import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ==========================
        // BASIC INPUT METHODS
        // ==========================

        // Reads one word (stops at space)
        // String word = sc.next();
        // System.out.println(word);

        // Reads an entire line
        // String line = sc.nextLine();
        // System.out.println(line);

        // Reads different primitive data types
        // byte b = sc.nextByte();
        // short s = sc.nextShort();
        // int i = sc.nextInt();
        // long l = sc.nextLong();
        // float f = sc.nextFloat();
        // double d = sc.nextDouble();
        // boolean bool = sc.nextBoolean();

        // Reads large numbers
        // BigInteger bigInt = sc.nextBigInteger();
        // BigDecimal bigDec = sc.nextBigDecimal();

        // ==========================
        // hasNext() METHODS
        // ==========================

        System.out.println(sc.hasNext());
        // System.out.println(sc.hasNextLine());
        // System.out.println(sc.hasNextInt());
        // System.out.println(sc.hasNextLong());
        // System.out.println(sc.hasNextDouble());
        // System.out.println(sc.hasNextFloat());
        // System.out.println(sc.hasNextBoolean());
        // System.out.println(sc.hasNextByte());
        // System.out.println(sc.hasNextShort());
        // System.out.println(sc.hasNextBigInteger());
        // System.out.println(sc.hasNextBigDecimal());

        // ==========================
        // DELIMITER
        // ==========================

        // sc.useDelimiter(",");
        // while(sc.hasNext()){
        //     System.out.println(sc.next());
        // }

        // ==========================
        // RADIX (Number Base)
        // ==========================

        // sc.useRadix(2);
        // int decimal = sc.nextInt();
        // System.out.println(decimal);

        // ==========================
        // REGEX METHODS
        // ==========================

        // String digits = sc.findInLine("\\d+");
        // System.out.println(digits);

        // sc.skip("Hello");

        // ==========================
        // CLOSE SCANNER
        // ==========================

        sc.close();
    }
}

/*
====================================================
ALL Scanner.next...() METHODS
====================================================

next()
nextLine()

nextByte()
nextShort()
nextInt()
nextLong()

nextFloat()
nextDouble()

nextBoolean()

nextBigInteger()
nextBigDecimal()

====================================================
ALL Scanner.hasNext...() METHODS
====================================================

hasNext()
hasNextLine()

hasNextByte()
hasNextShort()
hasNextInt()
hasNextLong()

hasNextFloat()
hasNextDouble()

hasNextBoolean()

hasNextBigInteger()
hasNextBigDecimal()

====================================================
MOST USED METHODS (Know These Well)
====================================================

next()
nextLine()
nextInt()
nextLong()
nextDouble()
nextFloat()
nextBoolean()

hasNext()
hasNextInt()
hasNextLine()



close()
====================================================
*/
