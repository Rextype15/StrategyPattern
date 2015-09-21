package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.*;


public class JamaiconSportsBallMain {
    public static void main (String[] args) {

        Ball soccer = new SoccerBall();
        Ball base = new BaseballBall();
        Ball american = new AmericanFootballBall();
        Ball glass = new GlassBall();
        Ball ping = new PingPongBall();
        Ball rugby = new RugbyBall();
        Ball stone = new StoneBall();
        Ball volley = new VolleyBallBall();


        System.out.println(soccer.roll());
        System.out.println(soccer.performBounce());
        System.out.println(soccer.performDeflate());
        System.out.println(soccer.performInflate());
        System.out.println(soccer.performSound());

        System.out.println();

        System.out.println(american.roll());
        System.out.println(american.performBounce());
        System.out.println(american.performDeflate());
        System.out.println(american.performInflate());
        System.out.println(american.performSound());

        System.out.println();

        System.out.println(base.roll());
        System.out.println(base.performBounce());
        System.out.println(base.performDeflate());
        System.out.println(base.performInflate());
        System.out.println(base.performSound());

        System.out.println();

        System.out.println(glass.roll());
        System.out.println(glass.performBounce());
        System.out.println(glass.performDeflate());
        System.out.println(glass.performInflate());
        System.out.println(glass.performSound());

          System.out.println();

        System.out.println(ping.roll());
        System.out.println(ping.performBounce());
        System.out.println(ping.performDeflate());
        System.out.println(ping.performInflate());
        System.out.println(ping.performSound());

        System.out.println();

        System.out.println(rugby.roll());
        System.out.println(rugby.performBounce());
        System.out.println(rugby.performDeflate());
        System.out.println(rugby.performInflate());
        System.out.println(rugby.performSound());

        System.out.println();

        System.out.println(stone.roll());
        System.out.println(stone.performBounce());
        System.out.println(stone.performDeflate());
        System.out.println(stone.performInflate());
        System.out.println(stone.performSound());

        System.out.println();

        System.out.println(volley.roll());
        System.out.println(volley.performBounce());
        System.out.println(volley.performDeflate());
        System.out.println(volley.performInflate());
        System.out.println(volley.performSound());
    }
}
