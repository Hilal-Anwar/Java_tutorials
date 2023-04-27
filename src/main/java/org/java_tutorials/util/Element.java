package org.java_tutorials.util;

public record Element<T extends Number>(T value, int index) {
}