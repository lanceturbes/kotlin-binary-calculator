fun main() {
    println(toBinaryString(534u))
}

tailrec fun toBinaryString(
    value: UInt,
    remaining: UInt = value,
    result: String = "",
    bitsRequired: UInt = 2u,
    currentBit: UInt = bitsRequired
): String {
    if (remaining < 2u) {
        if (currentBit == 1u) {
            return result + if (remaining == 1u) '1' else '0'
        }

        val nextBit = currentBit / 2u
        return toBinaryString(
            value,
            remaining,
            result + '0',
            bitsRequired,
            nextBit
        )
    }

    if (value > bitsRequired) {
        return toBinaryString(value, remaining, result, bitsRequired * 2u)
    }

    val isDivisibleByBit = remaining >= currentBit
    val symbolToAdd = if (isDivisibleByBit) '1' else '0'
    val nextRemaining = if (isDivisibleByBit) remaining - currentBit else remaining
    val nextBit = currentBit / 2u
    return toBinaryString(
        value,
        nextRemaining,
        result + symbolToAdd,
        bitsRequired,
        nextBit
    )
}

