package antoniojoseuchoa.com.appinjecaodependenciahilt


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var carro: Carro

   private val mainViewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //findViewById<TextView>(R.id.tv_nome).text = carro.nome
        findViewById<TextView>(R.id.tv_nome).text = mainViewModel.nome
    }

}

class Carro @Inject constructor(){
    val nome = "Gol "
}


class MainViewModel @Inject constructor(): ViewModel(){
    val nome = "Gol"
}



