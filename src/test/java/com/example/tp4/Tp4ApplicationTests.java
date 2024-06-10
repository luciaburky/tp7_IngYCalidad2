package com.example.tp4;

import com.example.tp4.entities.EstadoVenta;
import com.example.tp4.entities.Venta;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

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
	@Test
	void test_numero_venta_igual_diez_caracteres() {
		Venta venta = new Venta(2011919986);
		assertEquals(String.valueOf(venta.getId()).length(),10);
	}

	@Test
	void test_numero_estado_venta_igual_diez_caracteres() {
		EstadoVenta estadoVenta = new EstadoVenta(2000691986);
		assertEquals(String.valueOf(estadoVenta.getId()).length(),10);
	}

	@Test
	void test_nombre_EstadoVenta (){
		EstadoVenta estadoVenta = new EstadoVenta("Pendiente");
		assertInstanceOf(String.class,estadoVenta.getNombre());
	}

	@Test
	void test_montoTotal_venta_mayor_a_cero (){
		Venta venta = new Venta(3456.00);
		assertTrue(venta.getMontoTotal()>0);
	}

	@Test
	void test_montoTotal_tipo_double (){
		Venta venta = new Venta(3456.00);
		assertInstanceOf(Double.class,venta.getMontoTotal());
	}

	@Test
	void test_montoTotal_no_vacio (){
		Venta venta = new Venta(3456.00);
		assertNotNull(venta.getMontoTotal());
	}

}
