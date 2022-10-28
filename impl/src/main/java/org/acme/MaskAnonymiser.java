package org.acme;

import io.quarkus.vertx.http.runtime.QuarkusHttpHeaders;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Implementation of IDataAnonymiser which will mask the sensitive data.
 */
//@RequiredArgsConstructor
    @ApplicationScoped
public class MaskAnonymiser implements IDataAnonymiser {

    @Inject
    private IcgAnonymizerConfiguration cgAnonymizerConfiguration;

    @Override
    public String anonymize(final QuarkusHttpHeaders httpHeaders) {
        return "anon";
    }
}