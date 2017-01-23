package ch.deletescape.primitives;

import ch.deletescape.primitives.arrays.BoolArrays;
import ch.deletescape.primitives.arrays.ByteArrays;
import ch.deletescape.primitives.arrays.CharArrays;
import ch.deletescape.primitives.arrays.DoubleArrays;
import ch.deletescape.primitives.arrays.FloatArrays;
import ch.deletescape.primitives.arrays.IntArrays;
import ch.deletescape.primitives.arrays.LongArrays;
import ch.deletescape.primitives.arrays.ShortArrays;

public class Benchmark {
  private static final int FORMAT_ELEMENTS = 1000;
  private static final int SIZE = 5_000_000;
  private static final int SIZE_DISTINCT = 25_000;

  public static void main(String[] args) {
    randomArrays();
    average();
    distinct();
    stringsGeneral();
    stringFormatting();
  }

  private static void randomArrays() {
    printTitle("Random Array Generation with " + SIZE + " elements each");
    Stopwatch watch = new Stopwatch();
    watch.start();
    IntArrays.random(SIZE);
    watch.stop();
    long intTime = watch.getDuration();

    watch.start();
    BoolArrays.random(SIZE);
    watch.stop();
    long boolTime = watch.getDuration();

    watch.start();
    ByteArrays.random(SIZE);
    watch.stop();
    long byteTime = watch.getDuration();

    watch.start();
    CharArrays.random(SIZE);
    watch.stop();
    long charTime = watch.getDuration();

    watch.start();
    DoubleArrays.random(SIZE);
    watch.stop();
    long doubleTime = watch.getDuration();

    watch.start();
    FloatArrays.random(SIZE);
    watch.stop();
    long floatTime = watch.getDuration();

    watch.start();
    LongArrays.random(SIZE);
    watch.stop();
    long longTime = watch.getDuration();

    watch.start();
    ShortArrays.random(SIZE);
    watch.stop();
    long shortTime = watch.getDuration();

    String formatString = "{}-Array Generation took {}ms";
    System.out.println(Strings.simpleFormat(formatString, "int", toMs(intTime)));
    System.out.println(Strings.simpleFormat(formatString, "byte", toMs(byteTime)));
    System.out.println(Strings.simpleFormat(formatString, "char", toMs(charTime)));
    System.out.println(Strings.simpleFormat(formatString, "double", toMs(doubleTime)));
    System.out.println(Strings.simpleFormat(formatString, "float", toMs(floatTime)));
    System.out.println(Strings.simpleFormat(formatString, "long", toMs(longTime)));
    System.out.println(Strings.simpleFormat(formatString, "short", toMs(shortTime)));
    System.out.println(Strings.simpleFormat(formatString, "boolean", toMs(boolTime)));
  }

  private static void average() {
    printTitle("Random Array Average Calculation with " + SIZE + " elements each");
    Stopwatch watch = new Stopwatch();
    int[] intArr = IntArrays.random(SIZE);
    watch.start();
    double intAvg = IntArrays.avg(intArr);
    watch.stop();
    System.out.println("\tint average: " + intAvg);
    long intTime = watch.getDuration();

    byte[] byteArr = ByteArrays.random(SIZE);
    watch.start();
    double byteAvg = ByteArrays.avg(byteArr);
    watch.stop();
    System.out.println("\tbyte average: " + byteAvg);
    long byteTime = watch.getDuration();

    char[] charArr = CharArrays.random(SIZE);
    watch.start();
    double charAvg = CharArrays.avg(charArr);
    watch.stop();
    System.out.println("\tchar average: " + charAvg);
    long charTime = watch.getDuration();

    double[] doubleArr = DoubleArrays.random(SIZE);
    watch.start();
    double doubleAvg = DoubleArrays.avg(doubleArr);
    watch.stop();
    System.out.println("\tdouble average: " + doubleAvg);
    long doubleTime = watch.getDuration();

    float[] floatArr = FloatArrays.random(SIZE);
    watch.start();
    float floatAvg = FloatArrays.avg(floatArr);
    watch.stop();
    System.out.println("\tfloat average: " + floatAvg);
    long floatTime = watch.getDuration();

    long[] longArr = LongArrays.random(SIZE);
    watch.start();
    double longAvg = LongArrays.avg(longArr);
    watch.stop();
    System.out.println("\tlong average: " + longAvg);
    long longTime = watch.getDuration();

    short[] shortArr = ShortArrays.random(SIZE);
    watch.start();
    double shortAvg = ShortArrays.avg(shortArr);
    watch.stop();
    System.out.println("\tshort average: " + shortAvg);
    long shortTime = watch.getDuration();

    String formatString = "{}-Average calculation took {}ms";
    System.out.println(Strings.simpleFormat(formatString, "int", toMs(intTime)));
    System.out.println(Strings.simpleFormat(formatString, "byte", toMs(byteTime)));
    System.out.println(Strings.simpleFormat(formatString, "char", toMs(charTime)));
    System.out.println(Strings.simpleFormat(formatString, "double", toMs(doubleTime)));
    System.out.println(Strings.simpleFormat(formatString, "float", toMs(floatTime)));
    System.out.println(Strings.simpleFormat(formatString, "long", toMs(longTime)));
    System.out.println(Strings.simpleFormat(formatString, "short", toMs(shortTime)));
  }

