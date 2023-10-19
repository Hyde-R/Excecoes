import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo6 {
    public static void main(String[] args) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("C:\\Users\\12118287\\Downloads\\log6.txt"));
        String linha = "";
        try {
            verificarValor();
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            linha = e.getMessage();
            buffWrite.append(linha + "\n");
            buffWrite.close();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            linha = e.getMessage();
            buffWrite.append(linha + "\n");
            buffWrite.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            linha = e.getMessage();
            buffWrite.append(linha + "\n");
            buffWrite.close();
        }
    }

    private static void verificarValor() throws IllegalArgumentException{
        int valor = -10;
        if (valor < 0) {
            throw new IllegalArgumentException("ABCDEFG 900: O valor não pode ser negativo.");
        }
    }
}

// https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html