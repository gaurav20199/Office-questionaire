package com.example.demo.entity;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.TypeDef;

import antlr.collections.List;

@Entity
//@TypeDef(name = "json", typeClass = JsonStringType.class)
//@TypeDef(name = "json", typeClass = JsonStringType.class)
public class Question {
    
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String question;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;

//	 @Type(type = "json")
//	@Column( columnDefinition = "json" )
	
//	@NonNull
//    @Column(columnDefinition = "TEXT")
//    @Convert(converter= JSONObjectConverter.class)
//    private JSONObject possibilites;
//	private List possibilites;
	
	private int correct;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
		
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	
	public int getCorrect() {
		return correct;
	}
	public void setCorrect(int correct) {
		this.correct = correct;
	}
	
	
	
	
	
}
