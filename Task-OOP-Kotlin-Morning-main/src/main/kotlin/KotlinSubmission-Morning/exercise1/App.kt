package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaDepan = "Fatimatuzzahra"
    val namaBelakang = "Syahab"
    val umur = 20
    val status = true

    println("Nama Depan: $namaDepan")
    println("Nama Belakang: $namaBelakang")
    println("Umur: $umur tahun")
    println("Status: ${if(status) "Single" else "Tidak Single"}")

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {


    println("Nama Group: $groupId")
    println("Group Member: $groupMember")
    println("Session: $session")

    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val groupMember = listOf("Fatimatuzzahra", "Nurul", "Rayhan", "Fikry", "Rifqi", "Kelvin", "Astrid", "Ikram", "Zahra", "Febri", "Raynaldi")
    val namaSaya = groupMember[0]

    return listOf(groupMember[0])
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Reynaldi", "Kak Jovian", "Kak Kelvin", "Kak Sabrina", "Kak Peja")
    val countOfGroup = arrayOf<String>("Fatimatuzzahra", "Nurul", "Rayhan", "Fikry", "Rifqi", "Kelvin", "Astrid", "Ikram", "Zahra", "Febri", "Raynaldi")

    val total = mentor.size + countOfGroup.size

    return total
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Orion", listOf("Fatimatuzzahra", "Nurul", "Rayhan", "Fikry", "Rifqi", "Kelvin", "Astrid", "Ikram", "Zahra", "Febri", "Raynaldi"), "Morning")

}