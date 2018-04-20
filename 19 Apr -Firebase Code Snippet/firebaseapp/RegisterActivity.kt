package com.bmpl.firebaseapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*
import android.widget.Toast
import jdk.nashorn.internal.runtime.ECMAException.getException
import org.junit.experimental.results.ResultMatchers.isSuccessful
import android.support.annotation.NonNull
import android.R.attr.password
import android.content.Intent
import android.support.v4.app.FragmentActivity
import android.util.Log
import com.bmpl.firebaseapp.temp.UserDetails

class RegisterActivity : AppCompatActivity() {

    lateinit var mAuth: FirebaseAuth // NPE

    lateinit var firebaseDatabase : FirebaseDatabase
    lateinit var databaseReference : DatabaseReference

    lateinit var name : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        //validation-->  email --> @ and .com
        // password--> minimum --> 6 characters limit

        var userDetails = UserDetails()

        mAuth = FirebaseAuth.instance

        firebaseDatabase = FirebaseDatabase.getInstance()
        databaseReference = firebaseDatabase.getReference("Details")

        registerButton.setOnClickListener {

            name = nameEditText.text.toString()

            var email = emailEditText.text.toString()
            var password = passwordEditText.text.toString()

            mAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, object : OnCompleteListener<AuthResult>() {
                        fun onComplete(task: Task<AuthResult>) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                //Log.d("RegisterActivity", "createUserWithEmail:success")
                // setvalue --> if data is not created then i'll create that but if data is present then i'll update that
                                databaseReference.child("Students").child("Student1").child("Name").setValue(name)

                                // "details"."Name"
                                // sub-root --> child()

                                var intent = Intent(this, WelcomeScreen :: class.java)
                                intent.putExtra("name", name)
                                startActivity(intent)

                            } else {
                                // If sign in fails, display a message to the user.
                                Log.w("RegisterActivity", "createUserWithEmail:failure", task.getException())
                                Toast.makeText(this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show()

                            }

                            // ...
                        }
                    })
        }

        loginButton.setOnClickListener {


        }
    }


}
