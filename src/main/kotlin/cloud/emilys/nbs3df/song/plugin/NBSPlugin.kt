package cloud.emilys.nbs3df.song.plugin

import cloud.emilys.nbs3df.song.NBSSong

interface NBSPlugin {
    fun apply(file: NBSSong): NBSSong
}

typealias PluginChain = List<NBSPlugin>

fun PluginChain.apply(song: NBSSong): NBSSong =
    fold(song) { acc, plugin -> plugin.apply(acc) }