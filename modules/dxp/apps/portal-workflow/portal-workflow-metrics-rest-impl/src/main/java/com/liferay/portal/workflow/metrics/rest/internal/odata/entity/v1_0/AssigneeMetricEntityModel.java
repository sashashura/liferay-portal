/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.liferay.portal.workflow.metrics.rest.internal.odata.entity.v1_0;

import com.liferay.petra.string.CharPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.odata.entity.IntegerEntityField;

import java.util.Map;

/**
 * @author Rafael Praxedes
 */
public class AssigneeMetricEntityModel implements EntityModel {

	public AssigneeMetricEntityModel() {
		_entityFieldsMap = EntityModel.toEntityFieldsMap(
			new IntegerEntityField(
				"durationTaskAvg", locale -> "durationTaskAvg"),
			new IntegerEntityField(
				"onTimeTaskCount", locale -> "onTimeTaskCount"),
			new IntegerEntityField(
				"overdueTaskCount", locale -> "overdueTaskCount"),
			new IntegerEntityField("taskCount", locale -> "taskCount"));
	}

	@Override
	public Map<String, EntityField> getEntityFieldsMap() {
		return _entityFieldsMap;
	}

	@Override
	public String getName() {
		return StringUtil.replace(
			AssigneeMetricEntityModel.class.getName(), CharPool.PERIOD,
			CharPool.UNDERLINE);
	}

	private final Map<String, EntityField> _entityFieldsMap;

}