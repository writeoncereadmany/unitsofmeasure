package com.writeoncereadmany.unitsofmeasure.dynamictypes.units

import com.writeoncereadmany.unitsofmeasure.dynamictypes.{Dimensions, UnitOfMeasure, Dimension}

case object Time extends Dimension
{
  implicit def double2TimeBuilder(value: Double) = new TimeBuilder(value)

  val seconds = new UnitOfMeasure(1, new Dimensions(Map(Time->1)))
  val minutes = (60 seconds) asNewUnit
  val hours = (60 minutes) asNewUnit
  val days = (24 hours) asNewUnit

}

class TimeBuilder(val value: Double)
{
  def seconds = Time.seconds(value)
  def minutes = Time.minutes(value)
  def hours = Time.hours(value)
  def days = Time.days(value)
}
