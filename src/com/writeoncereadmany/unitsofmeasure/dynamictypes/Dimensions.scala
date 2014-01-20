package com.writeoncereadmany.unitsofmeasure.dynamictypes

class Dimensions(val dim: Map[Dimension, Int])
{
  def apply(dimension: Dimension): Int = dim.applyOrElse(dimension, { d:Dimension => 0 })
  def +(other: Dimensions) = new Dimensions((dim.keys ++ other.dim.keys).map(d => (d, this(d) + other(d))).filter{case (k, v) => v != 0}.toMap)
  def -(other: Dimensions) = new Dimensions((dim.keys ++ other.dim.keys).map(d => (d, this(d) - other(d))).filter{case (k, v) => v != 0}.toMap)

  override def equals(other: Any) = other match { case o:Dimensions => dim.equals(o.dim); case _ => false }
  override def hashCode = dim.hashCode()
  override def toString = dim.foldLeft("") {case (acc, (key, value)) => acc + s"$key^$value "}
}
