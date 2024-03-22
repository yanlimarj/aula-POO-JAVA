package com.escola;

import com.escola.pessoas.Aluno;
import com.escola.pessoas.empregados.Coordenador;
import com.escola.pessoas.empregados.Diretor;
import com.escola.pessoas.empregados.Professor;
import com.escola.pessoas.empregados.Secretario;


import java.util.Calendar;

import static com.escola.pessoas.Registro.*;

public class Main {
    public static void main(String[] args) {

        // Exemplo de aluno
        Aluno aluno = getAluno();
        imprimirDados(aluno);
        System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println();
        // Exemplo de coordenador
        Coordenador coordenador = getCoordenador();
        imprimirDados(coordenador);
        System.out.println("Area de coordenação: " + coordenador.getAreaCoordenacao());
        System.out.println();

        // Exemplo de diretor
        Diretor diretor = getDiretor();
        imprimirDados(diretor);
        System.out.println("Departamento: " + diretor.getDepartamento());
        System.out.println();

        // Exemplo de professor
        Professor professor = getProfessor();
        imprimirDados(professor);
        System.out.println("Disciplina(s): " + professor.getDisciplina());
        System.out.println();

        // Exemplo de secretario
        Secretario secretario = getSecretario();
        imprimirDados(secretario);
        System.out.println("Departamento: " + secretario.getDepartamento());
        System.out.println();
    }
}
