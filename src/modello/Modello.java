package model;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Modello {

    private Map<String, Object> mappaBean = new HashMap<String, Object>();

    public Modello() {
   
    }

    public Object getBean(String nome) {
        return mappaBean.get(nome);
    }

    public void putBean(String nome, Object object) {
        this.mappaBean.put(nome, object);
    }
}
