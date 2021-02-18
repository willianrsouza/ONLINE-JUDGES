/*NOME:		Willian Rodrigues de Souza
E-mail:     Williantrabalho944@gmail.com
Site: SPOJBR
PROBLEMA:	SOMA

ROTEIRO: 
Dada uma lista de N inteiros, encontre a soma de todos eles.

ENTRADA: 
A entrada é composta de um único caso de teste. A primeira linha contém um inteiro positivo N. 
As N linhas seguintes contêm cada uma um inteiro X, representando os N números a serem somados.

SAÍDA:
Seu programa deve produzir uma única linha na saída, contendo a soma de todos os N inteiros.

SOLUÇÃO PROPOSTA:
	
A solução é simples, criar uma variavel que recebe o valor inicial digitado pelo usuario,
esse valor vai controlar o laço de repetição. A segunda variavel é colocada dentro desse laço
somando os valores digitados em sequencia, como consequencia o resultado é guardado na mesma variavel. 
*/

package SPOJBR;
import java.util.Scanner;

public class SOMA {
    public static void main(String[]args){
     
     Scanner sc = new Scanner(System.in);

     int qSoma;
     int x = 0; 

     qSoma = sc.nextInt();

     for(int i = 0; i < qSoma; ++i){
      
     x += sc.nextInt();

     }

     System.out.println(x);
      
    }
}
