public class Calculateur {

    public int multiply(int a, int b) {
        int res = 0;
        if ((a > 0) && (b > 0)) {
            while (b-- > 0) {
                res = res + a;
            }
        } else if ((a < 0) && (b < 0)) {
            b = -b;
            while (b-- > 0) {
                res = res - a;
            }
        } else if ((a < 0) && (b > 0)) {
            a = -a;
            while (a-- > 0) {
                res = res + b;
            }
            res = -res;
        } else if ((a > 0) && (b < 0)) {
            b = -b;
            while (b-- > 0) {
                res = res + a;
            }
            res = -res;
        }
        return res;
    }

    public int add(int a, int b) {
        int res = 0;
        if ((a > 0) && (b > 0)) {
            while (b-- > 0) {
                res = res + a;
            }
        } else if ((a < 0) && (b < 0)) {
            b = -b;
            while (b-- > 0) {
                res = res - a;
            }
        } else if ((a < 0) && (b > 0)) {
            a = -a;
            while (a-- > 0) {
                res = res + b;
            }
            res = -res;
        } else if ((a > 0) && (b < 0)) {
            b = -b;
            while (b-- > 0) {
                res = res + a;
            }
            res = -res;
        }
        return res;
    }

}
