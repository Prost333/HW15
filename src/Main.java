import java.io.*;

public class Main {
    public static void main(String[] args) {


        String text = "The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his \n" +
                "estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding\n" +
                " breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion,\n" +
                "with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period\n" +
                " of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home\n" +
                " again. He felt that he had grown up and matured very much. His despair at failing in a Scripture\n" +
                " examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he \n" +
                "now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant\n" +
                " of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to \n" +
                "soldiers for bravery in action, and in the company of well-known, elderly, and respected racing\n" +
                " men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom \n" +
                "he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with\n" +
                " Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of \n" +
                "forty to whom Denísov had introduced him.";
        FileWriter fileWriter = null;

        //task1
        try (FileWriter fileWriter1= new FileWriter("C:\\Users\\dimab\\IdeaProjects\\task15\\src\\text.txt")){
            fileWriter1.write(text);
            fileWriter1.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //task2
        try {
            fileWriter = new FileWriter("src/text.txt");
            fileWriter.write(text);
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        //task3/4
        try (FileInputStream fileInputStream =new FileInputStream("C:\\Users\\dimab\\IdeaProjects\\task15\\src\\text.txt")){
//            fileInputStream = new FileInputStream("src/text.txt");
            int symbol;
            do {
                symbol = fileInputStream.read();
                if (symbol != -1) {
                    System.out.print((char) symbol);
                }
            } while (true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("ошибка с файлом");;
            }
        }


    }
}