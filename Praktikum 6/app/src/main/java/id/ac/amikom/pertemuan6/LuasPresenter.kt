package id.ac.amikom.pertemuan6.presenter

import id.ac.amikom.pertemuan6.LuasView

class LuasPresenter(
    private val luasView: LuasView
) {
    fun HitungLuasPersegiPanjang(panjang: Float, lebar: Float) {
        val hasil = panjang * lebar

        luasView.HasilLuasPersegiPanjang(hasil)
    }
}