package com.nit.daggerhiltsample.data.remote

import android.app.Application
import com.nit.daggerhiltsample.R
import com.nit.daggerhiltsample.data.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository. The app name is $appName")
    }

    override suspend fun doNetworkCall() {
    }
}