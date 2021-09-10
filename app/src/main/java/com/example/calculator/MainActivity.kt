package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    // Binding initialization

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnAC.setOnClickListener {
            binding.tvInputText.text = " "
            binding.tvOutputText.text = " "
        }

        binding.btnOne.setOnClickListener {
            binding.tvInputText.append("1")


        }

        binding.btnTwo.setOnClickListener {
            binding.tvInputText.append("2")


        }

        binding.btnThree.setOnClickListener {
            binding.tvInputText.append("3")


        }

        binding.btnFour.setOnClickListener {
            binding.tvInputText.append("4")


        }

        binding.btnFive.setOnClickListener {
            binding.tvInputText.append("5")


        }

        binding.btnSix.setOnClickListener {
            binding.tvInputText.append("6")


        }

        binding.btnSeven.setOnClickListener {
            binding.tvInputText.append("7")


        }

        binding.btnEight.setOnClickListener {
            binding.tvInputText.append("8")


        }

        binding.btnNine.setOnClickListener {
            binding.tvInputText.append("9")


        }


        binding.btnDot.setOnClickListener {
            binding.tvInputText.append(".")
        }

        binding.btnDivision.setOnClickListener {
            binding.tvInputText.append("/")


        }

        binding.btnMultiply.setOnClickListener {
            binding.tvInputText.append(" * ")


        }

        binding.btnMinus.setOnClickListener {
            binding.tvInputText.append(" - ")


        }

        binding.btnAdd.setOnClickListener {
            binding.tvInputText.append(" + ")


        }

        binding.btnStartBracket.setOnClickListener {
            binding.tvInputText.append(" ( ")
        }

        binding.btnEndBracket.setOnClickListener {
            binding.tvInputText.append(" ) ")
        }

        binding.btnEqual.setOnClickListener {

            var expression = ExpressionBuilder(binding.tvInputText.text.toString()).build()
            var result = expression.evaluate()
            var longResult = result.toLong()

            if(result==longResult.toDouble())
            {
                binding.tvOutputText.text = longResult.toString()
            }
            else
            {
                binding.tvOutputText.text = result.toString()
            }
        }

    }
}