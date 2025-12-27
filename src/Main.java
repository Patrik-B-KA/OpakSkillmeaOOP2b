

public class Main {
    public static void main(String[] args) {

        /*
        //Vytvorenie nových objektov z triedy Domov
        Domov domBotlovcov = new Domov(536f, 10, 3);
        Domov domHerkovcov = new Domov(423f, 8, 2);
        Domov domIvancikovcov = new Domov(356f, 6, 4);

        //Volanie metody vypocetCenyDomu
        float cenaDomuBotlovcov = domBotlovcov.vypocetCenyDomu(1, "Botlovci");
        float cenaDomuHerkovcov = domHerkovcov.vypocetCenyDomu(3, "Herkovci");
        float cenaDomuIvancikovcov = domIvancikovcov.vypocetCenyDomu(2, "Ivancikovci");

        //Volanie setter
        domBotlovcov.setPocetOkien(8);

        //Volanie getter
        int pocetOkienBotlovcov = domBotlovcov.getPocetOkien();

        System.out.println(pocetOkienBotlovcov);
        System.out.println(cenaDomuBotlovcov + cenaDomuHerkovcov);


        Obchod kaufland = new Obchod(2800f, 4, 25);
        Obchod tesco = new Obchod(3800f, 3, 20);
        Obchod billa = new Obchod(1400f, 1, 10);

        float cenaKauflandu = kaufland.vypocetCenyDomu(2, "Kaufland");
        System.out.println(cenaKauflandu);*/


        Pes dunco = new Pes("CV", 45.5f,true, 12);
        dunco.vydajZvuk();

        Macka muro = new Macka("siamska", 7.7f, true, 13);
        muro.vydajZvuk();




    }
}