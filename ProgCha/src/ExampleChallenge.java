import java.util.Scanner;

class ExampleChallenge {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    while(sc.hasNext()) {
      System.out.println(sc.nextInt() + 1);
    }
  }
}