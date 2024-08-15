package uz.iskandarbek.expandablelist

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.iskandarbek.expandablelist.adapters.ExpandableAdapter
import uz.iskandarbek.expandablelist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    lateinit var titleList: ArrayList<String>
    lateinit var map: HashMap<String, ArrayList<String>>
    lateinit var expandableAdapter: ExpandableAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        loadData()
        expandableAdapter = ExpandableAdapter(titleList, map)
        binding.expandble.setAdapter(this.expandableAdapter)

    }
    private fun loadData() {
        map = HashMap()
        val isco1 = arrayListOf("Kompyuter", "Noutbuk")
        val isco2 = arrayListOf("Telefon", "Planshet")
        val isco3 = arrayListOf("Televizor", "Proyektor")

        // Uchinchi elementni qo'shish kerak
        titleList = arrayListOf("Kompyuter,Smartfon", "Texnika", "Media")

        map[titleList[0]] = isco1
        map[titleList[1]] = isco2
        map[titleList[2]] = isco3
    }

}