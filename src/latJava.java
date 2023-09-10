import javax.swing.text.Style;
import java.util.Date;

public class latJava {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // kode tipe data integer number
        byte iniByte = 100; // iniByte merupakan variable atau class seperti di javaScript
        // min byte = -128 max 127 jika kita masukan lebih dari maxnya maka akan eror
        short iniShort = 1000;
        // min short -32,768 max 32767
        int iniInt = 100000;
        // min int 2milyar max 2milyar
        long iniLong = 10000000L;
        /* floating point number/angka pecahan.
        ada 2 tipe data yaitu float dan double
         */
        float iniFloat = 10.12F;
        double iniDouble = 12.2424;
        // literals number
        int decimalInt = 25; // untuk decimal ditulis biasa
        int hexInt = 0xA132B; // untuk hexadecimal ditambahkan 0x didepannya
        int binInt = 0b010101; // untuk binnary code ditambahkan 0b didepannya
        // underscore di angka (_) biasanya hanya untuk pemisah biar ga bingung baca angkanya (ga wajib)
        long balance = 1_000_000_000; // contohnya ini 1 milyar,misal tidak ada underscore maka akan bingung saat membacanya
        /* Konversi tipe data Number
        1.Widening Casting (Otomatis) : byte>short>int>float>double
        2.Narrowing Casting (Manual) : double>float>long>int>char>short>byte
         */
        // contoh penggunaan otomatis
        byte angkaByte = 100;
        short angkaShort = angkaByte;
        int angkaInt = angkaShort;
        long angkaLong = angkaInt;
        float angkaFloat = angkaLong;
        double angkaDouble = angkaFloat; // ini masi bisa karena maximum angka short masih mencakup maximum angka byte dan seterusnya
        // contoh penggunaan manual,simple sebenernya tinggal nambahin ()
        float angkaFloat2 = (float) angkaDouble; // nah misalnya ini tinggal tambahkan (float) menit [56.30]
        int angkaInt2 = 1000;
        byte angkaByte2 = (byte) angkaInt2;
        /* Tipe data character (satu huruf,misal A atau B atau C). [57.10]
        Data character (huruf) di Java direpresentasikan oleh tipe char.
        Untuk membuat data char di Java,kit bisa menggunakan tanda '(petik satu) di awal dan diakhir karakter.
         */
        char e = 'E';
        char f = 'F';
        char k = 'K';

        System.out.print(e);
        System.out.print(f);
        System.out.print(k);
        // perbedaan dengan println,kalau pakai print line akan menambahkan baris baru disetiap syntaxnya
        System.out.println(e);
        System.out.println(f);
        System.out.println(k);
        /* Tipe data Boolean (true and false) [1.0]
        Tipe data boolean hanya bernilai benar dan salah atau true and false.
        Tipe data Boolean di Java direpresentasikan dengan kata kunci Boolean.
        Default Value untuk Boolean adalah False.
         */
        boolean benar = true;
        boolean salah = false;

        System.out.println(benar);
        System.out.println(salah);

        /* Tipe data String (teks) [1.03]
        Tipe data String adalah tipe dayta yang berisikan data kumpulan karakter atau sederhananya adalah teks.
        di Java tipe data String direpresentasikan dengan kata kunci String.
        Untuk membuat string menggunakan "(petik dua).
        Default Value utnuk String adalah Null
         */
        String helloWorld = "Hello World Ohayouu Sekaiii";
        System.out.println(helloWorld);
        System.out.println("Ohayouuu sekaiii Good Morning World");
        // Menggabungkan string males  banget awkakwoa
        String firstName = "Ardya";
        String lastName = "Zero";
        String fullName = firstName + " " + lastName;

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(fullName);

        /* Variable [1.08]
        Variable adalah tempat utnuk menyimpan data.
        Java adalah bahasa static type,sehingga variable hanya bisa digunakan untuk menyimpan tipe data yang sama,tidak boleh berubah ubah tipe data seperti di bahasa JavaScript atau PHP.
        Untuk membuat variable kita cukup menggunakan nama tipe data lalu diikuti dengan nama variablenya.
        Nama variable tidak boleh mengandung whitespace (space,enter,tab) dab tidak boleh seluruhnya number.
        OVERALL KITA SUDAH PAHAM.
         */
        String name = "Kizaru Zero";
        String nama;
        nama = "Ardya Pusaka";
        int age = 30;
        String addres = "Apollo";

