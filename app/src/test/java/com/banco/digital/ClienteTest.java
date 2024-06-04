package com.banco.digital;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    @Test
    void testNome() {
        Cliente cliente = new Cliente("João da Silva");
        assertEquals("João da Silva", cliente.getNome());
    }

    @Test
    void testNomeVazio() {
        Cliente cliente = new Cliente("");
        assertEquals("", cliente.getNome());
    }

    @Test
    void testNomeNull() {
        Cliente cliente = new Cliente(null);
        assertNull(cliente.getNome());
    }

    @Test
    void testEquals() {
        Cliente cliente1 = new Cliente("João da Silva");
        Cliente cliente2 = new Cliente("João da Silva");
        assertTrue(cliente1.equals(cliente2));
    }

    @Test
    void testEqualsNomeDiferente() {
        Cliente cliente1 = new Cliente("João da Silva");
        Cliente cliente2 = new Cliente("Maria da Silva");
        assertFalse(cliente1.equals(cliente2));
    }

    @Test
    void testEqualsNull() {
        Cliente cliente1 = new Cliente("João da Silva");
        assertFalse(cliente1.equals(null));
    }

    @Test
    void testHashCode() {
        Cliente cliente1 = new Cliente("João da Silva");
        Cliente cliente2 = new Cliente("João da Silva");
        assertEquals(cliente1.hashCode(), cliente2.hashCode());
    }

    @Test
    void testHashCodeNomeDiferente() {
        Cliente cliente1 = new Cliente("João da Silva");
        Cliente cliente2 = new Cliente("Maria da Silva");
        assertNotEquals(cliente1.hashCode(), cliente2.hashCode());
    }

}
