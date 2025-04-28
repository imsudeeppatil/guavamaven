package com.example;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import com.google.common.collect.ImmutableList;

public class App 
{
    public static void main( String[] args )
    {
        // Creating an immutable list using Guava
        ImmutableList<String> fruits = ImmutableList.of("Apple", "Banana", "Cherry");
        System.out.println(fruits);  // Output the list
        
        // Define source and destination files for copying content
        File sourceFile = new File("source.txt");
        File destFile = new File("destination.txt");

        try {
            // Copy the file from source to destination using Commons IO
            FileUtils.copyFile(sourceFile, destFile);
            System.out.println("File copied successfully!");  // Success message
        } catch (IOException e) {
            // If there's an error during the file copy process
            System.err.println("Error occurred while copying file: " + e.getMessage());
        }
    }
}

