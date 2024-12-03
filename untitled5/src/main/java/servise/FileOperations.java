package servise;

import model.FamilyTree;

import java.io.IOException;

public interface FileOperations {
    default void saveToFile(FamilyTree familyTree, String fileName) throws IOException {

    }

    default FamilyTree loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        return null;
    }
}
