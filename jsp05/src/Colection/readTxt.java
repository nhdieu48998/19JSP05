package Colection;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
public class readTxt {
	
		  public static void main(String[] args) throws Exception 
		  { 
		    // pass the path to the file as a parameter 
		    FileReader fr = 
		      new FileReader("C:\\tmp\\test.txt"); 
		  
		    int i; 
		    while ((i=fr.read()) != -1) 
		      System.out.print((char) i); 
		 } 
} 

		
	


