package com.example.navigation2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.navigation2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.botonNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.opHome -> {
                    Navigation.findNavController(b.fragmentContainerView).navigate(R.id.initFragment)
                    true
                }
                R.id.opPerson -> {
                    findNavController(R.id.fragmentContainerView).navigate(R.id.firstFragment)
                    true }
                R.id.opSettings -> {
                    b.fragmentContainerView.findNavController().navigate(R.id.secondFragment)
                    true}
                else -> false
            }

        }



    }


}