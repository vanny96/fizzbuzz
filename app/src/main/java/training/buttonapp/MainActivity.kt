package training.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var counterView : TextView? = null
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterView = findViewById(R.id.textView)
        updateView()

        findViewById<Button>(R.id.button).setOnClickListener(this)
    }

    private fun updateView(){
        if(counter % 3 == 0 && counter % 5 == 0)
            counterView?.text = getText(R.string.fizz_buzz)
        else if(counter % 5 == 0)
            counterView?.text = getText(R.string.buzz)
        else if(counter % 3 == 0)
            counterView?.text = getText(R.string.fizz)
        else
            counterView?.text = counter.toString()
    }

    override fun onClick(v: View?) {
        counter++
        updateView()
    }
}
