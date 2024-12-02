package org.example.j;

import java.io.IOException;

public interface FileOperations {
    void saveToFile(FamilyTree familyTree, String fileName) throws
            IOException, IOException;
    FamilyTree loadFromFile(String fileName) throws IOException,
            ClassNotFoundException;
}
