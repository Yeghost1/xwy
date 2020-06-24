package edu.bsu.cs222;

import java.util.Scanner;

public class Main extends FormatSources{
    public static void main(String[] args){
        String continueMain = "y";
        QueryCitationInfo userInfo = new QueryCitationInfo();
        Scanner in = new Scanner(System.in);

        do{
            userInfo.queryUser();
            System.out.println();
            System.out.println(formatMLA());

            System.out.println("Continue? [y or n]: ");
            continueMain = in.nextLine();

        }while(continueMain.equals("y"));
    }
}
