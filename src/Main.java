import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Map<Integer,String> autors=new HashMap<>();
        String []v;
        String g;
        int u=0;
        try(FileInputStream imput=new FileInputStream("author.csv")) {
            Scanner s = new Scanner(imput);
            while (s.hasNext()) {
                String p = s.nextLine();
                v=p.split("[,]");
                for(int i=1;i<=1;i++){
                    g=v[i];
                    autors.put(u,g);
                    u++;
                }
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }System.out.println(autors.values());
        try (FileInputStream imput2=new FileInputStream("book.csv")) {
            Scanner ss = new Scanner(imput2);
            while (ss.hasNext()) {
                String pp = ss.nextLine();
                String[] b = pp.split(",");
                System.out.printf("");
                String nbv=b[1];
                System.out.println(nbv);
               Integer gfh=Integer.parseInt(b[5]);
                System.out.println(gfh);
                String hhh=b[4];
         try (FileInputStream stream=new FileInputStream("images/"+ hhh);
              FileOutputStream out= new FileOutputStream("result/"+nbv+autors.get(gfh)+".jpg")){
           byte[] bytes=stream.readAllBytes();
             out.write(bytes);
         }
         catch (IOException ex){
             ex.printStackTrace();
         }    }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
         }}
