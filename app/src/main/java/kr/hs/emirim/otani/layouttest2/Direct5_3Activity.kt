package kr.hs.emirim.otani.layouttest2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Direct5_3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lateinit var text : TextView
        lateinit var edit : EditText

        val linear1 = LinearLayout(this)
        linear1.orientation = LinearLayout.VERTICAL
        val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
        setContentView(linear1, params)

        edit = EditText(this)
        edit.textSize = 20f
        linear1.addView(edit)

        val btn = Button(this)
        btn.text = "버튼입니다."
        btn.setBackgroundColor(Color.rgb(255,0,255))
        linear1.addView(btn)

        text = TextView(this)
        text.text = "Part of result"
        text.textSize = 20f
        text.setTextColor(Color.rgb(128,0,128))
        linear1.addView(text)


        btn.setOnClickListener {
            text.text = edit.text
        }

    }
}