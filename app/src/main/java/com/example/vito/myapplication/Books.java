package com.example.vito.myapplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Created by jeanTindel on 11/10/2016.
 */
public class Books {
    Map<String,Book>LstBook = new HashMap<String,Book>();

    /** Instance unique pré-initialisée */
    private static Books INSTANCE = new Books();

    /** Constructeur privé */
    private Books()
    {

    }

    /** Point d'accès pour l'instance unique du singleton */
    public static Books getInstance()
    {
        return INSTANCE;
    }

    public void addBook(Book book){

    }

    public List<Book> getBooks(){
        return new ArrayList(LstBook.values());
    }

    public Book getBookById(String id){
        return LstBook.get(id);
    }

    private void init()
    {
        addBook(new Book("1","livre 1","LSI","http://google.com","4eme de couverture ici"));
        addBook(new Book("2","livre 2","HCE","http://bing.com","4eme de couverture ici"));
        addBook(new Book("3","livre 3","LTO","http://www.apple.com","4eme de couverture ici"));
        addBook(new Book("4","livre 4","VLE","http://google.com","4eme de couverture ici"));
        addBook(new Book("5","livre 5","LSI","http://google.com","4eme de couverture ici"));
    }
}
