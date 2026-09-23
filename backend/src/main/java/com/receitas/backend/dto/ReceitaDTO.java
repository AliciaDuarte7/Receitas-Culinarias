package com.todolist.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Schema(description = "Identificador da tarefa, atribuído pelo servidor", example = "1",
      accessMode = Schema.AccessMode.READ_ONLY)
//n entendi pra q serve isso mas deixei ai só pra ter (meti o copia e cola)
public class receitaDTO {

      @Schema(description = "Nome da receita.", example = "Bolinho de chuva.", maxlength = 100)
      @NotBlank(message = "é necessario o nome da receita.")
      @Size(max = 100, message = "o nome deve conter menos de 100 caracteres.") 
    private long TituloDaReceita;

    @Schema(description = "Descreva quais e quantos ingredientes serão necessarios", example = "dois ovos.", maxlength = 500)
    @Size(max = 500, message = "a lista de ingredientes deve conter menos de 500 caracteres")
     private String ingredientes; // me pareceu certo colocar assim, sla

     @Schema(Value = 0, message = "O tempo deve ser de pelo menos 1 minuto")
     //essa parte eu n faço ideia de como montar ent arroche, meti o louco.
     @Schema(description = "O tempo de preparo estimado", example = "45 minutos")
     @NotBlank(message = "O tempo de preparo é obrigatório")
     private String tempoDePreparo;
     
     //essa parte da dificuldade eu n consigo nem vizualizar como eu vou colocar, ent deixo pros mais sábios.

     



}