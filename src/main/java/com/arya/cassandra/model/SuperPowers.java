package com.arya.cassandra.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.io.Serializable;

@Data
@Builder
@UserDefinedType("super_powers")
public class SuperPowers implements Serializable {

    private String strength;

    private String durability;

    private boolean canFly;

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public String getDurability() {
		return durability;
	}

	public void setDurability(String durability) {
		this.durability = durability;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
    
    
}
