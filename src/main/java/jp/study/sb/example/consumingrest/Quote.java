package jp.study.sb.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Quote {

    private String type;
    private Value value;
    
    public Quote() {
        
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public Value getValue() {
        return this.value;
    }
    
    public void setValue(Value value) {
        this.value = value;
    }
    
    public String toString() {
        return "Quote{" +
    "type'" + type + '\'' + ", value = " + value + '}';
        
    }
    
    
}
