package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    Pessoa p = new Pessoa();
	    List<Pessoa> pessoas = new ArrayList<>();
	    String[] dadosSeparados = {"",""};
	    String dados = "";
	    while(!dados.equalsIgnoreCase("Sair")){
	        System.out.println("Digite nome-sexo: ou digite sair para encerrar");
	        dados = s.next();
	        if(dados.equalsIgnoreCase("sair")) {
	            break;
	        }
	        dadosSeparados = dados.split("-");
	        p.setNome(dadosSeparados[0]);
	        p.setSexo(dadosSeparados[1]);
	        pessoas.add(p);
	        p=new Pessoa();
	    }
	    pessoas.stream().filter(pessoa->pessoa.getSexo().equalsIgnoreCase("f")).forEach(System.out::println);
	}
}
