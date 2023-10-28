package com.souravdasslg.rntorrent

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise
import org.libtorrent4j.AlertListener
import org.libtorrent4j.LibTorrent;

class TorrentModule internal constructor(context: ReactApplicationContext) :
  TorrentSpec(context) {

  override fun getName(): String {
    return NAME
  }

  @ReactMethod
  override fun getLibTorrentVersion(): String {
    return LibTorrent.version()
  }

  companion object {
    const val NAME = "Torrent"
  }
}
