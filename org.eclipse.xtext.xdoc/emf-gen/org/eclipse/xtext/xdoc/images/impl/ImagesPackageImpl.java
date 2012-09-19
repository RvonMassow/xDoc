/**
 */
package org.eclipse.xtext.xdoc.images.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xdoc.images.ImageProxy;
import org.eclipse.xtext.xdoc.images.ImagesFactory;
import org.eclipse.xtext.xdoc.images.ImagesPackage;

import org.eclipse.xtext.xdoc.xdoc.XdocPackage;

import org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImagesPackageImpl extends EPackageImpl implements ImagesPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageProxyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.xtext.xdoc.images.ImagesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImagesPackageImpl()
	{
		super(eNS_URI, ImagesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ImagesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ImagesPackage init()
	{
		if (isInited) return (ImagesPackage)EPackage.Registry.INSTANCE.getEPackage(ImagesPackage.eNS_URI);

		// Obtain or create and register package
		ImagesPackageImpl theImagesPackage = (ImagesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ImagesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ImagesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XdocPackageImpl theXdocPackage = (XdocPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XdocPackage.eNS_URI) instanceof XdocPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XdocPackage.eNS_URI) : XdocPackage.eINSTANCE);

		// Create package meta-data objects
		theImagesPackage.createPackageContents();
		theXdocPackage.createPackageContents();

		// Initialize created meta-data
		theImagesPackage.initializePackageContents();
		theXdocPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theImagesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImagesPackage.eNS_URI, theImagesPackage);
		return theImagesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageProxy()
	{
		return imageProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageProxy_Name()
	{
		return (EAttribute)imageProxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagesFactory getImagesFactory()
	{
		return (ImagesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		imageProxyEClass = createEClass(IMAGE_PROXY);
		createEAttribute(imageProxyEClass, IMAGE_PROXY__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(imageProxyEClass, ImageProxy.class, "ImageProxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageProxy_Name(), ecorePackage.getEString(), "name", null, 0, 1, ImageProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ImagesPackageImpl
