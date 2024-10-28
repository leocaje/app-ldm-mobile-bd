package com.br.app_ldm_mobile_bd.roomDB

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Pessoa::class],
    version = 1
)

abstract class PessoaDatabase : RoomDatabase() {
    abstract fun pessoaDao(): PessoaDao
}