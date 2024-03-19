package com.escola.pessoas.empregados;


import com.escola.Endereco;
import com.escola.pessoas.Empregado;

import java.util.Calendar;

public class Professor extends Empregado {
    private String disciplina;

    public Professor(String nome, Calendar data_nascimento, long CPF, Endereco endereco, String disciplina) {
        super(nome, data_nascimento, CPF, endereco);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}

