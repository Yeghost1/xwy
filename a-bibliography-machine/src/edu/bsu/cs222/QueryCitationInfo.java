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

    public static void queryUser(){
        Scanner in = new Scanner(System.in);

        System.out.print("Author Name: ");
        authorName = in.next();
        System.out.print("Article Name: ");
        articleName = in.next();
        System.out.print("Publisher: ");
        publisherName = in.next();
        System.out.print("Date of Publication: ");
        publicationDate = in.next();
        System.out.print("Date Accessed: ");
        dateAccessed = in.next();
        System.out.print("Url: ");
        url = in.next();
    }

    public String getAuthorName(){
        return authorName;
    }

    public  String getArticleName(){
        return articleName;
    }

    public String getPublisherName(){
        return publisherName;
    }

    public String getPublicationDate(){
        return publicationDate;
    }

    public String getDateAccessed(){
        return dateAccessed;
    }

    public String getUrl(){
        return url;
    }
}
