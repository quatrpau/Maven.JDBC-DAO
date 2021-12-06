package daos;

import models.DTOInterface;

import java.util.Objects;

public class VeggieDTO implements DTOInterface {
    private int id;
    private String name;
    private Type type;
    private Status status;
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public VeggieDTO(){}
    public VeggieDTO(String name, Type type, Status status, String lastName) {
        this.name = name;
        this.type = type;
        this.status = status;
        this.lastName = lastName;
    }

    public VeggieDTO(Integer id, String name, Type type, Status status, String lastName) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VeggieDTO veggieDTO = (VeggieDTO) o;
        return getId() == veggieDTO.getId() && Objects.equals(getName(), veggieDTO.getName()) && getType() == veggieDTO.getType() && getStatus() == veggieDTO.getStatus() && Objects.equals(getLastName(), veggieDTO.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getType(), getStatus(), getLastName());
    }
}
