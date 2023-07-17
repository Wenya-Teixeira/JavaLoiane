package com.loaiane.cursojav.aula44;

//interfaces são quando não podemos extender apenas uma classe para todos, exemplo, cachorros e cavalos são mamiferos, no entanto,com o cachorro
//existe a possibilidade de brincar no sofa e com o cavalo não, então essa interface seria do cavalo e ainda temos a baleia que não é possivel
//fazer isso no dia a dia

public interface AnimalDomesticado {

	void levarVeterinario();

	void alimentar();

}

//Conceito para interface: seria uma classe abstrata e só possui metodos abstratos, dentor da classe, não consigo, por exemplo:
//public void imporimirNome(){ int i=0; } --> não podemos atribuir valor
//podemos apenas:
//void imprimirNome();
//Interfaces, não tem atributos, todos os atributos dentro de uma interface são do tipo: public final int ANO = 2016; --> aqui possuimos 
//uma constante chaamda ANO.