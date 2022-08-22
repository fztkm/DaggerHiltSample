package com.nit.daggerhiltsample

import androidx.lifecycle.ViewModel
import com.nit.daggerhiltsample.data.domain.repository.MyRepository
import dagger.Lazy
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: Lazy<MyRepository>
): ViewModel() {
    init {
        repository.get()
    }
}