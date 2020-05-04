package liang.lollipop.ltabviewdemo

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import liang.lollipop.ltabview.LTabHelper
import liang.lollipop.ltabview.LTabView
import liang.lollipop.ltabview.builder.ExpandBuilder
import liang.lollipop.ltabview.builder.MaterialBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var tabHelper: ExpandBuilder

    private lateinit var tabHelper2: MaterialBuilder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        initView()
    }

    private fun initView() {

        tabHelper = LTabHelper.withExpandItem(tabView)
            .addItem {
                val color = ContextCompat.getColor(this@MainActivity, R.color.purple)
                setIcon(R.drawable.ic_home_black_24dp)
                selectedIconColor = color
                unselectedIconColor = Color.BLACK
                textColor = color
                expandColor = color and 0x60FFFFFF
                text = "Home"
            }.addItem {
                val color = ContextCompat.getColor(this@MainActivity, R.color.pink)
                setIcon(R.drawable.ic_favorite_border_black_24dp)
                selectedIconColor = color
                unselectedIconColor = Color.BLACK
                textColor = color
                expandColor = color and 0x60FFFFFF
                text = "Like"
            }.addItem {
                val color = ContextCompat.getColor(this@MainActivity, R.color.orange)
                setIcon(R.drawable.ic_whatshot_black_24dp)
                selectedIconColor = color
                unselectedIconColor = Color.BLACK
                textColor = color
                expandColor = color and 0x60FFFFFF
                text = "Hot"
            }.addItem {
                val color = ContextCompat.getColor(this@MainActivity, R.color.blue)
                setIcon(R.drawable.ic_person_black_24dp)
                selectedIconColor = color
                unselectedIconColor = Color.BLACK
                textColor = color
                expandColor = color and 0x60FFFFFF
                text = "Center"
            }
        tabHelper.layoutStyle = LTabView.Style.Start
        tabHelper.onSelected {
            textView.text = "selected ：$it"
        }



        tabHelper2 = LTabHelper.withMaterialItem(tabView2)
            .addItem {
                val color = ContextCompat.getColor(this@MainActivity, R.color.purple)
                setIcon(R.drawable.ic_home_black_24dp)
                selectedIconColor = color
                unselectedIconColor = Color.BLACK
                textColor = color
                text = "Home"
            }.addItem {
                val color = ContextCompat.getColor(this@MainActivity, R.color.pink)
                setIcon(R.drawable.ic_favorite_border_black_24dp)
                selectedIconColor = color
                unselectedIconColor = Color.BLACK
                textColor = color
                text = "Like"
            }.addItem {
                val color = ContextCompat.getColor(this@MainActivity, R.color.orange)
                setIcon(R.drawable.ic_whatshot_black_24dp)
                selectedIconColor = color
                unselectedIconColor = Color.BLACK
                textColor = color
                text = "Hot"
            }.addItem {
                val color = ContextCompat.getColor(this@MainActivity, R.color.blue)
                setIcon(R.drawable.ic_person_black_24dp)
                selectedIconColor = color
                unselectedIconColor = Color.BLACK
                textColor = color
                text = "Center"
            }
        tabHelper2.layoutStyle = LTabView.Style.Start
        tabHelper2.onSelected {
            textView2.text = "selected ：$it"
        }

        LTabHelper.withExpandItem(tabView3)
            .addItem {
                val color = ContextCompat.getColor(this@MainActivity, R.color.purple)
                setIcon(R.drawable.ic_home_black_24dp)
                selectedIconColor = color
                unselectedIconColor = Color.BLACK
                textColor = color
                expandColor = color and 0x60FFFFFF
                text = "Home"
            }.addItem {
                val color = ContextCompat.getColor(this@MainActivity, R.color.pink)
                setIcon(R.drawable.ic_favorite_border_black_24dp)
                selectedIconColor = color
                unselectedIconColor = Color.BLACK
                textColor = color
                expandColor = color and 0x60FFFFFF
                text = "Like"
            }.addItem {
                val color = ContextCompat.getColor(this@MainActivity, R.color.orange)
                setIcon(R.drawable.ic_whatshot_black_24dp)
                selectedIconColor = color
                unselectedIconColor = Color.BLACK
                textColor = color
                expandColor = color and 0x60FFFFFF
                text = "Hot"
            }.addItem {
                val color = ContextCompat.getColor(this@MainActivity, R.color.blue)
                setIcon(R.drawable.ic_person_black_24dp)
                selectedIconColor = color
                unselectedIconColor = Color.BLACK
                textColor = color
                expandColor = color and 0x60FFFFFF
                text = "Center"
            }.onSelected {
                textView3.text = "selected ：$it"
            }
        LTabHelper.withMaterialItem(tabView3)
            .addItem {
                val color = ContextCompat.getColor(this@MainActivity, R.color.purple)
                setIcon(R.drawable.ic_home_black_24dp)
                selectedIconColor = color
                unselectedIconColor = Color.BLACK
                textColor = color
                text = "Home"
            }.addItem {
                val color = ContextCompat.getColor(this@MainActivity, R.color.pink)
                setIcon(R.drawable.ic_favorite_border_black_24dp)
                selectedIconColor = color
                unselectedIconColor = Color.BLACK
                textColor = color
                text = "Like"
            }.addItem {
                val color = ContextCompat.getColor(this@MainActivity, R.color.orange)
                setIcon(R.drawable.ic_whatshot_black_24dp)
                selectedIconColor = color
                unselectedIconColor = Color.BLACK
                textColor = color
                text = "Hot"
            }.addItem {
                val color = ContextCompat.getColor(this@MainActivity, R.color.blue)
                setIcon(R.drawable.ic_person_black_24dp)
                selectedIconColor = color
                unselectedIconColor = Color.BLACK
                textColor = color
                text = "Center"
            }.onSelected {
                textView3.text = "selected ：$it"
            }

        limitSwitch.setOnCheckedChangeListener { _, isChecked ->
            tabHelper.isLimit = isChecked
            tabHelper2.isLimit = isChecked
            uniformSwitch.isEnabled = isChecked
        }
        uniformSwitch.setOnCheckedChangeListener { _, isChecked ->
            tabHelper.isUniform = isChecked
            tabHelper2.isUniform = isChecked
        }

        styleSpinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                tabHelper.layoutStyle = LTabView.Style.Start
                tabHelper2.layoutStyle = LTabView.Style.Start
            }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                when (position) {
                    0 -> {
                        tabHelper.layoutStyle = LTabView.Style.Start
                        tabHelper2.layoutStyle = LTabView.Style.Start
                    }
                    1 -> {
                        tabHelper.layoutStyle = LTabView.Style.End
                        tabHelper2.layoutStyle = LTabView.Style.End
                    }
                    2 -> {
                        tabHelper.layoutStyle = LTabView.Style.Fit
                        tabHelper2.layoutStyle = LTabView.Style.Fit
                    }
                    3 -> {
                        tabHelper.layoutStyle = LTabView.Style.Center
                        tabHelper2.layoutStyle = LTabView.Style.Center
                    }
                }
            }
        }

        limitSwitch.isChecked = false
        uniformSwitch.isEnabled = false
    }

}
