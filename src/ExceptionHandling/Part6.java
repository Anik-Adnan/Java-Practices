package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Part6 {
    public static void main(String[] args) {
        // try with resourse

        // this code can be written to another way
        FileReader fr=null;
        try {
            fr= new FileReader("fle.txt");
        }catch (IOException e){

        }finally {
            try{
                fr.close();

            }catch (Exception e){
                System.out.println(e);
            }
        }


        try(FileReader frr = new FileReader("newfile.txt"); BufferedReader br =new BufferedReader(frr)){
            //we can write auto closeable object inside try paramter
            // we can nt use Main m =new Main(); File f = new File("")
            frr.read();
//            frr.close(); // redundant automatically closed
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
