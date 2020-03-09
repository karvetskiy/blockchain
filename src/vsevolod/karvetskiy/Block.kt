package vsevolod.karvetskiy

import java.io.Serializable

class Block(val from: String,
            val to: String,
            var amount: Int,
            var previousHash: String):Serializable {

    private var encode: Crypto = Crypto()

    var hash: String = encode.getHash(from + to + amount + previousHash)

    override fun toString(): String {
        return "from $from, to $to, amount = $amount \nhash(sha-256): $hash"
    }

}