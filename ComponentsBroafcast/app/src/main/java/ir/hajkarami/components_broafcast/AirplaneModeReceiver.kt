package ir.hajkarami.components_broafcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action != null && intent.action.equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)) {
            val isAirplaneMode: Boolean = intent.getBooleanExtra("state", false)

            val msg: String = if (isAirplaneMode) "Airplane Mode Enabled" else "Airplane Mode Disabled"
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
        }
    }
}