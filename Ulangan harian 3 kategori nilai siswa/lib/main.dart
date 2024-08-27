import 'package:flutter/material.dart';

void main() {
  runApp(NilaiSiswaApp()); // Menjalankan aplikasi dengan widget utama NilaiSiswaApp
}

class NilaiSiswaApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Pengelompokan Nilai Siswa', // Judul aplikasi
      theme: ThemeData(
        primarySwatch: Colors.blue, // Skema warna utama aplikasi
      ),
      home: NilaiSiswaPage(), // Widget utama yang ditampilkan saat aplikasi dimulai
    );
  }
}

class NilaiSiswaPage extends StatefulWidget {
  @override
  _NilaiSiswaPageState createState() => _NilaiSiswaPageState(); // Membuat dan mengembalikan state untuk NilaiSiswaPage
}

class _NilaiSiswaPageState extends State<NilaiSiswaPage> {
  final TextEditingController _controller = TextEditingController(); // Controller untuk mengontrol input TextField
  String _result = ''; // Menyimpan hasil kategori atau pesan kesalahan

  void _hitungNilai() {
    final String input = _controller.text; // Mengambil teks yang diinputkan
    final int? nilai = int.tryParse(input); // Mengonversi teks ke integer, jika gagal, nilai akan null

    if (nilai == null || nilai < 0 || nilai > 100) { // Validasi input
      setState(() {
        _result = 'Input tidak valid. Masukkan nilai antara 0-100.'; // Pesan kesalahan jika input tidak valid
      });
      return;
    }

    String kategori;
    // Menentukan kategori berdasarkan nilai
    if (nilai >= 85) {
      kategori = 'A';
    } else if (nilai >= 70) {
      kategori = 'B';
    } else if (nilai >= 55) {
      kategori = 'C';
    } else {
      kategori = 'D';
    }

    setState(() {
      _result = 'Kategori: $kategori'; // Mengupdate hasil dengan kategori nilai
    });
  }

  Color _getColorForCategory(String result) {
    // Mengatur warna teks berdasarkan kategori nilai
    if (result.startsWith('Kategori: A')) {
      return Colors.green; // Warna untuk kategori A
    } else if (result.startsWith('Kategori: B')) {
      return Colors.blue; // Warna untuk kategori B
    } else if (result.startsWith('Kategori: C')) {
      return Colors.orange; // Warna untuk kategori C
    } else if (result.startsWith('Kategori: D')) {
      return Colors.red; // Warna untuk kategori D
    } else {
      return Colors.black; // Warna default untuk pesan kesalahan
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Kategori Nilai Siswa'), // Judul pada AppBar
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0), // Memberi jarak sekitar widget di dalam Padding
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center, // Menyusun widget secara vertikal di tengah
          crossAxisAlignment: CrossAxisAlignment.start, // Menyelaraskan widget ke kiri
          children: [
            TextField(
              controller: _controller, // Menghubungkan TextEditingController
              keyboardType: TextInputType.number, // Menyediakan keyboard numerik
              decoration: InputDecoration(
                border: OutlineInputBorder(), // Mengatur border untuk TextField
                labelText: 'Masukkan Nilai', // Label untuk TextField
                hintText: '0 - 100', // Petunjuk teks yang ditampilkan saat TextField kosong
              ),
            ),
            SizedBox(height: 20), // Memberi jarak vertikal antara widget
            Row(
              children: [
                ElevatedButton(
                  onPressed: _hitungNilai, // Fungsi yang dijalankan saat tombol ditekan
                  style: ElevatedButton.styleFrom(
                    backgroundColor: Colors.purple, // Warna latar belakang tombol
                    foregroundColor: Colors.white, // Warna teks tombol
                  ),
                  child: Text('Hitung'), // Teks yang ditampilkan di tombol
                ),
              ],
            ),
            SizedBox(height: 20), // Memberi jarak vertikal antara widget
            Text(
              _result, // Menampilkan hasil kategori atau pesan kesalahan
              style: TextStyle(
                fontSize: 20, // Ukuran font
                fontWeight: FontWeight.bold, // Ketebalan font
                color: _getColorForCategory(_result), // Mengatur warna teks berdasarkan kategori
              ),
            ),
          ],
        ),
      ),
    );
  }
}
