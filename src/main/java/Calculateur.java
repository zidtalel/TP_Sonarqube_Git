public class Calculateur {
/**
* Returns an Image object that can then be painted on the screen. 
* The url argument must specify an absolute <a href="#{@link}">{@link URL}</a>. The name
* argument is a specifier that is relative to the url argument. 
* <p>
* This method always returns immediately, whether or not the 
* image exists. When this applet attempts to draw the image on
* the screen, the data will be loaded. The graphics primitives 
* that draw the image will incrementally paint on the screen. 
*
* @param  url  an absolute URL giving the base location of the image
* @param  name the location of the image, relative to the url argument
* @return      the image at the specified URL
* @see         Image
*/
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


