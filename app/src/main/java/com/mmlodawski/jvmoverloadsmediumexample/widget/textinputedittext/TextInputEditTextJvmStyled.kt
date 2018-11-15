package com.mmlodawski.jvmoverloadsmediumexample.widget.textinputedittext

import android.content.Context
import android.support.design.widget.TextInputEditText
import android.util.AttributeSet

class TextInputEditTextJvmStyled @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = android.support.design.R.attr.editTextStyle
) : TextInputEditText(context, attrs, defStyleAttr)
