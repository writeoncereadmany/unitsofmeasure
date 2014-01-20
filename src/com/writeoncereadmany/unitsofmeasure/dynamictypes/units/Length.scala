package com.writeoncereadmany.unitsofmeasure.dynamictypes.units

import com.writeoncereadmany.unitsofmeasure.dynamictypes.{Dimensions, UnitOfMeasure, Dimension}

case object Length extends Dimension
{
  implicit def double2LengthBuilder(value: Double) = new LengthBuilder(value)

  val metres = new UnitOfMeasure(1, new Dimensions(Map(Length->1)))
  val kilometres = (1000 metres) asNewUnit
  val centimetres = (0.01 metres) asNewUnit


  // higher order units: areas
  val squareMetres = (1 metres) * (1 metres) asNewUnit

  // higher order units: volumes
  val cubicMetres = (1 metres) * (1 squareMetres) asNewUnit
  val litres = (0.001 cubicMetres) asNewUnit
}

class LengthBuilder(val value: Double)
{
  // lengths
  def metres = Length.metres(value)
  def kilometres = Length.kilometres(value)
  def centimetres = Length.centimetres(value)


  // higher order units: areas
  def squareMetres = Length.squareMetres(value)

  // higher order units: volumes
  def cubicMetres = Length.cubicMetres(value)
  def litres = Length.litres(value)
}
