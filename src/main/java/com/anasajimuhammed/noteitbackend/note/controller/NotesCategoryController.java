package com.anasajimuhammed.noteitbackend.note.controller;

import com.anasajimuhammed.noteitbackend.note.service.NoteServiceInterface;
import lombok.RequiredArgsConstructor;
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
