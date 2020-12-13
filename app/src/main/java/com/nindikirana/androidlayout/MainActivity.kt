package com.nindikirana.androidlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nindikirana.androidlayout.layout.ConstraintLayout
import com.nindikirana.androidlayout.layout.LinearActivity
import com.nindikirana.androidlayout.layout.RelativeActivity
import com.nindikirana.androidlayout.layout.TableLayoutActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonLinearLayout.setOnClickListener {
            startActivity(Intent(this, LinearActivity::class.java)) }

        buttonRelativeLayout.setOnClickListener {
            startActivity(Intent(this, RelativeActivity::class.java))}

        buttonConstraintLayout.setOnClickListener {
            startActivity(Intent(this, ConstraintLayout::class.java))}

        buttonTableLayout.setOnClickListener {
            startActivity(Intent(this, TableLayoutActivity::class.java))}
    }
}