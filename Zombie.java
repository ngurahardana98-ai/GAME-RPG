public class Zombie extends Musuh {

    public Zombie(){
    super("Zombie merangak", 50);
    }
    @Override
    public void serangPemain() {
    System.out.println(this.namaMusuh + " mencakar kamu player -15 HP ");
    }
    public void suaraKhas(){
    System.out.println(this.namaMusuh + " AAAHHHHHHHH ");
    }
}
