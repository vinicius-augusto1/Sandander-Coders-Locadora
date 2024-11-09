package com.ada.santander.coders.locadora.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VeiculoDTO {
    private Long id;

    @NotBlank(message = "O modelo é obrigatório")
    private String modelo;

    @NotBlank(message = "A placa é obrigatória")
    private String placa;

    private int ano;
    private String cor;
    private String tipoVeiculo;
    private boolean veiculoDisponivelParaLocacao;
    private Long agenciaId;
}
