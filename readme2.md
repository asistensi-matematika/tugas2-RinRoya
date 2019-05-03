# TUGAS 2 ASISTENSI ALPRO - Jumat, 03 Mei 2019

## DESKRIPSI SOAL
Buatlah suatu program dengan menggunakan GUI untuk mengaproksimasi nilai $f(x)$ dengan $n$ angka penting.

## METODE PENYELESAIAN
Metode numerik adalah suatu metode untuk mencari nilai fungsi yang relatif rumit secara eksak. Biasanya, untuk melakukan aproksimasi digunakan cara rekursif sebanyak bilangan asli tertentu (berhingga).

 Didefinisikan suatu error dari perhitungan aproksimasi nilai $f(x)$ adalah sebagai 

$\varepsilon_{a}=\dfrac{f_i-f_{i-1}}{f_{i}}\times100\%$

dimana $\varepsilon_a$ menyatakan persentase error aproksimasi relatif dan $f_i$ menyatakan nilai aproksimasi pada saat ke $i$.

Nilai $\varepsilon_a$ dikatakan benar sampai suatu toleransi $\varepsilon_s$ dengan $n$ angka penting jika $|\varepsilon_a|<\varepsilon_s=(0.5\times10^{2-n})\%$

Kemudian, cara termudah mengaproksimasi suatu nilai fungsi adalah dengan melakukan penderetan Taylor.

Suatu fungsi $f(x)$ yang terdiferensiabel memiliki bentuk deret pada persekitaran titik $x=a$, dimana

$f(x)=\displaystyle\sum_{n=0}^\infty \dfrac{f^{(n)}(a)}{n!}(x-a)^n$

untuk $|x-a|<R$

Bila $a=0$, maka deret diatas disebut deret Maclaurin.

## SOAL
Pilih 3 nomor dan dapatkan aproksimasinya dari : 

1. $f(x)=e^{x^2}$ 
2. $f(x)=\sin(2x)$
3. $f(x)=\cosh(-6x)$
4. $f(x)=\ln(-x)$
5. $f(x)=\dfrac{x}{1-x}$
6. $f(x)=x^2\arctan(x)$
7. $f(x)=xe^{2x}$

untuk suatu input $a$ dan $n$.

## UPLOAD 
silahkan upload file solusi dengan nama `NAMA_TUGAS2.java` 

