package zamorano.miguel.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var intento: Intent = Intent(this, CatalogActivity::class.java)

        val boton: Button = findViewById(R.id.boton) as Button

        boton.setOnClickListener {
            startActivity(intento)

        }
    }
}
