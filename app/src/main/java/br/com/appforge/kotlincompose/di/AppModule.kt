package br.com.appforge.kotlincompose.di

import androidx.compose.material3.dynamicDarkColorScheme
import br.com.appforge.kotlincompose.data.remote.api.DummyAPI
import br.com.appforge.kotlincompose.data.remote.model.User
import br.com.appforge.kotlincompose.data.remote.repository.IUserRepository
import br.com.appforge.kotlincompose.data.remote.repository.UserRepositoryImpl
import br.com.appforge.kotlincompose.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    fun provideRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun provideDummyAPI(retrofit: Retrofit):DummyAPI{
        return retrofit.create(DummyAPI::class.java)
    }

    @Provides
    fun provideUserRepository(dummyAPI:DummyAPI):IUserRepository{
        return UserRepositoryImpl(dummyAPI)
    }
}