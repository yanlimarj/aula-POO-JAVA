package com.escola.pessoas;

import com.escola.Endereco;
import com.escola.pessoas.Aluno;
import com.escola.pessoas.empregados.Coordenador;
import com.escola.pessoas.empregados.Diretor;
import com.escola.pessoas.empregados.Professor;
import com.escola.pessoas.empregados.Secretario;

import java.util.Calendar;

public class Registro {

    public static Aluno getAluno() {
        Calendar dataAluno = Calendar.getInstance();
        dataAluno.set(2000, 5, 15);
        Endereco enderecoAluno = new Endereco();
        enderecoAluno.setPais("Brasil");
        enderecoAluno.setUf("RJ");
        enderecoAluno.setCidade("Rio de Janeiro");
        enderecoAluno.setRua("Rua das Flores");
        enderecoAluno.setNumero("123");
        enderecoAluno.setCep(20000000);
        enderecoAluno.setComplemento("Ap 101");
        Aluno aluno = new Aluno("Maria", dataAluno, 123456789, enderecoAluno);
        aluno.atualizarIdade();
        return aluno;
    }
    public static Coordenador getCoordenador() {
        Calendar dataCoordenador = Calendar.getInstance();
        dataCoordenador.set(1975, 2, 10);
        Endereco enderecoCoordenador = new Endereco();
        enderecoCoordenador.setPais("Brasil");
        enderecoCoordenador.setUf("SP");
        enderecoCoordenador.setCidade("São Paulo");
        enderecoCoordenador.setRua("Rua Principal");
        enderecoCoordenador.setNumero("456");
        enderecoCoordenador.setCep(10000000);
        enderecoCoordenador.setComplemento("Sala 201");
        Coordenador coordenador = new Coordenador("João", dataCoordenador, 987654321, enderecoCoordenador, "Ciências");
        coordenador.atualizarIdade();
        return coordenador;
    }

    public static Diretor getDiretor() {
        Calendar dataDiretor = Calendar.getInstance();
        dataDiretor.set(1960, 8, 25);
        Endereco enderecoDiretor = new Endereco();
        enderecoDiretor.setPais("Brasil");
        enderecoDiretor.setUf("MG");
        enderecoDiretor.setCidade("Belo Horizonte");
        enderecoDiretor.setRua("Av. Central");
        enderecoDiretor.setNumero("789");
        enderecoDiretor.setCep(30000000);
        enderecoDiretor.setComplemento("Escritório");
        Diretor diretor = new Diretor("Carlos", dataDiretor, 654321987, enderecoDiretor, "Administração");
        diretor.atualizarIdade();
        return diretor;
    }

    public static Professor getProfessor() {
        Calendar dataProfessor = Calendar.getInstance();
        dataProfessor.set(1985, 3, 20);
        Endereco enderecoProfessor = new Endereco();
        enderecoProfessor.setPais("Brasil");
        enderecoProfessor.setUf("RS");
        enderecoProfessor.setCidade("Porto Alegre");
        enderecoProfessor.setRua("Rua da Escola");
        enderecoProfessor.setNumero("321");
        enderecoProfessor.setCep(90000000);
        enderecoProfessor.setComplemento("Sala dos Professores");
        Professor professor = new Professor("Ana", dataProfessor, 456789123, enderecoProfessor, "Matemática");
        professor.atualizarIdade();
        return professor;
    }

    public static Secretario getSecretario() {
        Calendar dataSecretario = Calendar.getInstance();
        dataSecretario.set(1990, 11, 5);
        Endereco enderecoSecretario = new Endereco();
        enderecoSecretario.setPais("Brasil");
        enderecoSecretario.setUf("BA");
        enderecoSecretario.setCidade("Salvador");
        enderecoSecretario.setRua("Rua do Trabalho");
        enderecoSecretario.setNumero("789");
        enderecoSecretario.setCep(40000000);
        enderecoSecretario.setComplemento("Escritório do Secretário");
        Secretario secretario = new Secretario("Paulo", dataSecretario, 789123456, enderecoSecretario, "Secretariado");
        secretario.atualizarIdade();
        return secretario;
    }

    public static void imprimirDados(Pessoa pessoa) {
        System.out.println("Tipo: " + pessoa.getClass().getSimpleName());
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Data de Nascimento: " + pessoa.formatarDataNascimento());
        System.out.println("Idade: " + pessoa.getIdade());


        Endereco endereco = pessoa.getEndereco();
        System.out.println("Endereço: " + endereco.getRua() + ", " + endereco.getNumero() +
                ", " + endereco.getComplemento() + ", " + endereco.getCidade() +
                ", " + endereco.getUf() + ", " + endereco.getPais());

    }
}
