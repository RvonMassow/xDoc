package org.eclipse.xtext.xdoc.generator.util;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xdoc.resource.XdocResourceDescriptionManager;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.ChapterRef;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.Section2;
import org.eclipse.xtext.xdoc.xdoc.Section2Ref;
import org.eclipse.xtext.xdoc.xdoc.SectionRef;
import org.eclipse.xtext.xdoc.xdoc.XdocFile;
import org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals;

@SuppressWarnings("all")
public class EclipseNamingExtensions {
  
  @Inject
  private XdocResourceDescriptionManager rdm;
  
  @Inject
  private IResourceDescriptions index;
  
  @Inject
  private IQualifiedNameProvider nameProvider;
  
  public String urlSuffix(final AbstractSection aS) {
    String _xifexpression = null;
    EObject _eContainer = aS.eContainer();
    if ((_eContainer instanceof org.eclipse.xtext.xdoc.xdoc.XdocFile)) {
      _xifexpression = "";
    } else {
      String _labelName = this.labelName(aS);
      String _operator_plus = StringExtensions.operator_plus("#", _labelName);
      _xifexpression = _operator_plus;
    }
    return _xifexpression;
  }
  
  protected String _labelName(final Object any) {
    return "";
  }
  
  protected String _fileName(final EObject obj) {
    EObject _eContainer = obj.eContainer();
    String _fileName = this.fileName(_eContainer);
    return _fileName;
  }
  
  protected String _fileName(final Chapter obj) {
    Resource _eResource = obj.eResource();
    URI _uRI = _eResource.getURI();
    String _lastSegment = _uRI.lastSegment();
    String _operator_plus = StringExtensions.operator_plus(_lastSegment, ".html");
    return _operator_plus;
  }
  
  protected String _fileName(final AbstractSection obj) {
    String _xifexpression = null;
    EObject _eContainer = obj.eContainer();
    if ((_eContainer instanceof org.eclipse.xtext.xdoc.xdoc.XdocFile)) {
      String _xblockexpression = null;
      {
        AbstractSection _virtualContainer = this.virtualContainer(obj);
        final AbstractSection vCon = _virtualContainer;
        String _xifexpression_1 = null;
        boolean _operator_notEquals = ObjectExtensions.operator_notEquals(vCon, null);
        if (_operator_notEquals) {
          String _fileName = this.fileName(vCon);
          _xifexpression_1 = _fileName;
        } else {
          String _string = obj==null?(String)null:obj.toString();
          String _operator_plus = StringExtensions.operator_plus("NullFileName for ", _string);
          _xifexpression_1 = _operator_plus;
        }
        _xblockexpression = (_xifexpression_1);
      }
      _xifexpression = _xblockexpression;
    } else {
      EObject _eContainer_1 = obj.eContainer();
      String _fileName_1 = this.fileName(_eContainer_1);
      _xifexpression = _fileName_1;
    }
    return _xifexpression;
  }
  
  protected String _fileName(final ChapterRef obj) {
    Chapter _chapter = obj.getChapter();
    String _fileName = this.fileName(_chapter);
    return _fileName;
  }
  
  protected String _fileName(final SectionRef obj) {
    Section _section = obj.getSection();
    String _fileName = this.fileName(_section);
    return _fileName;
  }
  
  protected String _fileName(final Section2Ref obj) {
    Section2 _section2 = obj.getSection2();
    String _fileName = this.fileName(_section2);
    return _fileName;
  }
  
