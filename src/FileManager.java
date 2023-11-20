// High-level module with file management operations
public class FileManager {
    private FilePersistence filePersistence;

    // Inject FilePersistence through constructor (dependency injection)
    public FileManager(FilePersistence filePersistence) {
        this.filePersistence = filePersistence;
    }

    public void saveToFile(String data) {
        filePersistence.writeToFile(data);
    }
}
