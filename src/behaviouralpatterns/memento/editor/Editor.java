package behaviouralpatterns.memento.editor;

import behaviouralpatterns.memento.EditorHistory;


public class Editor {

    private String textContent;
    private String textColor;
    private String textBackgroundColor;
    private final EditorHistory editorHistory;

    public Editor(){
        editorHistory = new EditorHistory();
        restoreState((EditorState) editorHistory.getCurrentEditorState());
    }

    public void addTextContent(String textContent){
        EditorState currentEditorState = (EditorState) editorHistory.getCurrentEditorState();
        if(currentEditorState == null){
            currentEditorState = new EditorState.EditorStateBuilder()
                    .build();
        }
        EditorState newEditorState = new EditorState.EditorStateBuilder(currentEditorState.clone())
                .setTextContent(currentEditorState.getTextContent() + textContent)
                .build();

        editorHistory.push(newEditorState);
        restoreState(newEditorState);
    }

    public void addTextColor(String textColor){
        EditorState currentEditorState = (EditorState) editorHistory.getCurrentEditorState();
        if(currentEditorState == null){
            currentEditorState = new EditorState.EditorStateBuilder()
                    .build();
        }
        EditorState newEditorState = new EditorState.EditorStateBuilder(currentEditorState.clone())
                .setTextColor(textColor)
                .build();

        editorHistory.push(newEditorState);
        restoreState(newEditorState);
    }

    public void addTextBackgroundColor(String textBackgroundColor){
        EditorState currentEditorState = (EditorState) editorHistory.getCurrentEditorState();
        if(currentEditorState == null){
            currentEditorState = new EditorState.EditorStateBuilder()
                    .build();
        }
        EditorState newEditorState = new EditorState.EditorStateBuilder(currentEditorState.clone())
                .setTextBackgroundColor(textBackgroundColor)
                .build();

        editorHistory.push(newEditorState);
        restoreState(newEditorState);
    }

    public void undo(){
        editorHistory.movePointerToLeft();
        restoreState((EditorState) editorHistory.getCurrentEditorState());

    }
    public void redo(){
        editorHistory.movePointerToRight();
        restoreState((EditorState) editorHistory.getCurrentEditorState());
    }

    private void restoreState(EditorState editorState){
        if(editorState == null){
            editorState = new EditorState.EditorStateBuilder()
                         .build();
        }

        this.textContent = editorState.getTextContent();
        this.textColor = editorState.getTextColor();
        this.textBackgroundColor = editorState.getTextBackgroundColor();
    }

    @Override
    public String toString() {
        return "textContent : " + textContent + " textColor : " + textColor + " textBackgroundColor : " + textBackgroundColor;
    }

}
