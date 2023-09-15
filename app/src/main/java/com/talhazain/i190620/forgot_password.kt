import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.talhazain.i190620.R

class ForgotPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password2)

        val resetPasswordButton: Button = findViewById(R.id.resetPasswordButton)
        val emailEditText: EditText = findViewById(R.id.emailEditText)

        resetPasswordButton.setOnClickListener {
            val email = emailEditText.text.toString()

            // Implement your "Forgot Password" logic here, e.g., send a reset email
            // You can send an email to the user's provided email address with a reset link
        }
    }
}
