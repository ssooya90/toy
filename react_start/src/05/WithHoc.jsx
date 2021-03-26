
import React from "react";

export default function withHoc(WrappedComponent){

	return class WithHoc extends React.Component {
		render(){
			return <WrappedComponent {...this.props}/>;
		}
	}

}