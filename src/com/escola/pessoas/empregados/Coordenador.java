package com.escola.pessoas.empregados;


import com.escola.Endereco;
import com.escola.pessoas.Empregado;

import java.util.Calendar;

public final class Coordenador extends Empregado {
    private String areaCoordenacao;

    public Coordenador(String nome, Calendar data_nascimento, long CPF, Endereco endereco, String areaCoordenacao) {
        super(nome, data_nascimento, CPF, endereco);
        this.areaCoordenacao = areaCoordenacao;
    }

    public String getAreaCoordenacao() {
        return areaCoordenacao;
    }

    public void setAreaCoordenacao(String areaCoordenacao) {
        this.areaCoordenacao = areaCoordenacao;
    }
}

