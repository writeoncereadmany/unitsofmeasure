package com.writeoncereadmany.unitsofmeasure.statictypes.conversions

import com.writeoncereadmany.unitsofmeasure.statictypes.units.{Volume, SterlingOverVolume, Sterling}
import Sterling._
import Volume._
import SterlingOverVolume._

object SterlingToVolumeComversions
{
  implicit def sterlingToSterlingToVolumeConverter(price: Sterling) = new SterlingToVolumeConverter(price)
  implicit def volumeToSterlingConversion(volume: Volume) = new VolumeToSterlingConverter(volume)
}

class SterlingToVolumeConverter(val price: Sterling)
{
  def /(volume: Volume) = (price in pounds) / (volume in pints) poundsPerPint
}

class VolumeToSterlingConverter(val volume: Volume)
{
  def *(other: SterlingOverVolume) = (volume in pints) * (other in poundsPerPint) pounds
}
