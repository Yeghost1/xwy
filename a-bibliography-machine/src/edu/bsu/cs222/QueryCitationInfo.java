package edu.bsu.cs222;

import java.util.Scanner;

//This class asks the user directly for citation info.
public class QueryCitationInfo {

    public static String authorName;
    public static String articleName;
    public static String publisherName;
    public static String publicationDate;
    public static String dateAccessed;
    public static String url;

    public Scanner in = new Scanner(System.in);

    public void queryUser(){
        queryAuthor();
        queryArticleName();
        queryPublisherName();
        queryPublicationDate();
        queryDateAccessed();
        queryURL();
    }

    public void queryAuthor(){
        System.out.print("Author Name: ");
        authorName = in.nextLine();
    }

    public void queryArticleName(){
        System.out.print("Article Name: ");
        articleName = in.nextLine();
    }

    public void queryPublisherName(){
        System.out.print("Publisher: ");
        publisherName = in.nextLine();
    }

    public void queryPublicationDate(){
        System.out.print("Date of Publication: ");
        publicationDate = in.nextLine();
    }

    public void queryDateAccessed(){
        System.out.print("Date Accessed: ");
        dateAccessed = in.nextLine();
    }

    public void queryURL(){
        System.out.print("URL: ");
        url = in.nextLine();
    }
}
