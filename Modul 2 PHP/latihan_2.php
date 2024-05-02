<?php
$siswa = [
    'nama' => ['Ahmad Habibi','Zainul Abidin','Firdaus','Achmad Ilham'],
    'kelas' => ['X','XI','XII'],
    'jurusan' => ['-RPL','-TKJ']
    ];
        
    echo $siswa['nama'][0],"<br>",
    $siswa['kelas'][0], $siswa['jurusan'][0],"<br>",
    $siswa['nama'][1],"<br>",
    $siswa['kelas'][2], $siswa['jurusan'][0],"<br>",
    $siswa['nama'][2],"<br>",
    $siswa['kelas'][1], $siswa['jurusan'][1],"<br>",
    $siswa['nama'][3],"<br>",
    $siswa['kelas'][0], $siswa['jurusan'][1];
    ?>