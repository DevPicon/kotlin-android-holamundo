package pe.devpicon.android.miaplicacionkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * Created by Armando on 20/04/2016.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        var textViewNombre: TextView
        textViewNombre = findViewById(R.id.text_nombre) as TextView
        textViewNombre.text = "Hola Kotlin!"
    }

}