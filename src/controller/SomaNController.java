package controller;

public class SomaNController {

	public SomaNController() {
		// TODO Auto-generated constructor stub
	}

	public double soma(double numero,double aux) {
		double resultado = 0;
		if (aux > numero) { //verifica quando a aux que inicia com 1 fica maior que o numero
			return 0;
		} else {
			resultado = 1 / aux;
			aux = aux +1;  //aumenta em +1 a aux até ela ser igual ao numero
			}
		return resultado + soma(numero, aux);
	}
}