package distributedRedditAnalyser;

import moa.classifiers.Classifier;

public class ClassifierInstance {
	
	private final Classifier classifier;
	private double scms;
	private double swms;

	public ClassifierInstance(Classifier classifier){
		this.classifier = classifier;
	}
	
	public Classifier getClassifier(){
		return classifier;
	}
	
	public double getScms(){
		return scms;
	}
	
	public double getSwms(){
		return swms;
	}
	
	public void setScms(double scms){
		this.scms = scms;
	}
	
	public void setSwms(double swms){
		this.swms = swms;
	}
	
	public ClassifierInstance clone(){
		ClassifierInstance clone = new ClassifierInstance(this.classifier.copy());
		clone.setScms(scms);
		clone.setSwms(swms);
		return clone;
	}
}