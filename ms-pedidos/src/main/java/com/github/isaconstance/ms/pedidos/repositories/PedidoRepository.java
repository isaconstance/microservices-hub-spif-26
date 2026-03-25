package com.github.isaconstance.ms.pedidos.repositories;

import com.github.isaconstance.ms.pedidos.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
