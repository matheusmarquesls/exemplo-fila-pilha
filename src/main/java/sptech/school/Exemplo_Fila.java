package sptech.school;

import java.util.LinkedList;
import java.util.Queue;

public class Exemplo_Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        //Adicionar elementos na Fila
        fila.offer("Primeiro");
        fila.offer("Segundo");
        fila.offer("Terceiro");
        //Mostrar a fila
        System.out.println("Fila atual: " + fila);
        //Removendo elemento da Fila (Primeiro)
        String atendido = fila.poll();
        System.out.println("Atendido: " + atendido);
        //Mostrar quem é o próximo da fila
        String proximo = fila.peek();
        System.out.println("Proximo: " + proximo);
        //Mostrar o estado final da Fila
        System.out.println("Fila final: " + fila);

    }
}
