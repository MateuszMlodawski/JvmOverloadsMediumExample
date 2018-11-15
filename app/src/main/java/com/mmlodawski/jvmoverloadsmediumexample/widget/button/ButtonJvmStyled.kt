package com.mmlodawski.jvmoverloadsmediumexample.widget.button

import android.content.Context
import android.util.AttributeSet
import android.widget.Button

class ButtonJvmStyled @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = android.support.design.R.attr.buttonStyle
) : Button(context, attrs, defStyleAttr)
