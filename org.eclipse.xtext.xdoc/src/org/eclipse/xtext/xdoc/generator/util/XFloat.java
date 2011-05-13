package org.eclipse.xtext.xdoc.generator.util;

public class XFloat{
	private Float val;
	
	public XFloat(int f) {
		this.val = new Float(f);
	}
	public XFloat(String f){
		this.val = Float.valueOf(f);
	}
	public XFloat(Float f){
		this.val = f;
	}
	
	public XFloat operator_minus(XFloat a){
		return new XFloat(val - a.toFloat());
	}
	public XFloat operator_plus(XFloat a){
		return new XFloat(val + a.toFloat());
	}
	public XFloat operator_multiply(XFloat a){
		return new XFloat(val * a.toFloat());
	}
	
	public XFloat operator_divide(XFloat a){
		return new XFloat(val / a.toFloat());
	}
	
	public Float toFloat(){
		return val;
	}
	
	public String toString(){
		return val.toString();
	}

}
