public class Passageiro{

    public String nome, cpf, passaporte;
    public int idade;
    public boolean checkInRealizado;

    public Passageiro(String nome, String cpf, String passaporte, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.passaporte = passaporte;
        this.idade = idade;
    }

    public void fazerCheckIn(){
        this.checkInRealizado = true;
        System.out.println(nome + " realizou o check-in.");
    }
}