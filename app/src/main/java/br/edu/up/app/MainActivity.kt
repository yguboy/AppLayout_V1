package br.edu.up.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.commit
import androidx.fragment.app.replace

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mostrarLinear(view: View) {
        supportFragmentManager.commit {
            replace<LinearFragment>(R.id.fragmentContainerView)
        }
    }
    fun mostrarFrame(view: View) {
        supportFragmentManager.commit {
            replace<FrameFragment>(R.id.fragmentContainerView)
        }
    }
    fun mostrarConstraint(view: View) {
        supportFragmentManager.commit {
            replace<ConstraintFragment>(R.id.fragmentContainerView)
        }
    }
}