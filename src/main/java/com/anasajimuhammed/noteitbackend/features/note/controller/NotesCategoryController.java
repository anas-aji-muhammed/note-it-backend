package com.anasajimuhammed.noteitbackend.features.note.controller;

import com.anasajimuhammed.noteitbackend.features.note.model.NoteModel;
import com.anasajimuhammed.noteitbackend.features.note.service.NoteServiceImpl;
import com.anasajimuhammed.noteitbackend.features.note.service.NoteServiceInterface;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/noteCategory")
public class NotesCategoryController {


    final NoteServiceInterface  noteService;

    @GetMapping()
    public String getNotesCategory(){
        return noteService.getNotes();
    }

}
