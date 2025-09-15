package com.itb.inf2em.pizzariae.model.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Produto")    // O uso de @Table é facultativo quando o nome da classe é igual ao nome da tabela
public class Produto {

    @Id  // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto-incremento, ou seja, sequêncial de 1 em 1
    private Long id;
    @Column(length = 45, nullable = false)    // nullable:  false (NOT NULL)  true ( NULL)
    private String nome;
    @Column(length = 45, nullable = true)
    private String tipo;
    @Column(length = 255, nullable = true)
    private String descricao;
    @Column(columnDefinition = "DECIMAL(5,2)", nullable = true)    // DECIMAL(5,2) Ex: valor até  R$ 99.999,99
    private double valorCompra;
    @Column(columnDefinition = "DECIMAL(5,2)", nullable = true)
    private double valorVenda;
    @Column(nullable = true)
    private int quantidadeEstoque;
    private boolean codStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }
}
