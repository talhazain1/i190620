import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val signUpButton: Button = findViewById(R.id.signUpButton)
        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val emailEditText: EditText = findViewById(R.id.emailEditText)
        val contactNumberEditText: EditText = findViewById(R.id.contactNumberEditText)
        val countrySpinner: Spinner = findViewById(R.id.countrySpinner)
        val cityEditText: EditText = findViewById(R.id.cityEditText)

        // Populate the spinner with countries
        val countries = resources.getStringArray(R.array.countries_array)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, countries)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        countrySpinner.adapter = adapter

        signUpButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val email = emailEditText.text.toString()
            val contactNumber = contactNumberEditText.text.toString()
            val selectedCountry = countrySpinner.selectedItem.toString()
            val city = cityEditText.text.toString()

            // Implement your registration logic here
            // You can validate user input and save registration data
        }
    }
}
