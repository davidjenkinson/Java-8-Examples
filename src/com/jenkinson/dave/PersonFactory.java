package com.jenkinson.dave;

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}