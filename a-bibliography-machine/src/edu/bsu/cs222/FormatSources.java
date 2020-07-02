package edu.bsu.cs222;

//This class formats the info from QueryCitationInfo into MLA format.

public class FormatSources extends QueryCitationInfo{

    public static String formatMLA(){
        String result =  (authorName + ". \"" + articleName + "\" " + publisherName + ", " + publicationDate + ", " + url + ". Accessed " + dateAccessed);
        return result;
    }

    public static String formatAPA() {
        String result = (authorName + ". (" + publicationDate + "). " + articleName + ", " + publicationLocation + ", " + publisherName + ".");
        return result;
    }
}
