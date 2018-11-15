package com.mmlodawski.jvmoverloadsmediumexample.widget.button

import android.content.Context
import android.util.AttributeSet
import android.widget.Button

class ButtonJvm @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : Button(context, attrs, defStyleAttr)
