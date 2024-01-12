package com.anasajimuhammed.noteitbackend.note.service;

import com.anasajimuhammed.noteitbackend.note.model.NoteModel;
import com.anasajimuhammed.noteitbackend.note.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteServiceInterface{


    public final NoteRepository noteRepository;


    @Override
    public String getNotes() {
        NoteModel note = new NoteModel();
        note.setNote("new Note");
        noteRepository.save(note);
        return "notes";
    }
}
