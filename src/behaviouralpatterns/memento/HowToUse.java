package behaviouralpatterns.memento;

import behaviouralpatterns.memento.editor.Editor;

public class HowToUse {
    public static void main(String[] args) {

        /*
            When you have Situations Where you have to maintain all behavioural patterns.state changes of the Object and want to traverseback
            when ever you want, How would you implement?
            Naive Way:
                I will always create the Copies of the object with new State and store somewhere in a list within the Object
                to traverse back and forth
            Is it Good?
                No The Class not following Single Responsibility Principle here: Why should it concern about maintaining all the States

            Solution ( Memento Pattern ):
                Memento Pattern Suggests the following
                1) Holding the State in of an Object in another Object (Memento) ( Its work is Holding the snapshot of the Object )
                2) A History Object Holding all the Snapshots of the Object.
                3) The Object should itself responsible for making snapshots of it and should restore its behaviouralpatterns.state by its previous snapshots if given
         */


        // Editor is the Object here ( It deals with undo, save, redo from Clients and communicates with EditorHistory Accordingly )
        // EditorState -> Memento is the one that holds the State of the Editor
        // EditorHistory -> That will contain list of EditorState ( Memento Impl ) adds Snapshots, deletes Snapshots as sent by command from Editor
        Editor editor = new Editor();
        System.out.println(editor);

        editor.addTextBackgroundColor("Red");
        editor.addTextContent("M");
        editor.addTextContent("U");
        editor.addTextColor("Green");
        System.out.println(editor);

        editor.undo();
        System.out.println(editor);

        editor.undo();
        System.out.println(editor);

        editor.redo();
        System.out.println(editor);

        editor.addTextColor("Maroon");
        System.out.println(editor);

        editor.undo();
        System.out.println(editor);

        editor.redo();
        System.out.println(editor);

        editor.redo();
        System.out.println(editor);

    }
}
