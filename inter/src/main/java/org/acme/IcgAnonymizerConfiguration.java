package org.acme;

import io.smallrye.config.ConfigMapping;

import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

@ConfigMapping(prefix = IcgAnonymizerConfiguration.PREFIX)
public interface IcgAnonymizerConfiguration {

    String PREFIX = "cg.config.anonymizer.properties";

    /**
     * Sensitive keys which needs to be anonymized
     */
    Set<String> sensitiveKeys();


}