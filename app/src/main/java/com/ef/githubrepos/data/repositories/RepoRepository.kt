package com.ef.githubrepos.data.repositories

import com.ef.githubrepos.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}