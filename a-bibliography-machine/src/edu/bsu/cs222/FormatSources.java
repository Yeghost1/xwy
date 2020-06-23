package edu.bsu.cs222;

//This class formats the info from QueryCitationInfo into MLA format.

public class FormatSources extends QueryCitationInfo{

    public static void formatMLA(){
        System.out.println(authorName + ". \"" + articleName + "\" " + publisherName + ", " + publicationDate + ", " + url + ". Accessed " + dateAccessed);
    }
}
