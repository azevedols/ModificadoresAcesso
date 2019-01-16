package br.com.publicovsprivado;

public class MyClass {
	
	private int alpha;	//acesso privado
	public int beta;	//acesso publico
	int gamma;			//acesso padrão (basicamente público)
	
	/*Métodos para acessar alpha. Não há problema
	 * em um membro de uma classe acessar um membro
	 * privado da mesma classe.
	 */
	
	void setAlpha (int a){
		alpha = a;
	}
	
	int getAlpha(){
		return alpha;
	}
	

}

class AccessDemo{
	public static void main(String[] args) {
		MyClass ob = new MyClass();
		
		/*O acesso a alpha só é permitido por
		 * intermédio de seus métodos acessores.
		 */
		
		ob.setAlpha(-99);
		System.out.println("ob.alpha is " + ob.getAlpha());
		
		//Você não pode acessar alpha dessa forma:
		//ob.alpha = 10;	//Errado! alpha é privado!
		
		//Essas linhas estão corretas porque beta e gamma são públicos.
		ob.beta = 88;
		ob.gamma = 99;
		
		System.out.println("O valor de ob.beta e : " + ob.beta + " O valor de ob.gamma é: " + ob.gamma);
	}
}