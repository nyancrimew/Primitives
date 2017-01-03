[![Travis](https://img.shields.io/travis/Deletescape-Media/Primitives.svg)](https://travis-ci.org/Deletescape-Media/Primitives)
[![Codecov](https://img.shields.io/codecov/c/github/Deletescape-Media/Primitives.svg)](https://codecov.io/gh/Deletescape-Media/Primitives)
[![Codacy grade](https://img.shields.io/codacy/grade/09d4fe9b4a904a8aa34c49d7c130410e.svg)](https://www.codacy.com/app/deletescape/Primitives)
[![Github All Releases](https://img.shields.io/github/downloads/Deletescape-Media/Primitives/total.svg)](https://github.com/Deletescape-Media/Primitives/releases)

#[Deletescape Primitives](http://deletescape-media.github.io/Primitives/)

**[Quick Start](#quick-start) --- [Usage](#usage) --- [License](#license)**

* Dreaming of a simple way to convert `byte[]` to `int[]`?
	
	**How about that:**

```java
    int[] example = PrIntArray.from(new byte[] { 1, 2, 3 });
```
* You need to concatenate two `char` arrays?

	**Nothing easier than that!**
	
```java
    char[] pt1 = new char[] { 'h', 'e', 'l' };
    char[] pt2 = new char[] { 'l', 'o' };
    char[] result = PrCharArray.concatAll(pt1, pt2);
```
* `String.join()` doesn't work for your `int` array?

	**It might not, but the following code sure does!**
	
```java
    int[] input = new int[] { 3, 2, 1 };
    String result = PrIntArray.join(";", input);
```

>**Primitives is everything you'll ever need to work with primitive types!**

## Quick Start

### Installation

1. Download the binary jar file from the [latest release on GitHub](https://github.com/Deletescape-Media/Primitives/releases/latest)
* Additionally download the source and/or javadoc jar if needed
* Add the binary jar to your projects classpath

## Usage

* [Available Classes](#available-classes)
	* [Package `ch.deletescape.primitives`](#package-ch-deletescape-primitives)
	* [Package `ch.deletescape.primitives.arrays`](#package-ch-deletescape-primitives-arrays)
* [Conversions](#conversions)
	* [`boolean` Conversions](#boolean-conversions)
* [Random](#random)
	* [Random Arrays](#random-arrays)
* [Array Concatenation](#array-concatenation)
* [Array Joining](#array-joining)
* [Array Contains](#array-contains)
* [Array Distinct](#array-distinct)
* [Array Sequence Searching](#array-sequence-searching)
* [Array Sequence Counting](#array-sequence-counting)
* [Array Inserting](#array-inserting)
* [Array Appending](#array-appending)
* [String Reversing](#string-reversing)
* [String Formatting](#string-formatting)
* [String Repeating](#string-repeating)

### Available Classes

#### Package `ch.deletescape.primitives`

* `PrBool`
* `PrByte`
* `PrChar`
* `PrDouble`
* `PrFloat`
* `PrInt`
* `PrLong`
* `PrShort`
* `PrString`

#### Package `ch.deletescape.primitives.arrays`

* `PrBoolArray`
* `PrByteArray`
* `PrCharArray`
* `PrDoubleArray`
* `PrFloatArray`
* `PrIntArray`
* `PrLongArray`
* `PrShortArray`

### Conversions

In the following example an `int` value is converted to `short` using `PrShort`, all other conversions work exactly the same way.

```java
int i = 1;
short s = PrShort.from(i);
```

#### `boolean` Conversions

Conversions from `boolean` return a value of `1` for `true` and a value of `0` for `false`. When converting to `boolean` a value of `1` returns `true`, any other value will result in `false`. The same applies to `boolean[]` conversions.

### Random

The next small code snipped shows how to generate a [pseudorandom](https://en.wikipedia.org/wiki/Pseudorandom) `int` value using `PrInt`, random generation for other primitive types work the same way.

```java
int i = PrInt.random();
```

#### Random Arrays

The difference when generating an array of random values, for example a `byte` array, is that the size of the array needs to be specified.

```java
byte[] ba = PrByteArray.random(5);
```

### Array Concatenation

To concate two or more `boolean` arrays using `PrBoolArray` you can refer to the following piece of code. Array concatenations of other types follow the same pattern.

```java
boolean[] ba1 = new boolean[] { true, false };
boolean[] ba2 = new boolean[] { false, false };
boolean[] merge = PrBoolArray.concatAll(ba1, ba2);
```

### Array Joining

The following code shows how to easily convert an `int` array to a beautiful `String`, the same way `String.join()` works for `CharSequence` items. This can also be used for arrays of all other types.

```java
int[] ia = new int[] { 1, 4, 5 };
String str = PrIntArray.join("; ", ia);
```

### Array Contains

You can check if a `short` array contains a certain value like this:

```java
short[] sa = new short[] { 1, 2, 3 };
boolean contains = PrShortArray.contains(sa, PrShort.from(2));
```

The same pattern can be applied to all the other types.

### Array Distinct

To get only the unique values in a `long` array, you can use the following code which also applies to all other types.

```java
long[] la = new long[] { 5, 3, 4, 5, 4, 5 };
long[] uniques = PrLongArray.distinct(la);
```

The above snippet would result in an array containing `{ 5, 3, 4 }`.

### Array Sequence Searching

If you want to find the first occurrence of `1` followed by `2` inside an `int` array you can just use this snippet:

```java
int[] ia = new int[] { 5, 3, 1, 2, 4, 5, 4, 5 };
int index = PrIntArray.findSequence(ia, 1, 2);
```

### Array Sequence Counting

Finding out how often `1` followed by `2` occurs inside a `short` array is really simple.

```java
short[] sa = new short[] { 5, 3, 1, 2, 4, 1, 2, 4, 5 };
int count = PrShortArray.countSequence(sa, (short) 1, (short) 2);
```

### Array Inserting

To insert a `char` array into another the following code is used.

```java
char[] ca1 = new char[] { 'a', 'd' };
char[] ca2 = new char[] { 'b', 'c' };
char[] abcd = PrCharArray.insert(ca1, ca2, 1);
```

### Array Appending

Appending values to the end of a `long` array has never been easier!

```java
long[] la = new long[] { 1, 2, 3 };
long[] longer = PrLongArray.append(la, 4, 5);
```

### String Reversing

`PrString` allows you to reverse strings without a big impact on memory usage.

```java
String s = "Hello!";
String reverse = PrString.reverse(s);
```

The snippet above would result in `"!elloH"`.

### String Formatting

A simple way to format strings without a big memory impact or complicated syntax is `PrString.simpleFormat`.

```java
String world = "World";
char sign = '!';
String greeting = PrString.simpleFormat("Hello {}{}", world, sign);
```

This would obviously result in `"Hello World!"`.

> `simpleFormat` is approximately 5 times faster than `String.format` (which to be fair also has a lot more features).

### String Repeating

To repeat a string multiple times simply do the following:

```java
String str = "ab";
String letters = PrString.repeat(4, str);
```

This would result in `"abababab"` (the string `"ab"` repeated 4 times).

## License

MIT License

Copyright (c) 2016 Deletescape Media

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.