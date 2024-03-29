package com.escola.pessoas.empregados;


import com.escola.Endereco;
import com.escola.pessoas.Empregado;

import java.util.Calendar;

public final class Diretor extends Empregado {
    private String departamento;

    public Diretor(String nome, Calendar data_nascimento, long CPF, Endereco endereco, String departamento) {
        super(nome, data_nascimento, CPF, endereco);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

