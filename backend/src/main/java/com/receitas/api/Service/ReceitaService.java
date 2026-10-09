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

@Service
public class ReceitaService {
   private static final Logger logger = LoggerFactory.getLogger(ReceitaService.class);
   
   
   private final ReceitaRepository receitaRepository;
   private final ReceitaMapper receitaMapper;

   public ReceitaService(ReceitaRepository receitaRepository, ReceitaMapper receitaMapper){
    this.receitaRepository = ReceitaRepository;
    this.receitaMapper = ReceitaMapper;


   }

   //lista todas as receitas
   @Transactional(readOnly = true)
   public list<ReceitaDTO> getAllReceitas(){
    logger.debug("Buscando todas as receitas");
    return ReceitaRepository.findAll().stream().map(ReceitaMapper::convertToDTO).toList();

              
   }

   //busca receita pelo Id
   @Transactional(readOnly = true)
   public Optional<ReceitaDTO> getReceitaById(Long Id){
    logger.debug("Buscando Receitas pelo Id={}", Id);
    return ReceitaRepository.findById(Id).map(ReceitaMapper::convertToDTO);

   }

   //cria receita nova e retorna com id do banco
   @Transactional
   public ReceitaDTO createReceita(ReceitaDTO receitaDTO){
    logger.info("criando uma receita com o Título='{}'", receitaDTO.getNomeDaReceita());
    Receita receita = ReceitaMapper.convertToEntity(ReceitaDTO);
    Receita savedReceita = ReceitaRepository.save(receita);
    return ReceitaMapper.convertToDTO(savedReceita);
   }

   @Transactional 
   public Optional<ReceitaDTO> updateReceita(Long Id, ReceitaDTO receitaDTO){
    logger.info("atualizando receita com o Id={}", Id);
    return ReceitaRepository.findById(Id).map(existingReceita -> { 
        existingReceita.setNomeDaReceita(receitaDTO.getNomeDaReceita());
        existingReceita.setIngredientes(receitaDTO.getIngredientes());
        if (ReceitaDTO.getCompleted() != null){
            existingReceita.setCompleted(receitaDTO.getCompleted());

        }
        Receita updateReceita = ReceitaRepository.save(existingReceita);
        return ReceitaMapper.convertToDTO(updateReceita);
    });
   }

   @Transactional
    public Optional<ReceitaDTO> toggleReceitaCompletion(Long Id) {
        logger.info("alterar conclusão da receita com o id={}", Id);
        return ReceitaRepository.findById(Id).map(receita -> {
                    task.setCompleted(!task.getCompleted());
                    Task updatedTask = taskRepository.save(receita);
                    return taskMapper.convertToDTO(updatedReceita);
                });
    }
  



















}