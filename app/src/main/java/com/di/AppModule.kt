package com.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

/**
 * Created by altafshaikh on 01/02/18.
 */

@Module
abstract class AppModule {

    @Singleton
    @Binds
    abstract fun provideAppContext(app: Application): Context
}