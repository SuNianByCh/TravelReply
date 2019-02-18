package com.example.travelreply

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.reply.ReplyFragment
import java.lang.reflect.AccessibleObject.setAccessible
import android.graphics.Typeface



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        replaceSystemDefaultFont(applicationContext,"font_yaku.ttf")
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.fl,ReplyFragment.instance()).commitNowAllowingStateLoss()
    }

    private fun replaceSystemDefaultFont(context: Context, fontPath: String) {
        replaceTypefaceField("MONOSPACE", Typeface.createFromAsset(context.assets, fontPath))
    }

    //关键--》通过修改MONOSPACE字体为自定义的字体达到修改app默认字体的目的
    private fun replaceTypefaceField(fieldName: String, value: Any) {
        try {
            val defaultField = Typeface::class.java.getDeclaredField(fieldName)
            defaultField.isAccessible = true
            defaultField.set(null, value)
        } catch (e: NoSuchFieldException) {
            e.printStackTrace()
        } catch (e: IllegalAccessException) {
            e.printStackTrace()
        }

    }

}
