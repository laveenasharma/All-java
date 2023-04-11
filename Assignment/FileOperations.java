import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String choice = "";
        do {
            System.out.println("Menu based app - File Operations in Java");
            System.out.println("1. Create a new folder");
            System.out.println("2. Create a new text file");
            System.out.println("3. Write into a text file");
            System.out.println("4. Append data to a text file");
            System.out.println("5. Rename a file");
            System.out.println("6. Delete a File");
            System.out.println("7. Exit");
            System.out.print("Please enter the Menu: ");
            try {
                choice = br.readLine();
                switch (choice) {
                    case "1":
                        System.out.print("Please enter the Folder-name to be Created: ");
                        String folderName = br.readLine();
                        System.out.print("Please enter the Path where you wish to save a new folder: ");
                        String folderPath = br.readLine();
                        createFolder(folderName, folderPath);
                        break;
                    case "2":
                        System.out.print("Please enter the File-name to be Created: ");
                        String fileName = br.readLine();
                        System.out.print("Please enter the Path where you wish to save a new file: ");
                        String filePath = br.readLine();
                        createFile(fileName, filePath);
                        break;
                    case "3":
                        System.out.print("Please enter the absolute path of the file to write into: ");
                        String filePathWrite = br.readLine();
                        System.out.print("Please enter the content to be written: ");
                        String fileContentWrite = br.readLine();
                        writeToFile(filePathWrite, fileContentWrite);
                        break;
                    case "4":
                        System.out.print("Please enter the absolute path of the file to append data to: ");
                        String filePathAppend = br.readLine();
                        System.out.print("Please enter the data to be appended: ");
                        String fileContentAppend = br.readLine();
                        appendToFile(filePathAppend, fileContentAppend);
                        break;
                    case "5":
                        System.out.print("Please enter the absolute path of the file to be renamed: ");
                        String filePathRename = br.readLine();
                        System.out.print("Please enter the new name of the file: ");
                        String newFileName = br.readLine();
                        renameFile(filePathRename, newFileName);
                        break;
                    case "6":
                        System.out.print("Please enter the absolute path of the file to be deleted: ");
                        String filePathDelete = br.readLine();
                        deleteFile(filePathDelete);
                        break;
                    case "7":
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
            System.out.print("Press 'Y' to go back to the Main File-Operations Menu: ");
            try {
                choice = br.readLine().toUpperCase();
            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        } while (choice.equals("Y"));
    }

    public static void createFolder(String folderName, String folderPath) {
        File folder = new File(folderPath + "\\" + folderName);
        try {
            if (folder.mkdir()) {
                System.out.println("Folder is created Successfully!");
            } else {
                System.out.println("Failed to create the Folder!");
            }
        } catch (SecurityException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
