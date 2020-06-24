package edu.bsu.cs222;

//This class formats the info from QueryCitationInfo into MLA format.

public class FormatMLA extends QueryCitationInfo {

    public static String formatMLA() {
        String result =(authorName + ". \"" + articleName + "\" " + publisherName + ", " + publicationDate + ", " + url + ". Accessed " + dateAccessed);
        return result;
    }


}