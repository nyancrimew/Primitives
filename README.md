[![Travis](https://img.shields.io/travis/Deletescape-Media/Primitives.svg)](https://travis-ci.org/Deletescape-Media/Primitives)
[![Codecov](https://img.shields.io/codecov/c/github/Deletescape-Media/Primitives.svg)](https://codecov.io/gh/Deletescape-Media/Primitives)
[![Codacy grade](https://img.shields.io/codacy/grade/09d4fe9b4a904a8aa34c49d7c130410e.svg)](https://www.codacy.com/app/deletescape/Primitives)
[![Github All Releases](https://img.shields.io/github/downloads/Deletescape-Media/Primitives/total.svg)](https://github.com/Deletescape-Media/Primitives/releases)

#Deletescape Primitives

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
    int[] input = new int[]{ 3, 2, 1 };
    String result = PrIntArray.join(";", input);
```

>**Primitives is everything you'll ever need to work with primitive types!**

## Quick Start

### Installation

1. Download the binary jar file from the [latest release on GitHub](https://github.com/Deletescape-Media/Primitives/releases/latest)
* Additionally download the source and/or javadoc jar if needed
* Add the binary jar to your projects classpath

## Usage

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