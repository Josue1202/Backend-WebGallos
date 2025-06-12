package com.josue.Backend_WebGallos.controller;

import com.josue.Backend_WebGallos.model.Multimedia;
import com.josue.Backend_WebGallos.service.MultimediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/multimedia")
public class MultimediaController {

    @Autowired
    private MultimediaService multimediaService;

    @PostMapping
    public Multimedia crearMultimedia(@RequestBody Multimedia multimedia) {
        return multimediaService.guardarMultimedia(multimedia);
    }

    @GetMapping
    public List<Multimedia> listarMultimedia() {
        return multimediaService.listarMultimedia();
    }

    @GetMapping("/{id}")
    public Multimedia obtenerMultimedia(@PathVariable Integer id) {
        return multimediaService.obtenerMultimediaPorId(id)
                .orElseThrow(() -> new RuntimeException("Multimedia no encontrada con id: " + id));
    }

    @PutMapping("/{id}")
    public Multimedia actualizarMultimedia(@PathVariable Integer id, @RequestBody Multimedia multimedia) {
        return multimediaService.actualizarMultimedia(id, multimedia);
    }

    @DeleteMapping("/{id}")
    public void eliminarMultimedia(@PathVariable Integer id) {
        multimediaService.eliminarMultimedia(id);
    }
}
