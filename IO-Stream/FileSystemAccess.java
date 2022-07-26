import java.io.File;

public class FileSystemAccess {

    public static void main(String[] args) {
        
        File[] rootList = File.listRoots();

        for(var root : rootList){
            System.out.println("Path: " + root.getPath());
            System.out.println("- exists: " + root.exists());
            System.out.println("- can read: " + root.canRead());
            System.out.println("- can write: " + root.canWrite());
            System.out.println("- is directory: " + root.isDirectory());
        }

        var systemProperties = System.getProperties();
        
        for(var key : systemProperties.keySet()){
            System.out.println("Key: " + key + " // Value: " + systemProperties.get(key));
        }
    }

}