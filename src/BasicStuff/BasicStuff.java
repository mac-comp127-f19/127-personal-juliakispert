package BasicStuff;

public class BasicStuff {
    public static void main(String[] args){
        double age0 = 18;
        double age1 = 18;
        //age0 is my age and age1 is my partners age
        System.out.println( "We are " + age0 + "and " + age1+ " years old!");
        double sumOfAges= age0 + age1;
        System.out.println("The sum of our ages is " + sumOfAges + "!");
        System.out.println("The sum of our ages is " + (age0 + age1) + "!");
        // adding the variables within in the printl n statement must be in parentheses or other ways it will just print out the two numbers
        //changing ages to double adds .0 to all variables
        System.out.println(6/2);
        System.out.println(6/4);
        // 6/4 does not print 1.5 as 6 and 4 are both integers
        System.out.println(Integer.MAX_VALUE);
        // Integer.MAX_VALUE is the highest value a integer can store
        System.out.println(Integer.MIN_VALUE);
        //This prints the smallest value an intege can store
        System.out.println(Integer.MIN_VALUE-1);
        //Integer.MIN_VALUE -1 prints the highest value. I am not sure why, but I know it cant give another number smaller than the minimum.

        // code to compute number of weeks, days, hours in 1600 hours
        int weeks;
        int days;
        int hours = 1600;
        days = hours/24;
        weeks = days/7;
        System.out.println( " There are " + weeks + " weeks  and "+ days + " days in " + hours + " hours");

        //code to computer the surface area (A) and volume (V) of a solid cone given the radius (r) of its base (b) and height (h)
        double h,r, V, A;
        h = 5;
        r = 2;
        V = (Math.PI*r*r*h)/3;
        A= Math.PI*r*r + (Math.PI * r) * Math.sqrt(r*r + h*h);
        System.out.println( "The volume of the cone is " + V + " and its surface area is "+ A);






    }

}
