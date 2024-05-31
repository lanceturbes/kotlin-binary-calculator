fun main() {
    println(toBinaryString(534u))
}

tailrec fun toBinaryString(
    value: UInt,
    bitsRequired: UInt = 2u,
    currentBit: UInt = bitsRequired,
    remaining: UInt = value,
    result: String = "",
): String =
    if (currentBit == 1u)
        result + remaining.toString()
    else if (value > bitsRequired)
        toBinaryString(
            value = value,
            bitsRequired = bitsRequired * 2u
        )
    else
        toBinaryString(
            value = value,
            bitsRequired = bitsRequired,
            currentBit = currentBit / 2u,
            remaining = if (remaining >= currentBit) remaining - currentBit else remaining,
            result = result + if (remaining >= currentBit) '1' else '0'
        )

