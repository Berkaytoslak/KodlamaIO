public class Menu {

    private int id;
    private String dersİsim;
    private String icerik;
    private int süre;
    private String eğitmen;
    private String ücret;

    public Menu(int id,String dersİsim, String icerik, int süre, String eğitmen, String ücret) {
        this.id = id;
        this.dersİsim = dersİsim;
        this.icerik = icerik;
        this.süre = süre;
        this.eğitmen = eğitmen;
        this.ücret = ücret;
    }

    public String getIcerik() {
        return icerik;
    }

    public int getSüre() {
        return süre;
    }

    public String getEğitmen() {
        return eğitmen;
    }

    public String getÜcret() {
        return ücret;
    }

    public String toString(){
        return  "DERS İD: " + this.id+
                " DERS ADI: " + this.dersİsim +
                " DERS İÇERİĞİ: " + this.icerik +
                " DERS SÜRESİ(saat): " + this.süre +
                " DERS EĞİTMENİ: " + this.eğitmen +
                " DERS ÜCRETİ: " + this.ücret;
    }
}
