package com.receitasculinarias.api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.receitasculinarias.api.dto.ReceitaDTO;
import com.receitasculinarias.api.mapper.ReceitaMapper;
import com.receitasculinarias.api.model.Task;
import com.todoreceitasculinarias.list.api.repository.ReceitaRepository;

import java.util.Receita;
import java.util.Optional;

@service
public class ReceitaService {
    private static final Logger logger = LoggerFactory.getLogger(ReceitaService.class);
    private final ReceitaRepository ReceitaRepository;
    private final ReceitaMapper ReceitaMapper;

}

Transactional(readOnly = true) // isso tá suspeito
public Opcional<ReceitaDTO> getReceitaById(long Id){
    logger.debug("Buscar receita por Id='{}'", Id);
    return receitaRepository.findById(Id).map(ReceitaMapper::convertToDTO);
    //toda essa parte me parece errada e sem nexo, mas entendi oq ele faz.

}

@Transactional
public ReceitaDTO createReceita(ReceitaDTO receitaDTO){
    logger.info("criando a receita com um Titulo ='{}'", ReceitaDTO.getTituloDaReceita());
    Receita receita = ReceitaMapper.convertToEntity(ReceitaDTO);
    Receita savedReceita = ReceitaRepository.save(receita);
    return ReceitaMapper.convertToDTO(savedReceita);
    //n cheguei em conclusão nennhuma mas ta ai
}

@Transactional
public Optional<ReceitaDTO> updateReceita(Long Id, ReceitaDTO receitaDTO){
    logger.info("Atualizar receita por Id={}", Id);
    return ReceitaRepository.findById(Id).map(existingTask -> {
        existingReceita.setnomeDaReceita(ReceitaDTO.getnomeDaReceita());
        existingReceita.set
    })
}