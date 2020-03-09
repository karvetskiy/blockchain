package vsevolod.karvetskiy

import java.nio.charset.StandardCharsets
import java.security.MessageDigest

class Crypto {

    fun getHash(str: String): String {
            val bytes = str.toString().toByteArray()
            val md = MessageDigest.getInstance("SHA-256")
            val digest = md.digest(bytes)
            return digest.fold("", { str, it -> str + "%02x".format(it) })
    }
}