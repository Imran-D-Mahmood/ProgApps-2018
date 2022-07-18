package javaapplication;

import java.io.BufferedReader;
import java.io.FileInputStream;    
import java.io.IOException;    
import java.io.FileReader;
import java.util.Scanner;

/**
 * A program that shows bus schedules.
 * 
 * @author D528_PC8
 * @version 1.0
 */
public class JavaApplication {        

    /**
     * Main method
     * 
     * @param args Unused
     * @throws IOException Throw the IO exception.
     */
    public static void main(String[] args) throws IOException {
      
        Scanner scanner1 = new Scanner(new FileInputStream("C:/Users/Acer/Desktop/TOPIC5 - Javadoc/TOPIC5/JavaApplication/src/sample.txt"));
        String scan, terminal;
        boolean flag = false;
        terminal = userInput("");
        
        
        while(scanner1.hasNext()) {
            scan = scanner1.next();
    
            if(terminal.equalsIgnoreCase(scan) && terminal.equalsIgnoreCase("dalinterminal") || terminal.equalsIgnoreCase("dalin terminal") || terminal.equalsIgnoreCase("dalin")) {
                dalinTerminal("");

                flag = true;
                break;
            }  
            	else if(terminal.equalsIgnoreCase(scan) && terminal.equalsIgnoreCase("partasterminal") || terminal.equalsIgnoreCase("partas terminal") || terminal.equalsIgnoreCase("partas")) {
                    partasTerminal("");

                    flag = true;
                    break;
            }  if(terminal.equalsIgnoreCase(scan) && terminal.equalsIgnoreCase("victoryterminal") || terminal.equalsIgnoreCase("victory terminal") || terminal.equalsIgnoreCase("victory")) {
                    victoryTerminal("");

                    flag = true;
                    break;
            } else {
            	System.out.println("Terminal not found");
            	break;
            }

        }
    }
    
    /**
     * Take input from the user.
     * 
     * @param terminal The name of the terminal
     * @return the terminal name
     */
    public static String userInput(String terminal) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter terminal name: ");
        terminal = kbd.next();
        return terminal;
    }
    
    /**
     *
     * Show bus schedule of Dalin Terminal.
     * @param line The input of the user
     * @throws IOException Throw the IO exception.
     *  
     */
    public static void dalinTerminal(String line) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/Acer/Desktop/TOPIC5 - Javadoc/TOPIC5/JavaApplication/src/dalinterminal.txt"))) {
            line = null;
            while ((line = br.readLine()) != null) {
                System.out.println("");
                System.out.println(line);
            }
        }
    }
    
    /**
     *
     * Show bus schedule of Partas Terminal.
     * @param line The input of the user
     * @throws IOException Throw the IO exception.
     */
    public static void partasTerminal(String line) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/Acer/Desktop/TOPIC5 - Javadoc/TOPIC5/JavaApplication/src/partasterminal.txt"))) {
            line = null;
            while ((line = br.readLine()) != null) {
                System.out.println("");
                System.out.println(line);
            }
        }
    }

    /**
     *  
     * Show bus schedule of Victory Terminal.
     * @param line The input of the user
     * @throws IOException Throw the IO exception.
     */
    public static void victoryTerminal(String line) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/Acer/Desktop/TOPIC5 - Javadoc/TOPIC5/JavaApplication/src/victoryterminal.txt"))) {
            line = null;
            while ((line = br.readLine()) != null) {
                System.out.println("");
                System.out.println(line);
            }
        }
    }
    
}

