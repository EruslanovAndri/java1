import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class S4 {
    public static void main(String[] args) {
        // запись в файлы
        FileWriter fileWriter = null;
        FileReader reader = null;
//        try {
//            fileWriter = new FileWriter("db.sql");
//            fileWriter.append("ПриветМир");
//            fileWriter.flush();
//        }
//        catch (IOException e){
//            System.out.println(e.getMessage());
//        }
        String text = "";
        try {
            reader = new FileReader("db.sql");
            while (reader.ready()){
                text += (char)reader.read();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println(text);

    }
}
// текст в формате ФИО + возраст + пол
// 5-6 человек
// считать и разделить по строкам и по словам
// создать списки отдельно для фамилий, имён отчеств возраста и пола
//  заполнить данными для каждого человека из файла
