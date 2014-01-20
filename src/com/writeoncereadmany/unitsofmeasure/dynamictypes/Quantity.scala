package com.writeoncereadmany.unitsofmeasure.dynamictypes

sealed class Quantity(val amount: Double, val units: UnitOfMeasure)
{
  val baseValue = amount * units.scalingFactor
  val dim = units.dimensions

  private def this(value: Double, dim: Dimensions) = this(value, new UnitOfMeasure(1, dim))

  private def dimCheck(otherDim: Dimensions) { if(dim != otherDim) throw new DimensionMismatchException(dim, otherDim)}

  def +(other: Quantity) = { dimCheck(other.dim); new Quantity(baseValue + other.baseValue, dim)}
  def -(other: Quantity) = { dimCheck(other.dim); new Quantity(baseValue - other.baseValue, dim)}
  def *(other: Quantity) = new Quantity(baseValue * other.baseValue, dim + other.dim)
  def /(other: Quantity) = new Quantity(baseValue / other.baseValue, dim - other.dim)

  def in(units: UnitOfMeasure) = { dimCheck(units.dimensions); baseValue / units.scalingFactor }
  def asNewUnit = new UnitOfMeasure(baseValue, dim)

  override def equals(other: Any) = other match { case o:Quantity => o.baseValue == baseValue && o.dim == dim; case _ => false }
  override def hashCode = baseValue.hashCode + 31 * dim.hashCode
}
