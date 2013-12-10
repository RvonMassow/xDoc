/**
 */
package org.eclipse.xtext.xdoc.images;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.xdoc.images.ImagesFactory
 * @model kind="package"
 * @generated
 */
public interface ImagesPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "images";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/Xtext/xdoc/imageProxy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "images";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImagesPackage eINSTANCE = org.eclipse.xtext.xdoc.images.impl.ImagesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.images.impl.ImageProxyImpl <em>Image Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.images.impl.ImageProxyImpl
	 * @see org.eclipse.xtext.xdoc.images.impl.ImagesPackageImpl#getImageProxy()
	 * @generated
	 */
	int IMAGE_PROXY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PROXY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Image Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PROXY_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.images.ImageProxy <em>Image Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Proxy</em>'.
	 * @see org.eclipse.xtext.xdoc.images.ImageProxy
	 * @generated
	 */
	EClass getImageProxy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.xdoc.images.ImageProxy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtext.xdoc.images.ImageProxy#getName()
	 * @see #getImageProxy()
	 * @generated
	 */
	EAttribute getImageProxy_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImagesFactory getImagesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.images.impl.ImageProxyImpl <em>Image Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.images.impl.ImageProxyImpl
		 * @see org.eclipse.xtext.xdoc.images.impl.ImagesPackageImpl#getImageProxy()
		 * @generated
		 */
		EClass IMAGE_PROXY = eINSTANCE.getImageProxy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_PROXY__NAME = eINSTANCE.getImageProxy_Name();

	}

} //ImagesPackage
