package com.writeoncereadmany.unitsofmeasure.dynamictypes

class UnitOfMeasure(val scalingFactor: Double, val dimensions: Dimensions)
{
  def apply(inUnits: Double) = new Quantity(inUnits, this)
}
