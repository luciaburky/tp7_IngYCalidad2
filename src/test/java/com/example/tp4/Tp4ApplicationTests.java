package com.example.tp4;

import com.example.tp4.entities.EstadoVenta;
import com.example.tp4.entities.Venta;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class Tp4ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void test_existencia_clase_venta() {
		Venta venta = new Venta();
		assertNotNull(venta);
	}

	@Test
	void test_existencia_clase_estado_venta() {
		EstadoVenta estado = new EstadoVenta();
		assertNotNull(estado);
	}

	@Test
	void test_numero_venta_no_vacio() {
		Venta venta = new Venta(5667);
		assertNotNull(venta.getId());
	}

}
