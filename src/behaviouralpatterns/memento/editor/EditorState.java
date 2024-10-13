package behaviouralpatterns.memento.editor;

import behaviouralpatterns.memento.Memento;

class EditorState implements Cloneable, Memento {

    private static final String DEFAULT_TEXT_CONTENT = "";
    private static final String DEFAULT_TEXT_COLOR = "Black";
    private static final String DEFAULT_TEXT_BACKGROUND_COLOR = null;

    private String textContent = DEFAULT_TEXT_CONTENT;
    private String textColor = DEFAULT_TEXT_COLOR;
    private String textBackgroundColor = DEFAULT_TEXT_BACKGROUND_COLOR;

    private EditorState(){}

    public String getTextContent() {
        return textContent;
    }

    public String getTextColor() {
        return textColor;
    }

    public String getTextBackgroundColor() {
        return textBackgroundColor;
    }

    @Override
    public EditorState clone() {
        try {
            return (EditorState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    static class EditorStateBuilder{

        private String textContent = EditorState.DEFAULT_TEXT_CONTENT;
        private String textColor = EditorState.DEFAULT_TEXT_COLOR;
        private String textBackgroundColor = EditorState.DEFAULT_TEXT_BACKGROUND_COLOR;

        public EditorStateBuilder(){

        }

        public EditorStateBuilder(EditorState editorState){
            this.textContent = editorState.textContent;
            this.textColor = editorState.textColor;
            this.textBackgroundColor = editorState.textBackgroundColor;
        }

        public EditorStateBuilder setTextContent(String textContent) {
            this.textContent = textContent;
            return this;
        }

        public EditorStateBuilder setTextColor(String textColor) {
            this.textColor = textColor;
            return this;
        }

        public EditorStateBuilder setTextBackgroundColor(String textBackgroundColor) {
            this.textBackgroundColor = textBackgroundColor;
            return this;
        }

        public EditorState build(){
            EditorState editorState = new EditorState();
            editorState.textContent = textContent;
            editorState.textColor = textColor;
            editorState.textBackgroundColor = textBackgroundColor;

            return editorState;
        }

    }
}
