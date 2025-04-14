// Java program to format dates
package com.dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) throws ParseException {

        // Creating date pattern
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/YYYY");
        String str = sdf.format(new Date());
        System.out.println("Formatted date: " + str);

        // Parsing string into date format
        str = "April/15/2025";
        sdf = new SimpleDateFormat("MMMM/dd/YYYY");
        Date date = sdf.parse(str);
        System.out.println("Parsed date: " + date);
    }
}