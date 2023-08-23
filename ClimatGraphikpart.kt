import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Variables pour les objets graphiques
    private lateinit var tempMaxTextView: TextView
    private lateinit var tempMinTextView: TextView
    private lateinit var precipTotalTextView: TextView
    private lateinit var precipAvgTextView: TextView
    private lateinit var enterDataButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Liaison des objets graphiques avec leurs références dans le fichier XML
        tempMaxTextView = findViewById(R.id.temp_max_text_view)
        tempMinTextView = findViewById(R.id.temp_min_text_view)
        precipTotalTextView = findViewById(R.id.precip_total_text_view)
        precipAvgTextView = findViewById(R.id.precip_avg_text_view)
        enterDataButton = findViewById(R.id.enter_data_button)

        // Ajout d'un écouteur d'événement au bouton
        enterDataButton.setOnClickListener {
            // Code à exécuter lorsque le bouton est cliqué
        }
    }

    // Fonction pour mettre à jour les valeurs affichées sur l'interface utilisateur
    private fun updateUI(tempMax: Double, tempMin: Double, precipTotal: Double, precipAvg: Double) {
        tempMaxTextView.text = tempMax.toString()
        tempMinTextView.text = tempMin.toString()
        precipTotalTextView.text = precipTotal.toString()
        precipAvgTextView.text = precipAvg.toString()
    }
}
