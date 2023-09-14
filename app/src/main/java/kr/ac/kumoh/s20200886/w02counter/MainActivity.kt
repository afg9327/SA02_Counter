package kr.ac.kumoh.s20200886.w02counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20200886.w02counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    private var count = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)

        main.btnAdd.setOnClickListener {
            main.txtCount.text = "${++count}"

        }
        main.btnMi.setOnClickListener {
            if(count<1)
            {
                main.txtCount.text = "${count}"

            }
            else
                main.txtCount.text = "${--count}"
        }
        main.btnReset.setOnClickListener {
            count = 0;
            main.txtCount.text = "${count}"
        }
    }
}