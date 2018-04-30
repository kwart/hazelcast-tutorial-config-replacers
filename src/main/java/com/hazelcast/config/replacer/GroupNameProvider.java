package com.hazelcast.config.replacer;

/**
 * Sample class used as a value provider for TOSTRING replacer.
 */
public class GroupNameProvider {

    public String toString() {
        return "TestGroup";
    }
}
