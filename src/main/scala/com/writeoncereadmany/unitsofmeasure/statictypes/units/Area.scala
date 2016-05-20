package com.writeoncereadmany.unitsofmeasure.statictypes.units

import com.writeoncereadmany.unitsofmeasure.statictypes.{Quantity, UnitOfMeasure}

class Area(value: Double, unit: UnitOfMeasure[Area]) extends Quantity[Area](value, unit)
{
  def newInstance(unscaledValue: Double) = new Area(unscaledValue, Area.squareMetres)
}

object Area
{
  implicit def double2AreaBuilder(value: Double): AreaBuilder = new AreaBuilder(value)

  object squareMetres extends UnitOfMeasure[Area](1)
}

class AreaBuilder(value: Double)
{
  def squareMetres = new Area(value, Area.squareMetres)
}
