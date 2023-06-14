package org.example.behavioralPattern.command.command;

import org.example.behavioralPattern.command.editor.Editor;

public class CopyCommand extends Command{
    public CopyCommand(Editor editor){
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
