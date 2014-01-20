package com.writeoncereadmany.unitsofmeasure.statictypes.units

import com.writeoncereadmany.unitsofmeasure.statictypes.{Quantity, UnitOfMeasure}

class Length(value: Double, unit: UnitOfMeasure[Length]) extends Quantity[Length](value, unit)
{
  def newInstance(unscaledValue: Double) = new Length(unscaledValue, Length.metres)
}

object Length
{
  implicit def double2LengthBuilder(value: Double) = new LengthBuilder(value)

  val metres = new UnitOfMeasure[Length](1)
  val kilometres = (1000 metres) asNewUnit
  val centimetres = (0.01 metres) asNewUnit()
  val feet = (0.3084 metres) asNewUnit()
}

class LengthBuilder(value: Double)
{
  def metres = new Length(value, Length.metres)
  def kilometres = new Length(value, Length.kilometres)
  def centimetres = new Length(value, Length.centimetres)
  def feet = new Length(value, Length.feet)
}
