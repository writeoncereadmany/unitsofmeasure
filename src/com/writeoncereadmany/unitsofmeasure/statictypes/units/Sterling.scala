package com.writeoncereadmany.unitsofmeasure.statictypes.units

import com.writeoncereadmany.unitsofmeasure.statictypes.{Quantity, UnitOfMeasure}

class Sterling(value: Double, units: UnitOfMeasure[Sterling]) extends Quantity[Sterling](value, units)
{
  def newInstance(value: Double) = new Sterling(value, Sterling.pounds)
}

object Sterling
{
  implicit def double2SterlingBuilder(value: Double) = new SterlingBuilder(value)

  object pounds extends UnitOfMeasure[Sterling](1)
  object pence extends UnitOfMeasure[Sterling](0.01)
}

class SterlingBuilder(val value: Double)
{
  def pounds = new Sterling(value, Sterling.pounds)
  def pence = new Sterling(value, Sterling.pence)
}