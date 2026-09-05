# ProfilApp

Aplikasi Android sederhana untuk menampilkan halaman profil mahasiswa. Project ini dibuat menggunakan Jetpack Compose, serta menyediakan contoh layout menggunakan XML (activity_main.xml).

## Penjelasan Kode

1. **MainActivity.kt**
   File ini merupakan tampilan utama aplikasi yang menggunakan Jetpack Compose.
   - `Scaffold`: Digunakan sebagai wadah utama halaman.
   - `Column`: Menyusun komponen secara vertikal dan diatur agar berada di tengah layar (`Alignment.CenterHorizontally` dan `fillMaxWidth()`).
   - `Image`: Menampilkan foto profil yang di-crop berbentuk lingkaran (`CircleShape`).
   - `Text`: Menampilkan data diri seperti Nama Lengkap (Ihya' Ulumuddin), NIM (245150201111024), dan status mahasiswa.
   - `Spacer`: Memberi jarak vertikal antar elemen.
   - `FollowButton`: Komponen tombol interaktif yang bisa berubah status antara Follow dan Unfollow menggunakan state (`remember` dan `mutableStateOf`).

2. **activity_main.xml**
   Merupakan contoh layout tradisional berbasis XML menggunakan `LinearLayout` vertikal yang berisi `ImageView`, `TextView`, dan `Button`.

## Screenshot landscape dan portrait
<table>
  <tr>
    <td>
      <img
        src="https://github.com/user-attachments/assets/72168995-b3dc-4af5-bfa5-2322ce97b46d"
        alt="Landscape"
        width="700"
      />
    </td>
    <td>
      <img
        src="https://github.com/user-attachments/assets/2f091077-5a3b-4879-a91a-23fb5febda3d"
        alt="Portrait"
        width="300"
      />
    </td>
  </tr>
</table>


## Keuntungan Compose Dibandingkan XML Layout

Jetpack Compose menggunakan pendekatan deklaratif, dimana bisa hanya mendeskripsikan akan seperti apa UI yang diinginkan, misal Column langsung bisa diisikan dengan component Image, Text, Button, dan lain-lain dalam satu file kotlin yang sama. Berbeda dengan XML tradisional yang menggunakan LinearLayout atau jenis layout yang lain, dimana struktur tampilan XML, sedangkan logika interaksi tetap ditulis di file Kotlin.

Berdasarkan produktivitas, Jetpack Compose lebih praktis karena tidak perlu pindah pindah file untuk hanya menuliskan struktur layout halaman dengan logic dari halaman tersebut juga. Event seperti onClick pun masih dapat ditulis dalam komponen yang dituju, sehingga development menjadi lebih cepat.

Dari sisi pemeliharaan kode, Compose juga lebih mudah karena struktur UI langsung bisa dibaca dari kode Kotlin sendiri, seperti Column yang terlihat dengan jelas bahwa urutannya ada Image, lalu Text, lalu Button. Sedangkan pada XML, struktur UI yang terpisah dari logic aplikasi membuat developer harus mengelola dan menghubungkan lebih banyak file.

Selain itu, Jetpack Compose memiliki lebih sedikit boilerplate code, lalu ada fungsi @Composable yang membuat komponen lebih mudah digunakan kembali dan fitur @Preview sehingga dapat menampilkan sebagian functional code tanpa menjalankan seluruh aplikasi, serta lebih mudah menangani perubahan state.
