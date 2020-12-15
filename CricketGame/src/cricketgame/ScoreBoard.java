/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricketgame;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Chalani Weerarathna
 */
public class ScoreBoard {
    
    public ScoreBoard() {
    }
    static Map<Integer, Integer[]> scoreBoard = new HashMap<Integer, Integer[]>(); //to store summary of two teams
  
    public void scoreBoard( ){
        
        //to retrieve team's summary
        int team1score=scoreBoard.get(1)[0];
        int team2score= scoreBoard.get(2)[0];
        int team1wickets=scoreBoard.get(1)[1];
        int team2wickets=scoreBoard.get(2)[1];
        int team1balls=scoreBoard.get(1)[2];
        int team2balls=scoreBoard.get(2)[2];
        
       
        int difference; //to store score difference
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~SCORE BOARD~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    
       
        if(team1score>team2score){ //to find winning team
          difference=team1score-team2score;  
          System.out.println("                     *********** TEAM 1 BEATS TEAM 2 BY "+difference+" RUNS!!!! ************                       \n");
          
          
        }else if(team2score>team1score){
            difference=team2score-team1score;
            System.out.println("                   *********** TEAM 2 BEATS TEAM 1 BY "+difference+" RUNS!!!! ***********                        \n");
        }else{
           System.out.println("                                   *********** MATCH DRAW!!!! ***********                                         \n");
        }
        
        try{
            Thread.sleep(1000);
             }catch(InterruptedException e){
            System.out.println(e);
        }
        
      //print score board
       
       System.out.println("--------------------------------------------------------------------------------------------------------------");
       System.out.println("|                                                                                                            |");
       System.out.println("|               TEAM 1                             VS                   TEAM 2                               |");
       System.out.println("--------------------------------------------------------------------------------------------------------------");
       System.out.println("|                                                   |                                                        |");
       System.out.println("|PLAYER    SCORE     BALLS          STATE           |PLAYER    SCORE     BALLS            STATE              |"); 
       for(int i=1;i<=6;i++){ // to retrieve players details
       System.out.print("|Player "+i+"  "+String.format("%1$5s",Team1.playersteam1.get(i)[0])+"     "+String.format("%1$5s",Team1.playersteam1.get(i)[1])+"   "+String.format("%1$12s",Team1.playersteam1.get(i)[2])+"           |");
       System.out.println("Player "+i+"  "+String.format("%1$5s",Team2.playersteam2.get(i)[0])+"     "+String.format("%1$5s",Team2.playersteam2.get(i)[1])+"     "+String.format("%1$12s",Team2.playersteam2.get(i)[2])+"              |");
       
       
       }
       //to print team's summary
       System.out.println("|                                                   |                                                        |");
       System.out.println("| SCORE     : "+ team1score+"                                    | SCORE     : "+ team2score+"                                         |");
       System.out.println("|                                                   |                                                        |");
       System.out.println("| WICKETS   : "+ team1wickets+"                                     | WICKETS   : "+ team2wickets+"                                          |");
       System.out.println("|                                                   |                                                        |");
       System.out.println("| LEFT BALLS: "+ team1balls+"                                     | LEFT BALLS: "+ team2balls+"                                          |");
       System.out.println("|                                                   |                                                        |");
       System.out.println("--------------------------------------------------------------------------------------------------------------");
        
       
     }
   
    
}
