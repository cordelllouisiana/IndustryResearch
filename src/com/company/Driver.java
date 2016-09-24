package com.company;
import java.io.IOException;

public class Driver {

    public static void main(String[] args) throws IOException {

        UserInput userInput = new UserInput(); //View Class
        UserQuery userq = new UserQuery();
        userq.getInput(userInput.initialGetInput());
        userInput.printTitle(userq.getDocTitle());
        userq.printElements(userq.getDocument());

    }
}
