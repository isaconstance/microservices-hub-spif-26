package com.github.isaconstance.ms.pedidos.dto;

import com.github.isaconstance.ms.pedidos.entities.ItemPedido;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ItemDoPedidoDto {

    private Long id;

    @NotNull(message = "Quantidade requerido")
    @Positive(message = "Quantidade deve ser um número positivo")
    private Integer quantidade;
    @NotBlank(message = "Descrição requerido")
    private String descricao;
    @NotNull(message = "Preço unitário é requerido")
    @Positive(message = "Preço unitário deve ser um valor positivo e maior que zero")
    private BigDecimal precoUnitario;

    public ItemDoPedidoDto(ItemPedido itemPedido){
        id = itemPedido.getId();
        quantidade = itemPedido.getQuantidade();
        descricao = itemPedido.getDescricao();
        precoUnitario = itemPedido.getPrecoUnitario();
    }
}
