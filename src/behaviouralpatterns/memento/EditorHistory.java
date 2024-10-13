package behaviouralpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class EditorHistory{
    private List<Memento> editorStateLinkedList;
    private int currentPointerIndex = -1;

    public EditorHistory(){
        this.editorStateLinkedList = new ArrayList<>();
    }

    public void movePointerToLeft(){
        currentPointerIndex  = Math.max(-1,currentPointerIndex - 1);
    }

    public void movePointerToRight(){
        currentPointerIndex = Math.min(editorStateLinkedList.size() - 1, currentPointerIndex + 1);
    }

    public void push(Memento editorState){
        editorStateLinkedList = editorStateLinkedList.subList(0,currentPointerIndex + 1);
        editorStateLinkedList.add(editorState);
        currentPointerIndex = editorStateLinkedList.size() - 1;
    }

    public Memento getCurrentEditorState(){
        return editorStateLinkedList.isEmpty() ? null : editorStateLinkedList.get(currentPointerIndex);
    }
}