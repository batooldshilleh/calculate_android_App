package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnAdd: Button
    private lateinit var btnSub: Button
    private lateinit var btnMultiply: Button
    private lateinit var btnDivision: Button
    private lateinit var etA: EditText
    private lateinit var etB: EditText
    private lateinit var resultTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btn_add)
        btnSub = findViewById(R.id.btn_subtraction)
        btnMultiply = findViewById(R.id.btn_multiplication)
        btnDivision = findViewById(R.id.btn_division)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTv = findViewById(R.id.result_tv)
        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
        btnDivision.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        var firstNumber = etA.text.toString().toDouble()
        var secondNumber = etB.text.toString().toDouble()
        var result = 0.0
        when (v?.id) {
            R.id.btn_add -> {
                result = firstNumber + secondNumber
            }

            R.id.btn_subtraction -> {
                result = firstNumber - secondNumber
            }

            R.id.btn_multiplication -> {
                result = firstNumber * secondNumber
            }

            R.id.btn_division -> {
                result = firstNumber / secondNumber
            }
        }
        resultTv.text = "the result = $result"
    }
}