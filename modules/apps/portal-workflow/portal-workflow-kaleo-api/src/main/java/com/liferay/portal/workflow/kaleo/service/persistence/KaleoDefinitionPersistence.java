/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow.kaleo.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.change.tracking.CTPersistence;
import com.liferay.portal.workflow.kaleo.exception.NoSuchDefinitionException;
import com.liferay.portal.workflow.kaleo.model.KaleoDefinition;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the kaleo definition service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoDefinitionUtil
 * @generated
 */
@ProviderType
public interface KaleoDefinitionPersistence
	extends BasePersistence<KaleoDefinition>, CTPersistence<KaleoDefinition> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KaleoDefinitionUtil} to access the kaleo definition persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the kaleo definitions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching kaleo definitions
	 */
	public java.util.List<KaleoDefinition> findByCompanyId(long companyId);

	/**
	 * Returns a range of all the kaleo definitions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KaleoDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of kaleo definitions
	 * @param end the upper bound of the range of kaleo definitions (not inclusive)
	 * @return the range of matching kaleo definitions
	 */
	public java.util.List<KaleoDefinition> findByCompanyId(
		long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the kaleo definitions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KaleoDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of kaleo definitions
	 * @param end the upper bound of the range of kaleo definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kaleo definitions
	 */
	public java.util.List<KaleoDefinition> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
			orderByComparator);

	/**
	 * Returns an ordered range of all the kaleo definitions where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KaleoDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of kaleo definitions
	 * @param end the upper bound of the range of kaleo definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching kaleo definitions
	 */
	public java.util.List<KaleoDefinition> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first kaleo definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kaleo definition
	 * @throws NoSuchDefinitionException if a matching kaleo definition could not be found
	 */
	public KaleoDefinition findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
				orderByComparator)
		throws NoSuchDefinitionException;

	/**
	 * Returns the first kaleo definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kaleo definition, or <code>null</code> if a matching kaleo definition could not be found
	 */
	public KaleoDefinition fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
			orderByComparator);

	/**
	 * Returns the last kaleo definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kaleo definition
	 * @throws NoSuchDefinitionException if a matching kaleo definition could not be found
	 */
	public KaleoDefinition findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
				orderByComparator)
		throws NoSuchDefinitionException;

	/**
	 * Returns the last kaleo definition in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kaleo definition, or <code>null</code> if a matching kaleo definition could not be found
	 */
	public KaleoDefinition fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
			orderByComparator);

	/**
	 * Returns the kaleo definitions before and after the current kaleo definition in the ordered set where companyId = &#63;.
	 *
	 * @param kaleoDefinitionId the primary key of the current kaleo definition
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kaleo definition
	 * @throws NoSuchDefinitionException if a kaleo definition with the primary key could not be found
	 */
	public KaleoDefinition[] findByCompanyId_PrevAndNext(
			long kaleoDefinitionId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
				orderByComparator)
		throws NoSuchDefinitionException;

	/**
	 * Removes all the kaleo definitions where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of kaleo definitions where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching kaleo definitions
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Returns the kaleo definition where companyId = &#63; and name = &#63; or throws a <code>NoSuchDefinitionException</code> if it could not be found.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @return the matching kaleo definition
	 * @throws NoSuchDefinitionException if a matching kaleo definition could not be found
	 */
	public KaleoDefinition findByC_N(long companyId, String name)
		throws NoSuchDefinitionException;

	/**
	 * Returns the kaleo definition where companyId = &#63; and name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @return the matching kaleo definition, or <code>null</code> if a matching kaleo definition could not be found
	 */
	public KaleoDefinition fetchByC_N(long companyId, String name);

	/**
	 * Returns the kaleo definition where companyId = &#63; and name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching kaleo definition, or <code>null</code> if a matching kaleo definition could not be found
	 */
	public KaleoDefinition fetchByC_N(
		long companyId, String name, boolean useFinderCache);

	/**
	 * Removes the kaleo definition where companyId = &#63; and name = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @return the kaleo definition that was removed
	 */
	public KaleoDefinition removeByC_N(long companyId, String name)
		throws NoSuchDefinitionException;

	/**
	 * Returns the number of kaleo definitions where companyId = &#63; and name = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @return the number of matching kaleo definitions
	 */
	public int countByC_N(long companyId, String name);

	/**
	 * Returns all the kaleo definitions where companyId = &#63; and scope = &#63;.
	 *
	 * @param companyId the company ID
	 * @param scope the scope
	 * @return the matching kaleo definitions
	 */
	public java.util.List<KaleoDefinition> findByC_S(
		long companyId, String scope);

	/**
	 * Returns a range of all the kaleo definitions where companyId = &#63; and scope = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KaleoDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param scope the scope
	 * @param start the lower bound of the range of kaleo definitions
	 * @param end the upper bound of the range of kaleo definitions (not inclusive)
	 * @return the range of matching kaleo definitions
	 */
	public java.util.List<KaleoDefinition> findByC_S(
		long companyId, String scope, int start, int end);

	/**
	 * Returns an ordered range of all the kaleo definitions where companyId = &#63; and scope = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KaleoDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param scope the scope
	 * @param start the lower bound of the range of kaleo definitions
	 * @param end the upper bound of the range of kaleo definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kaleo definitions
	 */
	public java.util.List<KaleoDefinition> findByC_S(
		long companyId, String scope, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
			orderByComparator);

	/**
	 * Returns an ordered range of all the kaleo definitions where companyId = &#63; and scope = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KaleoDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param scope the scope
	 * @param start the lower bound of the range of kaleo definitions
	 * @param end the upper bound of the range of kaleo definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching kaleo definitions
	 */
	public java.util.List<KaleoDefinition> findByC_S(
		long companyId, String scope, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first kaleo definition in the ordered set where companyId = &#63; and scope = &#63;.
	 *
	 * @param companyId the company ID
	 * @param scope the scope
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kaleo definition
	 * @throws NoSuchDefinitionException if a matching kaleo definition could not be found
	 */
	public KaleoDefinition findByC_S_First(
			long companyId, String scope,
			com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
				orderByComparator)
		throws NoSuchDefinitionException;

	/**
	 * Returns the first kaleo definition in the ordered set where companyId = &#63; and scope = &#63;.
	 *
	 * @param companyId the company ID
	 * @param scope the scope
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kaleo definition, or <code>null</code> if a matching kaleo definition could not be found
	 */
	public KaleoDefinition fetchByC_S_First(
		long companyId, String scope,
		com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
			orderByComparator);

	/**
	 * Returns the last kaleo definition in the ordered set where companyId = &#63; and scope = &#63;.
	 *
	 * @param companyId the company ID
	 * @param scope the scope
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kaleo definition
	 * @throws NoSuchDefinitionException if a matching kaleo definition could not be found
	 */
	public KaleoDefinition findByC_S_Last(
			long companyId, String scope,
			com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
				orderByComparator)
		throws NoSuchDefinitionException;

	/**
	 * Returns the last kaleo definition in the ordered set where companyId = &#63; and scope = &#63;.
	 *
	 * @param companyId the company ID
	 * @param scope the scope
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kaleo definition, or <code>null</code> if a matching kaleo definition could not be found
	 */
	public KaleoDefinition fetchByC_S_Last(
		long companyId, String scope,
		com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
			orderByComparator);

	/**
	 * Returns the kaleo definitions before and after the current kaleo definition in the ordered set where companyId = &#63; and scope = &#63;.
	 *
	 * @param kaleoDefinitionId the primary key of the current kaleo definition
	 * @param companyId the company ID
	 * @param scope the scope
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kaleo definition
	 * @throws NoSuchDefinitionException if a kaleo definition with the primary key could not be found
	 */
	public KaleoDefinition[] findByC_S_PrevAndNext(
			long kaleoDefinitionId, long companyId, String scope,
			com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
				orderByComparator)
		throws NoSuchDefinitionException;

	/**
	 * Removes all the kaleo definitions where companyId = &#63; and scope = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param scope the scope
	 */
	public void removeByC_S(long companyId, String scope);

	/**
	 * Returns the number of kaleo definitions where companyId = &#63; and scope = &#63;.
	 *
	 * @param companyId the company ID
	 * @param scope the scope
	 * @return the number of matching kaleo definitions
	 */
	public int countByC_S(long companyId, String scope);

	/**
	 * Returns all the kaleo definitions where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @return the matching kaleo definitions
	 */
	public java.util.List<KaleoDefinition> findByC_A(
		long companyId, boolean active);

	/**
	 * Returns a range of all the kaleo definitions where companyId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KaleoDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param start the lower bound of the range of kaleo definitions
	 * @param end the upper bound of the range of kaleo definitions (not inclusive)
	 * @return the range of matching kaleo definitions
	 */
	public java.util.List<KaleoDefinition> findByC_A(
		long companyId, boolean active, int start, int end);

	/**
	 * Returns an ordered range of all the kaleo definitions where companyId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KaleoDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param start the lower bound of the range of kaleo definitions
	 * @param end the upper bound of the range of kaleo definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kaleo definitions
	 */
	public java.util.List<KaleoDefinition> findByC_A(
		long companyId, boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
			orderByComparator);

	/**
	 * Returns an ordered range of all the kaleo definitions where companyId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KaleoDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param start the lower bound of the range of kaleo definitions
	 * @param end the upper bound of the range of kaleo definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching kaleo definitions
	 */
	public java.util.List<KaleoDefinition> findByC_A(
		long companyId, boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first kaleo definition in the ordered set where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kaleo definition
	 * @throws NoSuchDefinitionException if a matching kaleo definition could not be found
	 */
	public KaleoDefinition findByC_A_First(
			long companyId, boolean active,
			com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
				orderByComparator)
		throws NoSuchDefinitionException;

	/**
	 * Returns the first kaleo definition in the ordered set where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kaleo definition, or <code>null</code> if a matching kaleo definition could not be found
	 */
	public KaleoDefinition fetchByC_A_First(
		long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
			orderByComparator);

	/**
	 * Returns the last kaleo definition in the ordered set where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kaleo definition
	 * @throws NoSuchDefinitionException if a matching kaleo definition could not be found
	 */
	public KaleoDefinition findByC_A_Last(
			long companyId, boolean active,
			com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
				orderByComparator)
		throws NoSuchDefinitionException;

	/**
	 * Returns the last kaleo definition in the ordered set where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kaleo definition, or <code>null</code> if a matching kaleo definition could not be found
	 */
	public KaleoDefinition fetchByC_A_Last(
		long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
			orderByComparator);

	/**
	 * Returns the kaleo definitions before and after the current kaleo definition in the ordered set where companyId = &#63; and active = &#63;.
	 *
	 * @param kaleoDefinitionId the primary key of the current kaleo definition
	 * @param companyId the company ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kaleo definition
	 * @throws NoSuchDefinitionException if a kaleo definition with the primary key could not be found
	 */
	public KaleoDefinition[] findByC_A_PrevAndNext(
			long kaleoDefinitionId, long companyId, boolean active,
			com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
				orderByComparator)
		throws NoSuchDefinitionException;

	/**
	 * Removes all the kaleo definitions where companyId = &#63; and active = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 */
	public void removeByC_A(long companyId, boolean active);

	/**
	 * Returns the number of kaleo definitions where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @return the number of matching kaleo definitions
	 */
	public int countByC_A(long companyId, boolean active);

	/**
	 * Returns the kaleo definition where companyId = &#63; and name = &#63; and version = &#63; or throws a <code>NoSuchDefinitionException</code> if it could not be found.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param version the version
	 * @return the matching kaleo definition
	 * @throws NoSuchDefinitionException if a matching kaleo definition could not be found
	 */
	public KaleoDefinition findByC_N_V(long companyId, String name, int version)
		throws NoSuchDefinitionException;

	/**
	 * Returns the kaleo definition where companyId = &#63; and name = &#63; and version = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param version the version
	 * @return the matching kaleo definition, or <code>null</code> if a matching kaleo definition could not be found
	 */
	public KaleoDefinition fetchByC_N_V(
		long companyId, String name, int version);

	/**
	 * Returns the kaleo definition where companyId = &#63; and name = &#63; and version = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param version the version
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching kaleo definition, or <code>null</code> if a matching kaleo definition could not be found
	 */
	public KaleoDefinition fetchByC_N_V(
		long companyId, String name, int version, boolean useFinderCache);

	/**
	 * Removes the kaleo definition where companyId = &#63; and name = &#63; and version = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param version the version
	 * @return the kaleo definition that was removed
	 */
	public KaleoDefinition removeByC_N_V(
			long companyId, String name, int version)
		throws NoSuchDefinitionException;

	/**
	 * Returns the number of kaleo definitions where companyId = &#63; and name = &#63; and version = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param version the version
	 * @return the number of matching kaleo definitions
	 */
	public int countByC_N_V(long companyId, String name, int version);

	/**
	 * Returns the kaleo definition where companyId = &#63; and name = &#63; and active = &#63; or throws a <code>NoSuchDefinitionException</code> if it could not be found.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param active the active
	 * @return the matching kaleo definition
	 * @throws NoSuchDefinitionException if a matching kaleo definition could not be found
	 */
	public KaleoDefinition findByC_N_A(
			long companyId, String name, boolean active)
		throws NoSuchDefinitionException;

	/**
	 * Returns the kaleo definition where companyId = &#63; and name = &#63; and active = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param active the active
	 * @return the matching kaleo definition, or <code>null</code> if a matching kaleo definition could not be found
	 */
	public KaleoDefinition fetchByC_N_A(
		long companyId, String name, boolean active);

	/**
	 * Returns the kaleo definition where companyId = &#63; and name = &#63; and active = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param active the active
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching kaleo definition, or <code>null</code> if a matching kaleo definition could not be found
	 */
	public KaleoDefinition fetchByC_N_A(
		long companyId, String name, boolean active, boolean useFinderCache);

	/**
	 * Removes the kaleo definition where companyId = &#63; and name = &#63; and active = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param active the active
	 * @return the kaleo definition that was removed
	 */
	public KaleoDefinition removeByC_N_A(
			long companyId, String name, boolean active)
		throws NoSuchDefinitionException;

	/**
	 * Returns the number of kaleo definitions where companyId = &#63; and name = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param active the active
	 * @return the number of matching kaleo definitions
	 */
	public int countByC_N_A(long companyId, String name, boolean active);

	/**
	 * Returns all the kaleo definitions where companyId = &#63; and scope = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param scope the scope
	 * @param active the active
	 * @return the matching kaleo definitions
	 */
	public java.util.List<KaleoDefinition> findByC_S_A(
		long companyId, String scope, boolean active);

	/**
	 * Returns a range of all the kaleo definitions where companyId = &#63; and scope = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KaleoDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param scope the scope
	 * @param active the active
	 * @param start the lower bound of the range of kaleo definitions
	 * @param end the upper bound of the range of kaleo definitions (not inclusive)
	 * @return the range of matching kaleo definitions
	 */
	public java.util.List<KaleoDefinition> findByC_S_A(
		long companyId, String scope, boolean active, int start, int end);

	/**
	 * Returns an ordered range of all the kaleo definitions where companyId = &#63; and scope = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KaleoDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param scope the scope
	 * @param active the active
	 * @param start the lower bound of the range of kaleo definitions
	 * @param end the upper bound of the range of kaleo definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kaleo definitions
	 */
	public java.util.List<KaleoDefinition> findByC_S_A(
		long companyId, String scope, boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
			orderByComparator);

	/**
	 * Returns an ordered range of all the kaleo definitions where companyId = &#63; and scope = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KaleoDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param scope the scope
	 * @param active the active
	 * @param start the lower bound of the range of kaleo definitions
	 * @param end the upper bound of the range of kaleo definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching kaleo definitions
	 */
	public java.util.List<KaleoDefinition> findByC_S_A(
		long companyId, String scope, boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first kaleo definition in the ordered set where companyId = &#63; and scope = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param scope the scope
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kaleo definition
	 * @throws NoSuchDefinitionException if a matching kaleo definition could not be found
	 */
	public KaleoDefinition findByC_S_A_First(
			long companyId, String scope, boolean active,
			com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
				orderByComparator)
		throws NoSuchDefinitionException;

	/**
	 * Returns the first kaleo definition in the ordered set where companyId = &#63; and scope = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param scope the scope
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kaleo definition, or <code>null</code> if a matching kaleo definition could not be found
	 */
	public KaleoDefinition fetchByC_S_A_First(
		long companyId, String scope, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
			orderByComparator);

	/**
	 * Returns the last kaleo definition in the ordered set where companyId = &#63; and scope = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param scope the scope
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kaleo definition
	 * @throws NoSuchDefinitionException if a matching kaleo definition could not be found
	 */
	public KaleoDefinition findByC_S_A_Last(
			long companyId, String scope, boolean active,
			com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
				orderByComparator)
		throws NoSuchDefinitionException;

	/**
	 * Returns the last kaleo definition in the ordered set where companyId = &#63; and scope = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param scope the scope
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kaleo definition, or <code>null</code> if a matching kaleo definition could not be found
	 */
	public KaleoDefinition fetchByC_S_A_Last(
		long companyId, String scope, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
			orderByComparator);

	/**
	 * Returns the kaleo definitions before and after the current kaleo definition in the ordered set where companyId = &#63; and scope = &#63; and active = &#63;.
	 *
	 * @param kaleoDefinitionId the primary key of the current kaleo definition
	 * @param companyId the company ID
	 * @param scope the scope
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kaleo definition
	 * @throws NoSuchDefinitionException if a kaleo definition with the primary key could not be found
	 */
	public KaleoDefinition[] findByC_S_A_PrevAndNext(
			long kaleoDefinitionId, long companyId, String scope,
			boolean active,
			com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
				orderByComparator)
		throws NoSuchDefinitionException;

	/**
	 * Removes all the kaleo definitions where companyId = &#63; and scope = &#63; and active = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param scope the scope
	 * @param active the active
	 */
	public void removeByC_S_A(long companyId, String scope, boolean active);

	/**
	 * Returns the number of kaleo definitions where companyId = &#63; and scope = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param scope the scope
	 * @param active the active
	 * @return the number of matching kaleo definitions
	 */
	public int countByC_S_A(long companyId, String scope, boolean active);

	/**
	 * Caches the kaleo definition in the entity cache if it is enabled.
	 *
	 * @param kaleoDefinition the kaleo definition
	 */
	public void cacheResult(KaleoDefinition kaleoDefinition);

	/**
	 * Caches the kaleo definitions in the entity cache if it is enabled.
	 *
	 * @param kaleoDefinitions the kaleo definitions
	 */
	public void cacheResult(java.util.List<KaleoDefinition> kaleoDefinitions);

	/**
	 * Creates a new kaleo definition with the primary key. Does not add the kaleo definition to the database.
	 *
	 * @param kaleoDefinitionId the primary key for the new kaleo definition
	 * @return the new kaleo definition
	 */
	public KaleoDefinition create(long kaleoDefinitionId);

	/**
	 * Removes the kaleo definition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param kaleoDefinitionId the primary key of the kaleo definition
	 * @return the kaleo definition that was removed
	 * @throws NoSuchDefinitionException if a kaleo definition with the primary key could not be found
	 */
	public KaleoDefinition remove(long kaleoDefinitionId)
		throws NoSuchDefinitionException;

	public KaleoDefinition updateImpl(KaleoDefinition kaleoDefinition);

	/**
	 * Returns the kaleo definition with the primary key or throws a <code>NoSuchDefinitionException</code> if it could not be found.
	 *
	 * @param kaleoDefinitionId the primary key of the kaleo definition
	 * @return the kaleo definition
	 * @throws NoSuchDefinitionException if a kaleo definition with the primary key could not be found
	 */
	public KaleoDefinition findByPrimaryKey(long kaleoDefinitionId)
		throws NoSuchDefinitionException;

	/**
	 * Returns the kaleo definition with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param kaleoDefinitionId the primary key of the kaleo definition
	 * @return the kaleo definition, or <code>null</code> if a kaleo definition with the primary key could not be found
	 */
	public KaleoDefinition fetchByPrimaryKey(long kaleoDefinitionId);

	/**
	 * Returns all the kaleo definitions.
	 *
	 * @return the kaleo definitions
	 */
	public java.util.List<KaleoDefinition> findAll();

	/**
	 * Returns a range of all the kaleo definitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KaleoDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of kaleo definitions
	 * @param end the upper bound of the range of kaleo definitions (not inclusive)
	 * @return the range of kaleo definitions
	 */
	public java.util.List<KaleoDefinition> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the kaleo definitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KaleoDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of kaleo definitions
	 * @param end the upper bound of the range of kaleo definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of kaleo definitions
	 */
	public java.util.List<KaleoDefinition> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
			orderByComparator);

	/**
	 * Returns an ordered range of all the kaleo definitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KaleoDefinitionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of kaleo definitions
	 * @param end the upper bound of the range of kaleo definitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of kaleo definitions
	 */
	public java.util.List<KaleoDefinition> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<KaleoDefinition>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the kaleo definitions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of kaleo definitions.
	 *
	 * @return the number of kaleo definitions
	 */
	public int countAll();

}