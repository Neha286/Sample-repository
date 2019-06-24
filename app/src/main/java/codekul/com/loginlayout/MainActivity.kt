package codekul.com.loginlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etnum1 = findViewById<EditText>(R.id.etNumber1)
        val etnum2 = findViewById<EditText>(R.id.etNumber2)
        val btadd = findViewById<Button>(R.id.btadd)
        val btsub = findViewById<Button>(R.id.btsub)
        val btmul = findViewById<Button>(R.id.btmul)
        val btdiv = findViewById<Button>(R.id.btdiv)
        val text = findViewById<TextView>(R.id.txtr)

        btadd.SetOnClickListener {
            it:View!
            txtr.text = "" + (Integer.parseInt(etnum1.text.tostring()) + Integer.parseInt(etnum2.text.tostring()))
        }
        btsub.SetOnClickListener {
            txtr.text = "" + (Integer.parseInt(etnum1.text.tostring()) - Integer.parseInt(etnum2.text.tostring()))

        }
        btmul.SetOnClickListener {
            txtr.text = "" + (Integer.parseInt(etnum1.text.tostring()) * Integer.parseInt(etnum2.text.tostring()))
        }
        btdiv.SetOnClickListener {
            txtr.text = "" + (Integer.parseInt(etnum1.text.tostring()) / Integer.parseInt(etnum2.text.tostring()))
        }
    }
}
