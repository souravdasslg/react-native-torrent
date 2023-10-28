package com.souravdasslg.rntorrent

import com.facebook.react.TurboReactPackage
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider
import com.facebook.react.module.model.ReactModuleInfo
import com.torrent.BuildConfig
import java.util.HashMap

class TorrentPackage : TurboReactPackage() {
  override fun getModule(name: String, reactContext: ReactApplicationContext): TorrentModule? {
    return if (name == TorrentModule.NAME) {
      TorrentModule(reactContext)
    } else {
      null
    }
  }

  override fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
    return ReactModuleInfoProvider {
      val moduleInfos: MutableMap<String, ReactModuleInfo> = HashMap()
      val isTurboModule: Boolean = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED
      moduleInfos[TorrentModule.NAME] = ReactModuleInfo(
        TorrentModule.NAME,
        TorrentModule.NAME,
        false,  // canOverrideExistingModule
        false,  // needsEagerInit
        true,  // hasConstants
        false,  // isCxxModule
        isTurboModule // isTurboModule
      )
      moduleInfos
    }
  }
}
