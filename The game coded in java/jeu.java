import java.util.Scanner;
/**
 * Décrivez votre classe jeu ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */public class jeu
{
public static void main(String[] args){
    boolean continu = true;
    String choicePlayer = "";
    String answerPlayer = "";
    String choiceyON = "";
    int answerp;
    int min1 = 1;
    int max1 = 10;
    int min2 = 1;
    int max2 = 100;
    int min3 = 1;
    int max3 = 500;
    int min4 = 1;
    int max4= 1000;
    
    
    int randomNumber = (int)Math.floor(Math.random()*(max1-min1+1)+min1);
      System.out.println(randomNumber);
    while(continu){
    System.out.println("welcome to the game");
    System.out.println("choose a dificulty");
    System.out.println("from easiest, easy, medium, hard, hardest");
    Scanner choice= new Scanner(System.in);
        choicePlayer = choice.next();
        
        while(!(choicePlayer.equals("easiest" ) || choicePlayer.equals("easy" ) || choicePlayer.equals("medium" ) || choicePlayer.equals("hard" ) || choicePlayer.equals("hardest" ))){
                System.out.println("try again please");
                    choicePlayer = choice.next();
                }  
            if (choicePlayer.equals("easiest")){
                randomNumber = (int)Math.floor(Math.random()*(max1-min1+1)+min1);
                 System.out.println("find the number");
                  Scanner answer= new Scanner(System.in);
                      answerPlayer = answer.next();
                      answerp = Integer.parseInt(answerPlayer);
                      while(answerp != randomNumber){
                      
                        if (answerp > randomNumber){
                            System.out.println("Wrong answer too high");
                            System.out.println("try again");
                              answerPlayer = answer.next();
                              answerp = Integer.parseInt(answerPlayer);
                        }
                        else if (answerp < randomNumber){
                        System.out.println("Wrong answer too low");
                                System.out.println("try again");
                              answerPlayer = answer.next();
                              answerp = Integer.parseInt(answerPlayer);
                        }
                    
                }
                if (answerp == randomNumber){
                    System.out.println("you won");  
                    System.out.println("play again"); 
                    Scanner yON= new Scanner(System.in);
                    choiceyON = choice.next();
            while(!(choiceyON.equals("yes" ) || choiceyON.equals("no" ))){
                System.out.println("you invalid answer");  
                choiceyON = choice.next();
            
                }
        if(choiceyON.equals("yes")){
        continu = true; }
        else if (choiceyON.equals("no")){
        continu = false;}
    }
    }
    
    
        else if (choicePlayer.equals("easy")){
                                 randomNumber = (int)Math.floor(Math.random()*(max1-min1+1)+min1);
                                 System.out.println("find the number betwen 1 and 10");
                                 Scanner answer= new Scanner(System.in);
                                 answerPlayer = answer.next();
                                 answerp = Integer.parseInt(answerPlayer);
           
              
                    for(int i = 0; i <= 5; i++) {              
                        if (answerp > randomNumber){
                        System.out.println("Wrong answer too high");
                        System.out.println("try again");
                          answerPlayer = answer.next();
                          answerp = Integer.parseInt(answerPlayer);
                          if (i == 3){
                            System.out.println("you lost"); 
                            break;}
                         
                        
            }
                    else if (answerp < randomNumber){
                        System.out.println("Wrong answer too low");
                        System.out.println("try again");
                        answerPlayer = answer.next();
                        answerp = Integer.parseInt(answerPlayer);
                        if (i == 3){
                            System.out.println("you lost"); 
                            break;}
                         
            }
                
            
        
            else if (answerp == randomNumber){
                            System.out.println("you won"); 
                            break;}
            }
                         
                        System.out.println("play again"); 
                        Scanner yON= new Scanner(System.in);
                        choiceyON = choice.next();
                        while(!(choiceyON.equals("yes" ) || choiceyON.equals("no" ))){
                        System.out.println("you invalid answer");  
                        choiceyON = choice.next();}
            
                                if(choiceyON.equals("yes")){
                                 continu = true;
                              }
                             else if (choiceyON.equals("no")){
                                 continu = false;
                             } 
                
            
        }
        
        else if (choicePlayer.equals("medium")){
                                 randomNumber = (int)Math.floor(Math.random()*(max2-min2+1)+min2);
                                 System.out.println("find the number betwen 1 and 100");
                                 Scanner answer= new Scanner(System.in);
                                 answerPlayer = answer.next();
                                 answerp = Integer.parseInt(answerPlayer);
           
              
                    for(int i = 0; i <= 5; i++) {              
                        if (answerp > randomNumber){
                        System.out.println("Wrong answer too high");
                        System.out.println("try again");
                          answerPlayer = answer.next();
                          answerp = Integer.parseInt(answerPlayer);
                          if (i == 3){
                            System.out.println("you lost"); 
                            break;}
                         
                        
            }
                    else if (answerp < randomNumber){
                        System.out.println("Wrong answer too low");
                        System.out.println("try again");
                        answerPlayer = answer.next();
                        answerp = Integer.parseInt(answerPlayer);
                        if (i == 3){
                            System.out.println("you lost"); 
                            break;}
                         
            }
                
            
        
            else if (answerp == randomNumber){
                            System.out.println("you won"); 
                            break;}
            }
                         
                        System.out.println("play again"); 
                        Scanner yON= new Scanner(System.in);
                        choiceyON = choice.next();
                        while(!(choiceyON.equals("yes" ) || choiceyON.equals("no" ))){
                        System.out.println("you invalid answer");  
                        choiceyON = choice.next();}
            
                                if(choiceyON.equals("yes")){
                                 continu = true;
                              }
                             else if (choiceyON.equals("no")){
                                 continu = false;
                             } 
                
            
        }
        
        else if (choicePlayer.equals("hard")){
                                 randomNumber = (int)Math.floor(Math.random()*(max3-min3+1)+min3);
                                 System.out.println("find the number betwen 1 and 500");
                                 Scanner answer= new Scanner(System.in);
                                 answerPlayer = answer.next();
                                 answerp = Integer.parseInt(answerPlayer);
           
              
                    for(int i = 0; i <= 8; i++) {              
                        if (answerp > randomNumber){
                        System.out.println("Wrong answer too high");
                        System.out.println("try again");
                          answerPlayer = answer.next();
                          answerp = Integer.parseInt(answerPlayer);
                          if (i == 6){
                            System.out.println("you lost"); 
                            break;}
                         
                        
            }
                    else if (answerp < randomNumber){
                        System.out.println("Wrong answer too low");
                        System.out.println("try again");
                        answerPlayer = answer.next();
                        answerp = Integer.parseInt(answerPlayer);
                        if (i == 6){
                            System.out.println("you lost"); 
                            break;}
                         
            }
                
            
        
            else if (answerp == randomNumber){
                            System.out.println("you won"); 
                            break;}
            }
                         
                        System.out.println("play again"); 
                        Scanner yON= new Scanner(System.in);
                        choiceyON = choice.next();
                        while(!(choiceyON.equals("yes" ) || choiceyON.equals("no" ))){
                        System.out.println("you invalid answer");  
                        choiceyON = choice.next();}
            
                                if(choiceyON.equals("yes")){
                                 continu = true;
                              }
                             else if (choiceyON.equals("no")){
                                 continu = false;
                             } 
                
            
        }
        
        else if (choicePlayer.equals("hardest")){
                                 randomNumber = (int)Math.floor(Math.random()*(max4-min4+1)+min4);
                                 System.out.println("find the number betwen 1 and 1000");
                                 Scanner answer= new Scanner(System.in);
                                 answerPlayer = answer.next();
                                 answerp = Integer.parseInt(answerPlayer);
           
              
                    for(int i = 0; i <= 9; i++) {              
                        if (answerp > randomNumber){
                        System.out.println("Wrong answer too high");
                        System.out.println("try again");
                          answerPlayer = answer.next();
                          answerp = Integer.parseInt(answerPlayer);
                          if (i == 7){
                            System.out.println("you lost"); 
                            break;}
                         
                        
            }
                    else if (answerp < randomNumber){
                        System.out.println("Wrong answer too low");
                        System.out.println("try again");
                        answerPlayer = answer.next();
                        answerp = Integer.parseInt(answerPlayer);
                        if (i == 7){
                            System.out.println("you lost"); 
                            break;}
                         
            }
                
            
        
            else if (answerp == randomNumber){
                            System.out.println("you won"); 
                            break;}
            }
                         
                        System.out.println("play again"); 
                        Scanner yON= new Scanner(System.in);
                        choiceyON = choice.next();
                        while(!(choiceyON.equals("yes" ) || choiceyON.equals("no" ))){
                        System.out.println("you invalid answer");  
                        choiceyON = choice.next();}
            
                                if(choiceyON.equals("yes")){
                                 continu = true;
                              }
                             else if (choiceyON.equals("no")){
                                 continu = false;
                             } 
                
            
        }
    
            }
            System.out.println("thanks for playing"); 
}    
}
