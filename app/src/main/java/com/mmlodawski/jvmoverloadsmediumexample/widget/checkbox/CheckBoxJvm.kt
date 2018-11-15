package com.mmlodawski.jvmoverloadsmediumexample.widget.checkbox

import android.content.Context
import android.util.AttributeSet
import android.widget.CheckBox

class CheckBoxJvm @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : CheckBox(context, attrs, defStyleAttr)
