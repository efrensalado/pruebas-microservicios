package com.efrensalado.cotizacionservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efrensalado.cotizacionservice.entity.Producto;
import com.efrensalado.cotizacionservice.repository.ProductoRepository;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productRepository;

    public List<Producto> getAll() {
        return productRepository.findAll();
    }

    public Producto getProductoById (int Id) {
        return productRepository.findById(Id).orElse(null);
    }

    public List<Producto> getProductoByNombre (String nombre) {
        return productRepository.findByNombreOrderBySKU(nombre);
    }

    public Producto save (Producto producto) {
        Producto product = producto;
        return productRepository.save(product);
    }

    public Producto edit (Producto producto) {
        Producto product = productRepository.findById(producto.getSKU()).orElse(null);

        if (product != null) {
            product.setNombre(producto.getNombre());
            product.setDescripcion(producto.getDescripcion());
            product.setPrecio(producto.getPrecio());
            productRepository.save(product);
        }

        return product;
    }

    public Producto delete (int Id) {
        Producto product = productRepository.findById(Id).orElse(null);

        if (product != null) {
            productRepository.delete(product);
        }

        return product;
    }
}
