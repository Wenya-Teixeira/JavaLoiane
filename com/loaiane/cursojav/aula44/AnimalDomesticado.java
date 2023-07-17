package com.loaiane.cursojav.aula44;

//interfaces s�o quando n�o podemos extender apenas uma classe para todos, exemplo, cachorros e cavalos s�o mamiferos, no entanto,com o cachorro
//existe a possibilidade de brincar no sofa e com o cavalo n�o, ent�o essa interface seria do cavalo e ainda temos a baleia que n�o � possivel
//fazer isso no dia a dia

public interface AnimalDomesticado {

	void levarVeterinario();

	void alimentar();

}

//Conceito para interface: seria uma classe abstrata e s� possui metodos abstratos, dentor da classe, n�o consigo, por exemplo:
//public void imporimirNome(){ int i=0; } --> n�o podemos atribuir valor
//podemos apenas:
//void imprimirNome();
//Interfaces, n�o tem atributos, todos os atributos dentro de uma interface s�o do tipo: public final int ANO = 2016; --> aqui possuimos 
//uma constante chaamda ANO.