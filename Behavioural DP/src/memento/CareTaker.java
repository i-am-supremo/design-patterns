package memento;

import java.util.Stack;

public class CareTaker {

    private Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor textEditor) {
        history.push(textEditor.save());
    }

    public void undo(TextEditor textEditor) {
        if(!history.isEmpty()){
            EditorMemento memento = history.pop();   // pop and USE it
            textEditor.restore(memento);
        }
    }
}
