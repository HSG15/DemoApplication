package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMain3Binding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
//
//class MainActivity3 : AppCompatActivity() {
//    lateinit var binding: ActivityMain3Binding
//   // private lateinit var mAuth: FirebaseAuth
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMain3Binding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        var database = FirebaseDatabase.getInstance().reference
//        database.setValue("lucky")
//
//        binding.btnLogin.setOnClickListener {
//
//            if ((TextUtils.isEmpty(binding.edtEmail.text.toString())) || (TextUtils.isEmpty(binding.edtPassword.text.toString())))
//            {
//                Toast.makeText(this,"Signing in",Toast.LENGTH_SHORT).show()
//                val intent = Intent(this,MainActivity4::class.java)
//                startActivity(intent)
//            }
//            else{
//                Toast.makeText(this,"Fill the info",Toast.LENGTH_SHORT).show()
//
//            }
//            val email = binding.edtEmail.text.toString()
//            val password = binding.edtPassword.text.toString()
//
//            login(email,password)
//
//        }
//
////
//    }
//    private fun login(email:String, password:String){
//
//        mAuth.signInWithEmailAndPassword(email, password)
//            .addOnCompleteListener(this) { task ->
//                if (task.isSuccessful) {
//                    // Sign in success, update UI with the signed-in user's information
//                    val intent = Intent(this,MainActivity4::class.java)
//                    startActivity(intent)
//
//                } else {
//                    // If sign in fails, display a message to the user.
//                    Toast.makeText(this,"user doesn't exist",Toast.LENGTH_SHORT).show()
//
//                }
//            }
//
//    }
//
//}