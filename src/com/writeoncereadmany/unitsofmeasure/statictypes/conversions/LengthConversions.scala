package com.writeoncereadmany.unitsofmeasure.statictypes.conversions

import com.writeoncereadmany.unitsofmeasure.statictypes.units.{Volume, Length, Area}
import Length._
import Area._
import Volume._

object LengthConversions
{
  implicit def lengthToLengthConverter(length: Length) = new LengthConverter(length)
  implicit def areaToAreaConvertor(area: Area) = new AreaConverter(area)
}

class LengthConverter(val length: Length)
{
  def *(other: Length) = (length in metres) * (other in metres) squareMetres
  def *(other: Area) = (length in metres) * (other in squareMetres) cubicMetres
}

class AreaConverter(val area: Area)
{
  def *(other: Length) = (area in squareMetres) * (other in metres) cubicMetres
}