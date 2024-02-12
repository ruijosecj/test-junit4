package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Teste {
	
	@Test
	public void testPessoasSexoFeminino() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Maria", "f"));
        pessoas.add(new Pessoa("João", "f"));
        pessoas.add(new Pessoa("Ana", "f"));

        for (Pessoa pessoa : pessoas) {
            assertEquals("f", pessoa.getSexo().toLowerCase());
        }
    }
	


}
