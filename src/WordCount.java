class WordCount{

 public int lineCount(String text){
   int lines = text.split("\n").length;
   return (lines);
 }

 public int wordCount(String text){
   String[] words = text.split("\\s+");
   int count=0;
   for(int i=0;i<words.length;i++){
     if(words[i]!="")
      count++;
   }
   return count;
 }

 public int characterCount(String text){
   return text.length();
 }

 public int byteCount(String text){
   byte[] bytes = text.getBytes();
   return bytes.length;
 }
}
