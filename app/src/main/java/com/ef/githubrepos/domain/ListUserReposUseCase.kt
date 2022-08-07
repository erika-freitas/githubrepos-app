package com.ef.githubrepos.domain

import com.ef.githubrepos.core.UseCase
import com.ef.githubrepos.data.model.Repo
import com.ef.githubrepos.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserReposUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}