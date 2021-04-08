//import java.io.File;
//import java.io.*;

class Fil{

    public static void main(String[] args)throws Exception {


        // File Methods
        
       /** Objects
         *  File f1 = new File("abcd.txt");
         *  File f2 = new File("/Users/ambrish/Desktop/VS_CODEw/fdd/src");
        */ 


        /** Files creation and modification
         *  System.out.println( "\nFile created = " + f1.createNewFile() + "\n" );
         *  System.out.println("\nFile Exist = " + f1.delete() + "\n");//delete the file and dir when dir is empty
         *  System.out.println( "\nFile Renamed = " + f1.renameTo(f2) + "\n" );
         *  
        */

        
        /** Files and Path
         *  System.out.println("\nAbsolute path = " + f1.getAbsolutePath() + "\n");//one file can have multiple Absolute path
         *  System.out.println("\nCanonical Path = " + f1.getCanonicalPath() + "\n");//only one can have only one canonical path
         *  System.out.println("\nCompare to = " + f1.compareTo(f2) + "\n");//compare file paths Lexicographically
         *  System.out.println("\nFile name = " + f1.getName() + "\n");
         *  System.out.println("\nFree Space in bytes = " + f1.getFreeSpace() + "\n");//return free or unallocated space
         *  System.out.println("\nFile Exist = " + f1.exists() + "\n");
         *  System.out.println( "\nLength = " + f1.length() + "\n" );
         *  System.out.println( "\nPath name = " + f1.toString() + "\n" );
         *  System.out.println( "\nParent file = " + f1.getParentFile() + "\n" );
         *  System.out.println( "\nLast Modified = " + f1.lastModified() + "\n" );
         *  System.out.println( "\nFile 1 = File 2 : " + f1.equals(f2) + "\n" );
         *  System.out.println( "\nPath Hash Code : " + f1.hashCode() + "\n" );
         *  System.out.println( "\nFile is is Hidden = " + f1.isHidden()+ "\n" );
        */
        
        
        /** Permissions of file
         *  System.out.println("\nExecutable = " + f1.canExecute() + "\n");
         *  System.out.println("\nSet Executable = " + f1.setExecutable(true) + "\n");
        
         *  System.out.println("\nReadable = " + f1.canRead() + "\n");
         *  System.out.println("\nRead only = " + f1.setReadable(true) + "\n");
         *  System.out.println("\nRead only = " + f1.setReadOnly() + "\n");
        
         *  System.out.println("\nWrite = " + f1.canWrite() + "\n");
         *  System.out.println("\nRead only = " + f1.setWritable(true) + "\n");
         
        */

        /** Lists 
         *  String[] l1 = f2.list();
         *  for (String string : l1) {
                System.out.println(string);
            }
         *
        */


        //File Reader and Buffered Reader

        /** Objects
         *  FileReader fr = new FileReader("abcd.txt");
         *  BufferedReader br = new BufferedReader(fr);
        */

        /** File Reader & Buffered Reader Methods
         *  System.out.println("Char = " fr.read());
         *  System.out.println("Ready to read = " + br.ready());
         *  System.out.println("Line from file = " +  br.readLine());
         *  System.out.println("Object equals = " + br.equals(br)); 
        */

        
        // File Writer and Buffered Writer

        /** Objects
         *  FileWriter fw = new FileWriter("abcd.txt",true);//FileWriter("File name",append = true)
         *  BufferedWriter bw = new BufferedWriter(fw);
        */
        
        /** File Writer and Buffered Writer Methods
         *  fw.write("sd");
         *  bw.newLine();//add new line
         *  bw.write("adbc");
         *  bw.flush();//flush the string without closing it
         *  bw.close();
        */

    }

}