package com.gvt.commons.dto.v1.patient;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class FamilyRelationshipDTO implements Serializable {

	private static final long serialVersionUID = 4176149581419801833L;

	@Size(max = 64)
	private String name;

	@Size(max = 64)
	private String phone;

	@Size(max = 64)
	private String relationship;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phone, relationship);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FamilyRelationshipDTO other = (FamilyRelationshipDTO) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone)
				&& Objects.equals(relationship, other.relationship);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FamilyRelationshipDTO [name=");
		builder.append(name);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", relationship=");
		builder.append(relationship);
		builder.append("]");
		return builder.toString();
	}

}
