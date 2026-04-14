
import java.util.ArrayList;
import java.util.List;

public class Aeronave {
    public String modelo, matricula;
    public int autonomia;
    public double cargaMaxima;
    public boolean emManutencao;
    public List<Passageiro> passageiros = new ArrayList<>();


    public Aeronave(String modelo, String matricula, int autonomia, double carga){
        this.modelo = modelo;
        this.matricula = matricula;
        this.autonomia = autonomia;
        this.cargaMaxima = carga;
    }

    public void embarcarPassageiro(Passageiro p){
        passageiros.add(p);
    }


}
