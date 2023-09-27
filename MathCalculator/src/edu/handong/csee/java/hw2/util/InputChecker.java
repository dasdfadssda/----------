package edu.handong.csee.java.hw2.util;

public class InputChecker {

    public static void printErrorMesssageForTheNumberOfRequiredInputsAndExit(String engineName, int numOfRequiredInputs) {
        System.out.println("You need " + numOfRequiredInputs + " input values for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }
    
    public static void printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(String engineName, int numOfRequiredInputs) {
        System.out.println("You need at least " + numOfRequiredInputs + " input values for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }
    
    public static void printErrorMesssageForNegativeInputsAndExit(String engineName) {
        System.out.println("The input value must not be a negative value for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }
}
