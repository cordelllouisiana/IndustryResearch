package com.company;

import java.util.Scanner;

/**
 * Created by Cordell on 7/25/2016.
 */
public class UserInput {

    public String initialGetInput(){
        System.out.println("Please Enter Company Name");
        Scanner scan = new Scanner(System.in);
        String companyName = scan.nextLine();

        return companyName;
    }

    public void printTitle(String x){
        System.out.println(x);
    }
}
