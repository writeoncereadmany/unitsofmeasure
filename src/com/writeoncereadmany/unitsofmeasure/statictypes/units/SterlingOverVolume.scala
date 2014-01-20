package com.writeoncereadmany.unitsofmeasure.statictypes.units

import com.writeoncereadmany.unitsofmeasure.statictypes.{Quantity, UnitOfMeasure}

class SterlingOverVolume(value: Double, units: UnitOfMeasure[SterlingOverVolume]) extends Quantity[SterlingOverVolume](value, units)
{
  def newInstance(value: Double) = new SterlingOverVolume(value, SterlingOverVolume.poundsPerPint)
}

object SterlingOverVolume
{
  implicit def double2SterlingOverVolumeBuilder(value: Double) = new SterlingOverVolumeBuilder(value)

  object poundsPerPint extends UnitOfMeasure[SterlingOverVolume](1)
}

class SterlingOverVolumeBuilder(val value: Double)
{
  def poundsPerPint = new SterlingOverVolume(value, SterlingOverVolume.poundsPerPint)
}