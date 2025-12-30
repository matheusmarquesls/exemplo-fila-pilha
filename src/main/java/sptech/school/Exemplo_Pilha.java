package sptech.school;

import java.util.Stack;

public class Exemplo_Pilha {
    public static void main(String[] args) {
        //Criando uma pilha de Strings
        Stack<String> pilha = new Stack<>();

        //Adicionar elementos
        pilha.push("Primeiro Elemento");
        pilha.push("Segundo Elemento");
        pilha.push("Terceiro Elemento");
        //Exibir a Pilha
        System.out.println("Pilha atual: " + pilha);

        //Removendo elemento da pilha
        String removido = pilha.pop();
        System.out.println("Pilha removida: " + removido);

        //Mostrar o topo da Pilha
        String topo = pilha.peek();
        System.out.println("Pilha topo: " + topo);

        System.out.println("Pilha atual: " + pilha);
    }
}
