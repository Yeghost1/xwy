package edu.bsu.cs222;

//This class formats the info from QueryCitationInfo into MLA format.

public class FormatSources extends QueryCitationInfo{

    public static String formatMLA(){
        return (authorName + ". \"" + articleName + "\" " + publisherName + ", " + publicationDate + ", " + url + ". Accessed " + dateAccessed);
    }

    public static String formatAPA(){
        return (authorName + ". (" + publicationDate + "). " + articleName + ", " + publicationLocation + ", "+ publisherName + ".");
    }
}
