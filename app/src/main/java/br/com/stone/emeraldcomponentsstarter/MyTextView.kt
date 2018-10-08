package br.com.stone.emeraldcomponentsstarter

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView

/**
 * Created by renan.silva on 08/10/2018.
 * Copyright (c) Stone Co. All rights reserved.
 * renan.silva@stone.com.br
 */
class MyTextView : TextView {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        setAttributes(attrs)
    }

    private fun setAttributes(attributeSet: AttributeSet) {
        val args = context.theme.obtainStyledAttributes(attributeSet, R.styleable.MyTextView, 0, 0)
        args.recycle()
    }

}