import java.util.Arrays;

class ArgsSeperator {
    private String[] args;

    public ArgsSeperator(String[] args) {
        this.args = args;
    }

    public String[] getFiles() {
        String files[] = new String[args.length];
        int index = 0;
        for (String arg : args) {
            if (!isValidOption(arg))
                files[index++] = arg;
        }
        return files;
    }

    public String[] getOptions() {
        String options[] = new String[args.length];
        int index = 0;
        for (String arg : args)
            if (isValidOption(arg))
                options[index++] = arg;
        return options;
    }

    public boolean isValidOption(String option) {
        String[] options = {"-l", "-w", "-c"};
        return (Arrays.asList(options).indexOf(option) >= 0) ? true : false;
    }
}
