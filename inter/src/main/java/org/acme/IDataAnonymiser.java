package org.acme;

import io.quarkus.vertx.http.runtime.QuarkusHttpHeaders;

import java.util.Map;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public interface IDataAnonymiser {

    String anonymize(final QuarkusHttpHeaders httpHeaders);
}
