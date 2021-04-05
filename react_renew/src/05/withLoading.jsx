import React from 'react';


// 하이오더 컴포넌트는 인자를 하나만 전달한다는 암묵적 규칙이 있음
// 다중 커링 이용
export default function(loadingMessage = '로딩 중(기본값)'){

  return function withLoading(WrappedComponent) {

    const { displayName, name : componentName} = WrappedComponent;
    const wrappedComponentName = displayName || componentName;

    function WithLoading({isLoading, ...otherProps}) {

      if(isLoading) return loadingMessage;

      return (
        <WrappedComponent {...otherProps} />
      );

    }

    WithLoading.displayName = `withLoading(${wrappedComponentName})`;
    return WithLoading;

  }
}