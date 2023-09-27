package com.vimal.leetcodealgorithms.string

class decodeMessage {
    fun decodeMessage(key: String, message: String): String {

        val truncatedKey = key.substring(0, message.length) // Ensure key and message have the same length

        val charMapping = mutableMapOf<Char, Char>()

        for (i in truncatedKey.indices) {
            val keyChar = truncatedKey[i]
            val messageChar = message[i]
            charMapping[messageChar] = keyChar
        }

        val decodedMessage = StringBuilder()
        for (char in message) {
            if (char == ' ') {
                decodedMessage.append(' ')
            } else {
                decodedMessage.append(charMapping[char])
            }
        }

        return decodedMessage.toString()

    }
}