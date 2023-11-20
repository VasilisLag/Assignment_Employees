// Violation of Dependency Inversion Principle (DIP)
public class FileManager {
    // Violation: This class depends on a low-level module (FileWriter) instead of an abstraction.
    private FileWriters fileWriter;

    public FileManager() {
        this.fileWriter = new FileWriters();
    }

    public void saveToFile(String data) {
        fileWriter.write(data);
    }
}
