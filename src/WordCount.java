class WordCount {
    private String str;

    public WordCount(String str) {
        this.str = str;
    }

    public int lineCount() {
        int lines = str.split("\n").length;
        return (lines);
    }

    public int wordCount() {
        String[] words = str.split("\\s+");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] != "")
                count++;
        }
        return count;
    }

    public int characterCount() {
        return str.length();
    }

    public int byteCount() {
        byte[] bytes = str.getBytes();
        return bytes.length;
    }

    public int[] l_w_c_Count() {
        WordCount w = new WordCount(str);
        int result[] = {w.lineCount(), w.wordCount(), w.characterCount()};
        return result;
    }
}
