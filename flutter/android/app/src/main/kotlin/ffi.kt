// ffi.kt

package ffi

import android.content.Context
import java.nio.ByteBuffer

import me.blocker.gamedesk.RdClipboardManager

object FFI {
    init {
        System.loadLibrary("gamedesk")
    }

    external fun init(ctx: Context)
    external fun onAppStart(ctx: Context)
    external fun setClipboardManager(clipboardManager: RdClipboardManager)
    external fun onVideoFrameUpdate(buf: ByteBuffer)
    external fun onAudioFrameUpdate(buf: ByteBuffer)
    external fun translateLocale(localeName: String, input: String): String
    external fun refreshScreen()
    external fun closeAllSessions()
    external fun setFrameRawEnable(name: String, value: Boolean)
    external fun setCodecInfo(info: String)
    external fun getLocalOption(key: String): String
    external fun onClipboardUpdate(clips: ByteBuffer)
    external fun isServiceClipboardEnabled(): Boolean
}
