package edu.bsu.cs222;

import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.Scanner;

public class Main extends QueryURL{

    public static void main(String[] args) throws IOException {
        String continueMain = "y";
        QueryCitationInfo userInfo = new QueryCitationInfo();
        Scanner in = new Scanner(System.in);

        do{
            userInfo.queryUser();
            System.out.println();
            System.out.println("Do you want to enter the info yourself? [y or n]");
            if(in.nextLine().equals("y")) {
                System.out.println("Which format you would like to use?");
                if (in.nextLine().equals("APA")) {
                    System.out.println(formatAPA());
                } else {
                    System.out.println(formatMLA());
                }
            } else {
                System.out.println("Enter URL of source: ");
                String sourceURL = in.nextLine();
                JSONObject json = JSONFromURL(sourceURL);
                System.out.println(json.toString());
            }
            System.out.println("Continue? [y or n]: ");
            continueMain = in.nextLine();

        }while(continueMain.equals("y"));
    }
}

