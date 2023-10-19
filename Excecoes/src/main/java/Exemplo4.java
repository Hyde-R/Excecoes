import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("C:\\Users\\12118287\\Downloads\\log4.txt"));
        String linha = "";
        try {
            // Código que pode lançar uma exceção
            // ...
        } catch (Exception e) {
            System.err.println("Exceção: " + e.getMessage());
            linha = e.getMessage();
            buffWrite.append(linha + "\n");
            buffWrite.close();
        } finally {
            // Código a ser executado sempre, mesmo se ocorrer uma exceção
            System.out.println("Bloco finally executado.");
        }
    }
}
