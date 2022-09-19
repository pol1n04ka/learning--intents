package com.topolina.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.topolina.intents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnApply.setOnClickListener {
            Intent(this, SecondActivity::class.java).also {
                val bundle      = Bundle()
                val name        = binding.tvName.text.toString()
                val age         = binding.tvAge.text.toString()
                val occupation  = binding.tvOccupation.text.toString()
                val country     = binding.tvCountry.text.toString()

                bundle.putString("name", name)
                bundle.putString("age", age)
                bundle.putString("occupation", occupation)
                bundle.putString("country", country)

                it.putExtras(bundle)
                startActivity(it)
            }
        }

    }
}