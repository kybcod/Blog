package exception.Resource;

import java.io.FileInputStream;
import java.io.IOException;

public class ResourceOpenClose {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("file.txt")) {
            fis.read();
            throw new IOException();
        }catch (IOException e){
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}
