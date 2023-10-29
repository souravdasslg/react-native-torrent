package com.souravdasslg.rntorrent
import com.facebook.react.bridge.ReactApplicationContext
import org.mockito.Mockito

class TorrentModuleTest {

    @org.junit.jupiter.api.Test
    fun getLibTorrentVersion() {
      val reactApplicationContext = Mockito.mock(ReactApplicationContext::class.java)
      val torrentPackage = TorrentModule(reactApplicationContext);
      val version = torrentPackage.getLibTorrentVersion();
      println("LibTorrent version: $version")
    }
}