  protected String _labelName(final AbstractSection aS) {
    String _xifexpression = null;
    String _name = aS.getName();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
    if (_operator_notEquals) {
      String _name_1 = aS.getName();
      _xifexpression = _name_1;
    } else {
      EObject _eContainer = aS.eContainer();
      String _labelName = this.labelName(_eContainer);
      String _operator_plus = StringExtensions.operator_plus(_labelName, "-");
      EObject _eContainer_1 = aS.eContainer();
      EList<EObject> _eContents = _eContainer_1.eContents();
      int _indexOf = _eContents.indexOf(aS);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ((Integer)_indexOf));
      _xifexpression = _operator_plus_1;
    }
    return _xifexpression;
  }
  
  public AbstractSection virtualContainer(final AbstractSection obj) {
    AbstractSection _xblockexpression = null;
    {
      Iterable<IResourceDescription> _allResourceDescriptions = this.index.getAllResourceDescriptions();
      final Function1<IResourceDescription,Boolean> _function = new Function1<IResourceDescription,Boolean>() {
          public Boolean apply(final IResourceDescription r) {
            Iterable<QualifiedName> _importedNames = r.getImportedNames();
            final Function1<QualifiedName,Boolean> _function_1 = new Function1<QualifiedName,Boolean>() {
                public Boolean apply(final QualifiedName e) {
                  String _name = obj.getName();
                  String _lowerCase = _name.toLowerCase();
                  QualifiedName _create = QualifiedName.create(_lowerCase);
                  boolean _operator_equals = ObjectExtensions.operator_equals(e, _create);
                  return ((Boolean)_operator_equals);
                }
              };
            boolean _exists = IterableExtensions.<QualifiedName>exists(_importedNames, _function_1);
            return ((Boolean)_exists);
          }
        };
      Iterable<IResourceDescription> _filter = IterableExtensions.<IResourceDescription>filter(_allResourceDescriptions, _function);
      final Iterable<IResourceDescription> resD = _filter;
      final Function1<IResourceDescription,Boolean> _function_2 = new Function1<IResourceDescription,Boolean>() {
          public Boolean apply(final IResourceDescription r_1) {
            Iterable<IReferenceDescription> _referenceDescriptions = r_1.getReferenceDescriptions();
            final Function1<IReferenceDescription,Boolean> _function_3 = new Function1<IReferenceDescription,Boolean>() {
                public Boolean apply(final IReferenceDescription ref) {
                  boolean _operator_or = false;
                  EReference _eReference = ref.getEReference();
                  EClass _eReferenceType = _eReference.getEReferenceType();
                  boolean _operator_equals_1 = ObjectExtensions.operator_equals(_eReferenceType, Literals.SECTION2);
                  if (_operator_equals_1) {
                    _operator_or = true;
                  } else {
                    boolean _operator_and = false;
                    EReference _eReference_1 = ref.getEReference();
                    EClass _eReferenceType_1 = _eReference_1.getEReferenceType();
                    boolean _operator_equals_2 = ObjectExtensions.operator_equals(_eReferenceType_1, Literals.SECTION);
                    if (!_operator_equals_2) {
                      _operator_and = false;
                    } else {
                      URI _uRI = r_1.getURI();
                      String _lastSegment = _uRI.lastSegment();
                      boolean _endsWith = _lastSegment.endsWith("xdoc");
                      _operator_and = BooleanExtensions.operator_and(_operator_equals_2, _endsWith);
                    }
                    _operator_or = BooleanExtensions.operator_or(_operator_equals_1, _operator_and);
                  }
                  return ((Boolean)_operator_or);
                }
              };
            boolean _exists_1 = IterableExtensions.<IReferenceDescription>exists(_referenceDescriptions, _function_3);
            return ((Boolean)_exists_1);
          }
        };
      IResourceDescription _findFirst = IterableExtensions.<IResourceDescription>findFirst(resD, _function_2);
      final IResourceDescription ird = _findFirst;
      Resource _eResource = obj.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      URI _uRI_1 = ird.getURI();
      Resource _resource = _resourceSet.getResource(_uRI_1, true);
      EList<EObject> _contents = _resource==null?(EList<EObject>)null:_resource.getContents();
      Iterable<XdocFile> _filter_1 = IterableExtensions.<XdocFile>filter(_contents, org.eclipse.xtext.xdoc.xdoc.XdocFile.class);
      XdocFile _head = IterableExtensions.<XdocFile>head(_filter_1);
      AbstractSection _mainSection = _head==null?(AbstractSection)null:_head.getMainSection();
      _xblockexpression = (_mainSection);
    }
    return _xblockexpression;
  }
  
  public String labelName(final Object aS) {
    if ((aS instanceof AbstractSection)) {
      return _labelName((AbstractSection)aS);
    } else if ((aS instanceof Object)) {
      return _labelName((Object)aS);
    } else {
      throw new IllegalArgumentException();
    }
  }
  
  public String fileName(final EObject obj) {
    if ((obj instanceof ChapterRef)) {
      return _fileName((ChapterRef)obj);
    } else if ((obj instanceof Section2Ref)) {
      return _fileName((Section2Ref)obj);
    } else if ((obj instanceof SectionRef)) {
      return _fileName((SectionRef)obj);
    } else if ((obj instanceof Chapter)) {
      return _fileName((Chapter)obj);
    } else if ((obj instanceof AbstractSection)) {
      return _fileName((AbstractSection)obj);
    } else if ((obj instanceof EObject)) {
      return _fileName((EObject)obj);
    } else {
      throw new IllegalArgumentException();
    }
  }
}