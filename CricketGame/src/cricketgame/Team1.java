/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricketgame;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Chalani Weerarathna
 */
public class Team1 {
    
    static Map<Integer, String[]> playersteam1  = new HashMap<Integer, String[]>();// to store players details
    
    //to get players score, cosumed balls per player and how out 
    private int playerscore;
    private int playerball;
    private String howout;
    
     public Team1(){

     }
  
    
public void startGame( ){
       
        Scanner input=new Scanner(System.in);//to get user input for bat
        String play;
        
        Integer[] summary = new Integer[3];//to store team summary
        int score=0;
        int wickets=0;
        int balls=15;
        int flag;
        int random ;
        Random rand = new Random( );
        
        String[] scorehow ={"-","-","Didn't play"};//inital details of a player
        
        for(int i=1;i<=6;i++){ //store initial detail into hashmap
            playersteam1.put(i,scorehow);
        
        }
        
         //start playing
     
        for(int i=1;i<=6;i++){ //check players are all out
             
             System.out.println("Player "+i +" is playing..\n");
           
             flag=0; //state of out
             playerscore=0; //player's score
             playerball=0; //balls per player
             howout="Not Out";//initial state
             scorehow=new String[3]; //store details of palyer's score and how out
              
            while(balls!=0){  
                try{ 
        
                    System.out.print("Enter 'p' key to bat: ");
                    play=input.next(); //to get user input
                    random = rand.nextInt(8); 
                }catch(InputMismatchException e){
                    random = 10;
                }
              
              
                switch(random){    //find marks for one ball
                    case 0:  
                        balls=balls-1;
                        System.out.println("IT'S A DOT BALL!\n");
                        playerball=playerball+1;
                      
                     break;  
                    case 1:
                         balls=balls-1;
                         score=score+1;
                         playerscore=playerscore+1;
                         playerball=playerball+1;
                         System.out.println("ONE RUN WITHING THE WICKETS!\n");
                      
                     break;  
                    case 2:    
                         balls=balls-1;
                         score=score+2;
                         playerscore=playerscore+2;
                         playerball=playerball+1;
                         System.out.println("TWO RUNS WITHING THE WICKETS!\n");
                         
                     break;  
                    case 3:    
                         balls=balls-1;
                         score=score+3;
                         playerscore=playerscore+3;
                         playerball=playerball+1;
                         System.out.println("THREE RUNS WITHIN THE WICKETS!\n");
                       
                     break;  
                    case 4:  
                         balls=balls-1;
                         score=score+4;
                         playerscore=playerscore+4;
                         playerball=playerball+1;
                          System.out.println("IT'S A BOUNDARY!!\n");
                     
                     break; 
                    case 5:   
                         balls=balls-1;
                         wickets=wickets+1;
                         flag=1;
                         playerball=playerball+1;
                         howout="Caught";
                         System.out.println("Oooops! PLAYER "+i +" IS OUT!!!! How:Caught\n");
                         
                         
                         
                        
                     break;  
                    case 6: 
                         balls=balls-1;
                         score=score+6;
                         playerscore=playerscore+6;
                         playerball=playerball+1;
                         System.out.println("Oh..IT'S A WONDERFUL SIX THROUGH THE BATTING END!!\n");
                         
                     break;
                    case 7:  
                         balls=balls-1;
                         wickets=wickets+1;
                         flag=1;
                         playerball=playerball+1;
                         howout="Bowled";
                         System.out.println("Oooops! PLAYER "+i +" IS OUT!!!!! How:Bowled\n");
                       
                        
                     break;  
                    
                }  
                
                scorehow[0]= Integer.toString(playerscore);
                scorehow[1]=Integer.toString(playerball);
                scorehow[2]=howout;
                playersteam1.put(i,scorehow );//put payer's data into hashmap
                
                
                if(flag==1){//if palyer out
                        if(i<6){
                            
                            System.out.println("NOW PLAYER "+(i+1) +" ON STRIKE NEXT\n");
                         
                         }else{
                            
                            
                            System.out.println("\nAll OUT!!\n");  
                              
                              
                         }
                        break;
                }
                
            }
           
                if(balls==0){//check balls are over
                  
                   System.out.println("\nTEAM 1 HAS NO OVERS LEFT!!\n");  
                   break;
                }
            
         }
           try{
            Thread.sleep(2000);
             }catch(InterruptedException e){
            System.out.println(e);
            }
           
       // print game summary of the team
        System.out.println("\n---------------------TEAM 1 SUMMARY------------------------" );
        System.out.println( );
        System.out.println("Team 1's "+ "total score: "+score);
        System.out.println("Number of wickets fell: "+wickets);
        System.out.println("Numer of balls left: "+balls);
        System.out.println( );
        System.out.println("---------------------------------------------------------------\n" );
       
        
        try{
            Thread.sleep(2000);
             }catch(InterruptedException e){
            System.out.println(e);
     
        }
        
        //to store team's summery into the hashmap
       summary[0]=score;
       summary[1]=wickets;
       summary[2]=balls;
       ScoreBoard.scoreBoard.put(1, summary);
    
 }

}