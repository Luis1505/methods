import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //objects are craeted from classes
    System.out.println(sum(3,4));

    System.out.println(subtract(9,8));

    System.out.println(product(2,3));

    System.out.println(quotient(10,5));
  }

  public static int sum( int num1, int num2)
  {
    return num1 + num2;
  }
  public static int subtract( int num1 , int num2)
  {
    return num1 - num2 ;
  }
  public static int product( int num1 , int num2)
  {
    return num1 * num2;
  }
  public static int quotient( int num1, int num2)
  {
    return num1 / num2;
  }

}