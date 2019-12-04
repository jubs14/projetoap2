package com.eecm.weather

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var textViewCidade: TextView? = null
    private var textViewTemperatura: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewCidade = findViewById<TextView>(R.id.textViewCidade)
        textViewTemperatura = findViewById<TextView>(R.id.textViewTemp)



        var id: String = ""
        var button = findViewById<Button>(R.id.button)
        var button2 = findViewById<Button>(R.id.button2)
        var button3 = findViewById<Button>(R.id.button3)
        var button4 = findViewById<Button>(R.id.button4)
        var button5 = findViewById<Button>(R.id.button5)
        var button6 = findViewById<Button>(R.id.button6)
        var button7 = findViewById<Button>(R.id.button7)
        var button8 = findViewById<Button>(R.id.button8)
        var button9 = findViewById<Button>(R.id.button9)
        var button10 = findViewById<Button>(R.id.button10)



        button2.setOnClickListener {

            id = "3402655"
            Thread {
                val cidade = CidadeClimaService.getClimaCidade(id)
                runOnUiThread {
                    textViewCidade?.text = cidade?.name.toString()
                    textViewTemperatura?.text = cidade?.main?.temp.toString()
                }
            }.start()
        }

        button.setOnClickListener {

            id = "6320645"
            Thread {
                var cidade = CidadeClimaService.getClimaCidade(id)
                runOnUiThread {
                    textViewCidade?.text = cidade?.name.toString()
                    textViewTemperatura?.text = cidade?.main?.temp.toString()
                }
            }.start()

        }
        button3.setOnClickListener {

            id = "3463237"
            Thread {
                var cidade = CidadeClimaService.getClimaCidade(id)
                runOnUiThread {
                    textViewCidade?.text = cidade?.name.toString()
                    textViewTemperatura?.text = cidade?.main?.temp.toString()
                }
            }.start()
        }

        button4.setOnClickListener {

            id = "6254926"
            Thread {
                var cidade = CidadeClimaService.getClimaCidade(id)
                runOnUiThread {
                    textViewCidade?.text = cidade?.name.toString()
                    textViewTemperatura?.text = cidade?.main?.temp.toString()
                }
            }.start()
        }

        button5.setOnClickListener {

            id = "3451190"
            Thread {
                var cidade = CidadeClimaService.getClimaCidade(id)
                runOnUiThread {
                    textViewCidade?.text = cidade?.name.toString()
                    textViewTemperatura?.text = cidade?.main?.temp.toString()
                }
            }.start()
        }

        button6.setOnClickListener {

            id = "3470127"
            Thread {
                var cidade = CidadeClimaService.getClimaCidade(id)
                runOnUiThread {
                    textViewCidade?.text = cidade?.name.toString()
                    textViewTemperatura?.text = cidade?.main?.temp.toString()
                }
            }.start()
        }

        button7.setOnClickListener {

            id = "3448439"
            Thread {
                var cidade = CidadeClimaService.getClimaCidade(id)
                runOnUiThread {
                    textViewCidade?.text = cidade?.name.toString()
                    textViewTemperatura?.text = cidade?.main?.temp.toString()
                }
            }.start()
        }

        button8.setOnClickListener {

            id = "3403642"
            Thread {
                var cidade = CidadeClimaService.getClimaCidade(id)
                runOnUiThread {
                    textViewCidade?.text = cidade?.name.toString()
                    textViewTemperatura?.text = cidade?.main?.temp.toString()
                }
            }.start()
        }

        button9.setOnClickListener {

            id = "3663517"
            Thread {
                var cidade = CidadeClimaService.getClimaCidade(id)
                runOnUiThread {
                    textViewCidade?.text = cidade?.name.toString()
                    textViewTemperatura?.text = cidade?.main?.temp.toString()
                }
            }.start()
        }

        button10.setOnClickListener {

            id = "6322752"
            Thread {
                var cidade = CidadeClimaService.getClimaCidade(id)
                runOnUiThread {
                    textViewCidade?.text = cidade?.name.toString()
                    textViewTemperatura?.text = cidade?.main?.temp.toString()
                }
            }.start()
        }

    }
}
