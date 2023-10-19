import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo1 {

//teste
    public static void main(String[] args) throws IOException {
        System.out.println("Exceções");
        String linha = "";
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("C:\\Users\\12118287\\Downloads\\log1.txt"));

        try {

            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.err.println("Ocorreu uma exceção: " + e.getMessage());
            linha = e.getMessage();
            buffWrite.append(linha + "\n");
            buffWrite.close();

        }
    }

}
