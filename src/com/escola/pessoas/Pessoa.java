package com.escola.pessoas;

import com.escola.Endereco;

import java.util.Calendar;

import static java.util.Calendar.*;

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private Calendar data_nascimento;
    private long CPF;
    private Endereco endereco;

    //Métodos
    public Pessoa ( String nome , Calendar data_nascimento, long CPF , Endereco endereco ) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.CPF = CPF;
        this.endereco = endereco;
        atualizarIdade ();
    }
    protected void setNome(String nome ) {
        this.nome = nome;
    }
    protected String getNome() {
        return this.nome;
    }
    protected void atualizarIdade () {
        this.idade = calcularIdade ();
    }
    protected int recuperarIdade () {
        return this.idade;
    }
    protected void setCPF ( long CPF ) {
        this.CPF = CPF;
    }
    protected long getCPF () {
        return this.CPF;
    }
    protected void setEndereco ( Endereco endereco ) {
        this.endereco = endereco;
    }
    protected Endereco getEndereco() {
        return this.endereco;
    }
    private int calcularIdade (){
        int lapso;
        Calendar hoje = Calendar.getInstance();
        lapso = hoje.get(YEAR) - data_nascimento.get(YEAR);
        if ( ( data_nascimento.get(MONTH) > hoje.get(MONTH) ) || ( data_nascimento.get(MONTH) ==
                hoje.get(MONTH) && data_nascimento.get(DATE) > hoje.get(DATE) ) )
            lapso--;
        return lapso;
    }
}