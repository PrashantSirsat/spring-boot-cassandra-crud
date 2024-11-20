package com.arya.cassandra.model;

import lombok.Builder;
import lombok.Data;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;

@Data
@Builder
@Table("super_hero")
public class SuperHero implements Serializable {

    @PrimaryKey
    private Long id;

    private String name;

    @Column("super_name")
    private String superName;

    private String profession;

    private int age;

    @Column("super_powers")
    private SuperPowers superPowers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuperName() {
		return superName;
	}

	public void setSuperName(String superName) {
		this.superName = superName;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public SuperPowers getSuperPowers() {
		return superPowers;
	}

	public void setSuperPowers(SuperPowers superPowers) {
		this.superPowers = superPowers;
	}
    
    

}