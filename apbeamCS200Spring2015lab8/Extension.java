public class Extension{

//separates file name from extension naming both
  public static void main(String[] args){
    String s = args[0]; //declares the file a String
    int dot = s.indexOf("."); //Separates the file name from extension
    String base = s.substring(0, dot); //Declares file name
    String extension = s.substring(dot + 1, s.length()); //Declares extension

    StdOut.println("File Name: " + base + "\n");
    StdOut.println("Extension: " + extension);

  }
}
