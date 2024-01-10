package com.anasajimuhammed.noteitbackend.features.note.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noteCategory")
public class NotesCategoryController {


    @GetMapping()
    public String getNotesCategory(){
        return "notes category";
    }

}
