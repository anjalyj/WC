/**
 * Created by anjalyj on 25/02/16.
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class ArgsSeperatorTest {
    @Test
    public void getFiles_returns_all_the_files_from_a_list_of_arguments() {
        String[] args = {"sample.txt", "-l", "-w"};
        ArgsSeperator arg = new ArgsSeperator(args);
        String[] files = arg.getFiles();
        assertEquals("sample.txt", files[0]);
    }

    @Test
    public void getFiles_returns_everything_otherthan_valid_options() {
        String[] args = {"sample.txt", "-l", "-w", "-m"};
        ArgsSeperator arg = new ArgsSeperator(args);
        String[] files = arg.getFiles();
        assertEquals("sample.txt", files[0]);
        assertEquals("-m", files[1]);
    }

    @Test
    public void getOptions_returns_every_valid_options_given_in_arguments() {
        String[] args = {"sample.txt", "-l", "-w", "-m"};
        ArgsSeperator arg = new ArgsSeperator(args);
        String[] options = arg.getOptions();
        assertEquals("-l", options[0]);
        assertEquals("-w", options[1]);
    }

    @Test
    public void isValidOption_returns_true_if_the_given_option_is_valid() {
        String[] args = {"sample.txt", "-l", "-w", "-m"};
        ArgsSeperator arg = new ArgsSeperator(args);
        assertTrue(arg.isValidOption("-l"));
    }

    @Test
    public void isValidOption_returns_false_if_the_given_option_is_valid() {
        String[] args = {"sample.txt", "-l", "-w", "-m"};
        ArgsSeperator arg = new ArgsSeperator(args);
        assertFalse(arg.isValidOption("sample.txt"));
    }
}
