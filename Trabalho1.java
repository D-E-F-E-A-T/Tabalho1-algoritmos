import java.util.Scanner;

class Trabalho1 {
    public static int printMenu() {
        System.out.println("1. Exibir todo o índice remissivo");
        System.out.println("2. Exibir percentual de stopwords do texto;");
        System.out.println("3. Encontrar a palavra mais frequente");
        System.out.println("4. Pesquisar palavra");
        System.out.print("\n\n");

        Scanner in = new Scanner(System.in);

        int op = in.nextInt();

        return op;
    }

    public static void remove_stop(File book) {
        File stops = new File("stopwords.txt");
        String stopwords[] = stops.getArray();

        int lenght = book.getWordsCount();
        StringList words = book.getwords();
    }

    public static void main(String[] args){
        File book = new File(args[0]);


    }
}