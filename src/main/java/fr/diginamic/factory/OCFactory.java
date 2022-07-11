package fr.diginamic.factory;

public class OCFactory {

    public ObjetConnecte getObjetConnecte(Type type, int limiteVolt) {

        switch (type) {
            case TelephonePortable -> {
                return new TelephonePortable(limiteVolt);
            }
            case Tablette -> {
                return new Tablette(limiteVolt);
            }
            case EnceinteConnectee -> {
                return new EnceinteConnectee(limiteVolt);
            }

            default -> {
                return null;
            }
        }

    }

}
