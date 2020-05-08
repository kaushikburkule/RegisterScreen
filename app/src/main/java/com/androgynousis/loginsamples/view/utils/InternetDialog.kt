package com.androgynousis.loginsamples.view.utils

import android.app.Dialog
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.view.View
import com.androgynousis.loginsamples.R

class InternetDialog(private val context: Context) {

    val internetStatus: Boolean
        get() {
            val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val activeNetwork = cm.activeNetworkInfo
            val isConnected = activeNetwork != null && activeNetwork.isConnectedOrConnecting
            if (!isConnected) showNoInternetDialog()
            return isConnected
        }

    private fun showNoInternetDialog() {
        val dialog1 = Dialog(context, R.style.df_dialog)
        dialog1.setContentView(R.layout.dialog_no_internet)
        dialog1.setCancelable(true)
        dialog1.setCanceledOnTouchOutside(true)
        dialog1.findViewById<View>(R.id.btnSpinAndWinRedeem).setOnClickListener { dialog1.dismiss() }
        dialog1.show()
    }

}
