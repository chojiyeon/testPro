package yut.model.vo;

public class Player {
    int songP = 2;
    Mal[] mals = {new Mal(), new Mal(), new Mal(), new Mal()};
    String nick;
    boolean specialty = true;
    int[] moves = new int[100];

    public Player(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "class " + this.getClass();
    }

    public int getSongP() {
        return songP;
    }

    public void setSongP(int songP) {
        this.songP = songP;
    }

    public Mal[] getMals() {
        return mals;
    }

    public void setMals(Mal[] mals) {
        this.mals = mals;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public boolean isSpecialty() {
        return specialty;
    }

    public void setSpecialty(boolean specialty) {
        this.specialty = specialty;
    }
}
