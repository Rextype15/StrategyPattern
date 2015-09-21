package mx.iteso;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.*;
import mx.iteso.strategy.lifesavers.*;


public class JamaiconSportsLifesaversMain {
        public static void main (String[] args) {
            //Add behaviours to constructor
            Lifesaver swimRing = new SwimRing(new Deflatable(), new Floatable() );
            Lifesaver swimSeat = new SwimSeat(new NotDeflatable(), new Sinkable());
            Lifesaver armBands = new ArmBands(new Deflatable(), new Floatable());
            Lifesaver foamFloat = new FoamFloat(new NotDeflatable(), new Floatable());
            Lifesaver lifeSaverCandy = new LifeSaverCandy(new NotDeflatable(), new Sinkable());
            Lifesaver lifeVest = new LifeVest(new NotDeflatable(), new Floatable());
            Lifesaver swimBelt = new SwimBelt(new NotDeflatable(), new Floatable());
            Lifesaver waterTube = new WaterTube(new Deflatable(), new Floatable());

            System.out.println(swimRing.display());
            System.out.println(swimRing.inflating());
            System.out.println(swimRing.deflating());
            System.out.println(swimRing.floating());

            System.out.println();

            System.out.println(swimSeat.display());
            System.out.println(swimSeat.inflating());
            System.out.println(swimSeat.deflating());
            System.out.println(swimSeat.floating());

            System.out.println();

            System.out.println(armBands.display());
            System.out.println(armBands.inflating());
            System.out.println(armBands.deflating());
            System.out.println(armBands.floating());

            System.out.println();

            System.out.println(foamFloat.display());
            System.out.println(foamFloat.inflating());
            System.out.println(foamFloat.deflating());
            System.out.println(foamFloat.floating());

            System.out.println();

            System.out.println(lifeSaverCandy.display());
            System.out.println(lifeSaverCandy.inflating());
            System.out.println(lifeSaverCandy.deflating());
            System.out.println(lifeSaverCandy.floating());

            System.out.println();

            System.out.println(lifeVest.display());
            System.out.println(lifeVest.inflating());
            System.out.println(lifeVest.deflating());
            System.out.println(lifeVest.floating());

            System.out.println();

            System.out.println(swimBelt.display());
            System.out.println(swimBelt.inflating());
            System.out.println(swimBelt.deflating());
            System.out.println(swimBelt.floating());

            System.out.println();

            System.out.println(waterTube.display());
            System.out.println(waterTube.inflating());
            System.out.println(waterTube.deflating());
            System.out.println(waterTube.floating());
        }
}
