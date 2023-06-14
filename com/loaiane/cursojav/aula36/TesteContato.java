package com.loaiane.cursojav.aula36;

public class TesteContato {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("Wenya");
		//Trocando por classes proprias(objetos)
		//contato.setEnderco("Planaltina-df");
		//contato.setTelefone("61 9999-9999");
		
		//Criar objeto endereço(relacionamento tem-um endereco)
		Endereco end = new Endereco();
		end.setNomeRua("Q 19");
		end.setNumero("19");
		end.setComplemento("B IV");
		end.setCidade("Planaltina");
		end.setEstado("DF");
		end.setCep("99999-99");
		//estou passando todas as informaçõe sde end para endereço
		contato.setEnderco(end);
		
		//Relacionamento tem-um telefone
		Telefone tel = new Telefone();
		tel.setDdd("61");
		tel.setTipo("Pré");
		tel.setNumero("9999-9999");
		//contato.setTelefone(tel);
		
		//Relacionamento tem-um para varios telefones
		Telefone cel = new Telefone();
		cel.setDdd("61");
		cel.setTipo("Celular");
		cel.setNumero("9999-9998");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = cel;
		contato.setTelefones(telefones);
		
		//Teste saida no console
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone());
		//System.out.println(contato.getEnderco().getCidade()); Podemos fazer uma melhoria para não precisar da linha 23=contato.setEnderco(end);
		
		if (contato != null && contato.getEnderco() != null) {
			System.out.println(contato.getEnderco().getCidade());
		} 
		
		/*Para modelo um para um
		 * if(contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}*/
		
		if(contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
			
		}

	}

}
