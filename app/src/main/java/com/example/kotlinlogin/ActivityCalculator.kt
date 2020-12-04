package com.example.kotlinlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculator.*

class ActivityCalculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        button_suma.setOnClickListener { metodoSuma()}
    }
    private fun metodoSuma() {
        if (num_edt1.text.toString().isEmpty() && num_edt2.text.toString().isEmpty() ){
            Toast.makeText(this,"No deje ningun campo vacio",Toast.LENGTH_LONG).show()
        }else if (num_edt1.text.toString().isEmpty()){
            Toast.makeText(this,"No deje vacio el primer campo", Toast.LENGTH_LONG).show()
        }else if (num_edt2.text.toString().isEmpty()){
            Toast.makeText(this,"No deje vacio el segundo campo",Toast.LENGTH_LONG).show()
        }else{
            val num1 = num_edt1.text.toString().toDouble()
            val num2 = num_edt2.text.toString().toDouble()
            val respuesta = num1 / num2
            //val solution:Double = String.format("%.2f",respuesta).toDouble()
            val solution  = Math.round(respuesta*10.0)/10.0
            textView_respuesta.text = "El Resultado es: ${solution.toDouble()}"
        }
    }
}