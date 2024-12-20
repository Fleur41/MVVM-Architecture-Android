package com.simon.mvvm_architecture_android.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Singleton
import kotlin.jvm.Throws
import kotlin.reflect.KClass

@Singleton
class ViewModelProviderFactory<T: ViewModel>(
    private val kClass: KClass<T>,
    private val creator: () -> T
): ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalArgumentException::class)
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(kClass.java)) return creator() as T
        throw IllegalArgumentException("Unkown class name")
    }
}