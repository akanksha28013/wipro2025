package com.wipro.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Excercise5 {

	public static void main(String[] args) {
		String inputFileName = "C:/Users/CSC/Desktop/java.jpg";      
        String outputFileName = "C:/Users/CSC/Desktop/java_new.jpg";   

        try (FileInputStream fi = new FileInputStream(inputFileName);
             FileOutputStream fo = new FileOutputStream(outputFileName)) {

            byte[] buffer = new byte[1024];
            int bytesRead=0;
            while ((bytesRead = fi.read(buffer)) != -1) {
                fo.write(buffer, 0, bytesRead);
            }

            System.out.println("copied successfully.");

        } catch (IOException e) {
            
        }
	}

}
