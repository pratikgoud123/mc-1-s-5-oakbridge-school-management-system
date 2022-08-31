package com.jap.marksevaluation;

import java.util.Arrays;

public class OakBridgeSchool {

    // Convert the given string name to upper case
    public String convertToUpperCase(String name){
        if (name.equals("")) {
            return " ";
        }
        return name.toUpperCase();
    }

    // Find the shortest word in the list of surnames
    public String shortestSurname(String[] surnames)
    {
        int smallWord = 0;
        for (int i = 0; i < surnames.length - 1; i++) {
            for (int j = 0; j < surnames.length - 1; j++) {
                if (surnames[j].length() < surnames[j + 1].length()) {
                    smallWord = j;
                } else if (surnames[j + 1].length() == surnames[smallWord].length()) {
                    smallWord = j;
                } else if (surnames[j + 1].length() < surnames[smallWord].length()) {
                    smallWord = j + 1;
                }
            }
        }
        return surnames[smallWord];
    }

    // Check if any of the names in the array is repeated, if yes return true else false
    public boolean checkIfNamesAreRepeated(String[] names){
        boolean flag = false;
        for (int i = 0; i <= names.length - 1; i++) {
            for (int j = i + 1; j <= names.length - 1; j++) {
                if (names[i].equals(names[j])) {
                    if (i == j) {
                        flag = false;
                        break;
                    } else {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    // Concatenate the name and surname of the students
    public String[] concatenateNameAndSurname(String[] names, String [] surnames){
        String[] concatenatedNames = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            concatenatedNames[i] = names[i].concat(" " + surnames[i]);
        }
        return concatenatedNames;
    }

    // Display the names
    public void displayStudentNames(String[] namesArray){
        System.out.println(Arrays.toString(namesArray));
    }

    public static void main(String[] args) {
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();

        // Declare and Initialize values to the arrays
        String[] studentNames = {"Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Kate", "Leo"};
        String[] studentSurnames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Martin", "Clark", "King"};

        // Call the method to convert all the student names to upper case and display results
        for (String studentName : studentNames) {
            System.out.print(oakBridgeSchool.convertToUpperCase(studentName) + " ");
        }

        // Call the method to sort names in alphabetical order and display results
        Arrays.sort(studentNames);
        System.out.println("\n" + Arrays.toString(studentNames));

        // Call the method to find the shortest surname and display results
        String shortSurname = oakBridgeSchool.shortestSurname(studentSurnames);
        System.out.println(shortSurname);

        // Call the method to check if two names in the array are the same and display results
        System.out.println(oakBridgeSchool.shortestSurname(studentSurnames));

        // Call the method to concatenate name and surname with a space in between and display results
        String[] namesArray = oakBridgeSchool.concatenateNameAndSurname(studentNames, studentSurnames);
        oakBridgeSchool.displayStudentNames(namesArray);

    }
}
