package com.efrensalado.plazoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efrensalado.plazoservice.entity.Plazo;
import com.efrensalado.plazoservice.service.PlazoService;

@RestController
@RequestMapping("/plazos")
public class PlazoController {
    @Autowired
    private PlazoService _plazoService;

    @PostMapping()
    public ResponseEntity<Plazo> nuevoPlazo(@RequestBody() Plazo plazo) {
        Plazo nuevoPlazo = _plazoService.save(plazo);

        if (plazo == null) {
            return ResponseEntity.unprocessableEntity().build();
        }
        return ResponseEntity.ok(nuevoPlazo);
    }
}
