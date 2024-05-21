package gr.aueb.cf.ch8;


    import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionsApp {
        public static void main(String[] args) throws IOException {
            File file = new File("C:/tmp/file/text");
            try(Scanner in = new Scanner(System.in)) {
                char ch = (char) System.in.read();
                int num = in.nextInt();
            } catch  (FileNotFoundException | InputMismatchException e) {
//            System.out.println("File not found");
                e.printStackTrace();
            }
            catch (IOException e) {
                System.out.println("IO Exception");
                throw e;
            }
//        catch (InputMismatchException e) {
//            e.printStackTrace();
//        }
        }
    }

