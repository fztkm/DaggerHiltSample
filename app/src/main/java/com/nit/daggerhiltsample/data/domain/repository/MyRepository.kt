package com.nit.daggerhiltsample.data.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}