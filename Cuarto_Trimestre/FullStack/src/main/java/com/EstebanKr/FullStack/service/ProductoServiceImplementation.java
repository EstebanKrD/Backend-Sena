package com.EstebanKr.FullStack.service;

import com.EstebanKr.FullStack.dto.ProductoDTO;
import com.EstebanKr.FullStack.model.Producto;
import com.EstebanKr.FullStack.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoServiceImplementation implements ProductoService {

    private ProductoDTO convertirADTO(Producto producto) {

        ProductoDTO dto = new ProductoDTO();
        dto.setId(producto.getId());
        dto.setNombre(producto.getNombre());
        dto.setCodigo(producto.getCodigo());
        dto.setDescripcion(producto.getDescripcion());
        dto.setPrecio(producto.getPrecio());
        dto.setCantidad(producto.getCantidad());
        dto.setEstado(producto.getEstado());
        return dto;

    }

    private Producto convertirAEntidad(ProductoDTO dto) {

        Producto producto = new Producto();
        producto.setId(dto.getId());
        producto.setNombre(dto.getNombre());
        producto.setCodigo(dto.getCodigo());
        producto.setDescripcion(dto.getDescripcion());
        producto.setPrecio(dto.getPrecio());
        producto.setCantidad(dto.getCantidad());
        producto.setEstado(dto.getEstado());
        return producto;
    }

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<ProductoDTO> obtenerTodos() {
        List<Producto> productos = productoRepository.findAll();
        List<ProductoDTO> dtos = new ArrayList<>();
        for (Producto producto : productos) {
            dtos.add(convertirADTO(producto));
        }

        return dtos;
    }

    @Override
    public ProductoDTO obtenerPorId(Long id) {
        Producto producto = productoRepository.findById(id).get();
        return convertirADTO(producto);
    }

    @Override
    public ProductoDTO guardar(ProductoDTO productoDTO) {

        if (productoRepository.findByCodigo(productoDTO.getCodigo()).isPresent()) {

            throw new RuntimeException("Código repetido");
        }

        Producto producto = convertirAEntidad(productoDTO);

        Producto productoGuardado = productoRepository.save(producto);

        return convertirADTO(productoGuardado);
    }

    @Override
    public ProductoDTO actualizar(Long id, ProductoDTO productoDTO) {
        Producto producto = productoRepository.findById(id).get();
        producto.setCodigo(productoDTO.getCodigo());
        producto.setNombre(productoDTO.getNombre());
        producto.setDescripcion(productoDTO.getDescripcion());
        producto.setPrecio(productoDTO.getPrecio());
        producto.setCantidad(productoDTO.getCantidad());
        producto.setEstado(productoDTO.getEstado());
        Producto productoActualizado = productoRepository.save(producto);
        return convertirADTO(productoActualizado);
    }

    @Override
    public void eliminar(Long id) {
        productoRepository.deleteById(id);
    }

}