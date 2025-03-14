# Reflection

1. **Perbedaan Pendekatan Performance Testing dengan JMeter dan Profiling dengan IntelliJ Profiler**
    - **Performance Testing (JMeter):**
        - Mengukur performa aplikasi secara end-to-end dengan mensimulasikan beban pengguna.
        - Fokus pada metrik seperti waktu respon, throughput, latency, dan error rate.
        - Pendekatannya bersifat black-box, sehingga tidak mengungkap detail implementasi internal aplikasi.
    - **Profiling (IntelliJ Profiler):**
        - Mengumpulkan data internal aplikasi seperti penggunaan CPU, memori, dan waktu eksekusi per metode.
        - Menyediakan visualisasi call tree, timeline, dan hotspot untuk menganalisis bottleneck.
        - Pendekatannya bersifat white-box sehingga memberikan insight mendalam ke dalam logika dan struktur kode.

2. **Bagaimana Proses Profiling Membantu Mengidentifikasi Titik Lemah Aplikasi**
    - Profiling memungkinkan kita untuk melihat secara detail bagian mana dari kode yang menghabiskan waktu atau memori secara berlebihan.
    - Dengan memeriksa call tree dan timeline, kita bisa mengidentifikasi metode atau query yang menjadi bottleneck.
    - Data yang diperoleh dari profiler membantu menentukan apakah masalah disebabkan oleh loop yang tidak efisien, query yang berlebihan, atau penggunaan sumber daya yang tidak optimal.

3. **Efektivitas IntelliJ Profiler dalam Analisis dan Identifikasi Bottleneck**
    - IntelliJ Profiler cukup efektif karena menyediakan visualisasi yang jelas (seperti grafik dan call tree) sehingga memudahkan untuk mengidentifikasi titik-titik masalah dalam kode.
    - Dengan data detail per metode, kita bisa mengarahkan upaya optimasi ke bagian kode yang benar-benar mempengaruhi performa.
    - Meskipun ada overhead dari proses profiling, alat ini sangat membantu dalam memahami dan memperbaiki masalah performa secara spesifik.

4. **Tantangan Utama dalam Performance Testing dan Profiling serta Cara Mengatasinya**
    - **Variabilitas Kondisi Lingkungan:**
        - Hasil testing bisa berubah-ubah karena faktor eksternal (misalnya, beban server, kondisi jaringan).
        - *Solusi:* Lakukan pengujian berulang dan bandingkan metrik rata-rata/median untuk mendapatkan gambaran yang lebih stabil.
    - **Overhead dari Profiling:**
        - Proses profiling dapat menambah overhead sehingga kadang hasilnya tidak sepenuhnya mencerminkan performa normal aplikasi.
        - *Solusi:* Gunakan teknik sampling dan bandingkan dengan hasil performance testing dari alat lain seperti JMeter.
    - **Interpretasi Data yang Kompleks:**
        - Data yang dihasilkan profiler bisa sangat detail dan memerlukan pemahaman mendalam untuk diinterpretasikan dengan benar.
        - *Solusi:* Gabungkan data profiling dengan metrik dari performance testing dan diskusikan temuan dengan tim untuk validasi.

5. **Manfaat Utama dari Menggunakan IntelliJ Profiler**
    - **Insight Mendalam:** Memperlihatkan secara spesifik metode atau query yang paling menghabiskan sumber daya.
    - **Visualisasi Bottleneck:** Call tree, timeline, dan grafik memudahkan identifikasi area kode yang perlu dioptimalkan.
    - **Fokus pada Optimasi:** Membantu dalam menentukan area mana yang harus di-refactor, sehingga optimasi dapat dilakukan secara tepat sasaran tanpa mengganggu fungsionalitas keseluruhan aplikasi.

6. **Menangani Ketidakkonsistenan Hasil Profiling IntelliJ Profiler dengan Performance Testing JMeter**
    - **Cross-Validation:** Bandingkan hasil dari kedua alat tersebut untuk mendapatkan gambaran yang lebih komprehensif.
    - **Evaluasi Skenario Pengujian:** Pastikan bahwa kondisi pengujian (misalnya beban dan lingkungan) konsisten saat menggunakan kedua alat.
    - **Gunakan Data Tambahan:** Kombinasikan hasil dengan log aplikasi, monitoring server, dan analisis lain untuk memahami perbedaan hasil dan menyaring noise yang mungkin muncul dari overhead masing-masing alat.

7. **Strategi Optimasi Aplikasi dan Menjaga Fungsionalitas Tetap Utuh**
    - **Refactoring dan Optimasi Query:**
        - Perbaiki algoritma yang tidak efisien (misalnya, dengan mengganti concatenation manual dengan `Collectors.joining()`).
        - Gunakan query yang lebih efisien, seperti `findTopByOrderByGpaDesc()`, untuk mengurangi beban pemrosesan di sisi aplikasi.
    - **Batch Processing dan Caching:**
        - Terapkan batch processing untuk operasi database yang berulang dan implementasikan caching jika memungkinkan untuk mengurangi beban query.
    - **Pengujian Otomatis:**
        - Pastikan untuk menjalankan unit test, integration test, dan regression test agar setiap perubahan optimasi tidak mengganggu fungsionalitas aplikasi.
    - **Monitoring dan Review Ulang:**
        - Setelah optimasi, lakukan pengujian ulang (baik dengan profiling maupun performance testing) untuk memastikan bahwa perubahan yang dilakukan benar-benar meningkatkan performa tanpa mengorbankan kestabilan dan fungsionalitas aplikasi.
