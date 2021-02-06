
package x.o;


import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class XO {
    public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    int game [] [] = new int[3][3];
    int x2=0;
    int y2=0;
    try{
     int w=0;
    for(int i=0;i<=Integer.MAX_VALUE;i++){  
    if(w%2==0){
    System.out.println("X player enter number of row");
    x2= input.nextInt();
    System.out.println("X player enter number of column");
    y2=input.nextInt();
    if(game[x2][y2]==2 || game[x2][y2]==1){
        System.out.println("your input already have input");
        continue;
    }else{
   game[x2][y2] =1;
       print(game);
w++;
    }
   if(checkWinner(game)==2){
       System.out.println("X player won");
    break;
    }
    }
    else{
    System.out.println("O player enter number of row");
   int x1= input.nextInt();
    System.out.println("O player enter number of column");
    int y1=input.nextInt();
    if(game[x1][y1]==1 || game[x1][y1]==2){
     System.out.println("your input already have input");
       continue;
    }else{
    game[x1][y1] =2;
        print(game);
        w++;
    }
    if(checkWinner(game)==3){
        System.out.println("O player won");
    break;
    }
    }
    if(w==9){
    if(checkWinner(game) ==1){
    System.out.println("TIE");
    break;
    }
    }
    }
    }
    catch(Exception e){
    System.out.println("invaled input");
}
    }
    public static int checkWinner(int game[][])
    {
        int x =0;
        if (game [0][0] == 1 && game [0][1] ==1 && game [0][2]== 1)
        {            
            x=2;
            return x;
        }
        else if (game [1][0] == 1 && game [1][1] ==1 && game [1][2]== 1)
        {           
            x=2;
            return x;
        }
        else if (game [2][0] == 1 && game [2][1] ==1 && game [2][2]== 1){            
            x=2;
            return x;
        }
        else if (game [0][0] == 1 && game [1][0] ==1 && game [2][0]== 1)
        {            
            x=2;
            return x;
        }
        else if (game [0][1] == 1 && game [1][1] ==1 && game [2][1]== 1)
        {            
            x=2;
            return x;
        }
        else if (game [0][2] == 1 && game [1][2] ==1 && game [2][2]== 1)
        {            
            x=2;
            return x;
        }
        else if (game [0][0] == 1 && game [1][1] ==1 && game [2][2]== 1)
        {   
            x=2;
            return x;
        }
        else if (game [0][2] == 1 && game [1][1] ==1 && game [2][0]== 1)
        {  
            x=2;
            return x;
        }
        else if (game [0][0] == 2 && game [0][1] ==2 && game [0][2]== 2)
        { 
            x=3;
            return x;
        }
        else if (game [1][0] == 2 && game [1][1] ==2 && game [1][2]==2)
        {   
            x=3;
            return x;
        }
        else if (game [2][0] == 2 && game [2][1] ==2 && game [2][2]== 2)
        {   
            x=3;
            return x;
        }
        else if (game [0][0] == 2 && game [1][0] ==2 && game [2][0]== 2)
        { 
           x=3;
            return x;
        }
        else if (game [0][1] == 2&& game [1][1] ==2 && game [2][1]== 2)
        {  
           x=3;
            return x;
        }
        else if (game [0][2] == 2 && game [1][2] ==2 && game [2][2]== 2)
        { 
           x=3;
            return x;
        }
        else if (game [0][0] == 2 && game [1][1] ==2 && game [2][2]== 2)
        {
            x=3;
            return x;
        }
        else if (game [0][2] == 2 && game [1][1] ==2 && game [2][0]== 2)
        {
             x=3;
            return x;
        }
        else 
        {
            x =1;
           return x;
        }   
    }
  static void print (int game [][]){
       int i=0,j=0;
       System.out.println( "------------------");
       for( i=0;i<3;i++){
           for( j=0;j<3;j++){
               if(game[i][j]==1){
                   System.out.print(" X   |");
               }
               else if (game[i][j]==2){
                 System.out.print(" O   |");

               }
               else{
                    System.out.print("     |");

               }
                   
           }
           System.out.println();
       System.out.println( "------------------");
       }
   }
}