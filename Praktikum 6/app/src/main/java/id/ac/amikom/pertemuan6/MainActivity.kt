 package id.ac.amikom.pertemuan6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import id.ac.amikom.pertemuan6.presenter.KelilingPresenter
import id.ac.amikom.pertemuan6.presenter.LuasPresenter

class MainActivity : AppCompatActivity(), LuasView, KelilingView {

    private lateinit var presenterLuas: LuasPresenter
    private lateinit var presenterKeliling: KelilingPresenter
    private lateinit var etpanjang: EditText
    private lateinit var etLebar: EditText
    private lateinit var tvHasilLuasdanKelilingPersegiPanjang: TextView
    private lateinit var btnHitungLuasPersegiPanjang: Button
    private lateinit var btnHitungKelilingPersegiPanjang: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenterLuas = LuasPresenter(this)
        presenterKeliling = KelilingPresenter(this)

        etpanjang = findViewById(R.id.et_panjang)
        etLebar = findViewById(R.id.et_lebar)
        tvHasilLuasdanKelilingPersegiPanjang = findViewById(R.id.tv_hasil)
        btnHitungLuasPersegiPanjang = findViewById(R.id.btn_Luas)
        btnHitungKelilingPersegiPanjang = findViewById(R.id.btn_Keliling)

        btnHitungLuasPersegiPanjang.setOnClickListener {
            val panjang = etpanjang.text.toString().trim().toFloat()
            val lebar = etLebar.text.toString().trim().toFloat()

            presenterKeliling.HitungKelilingPersegiPanjang(panjang, lebar)
        }
    }

    override fun hasilLuasPersegiPanjang(luas: Float) {
        tvHasilLuasdanKelilingPersegiPanjang.text = luas.toString()
    }

    override fun hasilKelilingPersegiPanjang(keliling: Float) {
        tvHasilLuasdanKelilingPersegiPanjang.text = keliling.toString()
    }
}