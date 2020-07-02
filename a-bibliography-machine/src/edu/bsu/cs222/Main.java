package edu.bsu.cs222;

import java.util.Scanner;

public class Main extends FormatSources{
    public static void main(String[] args){
        String continueMain = "y";
        QueryCitationInfo userInfo = new QueryCitationInfo();
        Scanner in = new Scanner(System.in);
        FormatsInArrayList fb=new FormatsInArrayList();

        do{
            userInfo.queryUser();
            System.out.println();
            System.out.println("Which format you would like to use?");
            String str=in.next();
            if(str.equals("APA")){
                System.out.println(formatAPA());
                fb.createList(formatAPA());

            }else if {
                System.out.println(formatMLA());
                fb.createList(formatMLA());


            }
            System.out.println("Continue? [y or n]: ");
            continueMain = in.next();
            if(continueMain.equals("n"))
            {
                fb.printList();
            }

        }while(continueMain.equals("y"));
    }
}
