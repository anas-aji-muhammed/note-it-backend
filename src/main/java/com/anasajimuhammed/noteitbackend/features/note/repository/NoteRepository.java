package com.anasajimuhammed.noteitbackend.features.note.repository;

import com.anasajimuhammed.noteitbackend.features.note.model.NoteModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<NoteModel, String > {
}
