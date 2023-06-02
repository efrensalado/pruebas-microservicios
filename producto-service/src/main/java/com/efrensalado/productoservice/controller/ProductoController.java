package com.efrensalado.productoservice.controller;

import com.efrensalado.productoservice.entity.Producto;
import com.efrensalado.productoservice.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoService _prodService;

    @GetMapping()
    public ResponseEntity<List<Producto>> listarUsuarios() {
        List<Producto> productos = _prodService.getAll();

        if (productos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(productos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> obtenerProducto(@PathVariable("id") int id) {
        Producto producto = _prodService.getProductoById(id);

        if (producto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(producto);
    }

    @PostMapping()
    public ResponseEntity<Producto> nuevoProducto(@RequestBody() Producto producto) {
        Producto nuevoProducto = _prodService.save(producto);

        if (producto == null) {
            return ResponseEntity.unprocessableEntity().build();
        }
        return ResponseEntity.ok(nuevoProducto);
    }

    @PutMapping()
    public ResponseEntity<Producto> editarProducto(@RequestBody() Producto producto) {
        Producto prod = _prodService.edit(producto);

        if (prod == null) {
            return ResponseEntity.unprocessableEntity().build();
        }
        return ResponseEntity.ok(prod);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Producto> eliminarProducto(@RequestParam("id") int id) {
        Producto prod = _prodService.delete(id);

        if (prod == null) {
            return ResponseEntity.unprocessableEntity().build();
        }
        return ResponseEntity.ok(prod);
    }
}