package in.youssef.springboot.controller;

import in.youssef.springboot.entity.Note;
import in.youssef.springboot.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class NotesController {
    @Autowired
    NotesRepository nRepository;

    @GetMapping("/notes")
    public ResponseEntity<List<Note>> readNotes () {
        return new ResponseEntity<List<Note>>(nRepository.findAll(), HttpStatus.OK);
    }

    // NotesRepository provides a save() to save Note object
    @PostMapping("/notes")
    public ResponseEntity<Note> createNote(@RequestBody Note note) {
        return new ResponseEntity<Note>(nRepository.save(note), HttpStatus.CREATED);
    }

    @GetMapping("/notes/{id}")
    public ResponseEntity<Note> readNote(@PathVariable long id) {
        return new ResponseEntity<Note>(nRepository.findById(id).get(), HttpStatus.OK);
    }

    @DeleteMapping("/notes/{id}")
    public ResponseEntity<HttpStatus> deleteNote(@PathVariable long id) {
        nRepository.deleteById(id);
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/notes")
    public ResponseEntity<Note> updateNote(@RequestBody Note note) {
        return new ResponseEntity<Note>(nRepository.save(note), HttpStatus.OK);
    }


}
