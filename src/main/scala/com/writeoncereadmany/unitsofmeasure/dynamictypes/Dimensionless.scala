package com.writeoncereadmany.unitsofmeasure.dynamictypes

object Dimensionless extends UnitOfMeasure(1, new Dimensions(Map()))
{
  implicit def double2DimensionlessQuantity(value: Double) = Dimensionless(value)
}
