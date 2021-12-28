import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Arquivo {
    public static void main(String[] args) {
        Path filePath = Paths.get("exemplo.txt");

        try {
            Files.writeString(filePath, "JAVA 11", StandardOpenOption.APPEND);
            String conteudo = Files.readString(filePath);
            System.out.println(conteudo);
        } catch(IOException e) {
            e.printStackTrace();
        }
        
    }
}