        System.out.println(name + " " + nama);
        System.out.println(age);
        System.out.println(addres);

        /* Kata kunci Var (1.14)
        Sejak java tipe 1o Java mendukung pembuatan variabel dengan kata kunci var,sehingga kita tidak perlu menyebutkan tipe datanya.
        Namun perlu diingat saat kita menggunakan kata kunci var untuk membuat variable,kita harus mengisi value/nilai dari variable tersebut secara langsung.
         */
        var makan = "makan bang";
        var banh = 1020;
        // var lebih disarankan untuk digunakan
        System.out.println(makan + " " + banh);
        /* Kata kunci Final.
        Jika kita ingin membuat sebuah variable yang datanya tidak boleh diubah sama sekali setelah dibuat,kita bisa menggunakan kata kunci final.
        Istilah variabel seperti ini banyak juga yang menyebutnya konstan.
         */
        final String zero = "Ardya Pusaka";
        // jika kita hanya menggunakan string atau var,maka variabel zero masih bisa diubah,tetapi kalau pakai variable final maka variable trsebut sudah permanen alias tidak bisa diubah.
        System.out.println(zero);

        /* Tipe Data Bukan Primitif. (1.18)
        Tipe data primitif adalah tipe data bawaan di dalam pemrograman.Tipe data primitif tidak bisa diubah lagi.
        Tipe data Number,Char,Boolean adalah tipe data primitif.Tipe data primitif selalu memiliki default value.
        Tipe data String bukan tipe data prmitif,tipe data bukan primitif tidak memiliki default value dan bisa bernilai null.
        di Java semua tipe data primitif memiliki representasi tipe data bukan primitifnya
        Representasi tipe data Primitif
        Primitif = Bukan Primitif
        byte = Byte
        short = Short
        int = Integer
        long = Long
        float = Float
        double = Double
        char = Character
        boolean = Boolean
        intinya saat penggunaan jika menggunakan tipe data bukan primitif maka default valuenya adalah null
         */
        // Penggunaan Tipe Data bukan Primitif
        Integer iniInteger = 100;
        Long iniLong1 = 100000L;
        Boolean iniBoolean = true;

        Short iniShort1; //jika kosong begini maka default valuenya dalah null karena bukan primitif
        iniShort = 100;
        // contoh konversi dari primitif ke bukan primitif
        int noInt = 100;

