package kotlin

fun main() {
    print(gcd(12,32))
}

fun gcd(p: Int, q: Int): Int {
    if(q == 0) return p

    val r = p % q
    return gcd(q, r)
}
