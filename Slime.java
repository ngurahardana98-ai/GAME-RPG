public class Slime extends Musuh {

    public Slime(){
    super("Slime Asam", 50);
    }
    @Override
    public void serangPemain() {
    System.out.println(this.namaMusuh + " melompat dan cairan asam! player -15 HP ");
    }
    public void suaraKhas(){
    System.out.println(this.namaMusuh + " PIUUUUUUUU ");
    }
}
