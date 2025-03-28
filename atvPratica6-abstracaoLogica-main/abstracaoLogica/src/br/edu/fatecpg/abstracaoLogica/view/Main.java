package br.edu.fatecpg.abstracaoLogica.view;

import br.edu.fatecpg.abstracaoLogica.model.FilaAtendimento;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos pacientes vão entrar na fila? ");
        int quantidade = scanner.nextInt();

        FilaAtendimento fila = new FilaAtendimento(quantidade, scanner);
        fila.atenderTodos();

        scanner.close();
    }
}
