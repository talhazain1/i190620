import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.talhazain.i190620.R
import kotlinx.android.synthetic.main.activity_login

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        // Handle the login button click
        val loginButton = null
        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Implement your login logic here, e.g., check username and password against a database
            if (isValidLogin(username, password)) {
                // Successful login, navigate to the dashboard or the next screen
                startActivity(Intent(this, DashboardActivity::class.java))
            } else {
                // Show an error message or toast for invalid login
                // For security, do not provide specific error messages
            }
        }

        // Handle the "Forgot Password?" click
        forgotPasswordTextView.setOnClickListener {
            // Implement the forgot password functionality, e.g., navigate to a password reset screen
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }

        // Handle the "Register" click
        registerTextView.setOnClickListener {
            // Implement the registration functionality, e.g., navigate to the registration screen
            startActivity(Intent(this, RegistrationActivity::class.java))

        }
    }

    // Example function to validate login (replace with your actual logic)
    private fun isValidLogin(username: String, password: String): Boolean {
        // Implement your authentication logic here, e.g., check against a database
        return (username == "your_username" && password == "your_password")
    }
}
