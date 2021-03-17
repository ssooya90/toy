
import {configure, setAddon} from "@storybook/react";
import JSXAddon from 'storybook-addon-jsx';

function loadStories(){


	require('../src/stories/InputStory');
	// 스토리 파일 여기 추가
	require('../src/stories/NewCounterStory');
	require('../src/stories/TextStory');
}

setAddon(JSXAddon)
configure(loadStories, module);