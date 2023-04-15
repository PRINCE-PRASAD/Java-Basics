class Calc
{
    public int add(int p, int c){
        return p+c;
    }
}
class AdvanceCalc extends Calc
{
    public int add(int p, int c){
        return p+c+1;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        
        AdvanceCalc obj = new AdvanceCalc();
        int z = obj.add(8, 1);
        System.out.println(z);
    }
}
// 1. for method overriding method has the same names with the parameters
// 2. It must use inheritance (extennds)