package com.github.isaconstance.ms.pedidos.repositories;

import com.github.isaconstance.ms.pedidos.entities.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDoPedidoRepository extends JpaRepository<ItemPedido, Long> {
}
