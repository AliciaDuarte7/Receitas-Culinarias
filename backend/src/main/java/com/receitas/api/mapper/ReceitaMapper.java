package com.receitas.api.mapper;

import com.receitas.api.dto.ReceitaDTO;
import com.ReceitasDTO.api.model.Receita;

import org.springframework.stereotype.Component;

@Component
public class ReceitaMapper{
    public ReceitaDTO convertToDTO(Receita receita){
        return new ReceitaDTO(
            receita.getId(),
            receita.getnomeDaReceita(),
            receita.getIngredientes(),
            receita.getTempoDePreparo(),
            receita.getdificuldadeReceita()
        );
    }
    public Task convertToEntity(ReceitaDTO receitaDTO){
        Receita receita = new Receita();
        receita.setId(receitaDTO.getId());
        receita.setnomeDaReceita(receitaDTO.getnomeDaReceita());
        receita.setIngredientes(receitaDTO.getIngredientes());
        receita.setTempoDePreparo(receitaDTO.getTempoDePreparo());
        receita.setdificuldadeReceita(receitaDTO.getdificuldadeReceita());
        return receita;
    }
}

//desconfio que tenha algo errado, mas deixo pro rei