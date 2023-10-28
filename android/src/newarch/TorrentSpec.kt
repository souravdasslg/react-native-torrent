package com.torrent

import com.facebook.react.bridge.ReactApplicationContext

abstract class TorrentSpec internal constructor(context: ReactApplicationContext) :
  NativeTorrentSpec(context) {
}
