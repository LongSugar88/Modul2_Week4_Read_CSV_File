import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Read_CSV_File {
    void Read_File(String link){
        try{
            File myFile = new File(link);
            if(!myFile.exists()){
                throw new FileNotFoundException("Not found");
            }
            FileReader fileReader = new FileReader(myFile);
            BufferedReader myBuffer = new BufferedReader(fileReader);
            String content = null;
            while ((content = myBuffer.readLine()) != null){
                String[] contentAppear = content.split(",");
                System.out.println("Code: "+ contentAppear[4] + " Country :"+ contentAppear[5] );
            }
            myBuffer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
