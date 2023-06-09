package seminars.seminar2;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileSystem {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("new_file.txt");
        if (Files.notExists(path)) {
            Files.createFile(path);
        }

        try (OutputStream os = Files.newOutputStream(path)) {
            String output = "output content";
            byte[] bytes = output.getBytes();
            os.write(bytes);
        }


        // java.io.File
        // java.nio.Path
//        File file = new File(".gitignore");
//        Path path = Path.of(".gitignore"); // Paths.get(".gitignore");

//        try {
//            InputStream inputStream = Files.newInputStream(path);
//        } catch (IOException exeption) {
//            System.out.println("Произошла ошибка при открытии файла: " + exeption.getClass() +
//                    " " + exeption.getMessage());
//        }

        // правильный вариант
//        try (InputStream inputStream = Files.newInputStream(path)) {
//            byte[] allBytes = inputStream.readAllBytes();
//            System.out.println(new String(allBytes));
//        } catch (IOException e) {
//            System.out.println("Произошла ошибка при открытии файла: " +
//                    e.getClass() + " " + e.getMessage());
//        }

//        byte[] allBytes = inputStream.readAllBytes();
//        System.out.println(new String(allBytes));
//
//        inputStream.close();


//        Scanner scanner = new Scanner(inputStream);
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine());
//        scanner.close();


//        System.out.println(file.isFile());
//        System.out.println(Files.isRegularFile(path));
//        System.out.println(file.isDirectory());
//        System.out.println(Files.isDirectory(path));
//        System.out.println(file.exists());
//        System.out.println(Files.exists(path));
//
//        Path path1 = path.toAbsolutePath();
//        System.out.println(path1.toString());
    }
}
