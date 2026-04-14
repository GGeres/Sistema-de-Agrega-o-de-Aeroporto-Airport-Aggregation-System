public class Piloto {
    
    public String nome, licencaANAC, categoria;
    public int horasVoo;
    public boolean disponivel;

    public Piloto(String nome, String licenca, String categoria, int horas){
        this.nome = nome;
        this.licencaANAC = licenca;
        this.categoria = categoria;
        this.horasVoo = horas;
        this.disponivel = true;
    }

    public void registarVoo(int horas){
        this.horasVoo += horas;
    }
}
