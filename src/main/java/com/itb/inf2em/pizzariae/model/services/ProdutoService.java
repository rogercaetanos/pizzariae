package com.itb.inf2em.pizzariae.model.services;


import com.itb.inf2em.pizzariae.model.entity.Produto;
import com.itb.inf2em.pizzariae.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired   // Injeção de dependência
    private ProdutoRepository produtoRepository;

    // Listar todos os produtos

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    // Salvar Produto

    public Produto save(Produto produto) {
        produto.setCodStatus(true);
        return produtoRepository.save(produto);
    }

    // Listar Produto por ID
    public Produto findById(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado com id " + id));
    }

    // Atualizar Produto
    public Produto update(Long id, Produto produto) {
        Produto produtoExistente = findById(id);
        produtoExistente.setNome(produto.getNome());
        produtoExistente.setDescricao(produto.getDescricao());
        produtoExistente.setTipo(produto.getTipo());
        produtoExistente.setValorVenda(produto.getValorVenda());
        produtoExistente.setValorCompra(produto.getValorCompra());
        produtoExistente.setQuantidadeEstoque(produto.getQuantidadeEstoque());
        produtoExistente.setCodStatus(produto.isCodStatus());
        return produtoRepository.save(produtoExistente);
    }

    // Excluir Produto ( Exclusão Física )
    public void delete(Long id) {
        Produto produtoExistente = findById(id);
        produtoRepository.delete(produtoExistente);
    }
}
