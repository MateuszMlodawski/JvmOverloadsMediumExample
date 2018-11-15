package com.mmlodawski.jvmoverloadsmediumexample.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mmlodawski.jvmoverloadsmediumexample.R
import com.mmlodawski.jvmoverloadsmediumexample.toolbox.Navigator
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val navigator: Navigator by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpListeners()
    }

    private fun setUpListeners() {
        buttons.setOnClickListener { navigator.navigateToButtons(this) }
        textInputEditTexts.setOnClickListener { navigator.navigateToTextInputEditTexts(this) }
        checkBoxes.setOnClickListener { navigator.navigateToCheckBoxes(this) }
    }
}