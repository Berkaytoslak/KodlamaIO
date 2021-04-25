import java.util.Scanner;

public class FirstMenu {
    Scanner scann = new Scanner(System.in);
    public void FirstMenuShow(){
        System.out.println("===TÜM DERSLER===");
        Lessons lessons = new Lessons();
        lessons.MenuShow(lessons.menu1);
        lessons.MenuShow(lessons.menu2);
        System.out.print("Girmek istediğin Ders: ");
        int menu1 = scann.nextInt();
        switch (menu1) {
            case 1: {
                System.out.println("===JAVA DERSİNE HOŞGELDİN===");
                System.out.print("DERS İÇERİĞİ: " + lessons.menu1.getIcerik());
                System.out.print("DERS SÜRESİ: " + lessons.menu1.getSüre());
                System.out.print(" DERS EĞİTMENİ: " + lessons.menu1.getEğitmen());
                System.out.println("DERS ÜCRETİ: " + lessons.menu1.getÜcret());
                Topics topics = new Topics();
                topics.JAVA();
                break;

            }
            case 2: {
                System.out.println("===C# DERSİNE HOŞGELDİN===");
                System.out.print("DERS İÇERİĞİ: " + lessons.menu2.getIcerik());
                System.out.print("DERS SÜRESİ: " + lessons.menu2.getSüre());
                System.out.print(" DERS EĞİTMENİ: " + lessons.menu2.getEğitmen());
                System.out.println("DERS ÜCRETİ: " + lessons.menu2.getÜcret());
                Topics topics2 = new Topics();
                topics2.Csharp();
                break;
            }
            default: {
                System.out.println("Geçerli ders giriniz...");
                break;
            }
        }

    }

}
