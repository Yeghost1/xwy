package edu.bsu.cs222;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.io.*;
import java.lang.*;
import java.util.Arrays;

public class FormatsInArrayList extends FormatSources {
    public ArrayList<String> list = new ArrayList<String>();
    public FormatsInArrayList(){}
    public void createList(String input) {

        {
            list.add(input);
            Collections.sort(list);
        }

    }
    public void printList()
    {
        for(String q:list)
            System.out.println(q);


    }
}