package com.github.magrossi.log4j2.elasticsearch;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpResponseException;
import org.apache.http.entity.ContentType;
import org.apache.http.nio.entity.NStringEntity;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import java.io.IOException;
import java.util.Collections;

public class ElasticBulkSender implements BulkSender {

    private static final String ES_BULK_METHOD = "POST";

    private static final String ES_BULK_ENDPOINT = "_bulk";

    private final RestClient restClient;

    ElasticBulkSender(RestClient restClient) {
        this.restClient = restClient;
    }

    @Override
    public void send(String body) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
