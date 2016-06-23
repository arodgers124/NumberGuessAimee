
import java.io.*;
import java.util.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.math.*;

public class GUESS
{
    private String vOption;
    private String vName;
    private int vRandNum;
    private int vGuess;
    private boolean vCorrectGuess;

    public GUESS()
    {
        vOption = "";
        vName = "";
        vRandNum = 0;
        vGuess = 0;
        vCorrectGuess = true;
    }

    public void display_message()
    {
        System.out.println("Welcome to the Guessing Game!");
    }

    public void play_game()
    {
        System.out.println("Press P to play and S to stop"); //3.1   	Display Menu
        vOption = JOptionPane.showInputDialog("Place select an option:"); //3.2 get option from user

        if(vOption.equals("P")) {         //3.3   	If option is equal to play then
            vName = JOptionPane.showInputDialog("Please enter your name: "); //3.4  Enter name       
            //3.5               	Generate random number
            //3.5.1	Computer generates a number between 1 and 50       	
            //3.6               	While found equals false do
            //3.7  	        	        	enter lucky guess from player
            //3.8              	        	if guess equals random number then
            //3.9                           	        	set found to true
            //3.10               	        	else if guess is less than random number then
            //3.11             	        	        	display a less than message
            //3.12 	        	        	else
            //3.13             	        	        	display a more than message
            //3.14             	        	end if
            //3.15 	        	end while
            //3.16             	Display results
            //3.17 	else
            //3.18             	quit game

        }//3.19 	end if
    }

    public void closemessage()
    {

    }

}