  private static void distinct() {
    printTitle("Random Array Distinct Filtering with " + SIZE_DISTINCT + " elements each");
    Stopwatch watch = new Stopwatch();
    int[] intArr = IntArrays.random(SIZE_DISTINCT);
    watch.start();
    IntArrays.distinct(intArr);
    watch.stop();
    long intTime = watch.getDuration();

    byte[] byteArr = ByteArrays.random(SIZE_DISTINCT);
    watch.start();
    ByteArrays.distinct(byteArr);
    watch.stop();
    long byteTime = watch.getDuration();

    char[] charArr = CharArrays.random(SIZE_DISTINCT);
    watch.start();
    CharArrays.distinct(charArr);
    watch.stop();
    long charTime = watch.getDuration();

    double[] doubleArr = DoubleArrays.random(SIZE_DISTINCT);
    watch.start();
    DoubleArrays.distinct(doubleArr);
    watch.stop();
    long doubleTime = watch.getDuration();

    float[] floatArr = FloatArrays.random(SIZE_DISTINCT);
    watch.start();
    FloatArrays.distinct(floatArr);
    watch.stop();
    long floatTime = watch.getDuration();

    long[] longArr = LongArrays.random(SIZE_DISTINCT);
    watch.start();
    LongArrays.distinct(longArr);
    watch.stop();
    long longTime = watch.getDuration();

    short[] shortArr = ShortArrays.random(SIZE_DISTINCT);
    watch.start();
    ShortArrays.distinct(shortArr);
    watch.stop();
    long shortTime = watch.getDuration();

    boolean[] boolArr = BoolArrays.random(SIZE_DISTINCT);
    watch.start();
    BoolArrays.distinct(boolArr);
    watch.stop();
    long boolTime = watch.getDuration();

    String formatString = "{}-Distinct calculation took {}ms";
    System.out.println(Strings.simpleFormat(formatString, "int", toMs(intTime)));
    System.out.println(Strings.simpleFormat(formatString, "boolean", toMs(boolTime)));
    System.out.println(Strings.simpleFormat(formatString, "byte", toMs(byteTime)));
    System.out.println(Strings.simpleFormat(formatString, "char", toMs(charTime)));
    System.out.println(Strings.simpleFormat(formatString, "double", toMs(doubleTime)));
    System.out.println(Strings.simpleFormat(formatString, "float", toMs(floatTime)));
    System.out.println(Strings.simpleFormat(formatString, "long", toMs(longTime)));
    System.out.println(Strings.simpleFormat(formatString, "short", toMs(shortTime)));
  }

  private static void stringsGeneral() {
    printTitle("General Strings Benchmark");
    Stopwatch watch = new Stopwatch();
    String tmp = new String(CharArrays.random(SIZE));

    watch.start();
    Strings.reverse(tmp);
    watch.stop();
    long reverseDuration = watch.getDuration();
    System.out.println(Strings.simpleFormat("Reversing a {} char long String took {}ms", SIZE, toMs(reverseDuration)));

    watch.start();
    Strings.repeat(SIZE, 'a');
    watch.stop();
    long repeatDuration0 = watch.getDuration();
    System.out.println(Strings.simpleFormat("Repeating 'a' {} times took {}ms", SIZE, toMs(repeatDuration0)));

    watch.start();
    Strings.repeat(SIZE, 'a', 'b', 'c');
    watch.stop();
    long repeatDuration1 = watch.getDuration();
    System.out.println(Strings.simpleFormat("Repeating 'a', 'b', 'c' {} times took {}ms", SIZE, toMs(repeatDuration1)));

    watch.start();
    Strings.repeat(SIZE, "abc");
    watch.stop();
    long repeatDuration2 = watch.getDuration();
    System.out.println(Strings.simpleFormat("Repeating \"abc\" {} times took {}ms", SIZE, toMs(repeatDuration2)));
  }

  private static void stringFormatting() {
    printTitle("String#format vs Strings#simpleFormat (with " + FORMAT_ELEMENTS + " elements)");
    Stopwatch watch = new Stopwatch();
    String stringFormatFormat = Strings.repeat(FORMAT_ELEMENTS, "%s ").trim();
    String simpleFormatFormat = Strings.repeat(FORMAT_ELEMENTS, "{} ").trim();
    Object[] elements = Strings.repeat(FORMAT_ELEMENTS, " ,").split(",");

    watch.start();
    String.format(stringFormatFormat, elements);
    watch.stop();
    long stringFormatTime = watch.getDuration();

    watch.start();
    Strings.simpleFormat(simpleFormatFormat, elements);
    watch.stop();
    long simpleFormatTime = watch.getDuration();

    System.out.println(Strings.simpleFormat("Formatting with String#format took {}ms", toMs(stringFormatTime)));
    System.out.println(Strings.simpleFormat("Formatting with Strings#simpleFormat took {}ms", toMs(simpleFormatTime)));
    long timeDifference = Math.abs(stringFormatTime - simpleFormatTime);
    System.out.println(Strings.simpleFormat("Time difference: {}ms", toMs(timeDifference)));
  }

  private static double toMs(long nanos) {
    return nanos / (double) 1_000_000;
  }

  private static void printTitle(String title) {
    char decoration = '*';
    String filler = Strings.repeat((70 - (title.length() - 2)) / 2, decoration);
    title = Strings.simpleFormat("{} {} {}", filler, title.trim(), filler);
    System.out.println();
    System.out.println(Strings.repeat(title.length(), decoration));
    System.out.println(title);
  }

  private static class Stopwatch {
    private long tmp;
    private long duration;

    private void start() {
      tmp = System.nanoTime();
    }

    private void stop() {
      duration = System.nanoTime() - tmp;
    }

    private long getDuration() {
      return duration;
    }
  }
}
