package activityStarterCode.objects;

import java.util.*;

public class Die {
    private ArrayList<Integer> possibleNumbers = new ArrayList<>();
    private int stateofDie;
    private Random state = new Random();


    public Die() {
        setPossibleNumbers(6);
        stateofDie = -1;
    }

    public Die(int sides) {
        setPossibleNumbers(sides);

        stateofDie = -1;
    }

    public void setPossibleNumbers(int sides) {
        for (int i = 1; i < sides + 1; i++) {
            possibleNumbers.add(i);
        }

    }

    public void roll() {
        stateofDie = state.nextInt(possibleNumbers.size()) + 1;
    }

    public int getValue() {
        return stateofDie;
    }

    public String toString() {
        if (stateofDie == 1) {
            return "one";
        }
        if (stateofDie == 2) {
            return "two";
        }
        if (stateofDie == 3) {
            return "three";
        }
        if (stateofDie == 4) {
            return "four";
        }
        if (stateofDie == 5) {
            return "five";
        }
        if (stateofDie == 6) {
            return "six";
        }
        if (stateofDie == 7) {
            return "seven";
        }
        if (stateofDie == 8) {
            return "eight";
        }
        if (stateofDie == 9) {
            return "nine";
        }
        if (stateofDie == 10) {
            return "ten";
        }
        if (stateofDie == 11) {
            return "eleven";
        }
        if (stateofDie == 12) {
            return "twelve";
        }
        return "negative one";

    }


}
