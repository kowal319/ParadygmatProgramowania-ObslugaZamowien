import java.util.Scanner;

public class Zamowienie {

    int a;
    double cenaCalkowita = 0.00;
    double cenaProduktu = 0.00;
    double obnizka = 0.8;
    double cenaNowa= 0.00;

        Produkt mleko = new Produkt("Mleko", "Laciate", 2.99, 4);
        Produkt Lays = new Produkt("Lays", "Paprykowe", 5.30, 10);
        Produkt chleb = new Produkt("Chleb", "Zytni", 3.99, 20);
        Produkt piwo = new Produkt("Piwo", "Zubr", 2.39, 10);

        Zamowienie() {
        uruchomMenu();
        }


    private void uruchomMenu() {
        Scanner input = new Scanner(System.in);

        boolean petla = true;
        while (petla) {

                    System.out.println("Menu");
                    System.out.println("Wybierz opcje: ");
                    System.out.println("1 - Dodaj Mleko");
                    System.out.println("2 - Dodaj Lays");
                    System.out.println("3 - Dodaj Chleb");
                    System.out.println("4 - Dodaj Piwo");
                    System.out.println("5 - Pokaz ile juz wydales");
                    System.out.println("6 - pokaz produkty");
                    int dodajProdukt = input.nextInt();

                    switch (dodajProdukt) {
                        case 1:
                            System.out.println("Podaj ilosc: ");
                            a = input.nextInt();
                            cenaProduktu = liczCeneMleko();
                            System.out.println("Wydales na ten produkt : " + cenaProduktu);
                            cenaCalkowita = liczCeneCalkowita();
                            break;
                        case 2:
                            System.out.println("Wybrales Laysy, podaj ilosc: ");
                            a = input.nextInt();
                            cenaProduktu = liczCeneLays();
                            System.out.println("Wydales na ten produkt : " + cenaProduktu);
                            cenaCalkowita = liczCeneCalkowita();
                            break;
                        case 3:
                            System.out.println("Wybrales Chleb, podaj ilosc: ");
                            a = input.nextInt();
                            cenaProduktu = liczCeneChleb();
                            System.out.println("Wydales na ten produkt : " + cenaProduktu);
                            cenaCalkowita = liczCeneCalkowita();
                            break;
                        case 4:
                            System.out.println("Wybrales Piwo, podaj ilosc: ");
                            a = input.nextInt();
                            cenaProduktu = liczCenePiwo();
                            System.out.println("Wydales na ten produkt : " + cenaProduktu);
                            cenaCalkowita = liczCeneCalkowita();
                            break;
                        case 5 :
                           wyswietlCeneCalkowita();
                            break;
                        case 6:
                            showInfo();
                            break;
                        default:
                            System.out.println("Wybrales zla opcje");
                    }
            }
        }

        public double liczCeneMleko(){
        return a * mleko.getCena();
        }

        public double liczCeneLays(){
                return a * Lays.getCena();
        }

        public double liczCenePiwo(){
                return a *  piwo.getCena();
        }

        public double liczCeneChleb(){
                return a  * chleb.getCena();
        }

        public double liczCeneCalkowita(){
            return  Math.round((cenaProduktu + cenaCalkowita) * 100.0) / 100;
        }

        public double cenaPoObnizce(double obnizka){
            double cenaNowa = cenaCalkowita * obnizka;
            return Math.round(cenaNowa * 100.0) / 100;
        }

        public void wyswietlCeneCalkowita(){
            System.out.println("Wydales juz : "+ cenaCalkowita);
            cenaNowa = cenaPoObnizce(obnizka);
            System.out.println("Cena po obnizce : " +  cenaNowa);
        }

        public void showInfo(){
        Lays.showInfo();
        mleko.showInfo();
        piwo.showInfo();
        chleb.showInfo();
}

}



