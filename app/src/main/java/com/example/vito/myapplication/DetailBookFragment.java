package com.example.vito.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DetailBookFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DetailBookFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailBookFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_BOOK_ID = "bookId";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String bookId;

    private Book mBook;
    private String idBook;

    private TextView lblTitle;
    private TextView lblAuthor;
    private TextView lblResume;

    private OnFragmentInteractionListener mListener;

    public DetailBookFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param bookId bookId.
     * @return A new instance of fragment DetailBookFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DetailBookFragment newInstance(String bookId) {
        DetailBookFragment fragment = new DetailBookFragment();
        Bundle args = new Bundle();
        args.putString(ARG_BOOK_ID, bookId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            idBook = getArguments().getString(ARG_BOOK_ID);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_detail_book, container, false);
        lblTitle=(TextView)rootView.findViewById(R.id.lbl_title);
        lblAuthor=(TextView)rootView.findViewById(R.id.lbl_author);
        lblResume=(TextView)rootView.findViewById(R.id.lbl_resume);
        refresh(idBook);
        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }




    public void refresh(String Id)
    {
        mBook=Books.getInstance().getBookById(idBook);
        lblTitle.setText(mBook.getTitle());
        lblAuthor.setText(mBook.getAuthor());
        lblResume.setText(mBook.getResume());

    }

}
