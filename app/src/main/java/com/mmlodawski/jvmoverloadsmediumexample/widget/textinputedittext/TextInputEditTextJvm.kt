package com.mmlodawski.jvmoverloadsmediumexample.widget.textinputedittext

import android.content.Context
import android.support.design.widget.TextInputEditText
import android.util.AttributeSet

class TextInputEditTextJvm @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : TextInputEditText(context, attrs, defStyleAttr)
