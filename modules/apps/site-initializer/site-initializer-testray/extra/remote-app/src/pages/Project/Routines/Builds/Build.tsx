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

import {useParams} from 'react-router-dom';

import Avatar from '../../../../components/Avatar';
import AssignToMe from '../../../../components/Avatar/AssigneToMe';
import Code from '../../../../components/Code';
import Container from '../../../../components/Layout/Container';
import ListViewRest from '../../../../components/ListView';
import StatusBadge from '../../../../components/StatusBadge';
import useAssignCaseResult from '../../../../hooks/useAssignCaseResult';
import useMutate from '../../../../hooks/useMutate';
import i18n from '../../../../i18n';
import {filters} from '../../../../schema/filter';
import {
	TestrayCaseResult,
	caseResultResource,
	getCaseResultTransformData,
} from '../../../../services/rest';
import {getStatusLabel} from '../../../../util/constants';
import {searchUtil} from '../../../../util/search';
import useBuildTestActions from './useBuildTestActions';

const Build = () => {
	const {buildId} = useParams();
	const {onAssignToMeFetch} = useAssignCaseResult();
	const {updateItemFromList} = useMutate();
	const {actions, form} = useBuildTestActions();

	return (
		<Container className="mt-4">
			<ListViewRest
				managementToolbarProps={{
					filterFields: filters.build.results as any,
					title: i18n.translate('tests'),
				}}
				resource={caseResultResource}
				tableProps={{
					actions,
					columns: [
						{
							clickable: true,
							key: 'priority',
							render: (
								_: any,
								{case: testrayCase}: TestrayCaseResult
							) => testrayCase?.priority,
							value: i18n.translate('priority'),
						},
						{
							key: 'component',
							render: (
								_: any,
								{case: testrayCase}: TestrayCaseResult
							) => testrayCase?.component?.name,
							value: i18n.translate('component'),
						},
						{
							clickable: true,
							key: 'name',
							render: (
								_: any,
								{case: testrayCase}: TestrayCaseResult
							) => testrayCase?.name,
							value: i18n.translate('case'),
						},
						{
							key: 'run',
							render: () => '01',
							value: i18n.translate('run'),
						},
						{
							key: 'user',
							render: (
								_: any,
								caseResult: TestrayCaseResult,
								mutate
							) => {
								if (caseResult?.user) {
									return (
										<Avatar
											className="text-capitalize"
											displayName
											name={`${caseResult.user.emailAddress
												.split('@')[0]
												.replace('.', ' ')}`}
											size="sm"
										/>
									);
								}

								return (
									<AssignToMe
										onClick={() =>
											onAssignToMeFetch(caseResult)
												.then(() => {
													updateItemFromList(
														mutate,
														0,
														{},
														{
															revalidate: true,
														}
													);
												})
												.then(form.onSuccess)
												.catch(form.onError)
										}
									/>
								);
							},
							value: i18n.translate('assignee'),
						},
						{
							key: 'dueStatus',
							render: (dueStatus: number) => (
								<StatusBadge type={getStatusLabel(dueStatus)}>
									{getStatusLabel(dueStatus)}
								</StatusBadge>
							),
							value: i18n.translate('status'),
						},
						{
							key: 'issues',
							value: i18n.translate('issues'),
						},
						{
							key: 'errors',
							render: (errors: string) =>
								errors && <Code>{errors}</Code>,
							value: i18n.translate('errors'),
						},
					],
					navigateTo: ({id}) => `case-result/${id}`,
				}}
				transformData={getCaseResultTransformData}
				variables={{
					filter: searchUtil.eq('buildId', buildId as string),
				}}
			/>
		</Container>
	);
};

export default Build;
