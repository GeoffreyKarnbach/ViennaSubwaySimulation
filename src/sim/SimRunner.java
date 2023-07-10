package sim;

import sim.transportation.SubwayNetwork;

public class SimRunner {

    public static void main(String[] args) {
        SubwayNetwork subwayNetwork = new SubwayNetwork();

        System.out.println(subwayNetwork.getPathBetween(subwayNetwork.karlsplatz, subwayNetwork.schottenring));
    }
}
