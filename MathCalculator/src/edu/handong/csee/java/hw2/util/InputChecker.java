package edu.handong.csee.java.hw2.util;

public class InputChecker {

    public static void printErrorMesssageForTheNumberOfRequiredInputsAndExit(String engineName, int numOfRequiredInputs) {
        System.out.println("You need " + numOfRequiredInputs + " input values for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }
}
