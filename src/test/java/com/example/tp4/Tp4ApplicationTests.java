package com.example.tp4;

import com.example.tp4.entities.Venta;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class Tp4ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void test() {
		Venta venta = new Venta();
		assertNotNull(venta);
	}



}
