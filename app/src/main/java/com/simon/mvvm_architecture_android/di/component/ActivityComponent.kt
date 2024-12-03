package com.simon.mvvm_architecture_android.di.component

import com.simon.mvvm_architecture_android.di.ActivityScope
import com.simon.mvvm_architecture_android.di.module.ActivityModule
import com.simon.mvvm_architecture_android.ui.topheadline.TopHeadlineViewModel
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(actvity: TopHeadlineViewModel)
}