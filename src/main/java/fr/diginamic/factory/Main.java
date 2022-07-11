package fr.diginamic.factory;

public class Main {



    public static void main(String[] args) {
        OCFactory objetFactory = new OCFactory();
        Tablette tablette = (Tablette) objetFactory.getObjetConnecte(Type.Tablette, 15);
        TelephonePortable telephone = (TelephonePortable) objetFactory.getObjetConnecte(Type.TelephonePortable, 15);
        EnceinteConnectee enceinte = (EnceinteConnectee) objetFactory.getObjetConnecte(Type.EnceinteConnectee, 15);


        System.out.println(tablette.getClass());
        System.out.println(telephone.getClass());
        System.out.println(enceinte.getClass());

    }


}
