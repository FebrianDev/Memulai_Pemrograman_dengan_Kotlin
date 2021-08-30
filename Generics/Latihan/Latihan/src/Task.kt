/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(10)

    // TODO 2
    println("String result: $stringResult")
    println("Int result: $intResult")
}

// TODO 1
fun <T> getResult(args: T): Int {
    if(args is Int){
     return args * 5
    }else if(args is String){
        return args.length
    }else {
        return 0
    }
}