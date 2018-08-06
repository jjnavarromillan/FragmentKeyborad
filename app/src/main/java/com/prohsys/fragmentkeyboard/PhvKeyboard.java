package com.prohsys.fragmentkeyboard;

public class PhvKeyboard {
    private StringBuilder _value;
    private double _dvalue;
    public PhvKeyboard(){
        init();
    }
    public String getValue(){
        return _value.toString();
    }
    public String back(){
        if(_value.length()<=1){
            init();
            return _value.toString();
        }
        else{
            return deleteLast();
        }
    }
    public String addValue(String value){
        if(validateNumber(value)){
            set_value(value);
        }
        return _value.toString();
    }
    private String deleteLast(){
        int len = _value.length();
        _value.delete(len-1,len);
        return _value.toString();
    }
    private void set_value(String value){

        if(_value.toString().equals("0")){
            _value = new StringBuilder(value);
        }
        else{
            _value.append(value);
        }
        _dvalue = Double.parseDouble(_value.toString());
    }

    private boolean validateNumber(String _value){
        try{
            double d = Double.parseDouble(_value);
        }
        catch (NumberFormatException nfe){
            return false;
        }
        return true;
    }
    private void init(){
        _value=new StringBuilder("0");
        _dvalue = Double.parseDouble(_value.toString());
    }
}
