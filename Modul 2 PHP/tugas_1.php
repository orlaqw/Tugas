<?php

$produk = [
    'nama' => ['Galaxy S21','Galaxy A71','iPhone 12 Pro Max','iPhone 12 Mini'],
    'merk' => ['Samsung','Samsung','Apple','Apple'],
    'harga' => [19000000,6999000,20999000,10999000],
    'stok' => [true, false, true, false]
];

function cekStok($stok) {
    if($stok == false) {
        return 'Stok Habis';
    } else {
        return 'Stok Tersedia';
    }
}

echo "<table border='1'>";
echo "<tr>";

for($i = 0; $i < count($produk['nama']); $i++) {
    echo "<td>";
    echo $produk['merk'][$i] . "<br>";
    echo $produk['nama'][$i] . "<br>";
    echo "Rp" . $produk['harga'][$i] . "<br>";
    echo cekStok($produk['stok'][$i]);
    echo "</td>";
}

echo "</tr>";
echo "</table>";

?>