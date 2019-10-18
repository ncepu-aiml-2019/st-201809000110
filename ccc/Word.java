package ccc;

public class Word {
String[] word;
int times;
Word(){
	
}
Word(String[] word,int times){
	this.word=word;
	this.times=times;
}
public String[] getWord() {
	return word;
}
public void setWord(String[] word) {
	this.word = word;
}
public int getTimes() {
	return times;
}
public void setTimes(int times) {
	this.times = times;
}

}
