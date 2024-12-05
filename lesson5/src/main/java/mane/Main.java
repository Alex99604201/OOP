package mane;

import presenter.FamilyTree;
import presenter.FileOperationsImpl;
import presenter.TreePresenter;
import view.ConsoleTreeView;
import presenter.Person;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FamilyTree<Person> familyTree = new FamilyTree<>();
        ConsoleTreeView view = new ConsoleTreeView();
        FileOperationsImpl<Person> fileOperations = new
                FileOperationsImpl<>();
        TreePresenter presenter = new TreePresenter(familyTree,
                view, fileOperations);
        presenter.handleUserInput();
    }
}