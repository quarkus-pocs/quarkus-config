package org.acme;

import io.smallrye.config.ConfigMapping;

import java.util.Set;

@ConfigMapping(prefix = IcgAnonymizerConfiguration.PREFIX)
public interface IcgAnonymizerConfiguration {

    String PREFIX = "cg.config.anonymizer.properties";

    /**
     * Sensitive keys which needs to be anonymized
     */
    Set<String> sensitiveKeys();


}