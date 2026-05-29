package com.EstebanKr.FullStack.service;

import com.EstebanKr.FullStack.dto.ProductoDTO;

import java.util.List;

public interface ProductoService {
    List<ProductoDTO> obtenerTodos();

    ProductoDTO obtenerPorId(Long id);

    ProductoDTO guardar(ProductoDTO productoDTO);

    ProductoDTO actualizar(Long id, ProductoDTO productoDTO);

    void eliminar(Long id);
}
