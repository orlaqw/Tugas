import 'package:flutter/material.dart';

// Fungsi utama yang menjalankan aplikasi
void main() {
  runApp(CalculatorApp());
}

// Kelas utama aplikasi kalkulator
class CalculatorApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: CalculatorHomePage(), // Menentukan beranda aplikasi sebagai halaman utama
    );
  }
}

// Widget stateful untuk halaman beranda kalkulator
class CalculatorHomePage extends StatefulWidget {
  @override
  _CalculatorHomePageState createState() => _CalculatorHomePageState();
}

// State untuk widget CalculatorHomePage
class _CalculatorHomePageState extends State<CalculatorHomePage> {
  String _output = "0"; // Variabel untuk menampilkan hasil
  String _input = ""; // Variabel untuk menampilkan input pengguna
  String _operator = ""; // Variabel untuk menyimpan operator saat ini
  double _num1 = 0; // Menyimpan nilai angka pertama
  double _num2 = 0; // Menyimpan nilai angka kedua

  // Fungsi untuk menangani tombol yang ditekan
  void _buttonPressed(String buttonText) {
    if (buttonText == "C") { // Jika tombol "C" ditekan, reset semua variabel
      _output = "0";
      _input = "";
      _operator = "";
      _num1 = 0;
      _num2 = 0;
    } else if (buttonText == "+" || buttonText == "-" || buttonText == "*" || buttonText == "/") { 
      // Jika tombol operator (+, -, *, /) ditekan
      if (_input.isNotEmpty) {
        _num1 = double.parse(_input); // Mengonversi input ke angka pertama
        _operator = buttonText; // Menyimpan operator yang dipilih
        _input += buttonText; // Menambahkan operator ke input untuk ditampilkan
      }
    } else if (buttonText == "=") { // Jika tombol "=" ditekan
      if (_operator.isNotEmpty && _input.isNotEmpty) {
        // Memisahkan input berdasarkan operator untuk mendapatkan angka kedua
        List<String> parts = _input.split(RegExp(r'[\+\-\*/]'));
        if (parts.length > 1) {
          _num2 = double.parse(parts[1]); // Mengonversi input setelah operator menjadi angka kedua
          String result = "";
          if (_operator == "+") {
            result = (_num1 + _num2).toString(); // Operasi penjumlahan
          } else if (_operator == "-") {
            result = (_num1 - _num2).toString(); // Operasi pengurangan
          } else if (_operator == "*") {
            result = (_num1 * _num2).toString(); // Operasi perkalian
          } else if (_operator == "/") {
            result = (_num1 / _num2).toString(); // Operasi pembagian
          }
          _input += "=" + result; // Menampilkan operasi yang dilakukan dan hasilnya
          _output = result; // Menyimpan hasil untuk ditampilkan
          _operator = ""; // Reset operator setelah operasi selesai
        }
      }
    } else if (buttonText == "⌫") { // Jika tombol "⌫" ditekan untuk menghapus karakter terakhir
      if (_input.isNotEmpty) {
        _input = _input.substring(0, _input.length - 1); // Menghapus karakter terakhir dari input
        _output = _input.isEmpty ? "0" : _input; // Jika input kosong setelah dihapus, tampilkan "0"
      }
    } else { // Jika tombol angka atau titik ditekan
      _input += buttonText; // Tambahkan angka atau titik ke input
      _output = _input; // Perbarui output dengan input terbaru
    }
    setState(() {}); // Memperbarui tampilan dengan nilai terbaru
  }

  // Fungsi untuk membuat tombol dengan teks dan warna tertentu
  Widget _buildButton(String buttonText, Color color) {
    return Expanded(
      child: TextButton(
        style: ButtonStyle(
          padding: MaterialStateProperty.all<EdgeInsets>(EdgeInsets.all(24.0)), // Ukuran padding tombol
          backgroundColor: MaterialStateProperty.all<Color>(color), // Warna latar tombol
          foregroundColor: MaterialStateProperty.all<Color>(Colors.white), // Warna teks tombol
          shape: MaterialStateProperty.all<RoundedRectangleBorder>(
            RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(10.0), // Bentuk tombol dengan sudut melingkar
            ),
          ),
        ),
        child: Text(
          buttonText,
          style: TextStyle(fontSize: 20.0, fontWeight: FontWeight.bold), // Gaya teks tombol
        ),
        onPressed: () => _buttonPressed(buttonText), // Panggil fungsi saat tombol ditekan
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Calculator"), // Judul aplikasi
      ),
      body: Column(
        children: <Widget>[
          Container(
            alignment: Alignment.centerRight,
            padding: EdgeInsets.symmetric(vertical: 24.0, horizontal: 12.0), // Padding untuk kontainer teks input/output
            child: Text(
              _input, // Menampilkan seluruh operasi dan hasil
              style: TextStyle(fontSize: 48.0, fontWeight: FontWeight.bold), // Gaya teks hasil
            ),
          ),
          Expanded(
            child: Divider(), // Pembatas di antara tampilan hasil dan tombol
          ),
          Column(
            children: [
              Row(
                children: [
                  _buildButton("7", Colors.grey), // Membuat tombol angka "7"
                  _buildButton("8", Colors.grey), // Membuat tombol angka "8"
                  _buildButton("9", Colors.grey), // Membuat tombol angka "9"
                  _buildButton("/", Colors.blueAccent), // Membuat tombol operator pembagian "/"
                ],
              ),
              Row(
                children: [
                  _buildButton("4", Colors.grey), // Membuat tombol angka "4"
                  _buildButton("5", Colors.grey), // Membuat tombol angka "5"
                  _buildButton("6", Colors.grey), // Membuat tombol angka "6"
                  _buildButton("*", Colors.blueAccent), // Membuat tombol operator perkalian "*"
                ],
              ),
              Row(
                children: [
                  _buildButton("1", Colors.grey), // Membuat tombol angka "1"
                  _buildButton("2", Colors.grey), // Membuat tombol angka "2"
                  _buildButton("3", Colors.grey), // Membuat tombol angka "3"
                  _buildButton("-", Colors.blueAccent), // Membuat tombol operator pengurangan "-"
                ],
              ),
              Row(
                children: [
                  _buildButton("0", Colors.grey), // Membuat tombol angka "0"
                  _buildButton("⌫", Colors.orangeAccent), // Membuat tombol hapus "⌫"
                  _buildButton("+", Colors.blueAccent), // Membuat tombol operator penjumlahan "+"
                ],
              ),
              Row(
                children: [
                  _buildButton("C", Colors.redAccent), // Membuat tombol reset "C"
                  _buildButton("=", Colors.green), // Membuat tombol sama dengan "="
                ],
              ),
            ],
          ),
        ],
      ),
    );
  }
}
