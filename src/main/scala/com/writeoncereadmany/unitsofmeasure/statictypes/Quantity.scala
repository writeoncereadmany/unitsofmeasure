package com.writeoncereadmany.unitsofmeasure.statictypes



abstract class Quantity[T <: Quantity[T]](val value: Double, val units: UnitOfMeasure[T]) {

  val valueInBaseUnits = value * units.scalingFactor

  protected def newInstance(valueInBaseUnits: Double): T
  
  def +(other: T) = newInstance(valueInBaseUnits + other.valueInBaseUnits)
  def -(other: T) = newInstance(valueInBaseUnits - other.valueInBaseUnits)
  def *(factor: Double) = newInstance(valueInBaseUnits * factor)
  def /(factor: Double) = newInstance(valueInBaseUnits / factor)
  def asNewUnit() = new UnitOfMeasure[T](valueInBaseUnits)
  def in(units: UnitOfMeasure[T]) = valueInBaseUnits / units.scalingFactor
  override def equals(other: Any) = other match { case that:T => this.getClass.equals(other.getClass) &&
                                                        this.valueInBaseUnits == that.valueInBaseUnits
                                         case _ => false }
  override def hashCode() = valueInBaseUnits.hashCode
}