package com.anasajimuhammed.noteitbackend.features.note.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "note_collection")
@Data
public class NoteModel {
    @Id
    public String  noteId;
    public String note;
}