        Integer integer2 = noInt; // ini akan otomatis konversi ke bukan primitif/object
        int ageAgain = integer2; // ini juga mau di ubah menjadi primitif lagi
        // mengubah dari bukan primitif ke primitif tapi dengan value/string yg berbeda/tidak kompatibel seperti ke short/byte
        short shortAge = integer2.shortValue();
        byte byteAge = integer2.byteValue();
        System.out.println(byteAge);
        /* Tipe Data Array. [1.28]
        Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama.
        Jumlah data di array tidak bisa berubah setelah pertama kali dibuat.
        Array dimulai dari 0
         */
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Kizaru";
        arrayString[1] = "Zero";
        arrayString[2] = "Kaede";
        System.out.println(arrayString[0]);
        System.out.println(arrayString[2]);
        // Array Initializer. Membuat sytaxs array lebih simple.
        int[] arrayInt = new int[]{
                10, 12, 15, 10, 07
        };
        System.out.println(arrayInt[3]);
        // lebih simple lagi
        long[] arrayLong = {
                100, 102, 189, 900000
        };
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong[3]);
        /* Operasi di Array.
        array[index] = mengambil data di array
        array[index] = value  = mengubah data di array
        array.lengtjh = mengambil panjang array
         */
        arrayLong[3] = 100;
        System.out.println(arrayLong[3]); // mengubah value di array
        System.out.println(arrayLong.length);
        // di Java kita tidak bisa menghapus data Array,yang mungkin bisa dilakukan yaitu memasukan data kosong.
        // contoh,kita akan mengubah array string salah satunya menjadi kosong/null karena tidak bisa dihapus
        String[] namaArray = {
                "Ardya", "Kizaru", "Zero"
        };
        System.out.println(namaArray[0]);
        namaArray[0] = null;
        System.out.println(namaArray[0]); // hanya bisa menjadikannya null tidak bisa menghapusnya
        //Mmebuat Array didalam Array [1.40]
        String[][] daftarNama = {
                {"Ardya", "Pusaka"},
                {"Kizaru", "Zero"},
                {"Hutao", "Kaede"},
        };
        System.out.println(daftarNama[0][0]); // ini dua kali [] karena lu paham lah gausa dijelasin woakwoa
        System.out.println(daftarNama[1][0]);
        /* Operasi Matematika di Java [1.42]
        + penjumlahan
        - pengurangan
        * perkalian
        / pembagian
        % sisa pembagian
         */
        int a = 100;
        int b = 50;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        /* Augmented Assignment [1.45] adalah sebuah operasi bilangan ke dia sendiri/angkanya sendiri.
        a = a+10   a+=10
        a= a-10    a-=10
        a= a*10    a*=10
        a= a/10    a/=10
        a= a%10    a%=10
         */
        a += 100;
        System.out.println(a);
        int c = 10;
        c *= 5;
        System.out.println(c);
        /* Unary Operator
        Operator = Keterangan
        ++ = a = a + 1
        -- = a = a - 1
        - = Negative
        + = Positive
        ! = Boolean Kebalikan
         */
        c++;
        System.out.println(c);
        c--;
        System.out.println(c);

        /* Operasi Perbandingan.
        Operasi perbandingan adalah operasi untuk membandingkan dua buah data.
        Operasi perbandingan adalah operasi yang menghasilkan nilai boolean atau true dan false.
        Jika hasilnya benar maka akan menghasilkan true dan jika salah akan menghasilkan false.
        > LEBIH DARI
        < KURANG DARI
        >= LEBIH DARI SAMA DENGAN
        <= KURANG DARI SAMA DENGAN
        == SAMA DENGAN
        != TIDAK SAMA DENGAN
         */

        int value1 = 100;
        int value2 = 150;
        System.out.println(value1 > value2);
        System.out.println(value1 < value2);
        System.out.println(value1 >= value2);
        System.out.println(value1 < +value2);
        System.out.println(value1 == value2);
        System.out.println(value1 != value2);
        /* Operasi Boolean. [1.54]
        Operator = Keterangan
        && = Dan
        || = Atau
        ! = Kebalikan
        materinya sama dengan javascript
         */
        /* Expression  [1.59]
        Exspression adalah konstruksi dari variabel,operator dan pemanggilan method yang mengevaluasi menjadi sebuah single value.
        Exspresiion adalah core component dari statement.
         */
        int value; // ini adalah exspression karena single value
        value = 10;
        System.out.println(value = 100); // ini adalah statements karena lebih dari 1 value yatu println dan value
        /* Statements.
        Statement bisa didbilang adalah kalimat lengkap dalam bahasa.
        Sebuah statement berisikan execution komplit,biasanya diakhiri dengan titik koma;
        ada beberapa jenis statement :
        Assignment expression adalah statements yang mengubah value
        penggunaan ++ dan --
        Method invocation
        Object creation ecpression
         */
        // Assignment statement
        double aValue = 9000;
        // increment statement
        aValue++;
        // method invocation statement
        System.out.println("Halllooo Zetaaa lovv uu" + " " + aValue + "x");
        // object cration statement
        Date date = new Date();
        System.out.println(date);
        /* Block.
        Block adaah kumpulan statement yang terdiri dari nol atau lebih statement.
        Block diawali dan diakhiri dengan kurung kurawal{}
         */
        /* If  Else Statement. {2.06}
        Dalam Java,if adalah salah satu kata kunci yang digunakan untuk percabangan.
        Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi.
        Hampir disemua bahasa pemrograman mendukung if expression.
        Else Statement
        Blok if akan dieksekusi ketika kondisi if bernilai true,kadang kita ingin melakukan eksekusi program tertentu jika if bernilai false,hal ini bisa dilakukan dengan menggunakan else statement
         */
        var nilai1 = 100;
        var nilai2 = 90;
        if (nilai1 > nilai2) {
            System.out.println("Kerja Bagus");
        } else {
            System.out.println("goblok");
        }
        var nilai = 85;
        var absen = 75;
        if (nilai >= 80 && absen >= 80) {
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Ngulang Goblok");
        } // jawabannya else karena kalau kita menggunakan && maka harus 2 kondisi true jika ingin jawabannya true,kalau salah satunya adalah false maka jawabnnya false
        /* Else if statements.
        Terkadang dalam if kita butuh membuat beberapa kondisi.
        Kasus seperti ini di Java kita bisa meenggunakan else if expression
        Else if di Java bisa lebih dari satu
         */
        var ujian = 80;
        var absensi = 80;
        if (ujian >= 85 && absensi >= 75) {
            System.out.println("SANGAT BAGUS");
        } else if (ujian >= 80 && absensi >= 70) {
            System.out.println("CUKUP BAGUS");
        } else {
            System.out.println("BELAJAR YANG RAJIN");
        }
        /* Switch Expression (2.15).
        Switch statement,kadang kita hanya butuh menggunakan kondisi sederhana di if statement,seperti hanya menggunakan perbandingan ==
        Switch adalah statement percabangan yang sama dengan if,namun lebih sederhana cara pembuatannya.
        kondisi di switch statement hanya untuk perbandingan == */
        var nilaiUj = "D";
        switch (nilaiUj) {
            case "A":
                System.out.println("Anda Pintar");
                break;
            case "B":
            case "C":
                System.out.println("Anda Cukup Pintar");
                break;
            case "D":
                System.out.println("Anda Salah Jurusan");
                break;
            default:
                System.out.println("Gausah Kuliah Jingg");
                break;
        }
        /* Switch Lambda
        Switch Lambda adalah switch expression yang lebih mudah atau simple daripada switch exp sebelumnya karena kita tidak perlu menggunakan kata kunci break
         */
        var nilUji = "E";
        switch (nilUji) {
            case "A" -> System.out.println("ANDA LULUS DENGAN BAIK");
            case "B", "C" -> System.out.println("ANDA LULUS CUKUP BAIK");
            case "D" -> System.out.println("ANDA LULUS KURANG BAIK");
            default -> {
                System.out.println("ANDA GAUSAH KULIAH");
            }
        }
        /* Kata kunci yield.
        kata kunci yield digunakan untuk mengembalikan nilai pada switch statement.
        ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement.
         */
        // contoh kode switch tanpa yield
        var nilaiUl = "E";
        String ucapan;
        switch (nilaiUl) {
            case "A" -> ucapan = "WOW ANDA LULUS DENGAN BAIK";
            case "B" -> ucapan = "WOW ANDA LULUS CUKUP BAIK";
            default -> ucapan = "UDAH BANGGG";
        }
        System.out.println(ucapan);
        // Contoh menggunakan yield
        var ulangan = "A";
        String ucapan1 = switch (ulangan) {
            case "A":
                yield "WOW ANDA LULUS DENGAN BAIK";
            case "B", "C":
                yield "ANDA LULUS CUKUP BAIK";
            case "D":
                yield "ANDA TIDAK LULUS";
            default:
                yield "ANDA SALAH JURUSAN";
        };
        System.out.println(ucapan1);
        /* TERNARY OPERATOR. Ternary operator adalah operator sederhana dari if statement.ternary operator terdiri dari lpndisi yang dievaluasi,jika menghasilkan true maka nilai pertama akan diambil,jika false maka nilai kedua akan diambil. */
        var nilaiUjian = 75;
        String ucapan2 =
                nilaiUjian >= 75 ? "Selamat anda lulus" : "Anda tidak lulus";
        System.out.println(ucapan2);
        /* For Loop.
        For adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan.
        Blok kode yang terdapat didalam for akan selalu diulangi selama kondisi for terpenuhi
        Sintak perulangan For
        for(init statement; kondisi; post statement) {
        blok perulangan
        }
        init statement akan dieksekusi hanya sekali diawal sebelum perulangan.
        Kondisi akan dilakukan pengeckan dalam setiap perulangan,jika true perulanan akan dilakukan,jika false perulangan akan berhenti.
        Post statement akan dieksekusi setiap kali diakhir perulangan.
        Init statement,Kondisi dan Post statement tidak wajib di isi,jika kondisi tidak di isi berarti kondisi akan bernilai true.
         */
        // contoh penggunaan perulangan dengan kondisi
        var counter = 1;
        for (; counter <= 5; ) {
            System.out.println("Perulangan ke" + counter);
            counter++;
        }
        // Init statement
        for (var hitung = 7; hitung <= 10; ) {
            System.out.println("Perulangan ke" + hitung);
            hitung++;
        }
        // Post statement akan selalu diekseusi diakhhir perulangan,dan setiap perulangan akan dieksekusi
        for (var hitung1 = 5; hitung1 <= 8; hitung1++) {
            System.out.println("Perulangan ke" + hitung1);
        }
        // gaada bedanya sebenernya cuman lebih ringkas aja kodenya
        /* While loop
        While loop adalah versi perulangan yang lebih sederhana dibanding for loop.
        Di While loop hanya terdapat kondisi perulangan tanpa ada init statement dan post statement.
         */
        var hitungan = 1;
        while (hitungan <= 10) {
            System.out.println("Hitung ke-" + hitungan);
            hitungan++;
        }
        /* Do while loop
        Do While loop adalah perulangan yang mirip dengan while.
        perbedaannya hanya pada pengecekan kondisi.
        pengecekan kondisi di while loop dilakukan diawal sebelum perulangan dilakukan,sedangkan di do while loop dilakukan setelah perulangan dilakukan.
        oleh karena itu di dalam do while loop minimal pasti sekali perulangan dilakukan walaupun kondisi bernilai false.
         */
        var count = 10;
        do {
            System.out.println("Hitungan ke" + count);
            count++;
        } while (count <= 9);
        /* Break dan Continue
        Pada switch statements kita sudah mengenal break untuk menghentiikan case dalam switch.
        sama dengan perulangan,break juga digunakan untuk menghentikan seluruh perulangan.
        namun berbeda dengan continue,continue digunakan untuk menghentikan perulangan saat ini,lalu melanjutkan ke perulangan selanjutnya
         */
        var count1 = 5;
        while (true) {
            System.out.println("perulangan ke" + count1);
            count1++;
            if (count1 > 7) {
                break;
            }

        }
        for (int count2 = 5; count2 <= 20; count2++) {
            if (count2 % 2 == 0) {
                continue;
            }
            System.out.println("Hallo kamu ganjil" + count2);
        }
        for (int hitung3 = 1; hitung3 <= 20; hitung3++) {
            if (hitung3 % 2 == 1) {
                continue;
            }
            System.out.println("hallo genap" + hitung3);
        }
        /* For Each
        Kadang kita biasa mengakses data array dentgan perulangan,tapi cara ini sangat bertele tele karena harus membuuat counter lalu menakses array menggunakan counter yang kita buat.
        Namun untungnya di Java terdapat perulangan For Each yang bisa digunakan untuk mengakses seluruh data Array secara otomatis.
         */
        // Contoh kode tanpa for each
        String[] namaa = {
                "Ardya", "Kizaru", "Zero", "Kiz4U"
        };
        for (int i = 1; i < namaa.length; i++) {
            System.out.println(namaa[i]);
        }
        // Kode For Each
        String[] nam = {
                "Halo", "Nama", "Saya", "Zero", "Kaede"
        };
        for (var o : nam) {
            System.out.println(o);
        }
        /* Method/Function
        Untuk method/Function di java lumayan ribet jadi buat file baru aja,soalnya functonnya harus diluar function main
        Untuk membuat method di Java,kita bisa menggunakan kata kunci void,lalu diikuti dengan nama method,jurung() dan diakhiri dengan block.
        Kita bisa memanggil method dengan menggunakan nama method lalu diikuti dengan kurung().
         */
        /* Method Parameter
        Kita bisa mengirim informasi ke method yang kita panggil.
        Tinggal menambahkan ke dalam tanda kurung.
        Parameter bisa lebih dari satu,jika lebih dari satu harus dipissah dengan koma
         */
        /* Mehtod Return Value
        Agar Method bisa menghasilkan value atau nilai kita harus mengubah kata kunci void dengan tipe data yang dihasilkan.
        Dan didalam block method,untuk menghasilkan nilai tersebut kita harus menggunakan kata kunci return lalu diikuti dengan data yang sessuai dengan tipe data yang sudah kita deklarasikan di method.
        di Java kita hanya bisa menghasilkan 1 data sebuah ,ethod,tidak bisa lebih dari satu
        */
        

    }
}

