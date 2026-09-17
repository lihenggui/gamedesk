// ffi.kt

package ffi

import android.content.Context
import java.nio.ByteBuffer

import me.blocker.gamedesk.RdClipboardManager

object FFI {
    init {
        System.loadLibrary("gamedesk")
    }

    external fun onAppStart(ctx: Context)
    external fun setClipboardManager(clipboardManager: RdClipboardManager)
    external fun translateLocale(localeName: String, input: String): String
    external fun closeAllSessions()
    external fun setCodecInfo(info: String)
    external fun getLocalOption(key: String): String
    external fun onClipboardUpdate(clips: ByteBuffer)
}
