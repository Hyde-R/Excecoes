import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo3 {
    public static void main(String[] args) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("C:\\Users\\12118287\\Downloads\\log3.txt"));
        String linha = "";
        try {
            // Código que pode lançar uma exceção
            //int[] array = new int[5];
            //int valor = array[10];
            String x = null;
            System.out.println(x.toUpperCase());
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.err.println("Exceção: " + e.getMessage());
            linha = e.getMessage();
            buffWrite.append(linha + "\n");
            buffWrite.close();
        }
    }
}
