package Anant_Joshi;

import java.util.Arrays;

class CustomStringManipulator {
    public static void main(String[] args) {
        // Demonstrating String operations
        System.out.println("Custom String Manipulator:\n");

        String institute = "P. S. Hirapara Mahila College ";
        String instituteCode = "SPKM ";

        // Display institute details
        System.out.println("Institute: " + institute);
        System.out.println("Institute Length: " + institute.length());
        System.out.println("Trimmed Institute: " + institute.trim());
        System.out.println("UpperCase: " + institute.toUpperCase());
        System.out.println("LowerCase: " + institute.toLowerCase());
        System.out.println("Substring: " + institute.substring(0, 5));

        // Concatenate institute and code
        String combinedString = combineStrings(instituteCode, institute);
        System.out.println("Combined String: " + combinedString);


        // Check equality of strings
        boolean isEqual = compareStrings(institute, instituteCode);
        System.out.println("Institute and Institute Code are equal: " + isEqual);


        // Check if institute starts with 'P' and code ends with 'M'
        System.out.println("Institute Starts With 'P': " + startsWithP(institute));
        System.out.println("Institute Code Ends With 'M': " + endsWithM(instituteCode));


        // Modify institute string
        String modifiedString = modifyString(institute);
        System.out.println("Modified String: " + modifiedString);


        // Replace spaces with underscores
        String replacedString = replaceSpaces(institute);
        System.out.println("Replace ' ' With '_': " + replacedString);


        // Convert institute ID to string
        String instituteID = convertToString();
        System.out.println("Institute ID: " + instituteID);


        // Split institute into parts
        String[] splitResult = splitString(institute);
        System.out.println("Split Result = " + Arrays.toString(splitResult));


        // Convert institute to char array
        char[] charArray = convertToCharArray(institute);
        System.out.println("Characters: " + Arrays.toString(charArray));


        // Demonstrating StringBuffer operations
        System.out.println("\n\n\nDemonstrating StringBuffer operations:\n");
        StringBuffer completeNameBuffer = new StringBuffer();
        System.out.println("StringBuffer Capacity: " + completeNameBuffer.capacity());
        completeNameBuffer.append(institute);
        System.out.println("StringBuffer Capacity: " + completeNameBuffer.capacity());
        completeNameBuffer.insert(0, "Shree ");
        System.out.println("Complete Name: " + completeNameBuffer);
        completeNameBuffer.delete(0, 5);
        System.out.println("Complete Name: " + completeNameBuffer);
        System.out.println("StringBuffer Capacity: " + completeNameBuffer.capacity());
        System.out.println("Reversed StringBuffer: " + completeNameBuffer.reverse());


        // Demonstrating StringBuilder operations
        System.out.println("\n\n\nDemonstrating StringBuilder operations:\n");
        StringBuilder completeNameBuilder = new StringBuilder();
        System.out.println("StringBuilder Capacity: " + completeNameBuilder.capacity());
        completeNameBuilder.append(institute);
        System.out.println("StringBuilder Capacity: " + completeNameBuilder.capacity());
        completeNameBuilder.insert(0, "Shree ");
        System.out.println("Complete Name: " + completeNameBuilder);
        completeNameBuilder.delete(0, 5);
        System.out.println("Complete Name: " + completeNameBuilder);
        System.out.println("StringBuilder Capacity: " + completeNameBuilder.capacity());
        System.out.println("Reversed StringBuilder: " + completeNameBuilder.reverse());
    }

    // Custom method to combine two strings
    private static String combineStrings(String str1, String str2) {
        return str1.concat(str2);
    }

    // Custom method to compare two strings
    private static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    // Custom method to check if a string starts with 'P'
    private static boolean startsWithP(String str) {
        return str.startsWith("P");
    }

    // Custom method to check if a string ends with 'M'
    private static boolean endsWithM(String str) {
        return str.endsWith("M");
    }

    // Custom method to modify a string
    private static String modifyString(String str) {
        str = str.replace("P.", "Prafulbhai");
        str = str.replace("S.", "Shambhubhai");
        return str;
    }

    // Custom method to replace spaces with underscores
    private static String replaceSpaces(String str) {
        return str.replaceAll(" ", "_");
    }

    // Custom method to convert an integer to string
    private static String convertToString() {
        return String.valueOf(14003);
    }

    // Custom method to split a string
    private static String[] splitString(String str) {
        return str.split(" ");
    }

    // Custom method to convert a string to char array
    private static char[] convertToCharArray(String str) {
        return str.toCharArray();
    }
}