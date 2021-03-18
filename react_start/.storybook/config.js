
import {configure} from "@storybook/react";

function loadStories(){

	require('../src/stories/InputStory');
	// 스토리 파일 여기 추가
}

configure(loadStories, module);