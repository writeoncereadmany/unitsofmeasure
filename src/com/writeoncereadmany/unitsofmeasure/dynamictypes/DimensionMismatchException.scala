package com.writeoncereadmany.unitsofmeasure.dynamictypes

class DimensionMismatchException(expected: Dimensions, actual: Dimensions)
  extends RuntimeException(s"Dimension mismatch: expected $expected, actual $actual") { }
