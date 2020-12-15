/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricketgame;
import java.util.*;
/**
 *
 * @author Chalani Weerarathna
 */
public class Toss {
    
    public Toss() {
    }
    
    public void throwToss(){
        
        Team1 team1= new Team1();
        Team2 team2= new Team2();
       // create instance of Random class 
        Random rand = new Random( );
         int random = rand.nextInt(2); 
        if(random==0 ){ //if Team 1 won the toss
            System.out.println("TEAM 1 WON THE TOSS AND SELECTED TO BAT FIRST!!!!\n ");
       
            try{
            Thread.sleep(2000);
             }catch(InterruptedException e){
            System.out.println(e);
            }
            System.out.print("Get Ready! Match is about to begin.....\n\n");
            
            try{
            Thread.sleep(2000);
             }catch(InterruptedException e){
            System.out.println(e);
            }
           
            System.out.println("OPEN BATSMAN COMMING FOR THE STRIKE\n");
             try{
            Thread.sleep(2000);
             }catch(InterruptedException e){
            System.out.println(e);
            }
           
             team1.startGame(); //call startGame to bat first for team1

             
             System.out.println("TEAM 2 OPEN BATS COMMING FOR STRIKE\n");
              try{
            Thread.sleep(2000);
             }catch(InterruptedException e){
            System.out.println(e);
            }
              
             System.out.println( );
             team2.startGame( ); //call strtGame for team2 
             
        }else{//if Team 2 won the toss
        
             System.out.println("TEAM 2 WON THE TOSS AND SELECTED TO BAT FIRST!!!!\n ");
            
             try{
            Thread.sleep(2000);
             }catch(InterruptedException e){
            System.out.println(e);
            }
             System.out.print("Get Ready! Match is about to begin.....\n");
            
             try{
            Thread.sleep(2000);
             }catch(InterruptedException e){
            System.out.println(e);
            }
             
             System.out.println("\nOPEN BATSMAN COMMING FOR THE STRIKE\n");
              try{
            Thread.sleep(2000);
             }catch(InterruptedException e){
            System.out.println(e);
            }
             
           
             team2.startGame( );//call startGame to bat first for team2
             
             System.out.println("TEAM 1 OPEN BATS COMMING FOR STRIKE\n");
              try{
            Thread.sleep(2000);
             }catch(InterruptedException e){
            System.out.println(e);
            }
           
             team1.startGame( ); //call strtGame for team1
             
        }
    
     
    }
  
}
