public class Method {
    public static void main(String[] args) {
        //jadi kita tidak bisa membuat method didalam main method,harus diluar
        panggilAku();
        halloSay("Hutao", "Ardya");
        System.out.println(hitung(5, 10));
        System.out.println(hitung1(100, "+", 200));
        System.out.println(hitung1(50, "-", 10));
        System.out.println(hitung1(75, "/", 3));
        double akar = Math.sqrt(25);
        System.out.println(akar);


    }

    static void panggilAku() {
        System.out.println("Hallo");
    }

    static void halloSay(String nama, String kamu) {
        System.out.println("Hallo " + nama + " Sayanggg" + " namaku " + kamu);
    }

    static int hitung(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung1(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "/":
                return value1 / value2;
            default:
                return 0;
        }
    }

}
