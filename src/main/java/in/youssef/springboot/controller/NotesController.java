package in.youssef.springboot.controller;

import in.youssef.springboot.entity.Note;
import in.youssef.springboot.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NotesController {
    @Autowired
    NotesRepository nRepository;

    @GetMapping("/notes")
    public ResponseEntity<List<Note>> readNotes () {
        return new ResponseEntity<List<Note>>(nRepository.findAll(), HttpStatus.OK);
    }

}
