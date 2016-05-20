package com.writeoncereadmany.unitsofmeasure.dynamictypes.units

import com.writeoncereadmany.unitsofmeasure.dynamictypes.{Dimensions, UnitOfMeasure, Dimension}

case object Sterling extends Dimension
{
  implicit def double2SterlingBuilder(value: Double) = new SterlingBuilder(value)

  val pounds = new UnitOfMeasure(1, new Dimensions(Map(Sterling->1)))
  val pence = (0.01 pounds) asNewUnit
}

class SterlingBuilder(val value: Double)
{
  def pounds = Sterling.pounds(value)
  def pence = Sterling.pence(value)
}
