/*
 * To change this license header, choose License Headers in Project Properties.
 * 
 * 
 */
package za.ac.cput.assignment3;

/**
 *
 * @author aasem
 */
public class Runfile {
      
    public static void main(String[] args) 
    {
        FileReader read = new FileReader();
        read.openFile();
        read.readFile();
        read.closeFile();
        read.openFileToWriteTo();
        read.writeCustomerToFile();
        read.closeWriter();
    
    

    
}
}