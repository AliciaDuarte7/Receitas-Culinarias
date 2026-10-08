package com.todolist.api.dto; //essa parte aqui tem hora q dá certo tem hora q dá errado, ent n vou mexer por enquanto.

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ReceitaDTO {

@Schema(description = "Identificador da receita, atribuído pelo servidor", example = "1",
      accessMode = Schema.AccessMode.READ_ONLY)
      private long Id;


@Schema(description = "Identificador da tarefa, atribuído pelo servidor", example = "1",
      accessMode = Schema.AccessMode.READ_ONLY)
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

      
      @Size(max = 20, message = "A dificuldade deve conter menos de 20 caracteres")
      @schema(description = "Dificuldade da receita (opcional)", example = "Fácil")
      private String dificuldadeReceita;


      public ReceitaDTO(Id, nomeDaReceita, Ingredientes, TempoDePreparo, dificuldadeReceita){
            this.Id = Id;
            this.nomeDaReceita = nomeDaReceita;
            this.TempoDePreparo = TempoDePreparo;
            this.dificuldadeReceita = dificuldadeReceita;


      }

      public long getId() {
            return Id;
      }

      public String getnomeDaReceita(){
            return nomeDaReceita;
      }

      public String getIngredientes(){
            return Ingredientes;
      
      }

      public String getTempoDePreparo(){
            return TempoDePreparo;
      }

      public String getdificuldadeReceita(){
            return dificuldadeReceita;
      }

      public void setId(long Id){
            this.Id = Id;
      }

      public void setnomeDaReceita(String nomeDaReceita){
            this.nomeDaReceita = nomeDaReceita;
      }

      public void setIngredientes(String Ingredientes){
            this.Ingredientes = Ingredientes;
      }

      public void setTempoDePreparo(String TempoDePreparo){
            this.TempoDePreparo = TempoDePreparo;
      }

      public void setdificuldadeReceita(String dificuldadeReceita){
            this.dificuldadeReceita = dificuldadeReceita;
      }

      //a partir da linha 58 foi tudo inventado, n tenho ideia do que eu fiz e pra que serve,
      //mas tava no outro código então achei uma boa colocar por aqui também, felicidades ao próximo.}
}