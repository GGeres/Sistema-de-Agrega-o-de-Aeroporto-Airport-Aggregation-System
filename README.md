# Sistema-de-Agrega-o-de-Aeroporto-Airport-Aggregation-System
# Sistema de Agregação de Aeroporto ✈️

## 📊 Diagrama de Classes

```mermaid
classDiagram
    class Aeroporto {
        +String nome
        +String codigoIATA
        +adicionarAeronave(Aeronave a)
    }
    class Aeronave {
        +String modelo
        +String matricula
        +embarcarPassageiro(Passageiro p)
    }
    class Piloto {
        +String nome
        +String licencaANAC
        +registrarVoo(int horas)
    }
    class Passageiro {
        +String nome
        +String cpf
        +fazerCheckIn()
    }

    Aeroporto o-- Aeronave : agrega
    Aeroporto o-- Piloto : agrega
    Aeronave o-- Passageiro : agrega











Descrição
  
    Este projeto é um exercício prático focado no conceito de Agregação em Programação Orientada a Objetos (POO). O objetivo é simular o ecossistema de um aeroporto, onde diferentes entidades coexistem de forma independente, mas se relacionam para formar um sistema funcional.

Entidades Implementadas

    Aeroporto: O "todo" que agrega aeronaves e pilotos.

    Aeronave: Agrega passageiros e possui características técnicas de voo.

    Piloto: Entidade independente que pode ser vinculada a um aeroporto.

    Passageiro: Entidade que pode ser embarcada em aeronaves.

Conceitos Explorados

    Agregação: Demonstração de que as "partes" (Passageiro, Piloto, Aeronave) podem existir sem o "todo" (Aeroporto).

    Manipulação de Coleções: Uso de ArrayList para gerenciar as agregações em tempo de execução.

    Gerenciamento de Memória: Estudo do comportamento das referências na Stack e dos objetos no Heap.

----------------------------------------------------------------------------------------------------------------------------------------------------

Description

    This project is a practical exercise focused on the concept of Aggregation in Object-Oriented Programming (OOP). The goal is to simulate an airport ecosystem, where different entities coexist independently but relate to each other to form a functional system.

Implemented Entities

    Airport (Aeroporto): The "whole" that aggregates aircraft and pilots.

    Aircraft (Aeronave): Aggregates passengers and contains technical flight specifications.

    Pilot (Piloto): An independent entity that can be linked to an airport's staff.

    Passenger (Passageiro): An entity that can be boarded onto aircraft.

Explored Concepts

    Aggregation: Demonstration that the "parts" (Passenger, Pilot, Aircraft) can exist without the "whole" (Airport).

    Collection Handling: Usage of ArrayList to manage aggregations during runtime.

    Memory Management: Study of how references behave in the Stack and how objects are allocated in the Heap.

----------------------------------------------------------------------------------------------------------------------------------------------------

Tecnologias / Technologies

    Java 21 (ou superior)

    UML (Mermaid/Class Diagrams)







