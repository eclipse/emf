/**
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved.  This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.emf.test.models.order;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.test.models.order.OrderPackage
 * @generated
 */
public interface OrderFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OrderFactory eINSTANCE = org.eclipse.emf.test.models.order.impl.OrderFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Customer Order</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Customer Order</em>'.
   * @generated
   */
  CustomerOrder createCustomerOrder();

  /**
   * Returns a new object of class '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document Root</em>'.
   * @generated
   */
  DocumentRoot createDocumentRoot();

  /**
   * Returns a new object of class '<em>Order</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Order</em>'.
   * @generated
   */
  Order createOrder();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  OrderPackage getOrderPackage();

} //OrderFactory
