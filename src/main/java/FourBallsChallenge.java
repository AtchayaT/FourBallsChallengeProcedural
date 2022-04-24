
    import processing.core.PApplet;

    public class FourBallsChallenge extends PApplet {


        public static final int WIDTH = 640;
        public static final int HEIGHT = 480;
        public static final int DIAMETER = 20;
        public static int noOfBalls = 4;
        public static int x[] = {0, 0, 0, 0};


        public static void main(String[] args) {
            PApplet.main("FourBallsChallenge", args);
        }

        @Override
        public void settings() {
            super.settings();
            size(WIDTH, HEIGHT);
        }

        @Override
        public void setup() {

        }

        @Override
        public void draw() {
            int ball;
            for (ball = 1; ball <= noOfBalls; ball++) {

                ellipse(x[ball - 1] += ball, (HEIGHT * ball) / 5, DIAMETER, DIAMETER);
            }
        }

    }










