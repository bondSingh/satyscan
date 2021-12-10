package tpty.satyscan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import tpty.satyscan.databinding.ActivityMainBinding
import android.content.Intent
import saty.scanner.CameraActivity


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textScan.setOnClickListener {
            val myIntent = Intent(this@MainActivity, CameraActivity::class.java)
            startActivity(myIntent)
            Log.d("saty", "MainActivity onCreate:: textScan")

        }
        binding.imageScan.setOnClickListener {
            Log.d("saty", "MainActivity onCreate:: imageScan")

        }
    }
}