package br.com.publicovsprivado;

public class MyClass {
	
	private int alpha;	//acesso privado
	public int beta;	//acesso publico
	int gamma;			//acesso padr�o (basicamente p�blico)
	
	/*M�todos para acessar alpha. N�o h� problema
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
		
		/*O acesso a alpha s� � permitido por
		 * interm�dio de seus m�todos acessores.
		 */
		
		ob.setAlpha(-99);
		System.out.println("ob.alpha is " + ob.getAlpha());
		
		//Voc� n�o pode acessar alpha dessa forma:
		//ob.alpha = 10;	//Errado! alpha � privado!
		
		//Essas linhas est�o corretas porque beta e gamma s�o p�blicos.
		ob.beta = 88;
		ob.gamma = 99;
		
		System.out.println("O valor de ob.beta e : " + ob.beta + " O valor de ob.gamma �: " + ob.gamma);
	}
}