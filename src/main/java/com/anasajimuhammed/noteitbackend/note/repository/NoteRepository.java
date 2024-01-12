package com.anasajimuhammed.noteitbackend.note.repository;

import com.anasajimuhammed.noteitbackend.note.model.NoteModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<NoteModel, String > {
}
