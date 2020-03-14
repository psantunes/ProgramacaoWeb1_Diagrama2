package diagrama2;

import diagrama2.produtos.Medicamento;
import diagrama2.util.Data;

public class Principal {

    public static void main(String[] args) {
    // Obs do Paulo: criei um mail pra fazermos testes com nossas classes

        Data dataTeste = new Data(14, 3, 2020);
        System.out.println(dataTeste);
        Medicamento medicamento1 = new Medicamento(12.0, "Azitromicina", dataTeste);
        Medicamento medicamento2 = new Medicamento(3.0, "Paracetamol", dataTeste);
        System.out.println(medicamento1);
        System.out.println(medicamento2);
    }


}
