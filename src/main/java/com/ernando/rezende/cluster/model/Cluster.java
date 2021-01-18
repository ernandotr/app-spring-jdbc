package com.ernando.rezende.cluster.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cluster {
	
	private String name;
    private int id;
    
    @Override
    public String toString() {
        return "Cluster{" + "name=" + name + ", id=" + id + '}';
    }
}
