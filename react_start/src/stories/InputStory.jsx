
import React from 'react';
import {storiesOf} from "@storybook/react";

import Input from '../03/Input';

storiesOf('Input',module).add('기본 설정', () => <input name="name" />);
storiesOf('Input',module).add('label 예제', () => <input name="name1" label="이름"/>);
