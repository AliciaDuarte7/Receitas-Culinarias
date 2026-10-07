package com.todolist.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public class ReceitaDTO {
      
     @Schema(description = "Identificador da receita, atribuído pelo servidor", example = "1",
            accessMode = Schema.AccessMode.READ_ONLY)
      //n entendi pra q serve isso mas deixei ai só pra ter (meti o copia e cola)
      private long id;
     
    


    @NotBlank(message = "é necessario o nome da receita.")
    @Size(max = 100, message = "o nome deve conter menos de 100 caracteres.") 
    @Schema(description = "Nome da receita.", example = "Bolinho de chuva.", maxLength = 100)
    private String nomeDaReceita;
   

    @Size(max = 500, message = "a lista de ingredientes deve conter menos de 500 caracteres")
    @Schema(description = "Descreva quais e quantos ingredientes serão necessarios", example = "dois ovos.", maxLength = 500)
     private String Ingredientes;
      
    
     @NotBlank(message = "O tempo de preparo é obrigatório")
     @Schema(description = "O tempo de preparo estimado", example = "45 Minutos")
      private String TempoDePreparo;
      
      
     
     




}