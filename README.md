[![Travis](https://img.shields.io/travis/Deletescape-Media/Primitives.svg)](https://travis-ci.org/Deletescape-Media/Primitives)
[![Codecov](https://img.shields.io/codecov/c/github/Deletescape-Media/Primitives.svg)](https://codecov.io/gh/Deletescape-Media/Primitives)
[![Codacy grade](https://img.shields.io/codacy/grade/09d4fe9b4a904a8aa34c49d7c130410e.svg)](https://www.codacy.com/app/deletescape/Primitives)
[![Github All Releases](https://img.shields.io/github/downloads/Deletescape-Media/Primitives/total.svg)](https://github.com/Deletescape-Media/Primitives/releases)

#Deletescape Primitives

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

> Conversions from `boolean` return a value of `1` for `true` and a value of `0` for `false`. When converting to `boolean` on the other hand a value of `1` returns `true`, any other value will result in `false`.