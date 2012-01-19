/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.winenergy.bookmark.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the bookmark local service. This utility wraps {@link com.winenergy.bookmark.service.impl.BookmarkLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Fuping Ma
 * @see BookmarkLocalService
 * @see com.winenergy.bookmark.service.base.BookmarkLocalServiceBaseImpl
 * @see com.winenergy.bookmark.service.impl.BookmarkLocalServiceImpl
 * @generated
 */
public class BookmarkLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.winenergy.bookmark.service.impl.BookmarkLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the bookmark to the database. Also notifies the appropriate model listeners.
	*
	* @param bookmark the bookmark
	* @return the bookmark that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.winenergy.bookmark.model.Bookmark addBookmark(
		com.winenergy.bookmark.model.Bookmark bookmark)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addBookmark(bookmark);
	}

	/**
	* Creates a new bookmark with the primary key. Does not add the bookmark to the database.
	*
	* @param bookmarkId the primary key for the new bookmark
	* @return the new bookmark
	*/
	public static com.winenergy.bookmark.model.Bookmark createBookmark(
		long bookmarkId) {
		return getService().createBookmark(bookmarkId);
	}

	/**
	* Deletes the bookmark with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookmarkId the primary key of the bookmark
	* @throws PortalException if a bookmark with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteBookmark(long bookmarkId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteBookmark(bookmarkId);
	}

	/**
	* Deletes the bookmark from the database. Also notifies the appropriate model listeners.
	*
	* @param bookmark the bookmark
	* @throws PortalException
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteBookmark(
		com.winenergy.bookmark.model.Bookmark bookmark)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteBookmark(bookmark);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.winenergy.bookmark.model.Bookmark fetchBookmark(
		long bookmarkId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchBookmark(bookmarkId);
	}

	/**
	* Returns the bookmark with the primary key.
	*
	* @param bookmarkId the primary key of the bookmark
	* @return the bookmark
	* @throws PortalException if a bookmark with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.winenergy.bookmark.model.Bookmark getBookmark(
		long bookmarkId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getBookmark(bookmarkId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the bookmarks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of bookmarks
	* @param end the upper bound of the range of bookmarks (not inclusive)
	* @return the range of bookmarks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.winenergy.bookmark.model.Bookmark> getBookmarks(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBookmarks(start, end);
	}

	/**
	* Returns the number of bookmarks.
	*
	* @return the number of bookmarks
	* @throws SystemException if a system exception occurred
	*/
	public static int getBookmarksCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBookmarksCount();
	}

	/**
	* Updates the bookmark in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bookmark the bookmark
	* @return the bookmark that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.winenergy.bookmark.model.Bookmark updateBookmark(
		com.winenergy.bookmark.model.Bookmark bookmark)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateBookmark(bookmark);
	}

	/**
	* Updates the bookmark in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bookmark the bookmark
	* @param merge whether to merge the bookmark with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the bookmark that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.winenergy.bookmark.model.Bookmark updateBookmark(
		com.winenergy.bookmark.model.Bookmark bookmark, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateBookmark(bookmark, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	/**
	* retrieve all the bookmarks from the database
	*
	* @return List<Bookmark>
	*/
	public static java.util.List<com.winenergy.bookmark.model.Bookmark> getAllBookmarks()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllBookmarks();
	}

	/**
	* retrieve the bookmark by bookmark name from the database
	*
	* @return
	*/
	public static java.util.List<com.winenergy.bookmark.model.Bookmark> getBookmarkByName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBookmarkByName(name);
	}

	public static void clearService() {
		_service = null;
	}

	public static BookmarkLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					BookmarkLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					BookmarkLocalService.class.getName(), portletClassLoader);

			_service = new BookmarkLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(BookmarkLocalServiceUtil.class,
				"_service");
			MethodCache.remove(BookmarkLocalService.class);
		}

		return _service;
	}

	public void setService(BookmarkLocalService service) {
		MethodCache.remove(BookmarkLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(BookmarkLocalServiceUtil.class,
			"_service");
		MethodCache.remove(BookmarkLocalService.class);
	}

	private static BookmarkLocalService _service;
}