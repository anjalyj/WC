import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WCTest{

  @Test
  public void lineCount_returns_the_number_of_lines(){
    String text = "asdfghj\nasdfghj";
    WordCount wc = new WordCount();
    assertEquals(2,wc.lineCount(text));
  }

  @Test
  public void lineCount_counts_the_number_of_lines_in_a_file_with_empty_lines(){
    String text="           \n          \nasdfghjkasdfghk\n";
    WordCount wc = new WordCount();
    assertEquals(3,wc.lineCount(text));
  }

  @Test
  public void lineCount_counts_the_number_of_lines_of_a_single_lined_file(){
      String text="asdfghqwertsdfghjasdfghjsdfghjhertdfgh";
      WordCount wc = new WordCount();
      assertEquals(1,wc.lineCount(text));
  }
  @Test
  public void wordCount_counts_number_of_words_in_a_single_line(){
    String text =  "asdf asdff asdfggh";
    WordCount wc = new WordCount();
    assertEquals(3,wc.wordCount(text));

  }

  @Test
  public void wordCount_counts_number_of_words_of_multiple_lines(){
    String text="asdf asdff\nasdfg\nasd asdfggh";
    WordCount wc = new WordCount();
    assertEquals(5,wc.wordCount(text));
  }

  @Test
  public void countWords_counts_number_of_words_of_multiple_lines_with_tabs_and_returns(){
    String text="asdf asdff\r\nasdfg\r\nasd\tasdfggh";
    WordCount wc = new WordCount();
    assertEquals(5,wc.wordCount(text));
  }
  
}
