package com.acs.ahadumonitor.feature_users.domain.use_cases

import com.acs.ahadumonitor.feature_users.domain.model.User
import com.acs.ahadumonitor.feature_users.domain.repository.UserRepository
import javax.inject.Inject

class DeleteUser @Inject constructor(
    private val repository: UserRepository
) {
    suspend operator fun invoke(user: User) {
        repository.deleteUser(user)
    }
}