package activityStarterCode;

import comp127graphics.Rectangle;

import java.awt.*;

public class Caboose extends TrainCar {
    public static final double CUPOLA_WIDTH = 35*SCALE;
    public static final double CUPOLA_HEIGHT = 8*SCALE;

public Caboose(Color color){
    super(color);
    drawCupola(CUPOLA_WIDTH,getCarHeight());
}

    private void drawCupola(double x, double y) {
        double xLeft = x + CONNECTOR+CAR_WIDTH/2-CUPOLA_WIDTH/2;
        double yTop = y - CAR_BASELINE - CAR_HEIGHT - CUPOLA_HEIGHT;
        comp127graphics.Rectangle cupola = new Rectangle(xLeft, yTop, CUPOLA_WIDTH, CUPOLA_HEIGHT);
        cupola.setFillColor(Color.RED);
        cupola.setFilled(true);
        this.add(cupola);
    }

    public double getCarHeight() {
        return CUPOLA_HEIGHT;
    }
}
