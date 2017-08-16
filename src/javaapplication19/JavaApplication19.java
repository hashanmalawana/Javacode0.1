
package javaapplication19;


public class JavaApplication19 {

   
    public static void main(String[] args) {
      System.out.println("Look at Star patern");
      int i,k,p ;
      for (i=1;i<=9;i++){
          for (k=1;k<=i;k++) {
          System.out.print("*");
      
          
          }
          System.out.print("\n");
      }
      for (i=1;i<=10;i++){
          for (k=9;k>=1;k--) {
          System.out.print("*");
          }
          System.out.print("\n");
      }
      for (i=1;i<=10;i++){
          for (k=10-i;k>=1;k--) {
          System.out.print("*");
          }
          System.out.print("\n");
      }
    }
    
}
