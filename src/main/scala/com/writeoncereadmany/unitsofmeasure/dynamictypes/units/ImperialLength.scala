package com.writeoncereadmany.unitsofmeasure.dynamictypes.units

import com.writeoncereadmany.unitsofmeasure.dynamictypes.units.Length._

case object ImperialLength {
  implicit def double2ImperialLengthBuilder(value: Double) = new ImperialLengthBuilder(value)

  val feet = (0.3084 metres) asNewUnit
  val inches = (1/12.0 feet) asNewUnit
  val yards = (3 feet) asNewUnit

  // higher order units: volume
  val pints = (0.568 litres) asNewUnit
  val gallons = (8 pints) asNewUnit
}

class ImperialLengthBuilder(val value: Double)
{
  def feet = ImperialLength.feet(value)
  def inches = ImperialLength.inches(value)
  def yards = ImperialLength.yards(value)

  // higher order units: volume
  def pints = ImperialLength.pints(value)
  def gallons = ImperialLength.gallons(value)
}
