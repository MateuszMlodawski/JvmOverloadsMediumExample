package com.mmlodawski.jvmoverloadsmediumexample.toolbox

import android.content.Context
import android.content.Intent
import com.mmlodawski.jvmoverloadsmediumexample.activity.ButtonsActivity
import com.mmlodawski.jvmoverloadsmediumexample.activity.CheckBoxesActivity
import com.mmlodawski.jvmoverloadsmediumexample.activity.TextInputEditTextsActivity


class Navigator {

    fun navigateToButtons(context: Context) {
        context.startActivity(Intent(context, ButtonsActivity::class.java))
    }

    fun navigateToTextInputEditTexts(context: Context) {
        context.startActivity(Intent(context, TextInputEditTextsActivity::class.java))
    }

    fun navigateToCheckBoxes(context: Context) {
        context.startActivity(Intent(context, CheckBoxesActivity::class.java))
    }
}