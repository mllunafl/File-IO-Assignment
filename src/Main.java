import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

        public class Main {

            public static void main(String[] args) throws IOException {
                //newing up an instane of file with file name .hidden
                File file = new File(".hidden");
                //creating new file is a file with same name does not exist
                file.createNewFile();

                System.out.println("Does file exist?: " + file.exists());
                System.out.println("Can you read it?: " + file.canRead());
                System.out.println("Can you write to it: " + file.canWrite());
                System.out.println("Is it a directory?: " + file.isDirectory());
                System.out.println("Is it a file?: " + file.isFile());
                System.out.println("Is it hidden?: " + file.isHidden());
                System.out.println("Can you execute?(first is false): " + file.canExecute());
                System.out.println("Set executable to true: " + file.setExecutable(true));
                System.out.println("Can you execute now?: " + file.canExecute());
                //System.out.println("Delete it: " + file.delete());
                System.out.println("Do you exist?: " + file.exists());


                System.out.println("=====Adventure======");
                System.out.println("What is absolute path?: " + file.getAbsolutePath());
                System.out.println("What is connical path?: " + file.getCanonicalPath());
                System.out.println("What is your lenght?: " + file.length());


                System.out.println("======Epic=======");
                //create instance of a path and make path for new file
                Path path = Paths.get("/Users/LunaFlores/IdeaProjects/File IO Assignment/.hidden2");
                // create new file with in path done above when path instanciated
                if (!Files.exists(path)){

                    try {
                        Files.createFile(path);
                    } catch (IOException e){
                        System.out.println(e.getMessage());
                    }

                }
                System.out.println("Does the file exist?: " + Files.exists(path));
                System.out.println("Can you read the file?: " + Files.isReadable(path));
                System.out.println("Can you write to file?: " + Files.isWritable(path));
                System.out.println("Is it a directory?: " + Files.isDirectory(path));
                System.out.println("Is it a file?: " + Files.isRegularFile(path));
                System.out.println("Is the file hidden?: " + Files.isHidden(path));
                System.out.println("Can you execute?: " + Files.isExecutable(path));
                // System.out.println(file.setExecutable(false));
                // System.out.println(file.canExecute());
                System.out.println("Delete the file: " + Files.deleteIfExists(path));
                System.out.println("Does the file exist: " + Files.exists(path));
            }
        }
