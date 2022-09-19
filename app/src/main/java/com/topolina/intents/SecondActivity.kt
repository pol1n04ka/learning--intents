package com.topolina.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.topolina.intents.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent  = intent.extras
        if (intent != null) {
            val name        = intent.getString("name")
            val age         = intent.getString("age")
            val occupation  = intent.getString("occupation")
            val country     = intent.getString("country")

            binding.textView2.text = "Hey, my name is $name, i'm $age old, i'm $occupation and i'm living in $country"
        } else {
            binding.textView2.text = "Vai cazzo"
        }
    }
}