/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricketgame;
import java.util.*;

//import java.util.Random; 
/**
 *
 * @author Chalani Weerarathna
 *  
       
      
 */
public class CricketGame {

   
    
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in); //to get user input
       System.out.println("\nUse your keypad when playing\n");
       try{ //to delay 
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
       System.out.println("After presssing a number you must press the enter key to validate your input\n");
      
       try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
       int start;
       Toss newgame=new Toss(); //create new Toss object
        
        try{ 
        
            System.out.print("Enter any number to continue with the game: ");
            start=input.nextInt(); 
        }catch(InputMismatchException e){
            
        }
        
        System.out.println("\nTHROW TOSS..WATING TO START MATCH..\n");
       
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        newgame.throwToss(); //calling throwToss method in Toss class
       
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
         
         System.out.println("MATCH IS OVER!!!!\n ");
         
         try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
         
         ScoreBoard sb= new ScoreBoard();//create new ScoreBoard object
         sb.scoreBoard( );  //calling scoreBoard
        
        
    
        
    }
       
        
        
        
}

