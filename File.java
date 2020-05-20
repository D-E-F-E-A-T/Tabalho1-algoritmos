import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File{
    private StringList lines = new StringList();
    private StringList words = new StringList();
    private String path = null;

    public File(String path) {
        this.path = path;
        readFile();
    }

    private void readFile(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(this.path));
            String line = null;
            
            while((line = reader.readLine()) != null) {
                lines.addNode(line);

                for(String word : line.split(" ")){
                    words.addNode(word.toLowerCase());
                }
            }
    
            reader.close();
        } catch (IOException exception) {
            System.err.format("Erro na leitura: ", exception);
        }
    }

    public int getLinesCount() {
        return lines.count;
    }

    public int getWordsCount() {
        return words.count;
    }

    public String toString() {
        return lines.toString();
    }

    public StringList getwords() {
        return words;
    }
}