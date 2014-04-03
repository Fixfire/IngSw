package es05;

public abstract class Shape { //classe astratta -> alcune parti di implementazione le facciamo ora altre quando sono sicuro di una particolare formula specifica per un oggetto concreto
	
	public abstract double getArea();//non posso fare un'implementazione per getArea perchè è astratto -> non c'è una formula universale per tutte le figure
	
	public abstract double getPerimeter();
	
	public abstract List<Point> getSequenceOfPointsToDraw();
	
	public void draw(TwoDimensionalCanvas canvas){
		List<Point> points = getSequenceOfPointsToDraw();
		for (int i = 0; i < points.size() - 1; i++){
			canvas.drawLine(points.get(i), points.get(i+1));
		}
	}
}
