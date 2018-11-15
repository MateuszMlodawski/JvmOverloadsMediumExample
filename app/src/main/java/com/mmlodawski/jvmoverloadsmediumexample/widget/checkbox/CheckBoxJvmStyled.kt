package com.mmlodawski.jvmoverloadsmediumexample.widget.checkbox

import android.content.Context
import android.util.AttributeSet
import android.widget.CheckBox

class CheckBoxJvmStyled @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = android.support.design.R.attr.checkboxStyle
) : CheckBox(context, attrs, defStyleAttr)
