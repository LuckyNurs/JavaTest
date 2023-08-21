# JavaTest
## Detail kompleksitas jawaban No.3.

Kompleksitas Waktu:

Loop for (char c : input.toCharArray()) melintasi setiap karakter dalam string input, sehingga kompleksitas waktu loop adalah O(n), di mana n adalah panjang string input.
Pada setiap iterasi, operasi push dan pop pada stack memiliki kompleksitas waktu konstan O(1). Tidak ada perulangan lain atau operasi yang bergantung pada panjang string.
Karena operasi push/pop dan loop tidak berinteraksi secara bersamaan, kompleksitas waktu total adalah O(n), di mana n adalah panjang string input.

Kompleksitas Ruang:

Stack digunakan untuk menyimpan karakter-karakter pembuka. Pada setiap iterasi, setidaknya satu karakter pembuka akan dimasukkan ke dalam stack.
Dalam kasus terburuk, jika seluruh karakter dalam input adalah karakter pembuka, stack akan mencapai ukuran n (panjang string).
Karena itu, kompleksitas ruang adalah O(n).
Dalam hal ini, kompleksitas waktu dan ruang bergantung pada panjang string input (n). Keduanya adalah O(n), di mana n adalah panjang string input. Anda dapat menjelaskan ini lebih detail di dalam README pada repository Anda untuk memberikan pemahaman yang lebih baik kepada orang yang membaca kode tersebut.
