package com.escola.pessoas;

import com.escola.Endereco;

import java.text.SimpleDateFormat;
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
    protected int getIdade() {
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
    protected String formatarDataNascimento(){
        int ano = data_nascimento.get(YEAR);
        int mes = data_nascimento.get(MONTH);
        int dia = data_nascimento.get(DAY_OF_MONTH);
        return String.format("%02d/%02d/%04d", dia, mes, ano);
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