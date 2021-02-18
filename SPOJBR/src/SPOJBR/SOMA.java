/*NOME:		Willian Rodrigues de Souza
E-mail:     Williantrabalho944@gmail.com
Site: SPOJBR
PROBLEMA:	SOMA

ROTEIRO: 
Dada uma lista de N inteiros, encontre a soma de todos eles.

ENTRADA: 
A entrada � composta de um �nico caso de teste. A primeira linha cont�m um inteiro positivo N. 
As N linhas seguintes cont�m cada uma um inteiro X, representando os N n�meros a serem somados.

SA�DA:
Seu programa deve produzir uma �nica linha na sa�da, contendo a soma de todos os N inteiros.

SOLU��O PROPOSTA:
	
A solu��o � simples, criar uma variavel que recebe o valor inicial digitado pelo usuario,
esse valor vai controlar o la�o de repeti��o. A segunda variavel � colocada dentro desse la�o
somando os valores digitados em sequencia, como consequencia o resultado � guardado na mesma variavel. 
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
