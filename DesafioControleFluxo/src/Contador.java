import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt ();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt ();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
		
        terminal.close ();
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
		

        int subtracao = parametroDois - parametroUm;
		for (int contagem = 1; contagem <= subtracao; contagem++) {
            System.out.println("Contagem: " + contagem);
        }
	}
}
