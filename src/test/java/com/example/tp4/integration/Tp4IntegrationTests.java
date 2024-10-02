package com.example.tp4.integration;

import com.example.tp4.entities.Venta;
import com.example.tp4.repositories.VentaRepository;
import com.example.tp4.services.VentaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;


@SpringBootTest
class Tp4IntegrationTests {

    @Autowired
    private VentaRepository ventaRepository;

    @Autowired
    private VentaService ventaService;

    @BeforeEach
    void setUp() {
        ventaService.save(new Venta(2500.00));
        ventaService.save(new Venta(2300.00));
    }

    @Test
    void testFindAll() {
        List<Venta> ventas = ventaService.findAll();
        assertThat(ventas).hasSize(2);
    }
}