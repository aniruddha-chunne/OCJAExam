package com.OCJA.chapter8_HandlingExceptions;

/**
 * 174 - Exceptional_Handling
 * 587 - Answer
 *
 * 18. Which of following method signatures would not be allowed in a
 * class implementing the Printer interface?
 * class PrintException extends Exception {}
 * class PaperPrintException extends PrintException {}
 * public interface Printer
 * {
 *    abstract int printData() throws PrintException;
 * }
 *
 * A. public int printData() throws PaperPrintException
 * B. public int printData() throws Exception
 * C. public int printData()
 * D. None of the above
 *
 * B
 *
 * 18. B. Overridden methods cannot throw new or broader checked
 * exceptions than the one they inherit. Since Exception is a
 * broader checked exception than PrintException, Option B is not
 * allowed and is the correct choice. Alternatively, declaring
 * narrower or the same checked exceptions or removing them
 * entirely is allowed, making Options A and C incorrect. Since
 * Option B is correct, Option D is incorrect
 *
 */


class PrintException extends Exception {}
class PaperPrintException extends PrintException {}
interface Printer
{
    abstract int printData() throws PrintException;
}
public class Que18_Imp implements Printer
{


    public static void main(String[] args) {
        
    }

    @Override
    public int printData() throws PaperPrintException {
        return 0;
    }
}
