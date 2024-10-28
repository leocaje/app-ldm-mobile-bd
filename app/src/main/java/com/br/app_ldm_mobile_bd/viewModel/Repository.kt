package com.br.app_ldm_mobile_bd.viewModel

import com.br.app_ldm_mobile_bd.roomDB.Pessoa
import com.br.app_ldm_mobile_bd.roomDB.PessoaDatabase

class Repository(private val db: PessoaDatabase) {
    suspend fun upsertPessoa(pessoa: Pessoa) {
        db.pessoaDao().upsertPessoa(pessoa)
    }

    suspend fun deletePessoa(pessoa: Pessoa) {
        db.pessoaDao().deletePessoa(pessoa)
    }

    fun getAllPessoas(): List<Pessoa> {
        return db.pessoaDao().getAllPessoas()
    }
}