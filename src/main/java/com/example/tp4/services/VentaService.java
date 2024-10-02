package com.example.tp4.services;

import com.example.tp4.entities.Venta;
import com.example.tp4.repositories.VentaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaService {
    private VentaRepository ventaRepository;

    public VentaService(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    public Venta save(Venta venta) {
        return ventaRepository.save(venta);
    }

    public Optional<Venta> findById(Long id) {
        return ventaRepository.findById(id);
    }

    public List<Venta> findAll() {
        return ventaRepository.findAll();
    }

    public void delete(Long id) {
        ventaRepository.deleteById(id);
    }
}