package br.com.verpcad.models

import java.util.*
import javax.persistence.*


@Entity
@Table(name = "pessoa")
class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
    @Column(name = "nome", nullable = false)
    val nome: String? = null
    @Column(name = "data_nascimento", nullable = false)
    val dataNasciment: Date? = null
    @Column(name = "cpf", length = 14, nullable = false)
    val cpf: String? = null
}