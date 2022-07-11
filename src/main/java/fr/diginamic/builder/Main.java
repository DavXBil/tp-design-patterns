package fr.diginamic.builder;

public class Main {

    public static void main(String[] args) {
        String nomZoo =" Beauval";
        ZooBuilder zooBuilder = new ZooBuilder(nomZoo);

        Animal lion = new Lion("lion");
        Animal dauphin = new Dauphin("dauphin");
        Animal singe = new Animal("singe");
        Animal girafe = new Animal("girafe");

        String zoneLion = "Zones des lions";
        String zoneDauphin = "Zones des dauphins";
        String zoneSinge = "Zones des singe";
        String zoneGirafe = "Zones des girafes";

        int capacite = 5;

        zooBuilder.appendZone(zoneLion, capacite);
        zooBuilder.appendZone(zoneDauphin, capacite);
        zooBuilder.appendZone(zoneSinge, capacite);
        zooBuilder.appendZone(zoneGirafe, capacite);

        zooBuilder.appendAnimal(zoneDauphin, dauphin);
        zooBuilder.appendAnimal(zoneDauphin, dauphin);


        zooBuilder.appendAnimal(zoneSinge, singe);
        zooBuilder.appendAnimal(zoneSinge, singe);
        zooBuilder.appendAnimal(zoneSinge, singe);
        zooBuilder.appendAnimal(zoneSinge, singe);
        zooBuilder.appendAnimal(zoneSinge, singe);

        System.out.println(zooBuilder.getResult());

    }

}
