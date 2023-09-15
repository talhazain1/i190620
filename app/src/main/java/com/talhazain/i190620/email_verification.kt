import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.talhazain.i190620.R
import kotlinx.android.synthetic.main.activity_email_verification.*

class EmailVerificationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_verification2)

        val otpEditText: EditText = findViewById(R.id.otpEditText)

        // Implement logic for handling OTP input and verification here

        // Example: Adding click listeners to numeric keypad buttons
        val numericButtons = arrayOf(
            button1, button2, button3, button4,
            button5, button6, button7, button8,
            button9, button0, buttonDelete
        )

        for (button in numericButtons) {
            button.setOnClickListener {
                val currentOtp = otpEditText.text.toString()
                val clickedNumber = button.text.toString()

                // Append the clicked number to the OTP EditText
                otpEditText.setText(currentOtp + clickedNumber)
            }
        }
    }
}




