
import React from 'react';
import {storiesOf} from "@storybook/react";
import {action} from "@storybook/addon-actions";

import Input from '../03/Input';

storiesOf('Input',module)
	.add('기본 설정', () => <Input name="name1" />)
	.add('label 예제', () => <Input name="name1" label="이름"/>)
	.add('onChange 예제', () => <Input name="name1" onChange={action('onChange 이벤트 발생')} />);

