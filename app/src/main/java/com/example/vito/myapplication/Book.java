package com.example.vito.myapplication;

/**
 * Created by jeanTindel on 11/10/2016.
 */
public class Book {
    String id;
    String title;
    String author;
    String CoverUrl;
    String Resume;

    public String GetId()
    {
        return this.id;
    }

    public String GetTitle(){
        return this.title;
    }

    public String GetAuthor(){
        return this.author;
    }

    public String GetCoverUrl(){
        return this.CoverUrl;
    }

    public String GetResume(){
        return this.Resume;
    }

    public void SetId(String id){
        this.id = id;
    }

    public void SetTitle(String title){
        this.title = title;
    }

    public void SetAuthor(String Author){
        this.author = Author;
    }

    public void SetCoverUrl(String CoverUrl){
        this.CoverUrl = CoverUrl;
    }

    public void SetResume(String Resume){
        this.Resume = Resume;
    }

    public String ToString()
    {
        return "Le livre " + this.id + "a le titre " + this.title + " il a été écrit par "+this.author+" le résumé est : "+this.Resume;
    }
}
