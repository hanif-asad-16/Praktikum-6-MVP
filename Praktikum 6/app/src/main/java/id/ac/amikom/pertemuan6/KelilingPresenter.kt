package id.ac.amikom.pertemuan6.presenter

import id.ac.amikom.pertemuan6.KelilingView

class KelilingPresenter (
    private val kelilingView: KelilingView
) {
    fun HitungKelilingPersegiPanjang(panjang: Float, lebar: Float){
        val hasil = 2*(panjang + lebar)

        kelilingView.HasilKelilingPersegiPanjang(hasil)
    }
}