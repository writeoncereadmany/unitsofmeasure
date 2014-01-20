package com.writeoncereadmany.unitsofmeasure.statictypes.samples

import com.writeoncereadmany.unitsofmeasure.statictypes.units.Volume._
import com.writeoncereadmany.unitsofmeasure.statictypes.units.Length._
import com.writeoncereadmany.unitsofmeasure.statictypes.units.Sterling._
import com.writeoncereadmany.unitsofmeasure.statictypes.conversions.LengthConversions._
import com.writeoncereadmany.unitsofmeasure.statictypes.conversions.SterlingToVolumeComversions._

object StaticSample
{
  def main(args: Array[String])
  {
    val length = 50 metres
    val width = 25 metres
    val depth = 9 feet
    val swimmingPool = length * width * depth

    val costOfAPint = (3.50 pounds) / (1 pints)

    val costOfASwimmingPoolFullOfBeer = swimmingPool * costOfAPint

    val costOfFiveSwimmingPoolsFullOfBeer = costOfASwimmingPoolFullOfBeer * 5

    println(f"A swimming pool full of beer would cost £${costOfASwimmingPoolFullOfBeer in pounds}%10.2f")
    println(f"Five swimming pools full of beer would cost £${costOfFiveSwimmingPoolsFullOfBeer in pounds}%10.2f")
  }
}

