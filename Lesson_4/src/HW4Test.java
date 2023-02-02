import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class HW4Test {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        String text = "";
        try{
            fileWriter = new FileWriter("home_work_test.sql");
//            fileWriter.append("My name is Andrey\n");
            fileWriter.write("Ivanov Ivan Ivanovich 45 M\n" +
                    "Smornova Natasha Ivamovna 34 W");
            fileWriter.flush();
            fileReader = new FileReader("home_work_test.sql");
            while (fileReader.ready()){
                text += (char)fileReader.read();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println(text);

        String[] fileInformation = text.split("\n");
        ArrayList<String> surname = new ArrayList<String>();
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<String> fatherName = new ArrayList<String>();
        ArrayList<Integer> age = new ArrayList<Integer>();
        ArrayList<Boolean> gender = new ArrayList<Boolean>();
        LinkedList<Integer> ll = new LinkedList<Integer>();

        for (int i = 0; i < fileInformation.length; i++) {
            String[] tmp = fileInformation[i].split(" ");
            surname.add(tmp[0]);
            name.add(tmp[1]);
            fatherName.add(tmp[2]);
            age.add(Integer.parseInt(tmp[3]));
            gender.add(tmp[4].equals("M") ? true:false);
            ll.add(i);
        }
        for (int i = 0; i < surname.size(); i++) {
            System.out.printf("%d %s %s. %s. %d %s\n",ll.get(i), surname.get(ll.get(i)),name.get(ll.get(i)).charAt(0),
                    fatherName.get(ll.get(i)).charAt(0),age.get(ll.get(i)),gender.get(ll.get(i)).equals(true) ? "M":"W");
        }

        for (int i = 0; i < age.size()-1; i++) {
            System.out.println(age.get(ll.get(i)));
            if(age.get(ll.get(i)) > age.get(ll.get(i+1))){
                int tmp =  ll.get(i);
                System.out.println(tmp);
                ll.set(i,ll.get(i+1));
                System.out.println(ll.set(i,ll.get(i+1)));
                ll.set(i+1,tmp);
            }

        }
        System.out.println(ll);
        for (int i = 0; i < name.size(); i++) {
            System.out.printf("%d %s %s. %s. %d %s\n",ll.get(i),surname.get(ll.get(i)),name.get(ll.get(i)).charAt(0),
                    fatherName.get(ll.get(i)).charAt(0),age.get(ll.get(i)),gender.get(ll.get(i)));

        }
    }
}
