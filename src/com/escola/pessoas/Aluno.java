package com.escola.pessoas;

import com.escola.Endereco;

import java.util.Calendar;

public class Aluno extends Pessoa {
    //Atributos
    private final int matricula;

    //Métodos
    public Aluno (String nome , Calendar data_nascimento , long CPF , Endereco endereco, int matricula) {
        super ( nome , data_nascimento , CPF , endereco );
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
}
