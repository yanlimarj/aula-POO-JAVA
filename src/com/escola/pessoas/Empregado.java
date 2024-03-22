package com.escola.pessoas;

import com.escola.Endereco;

import java.util.Calendar;

public abstract class Empregado extends Pessoa {
    //Atributos
    protected String matricula;

    public Empregado(String nome, Calendar data_nascimento, long CPF, Endereco endereco) {
        super(nome, data_nascimento, CPF, endereco);
        this.matricula = getMatricula();
        Calendar data_admissao = Calendar.getInstance();
    }
    public void demitirEmpregado () {
        Calendar data_demissao = Calendar.getInstance();
    }
    protected void gerarMatricula () {
        this.matricula = "Matrícula não definida.";
    }
    protected String getMatricula() {
        return this.matricula;
    }
}
