package com.anasajimuhammed.noteitbackend.features.note.service;

import com.anasajimuhammed.noteitbackend.features.note.model.NoteModel;
import com.anasajimuhammed.noteitbackend.features.note.repository.NoteRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
