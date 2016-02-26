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
            Reader readObj = new Reader(files[i]);
            WordCount wc = new WordCount(readObj.readContent());
            result = wc.l_w_c_Count();
            total = getTotal(result, total);
            System.out.println(" " + result[0] + "	" + result[1] + "	" + result[2] + " " + files[i]);
        }
        if (files.length > 1)
            System.out.println(" " + total[0] + "	" + total[1] + "	" + total[2] + " total");
    }

    private int[] getTotal(int[] values, int[] result) {
        int index = 0;
        for (int value : values)
            result[index++] += value;
        return result;
    }

    public void wcWithOption() {
        int total[] = {0, 0, 0};
        for (int j = 0; files[j] != null; j++) {
            int result[] = new int[3];
            Reader readObj = new Reader(files[j]);
            WordCount wc = new WordCount(readObj.readContent());
            for (int i = 0; options[i] != null; i++) {
                result[i] = checkFlag(readObj.readContent(), options[i]);
            }
            total = getTotal(result, total);
            System.out.println(" " + result[0] + "	" + result[1] + "	" + result[2] + " " + files[j]);
        }
        if (files[1] != null)
            System.out.println(" " + total[0] + "	" + total[1] + "	" + total[2] + " total");
    }

    public int checkFlag(String content, String option) {
        WordCount w = new WordCount(content);
        switch (option) {
            case "-l":
                return w.lineCount();
            case "-w":
                return w.wordCount();
            case "-c":
                return w.characterCount();
            default:
                return -1;
        }
    }

}
