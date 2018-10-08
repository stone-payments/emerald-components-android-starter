package br.com.stone.emeraldcomponentsstarter

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment

/**
 * Created by renan.silva on 08/10/2018.
 * Copyright (c) Stone Co. All rights reserved.
 * renan.silva@stone.com.br
 */
@RunWith(RobolectricTestRunner::class)
class MyTextViewTest {

    private lateinit var myTextView: MyTextView

    @Before
    fun setup() {
        myTextView = MyTextView(RuntimeEnvironment.application)
    }

    @Test
    fun testInstanceWithContext() {
        val view = MyTextView(RuntimeEnvironment.application)
        Assert.assertNotNull(view)
    }

    @Test
    fun testInstanceWithAttributeSet() {
        val attrs = Robolectric.buildAttributeSet().build()
        val view = MyTextView(RuntimeEnvironment.application, attrs)
        Assert.assertNotNull(view)
    }
}