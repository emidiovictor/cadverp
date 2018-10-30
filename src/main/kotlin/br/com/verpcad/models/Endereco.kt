package br.com.verpcad.models

import javax.persistence.*


@Entity
@Table(name = "endereco")
class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
    @Column(name = "cep", length = 15, nullable = false)
    val cep: String? = null
    @Column(name = "cidade", length = 100, nullable = false)
    val cidade: String? = null
    @Column(name = "estado", length = 20, nullable = false)
    val estado: String? = null
    @Column(name = "rua", length = 150, nullable = false)
    val rua: String? = null
    @Column(name = "numero", length = 20, nullable = false)
    val numero: String? = null
    @Column(name = "complemento", length = 100)
    val complemento: String? = null
}
