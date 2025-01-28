package br.com.eduardo.adocao_cachorros.domain;

import br.com.eduardo.adocao_cachorros.enums.CachorroEnum;
import jakarta.persistence.*;

@Entity
public class Cachorro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 40, nullable = false)
    private String nome;
    @Column(length = 2, nullable = false)
    private int idade;
    @Column(nullable = false)
    private CachorroEnum sexo;
    @Column(length = 40, nullable = false)
    private String cor;
    @Column(length = 40, nullable = false)
    private String motivoDoacao;

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public CachorroEnum getSexo() {
        return sexo;
    }

    public void setSexo(CachorroEnum sexo) {
        this.sexo = sexo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMotivoDoacao() {
        return motivoDoacao;
    }

    public void setMotivoDoacao(String motivoDoacao) {
        this.motivoDoacao = motivoDoacao;
    }
}
