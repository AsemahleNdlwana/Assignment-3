/*
 * To change this license header, choose License Headers in Project Properties.
 * 
 * Asemahle Ndlwana
* 211043060
 */
package za.ac.cput.assignment3;
import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author aasem
 */
public class FileReader {
   ObjectInputStream output;
    ArrayList<Customer> customerList = new ArrayList<Customer>();
    ArrayList<Supplier> supplierList = new ArrayList<Supplier>();
    PrintWriter writerObject;

    public void openFile()
    {
        try{
            output = new ObjectInputStream(new FileInputStream("stakeholder.ser"));
        }catch(IOException ioException){
            System.out.println("Failed to open the ser file: " + ioException.getMessage());
        }
    }

    public void readFile() {
        for(int o = 0; o < 11; ++o)
        {
            try{
                Object object = output.readObject();
                if (object.getClass().equals(Customer.class)){
                    customerList.add((Customer) object);
                }
                else {
                    supplierList.add((Supplier) object);
                }
            }
            catch (IOException a)
            {
                System.out.println("Failed to read from file: " + a.getMessage());
            }
            catch(ClassNotFoundException e)
            {
                System.out.println("An Error Occurred: " + e.getMessage());
            }
        }
//        System.out.println("Customer before sorting");
//        for (Customer customer : customerList) {
//            System.out.println(customer);
//        }
        sort();
          //System.out.println("Customer " + customerList.get(0).getFirstName() + "'s age is " + getCustAge(customerList.get(0)));
          //System.out.println("Customer " + customerList.get(0).getFirstName() + "'s Date of birth " + formatDOB(customerList.get(0)));

          //        System.out.println("Customer after sorting");
//        for (Customer customer : customerList) {
//            System.out.println(customer);
//        }
    }

    private void sort() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
