
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
    }
    
    public static void main(String[] args) 
    {
        WhileLoops hw = new WhileLoops();
        hw.run();
    
    }
}

