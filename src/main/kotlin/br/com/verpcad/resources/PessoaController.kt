package br.com.verpcad.controller

import br.com.verpcad.models.Pessoa
import br.com.verpcad.repositories.PessoaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*


@RestController
@RequestMapping("pessoa")
class PessoController {

    @Autowired
    lateinit var repository: PessoaRepository

    @GetMapping
    fun list(): Boolean {
        var pessoa = Pessoa()
        pessoa.id = 1
        pessoa.cpf = "123123"
        pessoa.dataNasciment = Date()
        pessoa.nome = "victor"
        repository.save(pessoa)
        return true
    }
}