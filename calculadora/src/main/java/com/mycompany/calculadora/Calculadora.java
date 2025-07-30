
package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        double resultado;
     
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite o tipo de operaçao que deseja realizar (+, -, /, *):");
        char operacao=teclado.next().charAt(0);
        
        System.out.println("Digite o valor um:");
        double num1=teclado.nextDouble();
        System.out.println("Digite o valor dois:");
        double num2=teclado.nextDouble();
        
        
        switch(operacao){
            case '+':
                resultado=num1+num2;
                break;
            
                case '-':
                    resultado=num1-num2;
                    break;
                    
                    case '/':
                        resultado=num1/num2;
                        break;
                    
                        case '*':
                            resultado=num1*num2;
                            break;
                            
                        default:
                            System.out.println("Não foi possivel realizar a operaçao!");
                            return;
                
        }
        System.out.println(num1+ " " +operacao+ " " +num2+ ": " +resultado);
       
        
    }
    
}

