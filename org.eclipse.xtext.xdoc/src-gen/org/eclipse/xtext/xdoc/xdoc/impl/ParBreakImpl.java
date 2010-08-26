/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.xdoc.xdoc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xdoc.xdoc.ParBreak;
import org.eclipse.xtext.xdoc.xdoc.XdocPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Par Break</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.impl.ParBreakImpl#getC <em>C</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParBreakImpl extends CodeBlockImpl implements ParBreak
{
  /**
   * The default value of the '{@link #getC() <em>C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected static final String C_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getC() <em>C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected String c = C_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParBreakImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XdocPackage.Literals.PAR_BREAK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getC()
  {
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC(String newC)
  {
    String oldC = c;
    c = newC;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XdocPackage.PAR_BREAK__C, oldC, c));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case XdocPackage.PAR_BREAK__C:
        return getC();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XdocPackage.PAR_BREAK__C:
        setC((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case XdocPackage.PAR_BREAK__C:
        setC(C_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case XdocPackage.PAR_BREAK__C:
        return C_EDEFAULT == null ? c != null : !C_EDEFAULT.equals(c);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (c: ");
    result.append(c);
    result.append(')');
    return result.toString();
  }

} //ParBreakImpl
