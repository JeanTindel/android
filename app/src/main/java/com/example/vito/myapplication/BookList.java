package com.example.vito.myapplication;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BookList.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BookList#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BookList extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";



    // TODO: Rename and change types of parameters
    private String login;


    //Nos creations
    private EditText editNewItem;
    private ListView listView;
    private ArrayAdapter<Book> arrayAdapter;

    private OnFragmentInteractionListener mListener;

    public BookList() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param1 login de l'ecran precedent.

     * @return A new instance of fragment BookList.
     */
    // TODO: Rename and change types and number of parameters
    public static BookList newInstance(String param1, String param2) {
        BookList fragment = new BookList();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            login = getArguments().getString(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_book_list, container, false);
        editNewItem=(EditText)rootView.findViewById(R.id.edit_newItem);
        listView= (ListView)rootView.findViewById(R.id.ListView);
        //on construit un objet qui va faire la passerelle entre le tableau d'objet java et la vue ListView
        arrayAdapter= new ArrayAdapter<Book>(getActivity(),android.R.layout.simple_list_item_1,Books.getInstance().getBooks());

        //on associe l'adapter a notre ListView
        listView.setAdapter(arrayAdapter);
        //action de selection d'un objet dans la liste
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Log.d("List","Click");
                Book selected = Books.getInstance().getBooks().get(i);
                mListener.onBookSelected(selected.getId());
            }
        });



        return inflater.inflate(R.layout.fragment_book_list, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    /*public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }*/

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try
        {
            mListener = (OnFragmentInteractionListener) activity;
        }
        catch (ClassCastException e)
        {
            throw new ClassCastException(activity.toString()
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

        // c'est la vue du fragment pour l'activite > on va dire a l'activite dans quelle vue on est pour qu elle sache ce qu elle maj et afficher
        void onBookSelected(String Id);
    }
}
