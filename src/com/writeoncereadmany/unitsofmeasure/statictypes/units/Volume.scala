package com.writeoncereadmany.unitsofmeasure.statictypes.units

import com.writeoncereadmany.unitsofmeasure.statictypes.{Quantity, UnitOfMeasure}

class Volume(value: Double, unit: UnitOfMeasure[Volume]) extends Quantity[Volume](value, unit)
{
  def newInstance(unscaledValue: Double) = new Volume(unscaledValue, Volume.cubicMetres)
}

object Volume
{
  implicit def double2VolumeBuilder(value: Double): VolumeBuilder = new VolumeBuilder(value)

  object cubicMetres extends UnitOfMeasure[Volume](1)
  object pints extends UnitOfMeasure[Volume](0.000568261485)
}

class VolumeBuilder(value: Double)
{
  def cubicMetres = new Volume(value, Volume.cubicMetres)
  def pints = new Volume(value, Volume.pints)
}
