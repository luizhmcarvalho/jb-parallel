package net.parallel.jb.aula2;
import net.parallel.jb.classes.*;

public class Ex01 {

	public static void main(String[] args) {

		/*
		//Atribuindo o valor à variável nome
		String nome = "Teste";
		
		//Imprime o valor da variável
		System.out.println(nome);
		
		//Imprime o valor da posição 3 da string
		System.out.println(nome.charAt(3));
		
		//Compara o valor de uma string
		System.out.println(nome.equals("teste"));
		
		//Compara o valor de uma string
		//Ignorando maiúsculas e minúsculas
		System.out.println(nome.equalsIgnoreCase("teste"));
		
		
		for(int i = 0; i < nome.length(); i++){
			System.out.println(nome.charAt(i));
		}
		
		nome = "Java";
		for(int i = nome.length() -1; i >=0; i--){
			System.out.println(nome.charAt(i));
		}*/
		
		
		//Ex02.imprimeVetores();
		
		Pessoa p = new Pessoa();
		
		p.setId(1);
		p.setNome("Luiz");
		
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica();
		
		pf.setId(p.getId());
		pf.setNome(p.getNome());
		
		pf.setCpf("12312312345");
		
		System.out.println(pf);
		
		p = pf;
		System.out.println(p);
		
		Imovel im = new Casa();
		
		im.setId(1);
		im.setEndereco("Rua A, Centro, SSA - BA");
		
		for(int i= 1; i <= 20; i++){
			Pessoa morador1 = new Pessoa();
			morador1.setId(i);
			morador1.setNome("Pessoa " + 1);
			im.addMorador(morador1);
		}
		
		Pessoa morador = im.getMoradores().get(5);
		morador.setNome("Luiz");
		im.setMorador(5, morador);
		
		
		System.out.println(im);
	}

}
