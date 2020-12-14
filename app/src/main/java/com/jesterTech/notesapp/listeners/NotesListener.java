package com.jesterTech.notesapp.listeners;

import com.jesterTech.notesapp.entities.Notes;

public interface NotesListener {
    void onNoteClicked(Notes notes, int position);

}
