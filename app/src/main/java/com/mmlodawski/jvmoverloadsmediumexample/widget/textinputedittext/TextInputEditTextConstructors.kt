package com.mmlodawski.jvmoverloadsmediumexample.widget.textinputedittext

import android.content.Context
import android.support.design.widget.TextInputEditText
import android.util.AttributeSet

class TextInputEditTextConstructors : TextInputEditText {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

}
