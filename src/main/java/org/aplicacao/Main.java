package org.aplicacao;

import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;

import org.aplicacao.dto.EnderecoDto;
import org.aplicacao.servico.ApiServico;

import java.io.IOException;

public class Main {

    public static void main(String[] args ){

        ApiServico apiServico = new ApiServico();
        try {

            EnderecoDto enderecoDto = apiServico.getEndereco("03107048");
            System.out.println(enderecoDto.getBairro());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}