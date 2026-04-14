import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
    public String nome, codigoIATA, cidade;
    public int capacidadeHangar;
    public boolean internacional;
    public List<Aeronave> frota = new ArrayList<>();
    public List<Piloto> staff = new ArrayList<>();

    public Aeroporto(String nome, String codigo, String cidade, int hangar){
        this.nome = nome;
        this.codigoIATA = codigo;
        this.cidade = cidade;
        this.capacidadeHangar = hangar;
    }

    public void addAeronave(Aeronave a){
        frota.add(a);
    }

    // Algoritmo para teste abaixo

    public void mostrarStatus(){
        System.out.println("--- Aeroporto: "+ nome + " ---");
        for(Aeronave a : frota){
            System.out.println("Aeroporto: "+ a.modelo + " ("+ a.matricula + ")");
            for(Passageiro p : a.passageiros){
                System.out.println(" -> Passageiro: "+ p.nome);
            }
        }
        for(Piloto pi : staff){
            System.out.println("Piloto de plantao: "+pi.nome);
        }
    }
}
