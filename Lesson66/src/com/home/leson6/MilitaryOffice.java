package com.home.leson6;

public class MilitaryOffice {
    private PersonRegistry PersonRegistry;

    public MilitaryOffice(PersonRegistry PersonRegistry) {
        this.PersonRegistry = PersonRegistry;
    }

    public com.home.leson6.PersonRegistry getPersonRegistry() {
        return PersonRegistry;
    }

    public void setPersonRegistry(com.home.leson6.PersonRegistry personRegistry) {
        PersonRegistry = personRegistry;
    }
}
