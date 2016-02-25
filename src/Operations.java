/**
 * Created by anjalyj on 25/02/16.
 */
public class Operations {
    private String[] files;
    private String[] options;

    public Operations(String[] files, String[] options) {
        this.files = files;
        this.options = options;
    }

    public void wcWithoutOption() {
        int total[] = {0, 0, 0};
        for (int i = 0; i < files.length; i++) {
            int result[] = new int[3];
            Reader fr = new Reader(files[i]);
            WordCount wc = new WordCount(fr.readContent());
            result = wc.l_w_c_Count();
              total =  getTotal(result, total);
            System.out.println(" " + result[0] + "	" + result[1] + "	" + result[2] + " " + files[i]);
        }
        if (files[1] != null)
            System.out.println(" " + total[0] + "	" + total[1] + "	" + total[2] + " total");
    }

    private int[] getTotal(int[] values, int[] result) {
        int index = 0;
        for (int value : values)
            result[index++] += value;
        return result;
    }

}
