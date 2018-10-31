package br.com.verpcad.models

import java.util.*
import javax.persistence.*


@Entity
@Table(name = "pessoa")
class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
    @Column(name = "nome", nullable = false)
    var nome: String? = null
    @Column(name = "data_nascimento")
    var dataNasciment: Date? = null
    @Column(name = "cpf", length = 14, nullable = false)
    var cpf: String? = null
}