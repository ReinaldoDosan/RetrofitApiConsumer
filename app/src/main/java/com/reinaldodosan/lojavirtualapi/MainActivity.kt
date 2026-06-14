package com.reinaldodosan.lojavirtualapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reinaldodosan.lojavirtualapi.apidummyjson.DummyJsonApi
import com.reinaldodosan.lojavirtualapi.databinding.ActivityMainBinding
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {

    private val binding by lazy{
    ActivityMainBinding.inflate(layoutInflater)
}
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://dummyjson.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        val dummyJsonApi =retrofit.create( DummyJsonApi::class.java )

    }
}