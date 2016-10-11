package com.example.vito.myapplication;

/**
 * Created by jeanTindel on 11/10/2016.
 */
public class Book {
    String id;
    String title;
    String author;
    String coverUrl;
    String resume;

    public String getId()
    {
        return this.id;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getCoverUrl(){
        return this.coverUrl;
    }

    public String getResume(){
        return this.resume;
    }

    public void setId(String id){
        this.id = id;
    }

    public void SetTitle(String title){
        this.title = title;
    }

    public void setAuthor(String Author){
        this.author = Author;
    }

    public void setCoverUrl(String CoverUrl){
        this.coverUrl = CoverUrl;
    }

    public void setResume(String Resume){
        this.resume = Resume;
    }

    public String toString()
    {
        return "Le livre " + this.id + "a le titre " + this.title + " il a été écrit par "+this.author+" le résumé est : "+this.resume;
    }

    //constructeur Book
    public Book(String Id,String Title,String Author,String CoverUrl,String Resume)
    {
        this.id=Id;
        this.title=Title;
        this.author=Author;
        this.coverUrl=CoverUrl;
        this.resume=Resume;
    }
}
