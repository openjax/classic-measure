/* Copyright (c) 2014 FastJAX
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * You should have received a copy of The MIT License (MIT) along with this
 * program. If not, see <http://opensource.org/licenses/MIT/>.
 */

package org.fastjax.measure;

import org.fastjax.measure.Dimension.Unit;

/**
 * A scalar dimension representing density.
 */
public final class Density extends Dimension.Scalar<Unit.Ratio<Mass.Unit,Volume.Unit>> {
  public Density(final double value, final Unit.Ratio<Mass.Unit,Volume.Unit> unit) {
    super(value, unit);
  }
}