package com.mmlodawski.jvmoverloadsmediumexample.widget.button

import android.content.Context
import android.util.AttributeSet
import android.widget.Button

class ButtonConstructors : Button {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

}
