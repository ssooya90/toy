class Shape {

	static create(x,y) { return new Shape(x,y);}

	name = 'Shape';
	constructor(x,y) {

		this.move(x,y);
	}

	move(x,y){
		this.x = x;
		this.y = y;
	}

	area(){
		return 0;
	}
}

var s = new Shape(0,1);
s.area();

console.log(s.area())

