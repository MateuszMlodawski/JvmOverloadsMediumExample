package com.mmlodawski.jvmoverloadsmediumexample.widget.checkbox

import android.content.Context
import android.util.AttributeSet
import android.widget.CheckBox

class CheckBoxConstructors : CheckBox {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

}
