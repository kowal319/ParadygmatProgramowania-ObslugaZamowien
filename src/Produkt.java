public class Produkt {

    private String name;
    private String opis;
    private double cena;
    private int iloscSztuk;

    public Produkt(String name, String opis, double cena, int iloscSztuk) {
        this.name = name;
        this.opis = opis;
        this.cena = cena;
        this.iloscSztuk = iloscSztuk;
    }

    public int pobierzIlosc(){
        return iloscSztuk;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getIloscSztuk() {
        return iloscSztuk;
    }

    public void setIloscSztuk(int iloscSztuk) {
        this.iloscSztuk = iloscSztuk;
    }

    public void showInfo(){
        System.out.println("---------------");
        System.out.println("Produkt: " + name);
        System.out.println("Opis: " + opis);
        System.out.println("Cena za szt.: " + cena);
        System.out.println("Ilosc sztuk w sklepie: " + iloscSztuk);
        System.out.println();
    }

}


