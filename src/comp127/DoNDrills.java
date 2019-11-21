package comp127;

public class DoNDrills {
    public static void main(String[] args){
        printZeroToNine();
        printTenToZero();
        printPowerofTwo();
        printMultiplyByTwoPlusOne();
        printFirst25Roots();
    }

    public static void printZeroToNine(){
        for (int i = 0; i < 10; i++)
            System.out.println(i);
    }

    public static void printTenToZero(){
        for(int i = 10; i > -1; i--){
            System.out.println(i);
        }
    }

    public static void printPowerofTwo(){
        int start = 1;
        System.out.println(start);
        for(int i = 0; i < 9; i++){
            System.out.println(2*start);
            start = start *2;
        }
    }
    public static void printMultiplyByTwoPlusOne(){
        int previous = 0;
        for(int i = 0; i < 8; i++){
            previous = (previous * 2) +1;
            System.out.println(previous);
        }
    }
    public static void printFirst25Roots(){
        for (double i = 1.0; i < 26.0; i++){
            System.out.println(Math.sqrt(i));
        }
    }

}
