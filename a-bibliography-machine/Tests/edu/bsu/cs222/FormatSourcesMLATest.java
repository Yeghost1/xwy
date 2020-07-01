package edu.bsu.cs222;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class FormatSourcesMLATest extends QueryCitationInfo {
    @Test
    public void correctMLATest(){
        QueryCitationInfo queryCitationInfo = new QueryCitationInfo();
        String author = QueryCitationInfo.authorName="James";
        String name = QueryCitationInfo.articleName="Corona Virus";
        String publisher = QueryCitationInfo.publisherName="ABC publishers";
        String publishingDate = QueryCitationInfo.publicationDate="10.10.2005";
        String date = QueryCitationInfo.dateAccessed="20.10.2020";
        String url = QueryCitationInfo.url="www.check.com";
        String result = FormatSources.formatMLA();
        Assertions.assertEquals("James. \"Corona Virus\" ABC publishers, 10.10.2005, www.check.com. Accessed 20.10.2020", result);
    }
}
