/**
 * Created by anjalyj on 25/02/16.
 */
public class Operations {
    private String[] files;
    private String[] options;
    public Operations(String[] files,String[] options){
        this.files = files;
        this.options = options;
    }

    public void wcWithoutOption(){
        for(int i=0; i< files.length; i++){
            int result[] = new int[3];
            Reader fr = new Reader(files[i]);
            WordCount wc = new WordCount(fr.readContent());
            result = wc.l_w_c_Count();
            System.out.println(" "+result[0]+"	"+result[1]+"	"+result[2]+ " "+files[i]);
        }
    }
}
