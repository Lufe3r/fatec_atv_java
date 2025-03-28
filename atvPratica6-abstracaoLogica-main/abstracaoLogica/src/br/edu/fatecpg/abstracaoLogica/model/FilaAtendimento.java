package br.edu.fatecpg.abstracaoLogica.model;

import java.util.Scanner;

public class FilaAtendimento {
    private int pacientesNaFila;
    private Scanner scanner;

    public FilaAtendimento(int totalPacientes, Scanner scanner) {
        this.pacientesNaFila = totalPacientes;
        this.scanner = scanner;
    }

    public void adicionarPaciente() {
        System.out.print("Novo paciente chegou? (s/n): ");
        String resposta = scanner.next().trim().toLowerCase();
        
        if (resposta.equals("s")) {
            pacientesNaFila++;
            System.out.println("Novo paciente entrou na fila. Total na fila: " + pacientesNaFila);
        }
    }

    public void chamarPacientes() {
        if (pacientesNaFila == 0) {
            System.out.println("Não há pacientes na fila.");
            return;
        }

        int atendidos = Math.min(2, pacientesNaFila);
        System.out.println("Chamando " + atendidos + " paciente(s) para atendimento.");
        pacientesNaFila -= atendidos;

        adicionarPaciente(); // Pergunta se há novos pacientes antes do próximo atendimento
    }

    public void atenderTodos() {
        while (pacientesNaFila > 0) {
            chamarPacientes();
        }
        System.out.println("Todos os pacientes foram atendidos.");
    }
}
