package pe.devpicon.android.miaplicacionkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import org.jetbrains.anko.find

/**
 * Created by Armando on 20/04/2016.
 */
class MainActivity : AppCompatActivity() {

    private val fruits = listOf<String>("banana", "apple", "strawberry", "kiwi",
            "watermelon", "pineapple", "orange")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        val myRecyclerView: RecyclerView = find(R.id.my_recycler_view)
        myRecyclerView.layoutManager = LinearLayoutManager(this)
        myRecyclerView.adapter = MyAdapter(fruits)
    }

}