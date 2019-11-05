/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

/**
 *
 * @author WINDOWS 10
 */
public class Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int nilai [][]= {{2,4,6,8},{3,9,27,30},{4,16,20,24},{15,25,35,45}};
      
      for (int i=0; i < nilai.length; i++) {
          for (int j = 0; j < nilai [i].length; j++){
              System.out.print(nilai[i][j]+"\t");
          }
          System.out.println();
      }
    }
    
}


  
    
