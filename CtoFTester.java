public class CtoFTester{
  public static double CtoF(double c){
    return c * 9 / 5 + 32;
  }
  public static double FtoC(double f){
    return (f-32) * 5 / 9;
  }
  public static void main(String[] args){
    System.out.println(CtoF(100.0));
    System.out.println(FtoC(212.0));
  }
}
