package daos;

import models.DTOInterface;

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

}
