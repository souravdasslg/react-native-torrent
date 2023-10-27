const Torrent = require('./NativeTorrent').default;

export function multiply(a: number, b: number): number {
  return Torrent.multiply(a, b);
}
