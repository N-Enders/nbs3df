package cloud.emilys.nbs3df.song.converter

import cloud.emilys.nbs3df.song.NBSSong
import cloud.emilys.nbs3df.template.Args
import cloud.emilys.nbs3df.template.BlockTagItem
import cloud.emilys.nbs3df.template.CodeBlock
import cloud.emilys.nbs3df.template.SlotItem

object LineStarterGenerator {
    private val hiddenTag = BlockTagItem(
        BlockTagItem.BlockTagData(
            option = "False",
            tag = "Is Hidden",
            action = "dynamic",
            block = "func"
        )
    )

    fun createLineStarter(song: NBSSong): CodeBlock {
        return CodeBlock(
            block = "func",
            data = song.header.meta.name,
            args = Args(
                items = listOf(
                    SlotItem(
                        item = hiddenTag,
                        slot = 26
                    )
                )
            )
        )
    }
}