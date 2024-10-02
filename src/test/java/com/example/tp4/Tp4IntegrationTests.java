package com.example.tp4;

import com.example.tp4.entities.Venta;
import com.example.tp4.repositories.VentaRepository;
import com.example.tp4.services.VentaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;


@DataJpaTest
class Tp4IntegrationTests {

    @Autowired
    private VentaRepository ventaRepository;

    private VentaService ventaService;

    @BeforeEach
    void setUp() {
        ventaService = new VentaService(ventaRepository);
        // Insertar datos de prueba
        ventaService.save(new Venta(2500.00));
    }

    @Test
    void testFindAll() {
        List<Venta> ventas = ventaService.findAll();
        assertThat(ventas).hasSize(1);
    }
}