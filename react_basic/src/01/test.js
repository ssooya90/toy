function Shape (x,y){
	this.name = 'Shape';
	this.move(x,y);
}

Shape.create = function (x,y){
	return new Shape(x,y);
}

Shape.prototype.move = function (x,y){
	this.x = x;
	this.y = y;
}