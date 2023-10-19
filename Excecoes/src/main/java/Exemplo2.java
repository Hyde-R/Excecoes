import java.io.*;

public class Exemplo2 {
    public static void main(String[] args) throws IOException {

        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("C:\\Users\\12118287\\Downloads\\log2.txt"));
        String linha = "";
        try {
            // Código que pode lançar uma exceção
            FileReader file = new FileReader("arquivo.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());
            linha = e.getMessage();
            buffWrite.append(linha + "\n");
            buffWrite.close();
        } catch(Exception e){
            System.err.println("Minha exceção pai: " + e.getMessage());
            linha = e.getMessage();
            buffWrite.append(linha + "\n");
            buffWrite.close();
        }
    }
}
