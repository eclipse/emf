/**
 * <copyright>
 * </copyright>
 *
 * $Id: DbValidator.java,v 1.1 2004/06/16 18:01:17 elena Exp $
 */
package org.eclipse.emf.test.models.movie.db.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.emf.test.models.movie.db.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.test.models.movie.db.DbPackage
 * @generated
 */
public class DbValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final DbValidator INSTANCE = new DbValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "org.eclipse.emf.test.models.movie.db";

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

  /**
   * The cached base package validator.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XMLTypeValidator xmlTypeValidator;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbValidator()
  {
    xmlTypeValidator = XMLTypeValidator.INSTANCE;
  }

  /**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EPackage getEPackage()
  {
    return DbPackage.eINSTANCE;
  }

  /**
   * Calls <code>validateXXX</code> for the corresonding classifier of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context)
  {
    switch (classifierID)
    {
      case DbPackage.CRITICS_REVIEW_TYPE:
        return validateCriticsReviewType((CriticsReviewType)value, diagnostics, context);
      case DbPackage.CUSTOMER_REVIEW_TYPE:
        return validateCustomerReviewType((CustomerReviewType)value, diagnostics, context);
      case DbPackage.DOCUMENT_ROOT:
        return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
      case DbPackage.MOVIE_DB_TYPE:
        return validateMovieDBType((MovieDBType)value, diagnostics, context);
      case DbPackage.MOVIE_TYPE:
        return validateMovieType((MovieType)value, diagnostics, context);
      case DbPackage.GENRE_TYPES:
        return validateGenreTypes((Object)value, diagnostics, context);
      case DbPackage.ACTORS_LIST:
        return validateActorsList((List)value, diagnostics, context);
      case DbPackage.GENRE_TYPES_OBJECT:
        return validateGenreTypesObject((GenreTypes)value, diagnostics, context);
      case DbPackage.RATING_TYPE:
        return validateRatingType(((Integer)value).intValue(), diagnostics, context);
      case DbPackage.RATING_TYPE_OBJECT:
        return validateRatingTypeObject((Integer)value, diagnostics, context);
      case DbPackage.RATING_VALUES:
        return validateRatingValues(((Integer)value).intValue(), diagnostics, context);
      case DbPackage.RATING_VALUES_OBJECT:
        return validateRatingValuesObject((Integer)value, diagnostics, context);
      default: 
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCriticsReviewType(CriticsReviewType criticsReviewType, DiagnosticChain diagnostics, Map context)
  {
    return validate_EveryDefaultConstraint(criticsReviewType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCustomerReviewType(CustomerReviewType customerReviewType, DiagnosticChain diagnostics, Map context)
  {
    return validate_EveryDefaultConstraint(customerReviewType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map context)
  {
    return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMovieDBType(MovieDBType movieDBType, DiagnosticChain diagnostics, Map context)
  {
    return validate_EveryDefaultConstraint(movieDBType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMovieType(MovieType movieType, DiagnosticChain diagnostics, Map context)
  {
    return validate_EveryDefaultConstraint(movieType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateGenreTypes(Object genreTypes, DiagnosticChain diagnostics, Map context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateActorsList(List actorsList, DiagnosticChain diagnostics, Map context)
  {
    boolean result = validateActorsList_ItemType(actorsList, diagnostics, context);
    return result;
  }

  /**
   * Validates the ItemType constraint of '<em>Actors List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateActorsList_ItemType(List actorsList, DiagnosticChain diagnostics, Map context)
  {
    boolean result = true;
    for (Iterator i = actorsList.iterator(); i.hasNext() && (result || diagnostics != null); )
    {
      Object item = i.next();
      if (XMLTypePackage.eINSTANCE.getNCName().isInstance(item))
      {
        result &= xmlTypeValidator.validateNCName((String)item, diagnostics, context);
      }
      else
      {
        result = false;
        reportDataValueTypeViolation(XMLTypePackage.eINSTANCE.getNCName(), item, diagnostics, context);
      }
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateGenreTypesObject(GenreTypes genreTypesObject, DiagnosticChain diagnostics, Map context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRatingType(int ratingType, DiagnosticChain diagnostics, Map context)
  {
    boolean result = validateRatingType_Min(ratingType, diagnostics, context);
    if (result || diagnostics != null) result &= validateRatingType_Max(ratingType, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @see #validateRatingType_Min
   */
  public static final int RATING_TYPE__MIN__VALUE = 0;

  /**
   * Validates the Min constraint of '<em>Rating Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRatingType_Min(int ratingType, DiagnosticChain diagnostics, Map context)
  {
    boolean result = ratingType >= RATING_TYPE__MIN__VALUE;
    if (!result && diagnostics != null) 
      reportMinViolation(DbPackage.eINSTANCE.getRatingType(), new Integer(ratingType), new Integer(RATING_TYPE__MIN__VALUE), true, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @see #validateRatingType_Max
   */
  public static final int RATING_TYPE__MAX__VALUE = 10;

  /**
   * Validates the Max constraint of '<em>Rating Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRatingType_Max(int ratingType, DiagnosticChain diagnostics, Map context)
  {
    boolean result = ratingType <= RATING_TYPE__MAX__VALUE;
    if (!result && diagnostics != null) 
      reportMaxViolation(DbPackage.eINSTANCE.getRatingType(), new Integer(ratingType), new Integer(RATING_TYPE__MAX__VALUE), true, diagnostics, context);
    return result; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRatingTypeObject(Integer ratingTypeObject, DiagnosticChain diagnostics, Map context)
  {
    boolean result = validateRatingType_Min(ratingTypeObject.intValue(), diagnostics, context);
    if (result || diagnostics != null) result &= validateRatingType_Max(ratingTypeObject.intValue(), diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRatingValues(int ratingValues, DiagnosticChain diagnostics, Map context)
  {
    boolean result = validateRatingValues_Min(ratingValues, diagnostics, context);
    if (result || diagnostics != null) result &= validateRatingValues_Max(ratingValues, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @see #validateRatingValues_Min
   */
  public static final int RATING_VALUES__MIN__VALUE = 0;

  /**
   * Validates the Min constraint of '<em>Rating Values</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRatingValues_Min(int ratingValues, DiagnosticChain diagnostics, Map context)
  {
    boolean result = ratingValues >= RATING_VALUES__MIN__VALUE;
    if (!result && diagnostics != null) 
      reportMinViolation(DbPackage.eINSTANCE.getRatingValues(), new Integer(ratingValues), new Integer(RATING_VALUES__MIN__VALUE), true, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @see #validateRatingValues_Max
   */
  public static final int RATING_VALUES__MAX__VALUE = 10;

  /**
   * Validates the Max constraint of '<em>Rating Values</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRatingValues_Max(int ratingValues, DiagnosticChain diagnostics, Map context)
  {
    boolean result = ratingValues <= RATING_VALUES__MAX__VALUE;
    if (!result && diagnostics != null) 
      reportMaxViolation(DbPackage.eINSTANCE.getRatingValues(), new Integer(ratingValues), new Integer(RATING_VALUES__MAX__VALUE), true, diagnostics, context);
    return result; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRatingValuesObject(Integer ratingValuesObject, DiagnosticChain diagnostics, Map context)
  {
    boolean result = validateRatingValues_Min(ratingValuesObject.intValue(), diagnostics, context);
    if (result || diagnostics != null) result &= validateRatingValues_Max(ratingValuesObject.intValue(), diagnostics, context);
    return result;
  }

} //DbValidator
