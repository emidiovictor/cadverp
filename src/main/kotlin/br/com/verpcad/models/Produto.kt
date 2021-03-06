package br.com.verpcad.models

import javax.persistence.*


@Entity
@Table(name = "produtos")
class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
    @Column(name = "descricao")
    val descricao: String? = null
    @Column(name = "preco_venda")
    val precoVenda: String? = null
    @Column(name = "custo")
    val custo: Double? = null


}