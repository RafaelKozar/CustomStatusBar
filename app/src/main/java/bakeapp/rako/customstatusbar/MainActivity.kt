package bakeapp.rako.customstatusbar

import android.content.Context
import android.graphics.PixelFormat
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.WindowManager
import android.view.ViewGroup
import android.widget.TextView
import android.content.Context.LAYOUT_INFLATER_SERVICE
import android.util.TypedValue
import android.view.LayoutInflater


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (Build.VERSION.SDK_INT >= 21) {
            val window = window



            var height = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 25.toFloat() , getResources().getDisplayMetrics());

            val lp = WindowManager.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, height.toInt(),
                    WindowManager.LayoutParams.TYPE_STATUS_BAR,
                    WindowManager.LayoutParams.FLAG_SCALED, PixelFormat.TRANSLUCENT)

            val params = WindowManager.LayoutParams(
                    WindowManager.LayoutParams.MATCH_PARENT,
                    25,
                    WindowManager.LayoutParams.TYPE_SYSTEM_OVERLAY,
                    WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or
                            WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN or
                            WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE or
                            WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    PixelFormat.TRANSLUCENT)

            val layoutInflater = this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = layoutInflater.inflate(R.layout.teste, null)
            window.addContentView(view, lp)
        }
    }
}
