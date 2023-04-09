class Calculator{
    int a;

    public int add() {
        System.out.println("HERE IS ADD");
        return 0;
    }

    public int Mult(int n1, int n2) {
    int r = n1 * n2;
        return r;
    }

}





public class ClassObj {
    public static void main(String[] args) {

        int num1 = 8;
        int num2 = 9;

        Calculator calc = new Calculator();

        calc.add();
      int result1 = calc.Mult(4, 5);
      int result2 =calc.Mult(num1, num2);

      System.out.println(result1);
      System.out.println(result2);
        
    }
}
