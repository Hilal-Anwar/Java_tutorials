package org.java_tutorials.part_1.util;

public record Element<T extends Number>(T value, int index) {
}