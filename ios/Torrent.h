
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNTorrentSpec.h"

@interface Torrent : NSObject <NativeTorrentSpec>
#else
#import <React/RCTBridgeModule.h>

@interface Torrent : NSObject <RCTBridgeModule>
#endif

@end
