package com.acs.ahadumonitor.feature_users.domain.use_cases

import com.acs.ahadumonitor.feature_users.domain.model.User
import com.acs.ahadumonitor.feature_users.domain.repository.UserRepository
import javax.inject.Inject

class GetUser @Inject constructor(
    private val repository: UserRepository
) {
    suspend operator fun invoke(id: Int): User? {
        return repository.getUserById(id)
    }
}