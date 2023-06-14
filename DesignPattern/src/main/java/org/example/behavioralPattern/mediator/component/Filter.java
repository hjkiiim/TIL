package org.example.behavioralPattern.mediator.component;

import org.example.behavioralPattern.mediator.mediator.Mediator;
import org.example.behavioralPattern.mediator.mediator.Note;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Filter extends JTextField implements Component {
    private Mediator mediator;
    private ListModel listModel;

    public Filter(){ }

    @Override
    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }
    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent){
        String start = getText();
        searchElements(start);
    }

    public void setList(ListModel listModel){
        this.listModel = listModel;
    }
    private void searchElements(String s){
        if(listModel == null){
            return;
        }
        if(s.equals("")){
            mediator.setElementsList(listModel);
            return;
        }
        ArrayList<Note> notes = new ArrayList<Note>();
        for(int i = 0; i < listModel.getSize(); i++){
            notes.add((Note) listModel.getElementAt(i));
        }
        DefaultListModel<Note> defaultListModel = new DefaultListModel<Note>();
        for(Note note : notes){
            if(note.getName().contains(s)){
                defaultListModel.addElement(note);
            }
        }
        mediator.setElementsList(defaultListModel);
    }

    @Override
    public String getName(){
        return "Filter";
    }
}
