
public class WhileLoops
{
    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("i is " + i + " but is less than 15");
            i = i + 1;
        }
        int k = 10;
        while (k > 5) {
            System.out.println("k is " + k + " but is greater than 5");
            k = k - 1;
        }
        int a = 0;
        while (a < 10) {
            System.out.println("a is " + a + " but is less than 10");
            a = a + 1;
        }
        int b = 10;
        while (b <= 20) {
            System.out.println("b is " + b + " but is less or equal to 20");
            b = b + 1;
        }
        
    }
    
    public static void main(String[] args) 
    {
        WhileLoops hw = new WhileLoops();
        hw.run();
    
    }
}

