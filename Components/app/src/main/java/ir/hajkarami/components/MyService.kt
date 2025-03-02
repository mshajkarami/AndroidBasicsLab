package ir.hajkarami.components

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings


class MyService : Service() {
    private var  player : MediaPlayer? = null
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        player = MediaPlayer.create(this,Settings.System.DEFAULT_RINGTONE_URI).apply {
            isLooping = true
            start()
        }


        return START_STICKY
    }



    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
    override fun onDestroy() {
        super.onDestroy()
        player?.let {
            if (it.isPlaying)
                it.stop()
            it.release()
        }
        player = null
    }
}