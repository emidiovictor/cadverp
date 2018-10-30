package br.com.verpcad.repositories

import br.com.verpcad.models.Pessoa
import org.springframework.data.jpa.repository.JpaRepository

interface PessoaRepository : JpaRepository<Pessoa, Long>