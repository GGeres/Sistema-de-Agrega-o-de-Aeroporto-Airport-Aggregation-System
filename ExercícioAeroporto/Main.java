public class Main {
    public static void main(String[] args) {
        // 2 Passageiros
        Passageiro p1 = new Passageiro("Gary", "111", "CN123", 63);
        Passageiro p2 = new Passageiro("Neil", "456", "CN456", 65);

        //2 Pilotos
        Piloto pil1 = new Piloto("Cap. Dickinson", "ANAC-99", "Comercial", 5000);
        Piloto pil2 = new Piloto("Cap. Harris", "ANAC-88", "Privada", 2000);

        //2 Aeronaves
        Aeronave a1 = new Aeronave("Boeing 737", "PR-ABC", 6000, 80000);
        Aeronave a2 = new Aeronave("Airbus A320", "PR-XYZ", 5800, 75000);

        // Agregando Passageiros às Aeronaves:
        a1.embarcarPassageiro(p1);
        a2.embarcarPassageiro(p2);

        //2 Aeroportos
        Aeroporto aero1 = new Aeroporto("Toronto", "YYZ", "Mississauga", 100);
        Aeroporto aero2 = new Aeroporto("Guarulhos", "GRU", "Guarulhos", 80);

        // Agregando Aeronaves e Pilotos aos Aeroportos
        aero1.addAeronave(a1);
        aero1.staff.add(pil1);

        aero2.addAeronave(a2);
        aero2.staff.add(pil2);

        //Algoritmo de teste
        aero1.mostrarStatus();
        aero2.mostrarStatus();
    }
}
