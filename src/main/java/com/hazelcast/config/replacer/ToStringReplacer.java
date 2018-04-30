package com.hazelcast.config.replacer;

import com.hazelcast.config.replacer.spi.ConfigReplacer;

/**
 * Sample implementation of ConfigReplacer.
 */
public class ToStringReplacer implements ConfigReplacer {

    @Override
    public void init(java.util.Properties properties) {
        // we don't need init properties
    }

    @Override
    public String getPrefix() {
        return "TOSTRING";
    }

    @Override
    public String getReplacement(String value) {
        try {
            return Class.forName(value).newInstance().toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Return null when we are not able to find proper replacement.
        return null;
    }
}
