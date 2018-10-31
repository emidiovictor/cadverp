package br.com.verpcad.resources

import br.com.verpcad.models.Pessoa
import br.com.verpcad.repositories.PessoaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("pessoa")
class PessoaController {

    @Autowired
    lateinit var repository: PessoaRepository

    @PostMapping
    fun salvarPessoa(@RequestBody pessoa: Pessoa): Pessoa {
        return repository.save(pessoa)
    }
}