package activityStarterCode.objects;

public class DiceRoller {
    public static void main(String[] args) {
        Die dieOne = new Die(8);
        for(int i = 0; i < 10; i ++) {
            dieOne.roll();
          System.out.println(dieOne.toString());
        }
        Die dieTwo = new Die(6);
        int count = 0;
        for(int i = 0; i < 1000000; i ++) {
            dieOne.roll();
            dieTwo.roll();
            if(dieOne.getValue() == dieTwo.getValue())
                count++;
        }
        System.out.println("In one million rolls the two dice had the same value, " + count + " times.");

    }
}
