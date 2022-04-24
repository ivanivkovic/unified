package main.Helpers;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

import org.apache.http.client.HttpClient;

import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpDelete;

import java.net.URI;

import java.net.http.HttpRequest;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.net.URLEncoder;
import java.util.Map;

public class HttpHelper {

    /**
     * Calls GET request on an endpoint, returns its original response
     *
     * @param URL URL of the API
     * @param queryParameters parameters | optional
     * @param headers | optional
     *
     * @return HttpResponse
     */
    public HttpResponse httpGet(String URL, HashMap<String, String> queryParameters, List<String> headers){

        List<String> queryParts = new ArrayList<>();
        for(Map.Entry<String, String> param : queryParameters.entrySet()){
            queryParts.add(param.getKey() + '=' + URLEncoder.encode(param.getValue(), StandardCharsets.UTF_8));
        }

        if(queryParts.size() > 0){
            URL += '?' + String.join("&", queryParts);
        }

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL))
                .GET()
                .hea
                .build();

        for(Map.Entry<String, String> header : headers.entrySet()) {

            request.headers(header.getKey(), header.getValue());
        }

        return httpClient. .execute(request);
    }

    /**
     * Calls POST request on an endpoint, returns its original response
     *
     * @param URL URL of the API
     * @param apiBodyString JSON body
     * @param headers | optional
     * @param queryParameters | optional
     * @param contentType | optional | default APPLICATION_JSON
     *
     * @return HttpResponse
     */
    /*
    static HttpResponse httpPost(String URL, String apiBodyString, Map<String, String> headers = [:], Map<String, String> queryParameters = [:], ContentType contentType = ContentType.APPLICATION_JSON){
        HttpClient httpClient = HttpClients.custom()
                .setConnectionManager(new PoolingHttpClientConnectionManager())
                .build()

        List<String> queryParts = []
        queryParameters.each{String key, String value ->
                queryParts.add(key + '=' + URLEncoder.encode(value, 'UTF-8'))
        }

        if(queryParts.size() > 0){
            URL += '?' + queryParts.join('&')
        }

        HttpPost httpPost = new HttpPost(URL)

        HttpEntity stringEntity = new StringEntity(apiBodyString, contentType)
        httpPost.setEntity(stringEntity)

        headers.each{String key, String value ->
                httpPost.setHeader(key, value)
        }

        return httpClient.execute(httpPost)
    }
    */

    /**
     * Calls PUT request on an endpoint, returns its original response
     *
     * @param URL URL of the API
     * @param apiBodyString JSON body
     * @param headers | optional
     * @param queryParameters | optional
     * @param contentType | optional | default APPLICATION_JSON
     *
     * @return HttpResponse
     */
    /*
    static HttpResponse httpPut(String URL, String apiBodyString, Map<String, String> headers = [:], Map<String, String> queryParameters = [:], ContentType contentType = ContentType.APPLICATION_JSON){
        HttpClient httpClient = HttpClients.custom()
                .setConnectionManager(new PoolingHttpClientConnectionManager())
                .build()

        List<String> queryParts = []
        queryParameters.each{String key, String value ->
                queryParts.add(key + '=' + URLEncoder.encode(value, 'UTF-8'))
        }

        if(queryParts.size() > 0){
            URL += '?' + queryParts.join('&')
        }

        HttpPut httpPut = new HttpPut(URL)

        HttpEntity stringEntity = new StringEntity(apiBodyString, contentType)
        httpPut.setEntity(stringEntity)

        headers.each{String key, String value ->
                httpPut.setHeader(key, value)
        }

        return httpClient.execute(httpPut)
    }

    /**
     * Calls PATCH request on an endpoint, returns its original response
     *
     * @param URL URL of the API
     * @param apiBodyString JSON body
     * @param headers | optional
     * @param queryParameters | optional
     * @param contentType | optional | default APPLICATION_JSON
     *
     * @return HttpResponse
     */
    /*
    static HttpResponse httpPatch(String URL, String apiBodyString, Map<String, String> headers = [:], Map<String, String> queryParameters = [:], ContentType contentType = ContentType.APPLICATION_JSON){
        HttpClient httpClient = HttpClients.custom()
                .setConnectionManager(new PoolingHttpClientConnectionManager())
                .build()

        List<String> queryParts = []
        queryParameters.each{String key, String value ->
                queryParts.add(key + '=' + URLEncoder.encode(value, 'UTF-8'))
        }

        if(queryParts.size() > 0){
            URL += '?' + queryParts.join('&')
        }

        HttpPatch httpPatch = new HttpPatch(URL)

        HttpEntity stringEntity = new StringEntity(apiBodyString, contentType)
        httpPatch.setEntity(stringEntity)

        headers.each{String key, String value ->
                httpPatch.setHeader(key, value)
        }

        return httpClient.execute(httpPatch)
    }

    /**
     * Calls DELETE request on an endpoint, returns its original response
     *
     * @param URL URL of the API
     * @param query parameters | optional
     * @param headers | optional
     *
     * @return HttpResponse
     */
    /*
    static HttpResponse httpDelete(String URL, Map<String, String> queryParameters = [:], Map<String, String> headers = null){
        HttpClient httpClient = HttpClients.custom()
                .setConnectionManager(new PoolingHttpClientConnectionManager())
                .build()

        List<String> queryParts = []
        queryParameters.each{String key, String value ->
                queryParts.add(key + '=' + URLEncoder.encode(value, 'UTF-8'))
        }

        if(queryParts.size() > 0){
            URL += '?' + queryParts.join('&')
        }

        HttpDelete httpDelete = new HttpDelete(URL)
        headers.each{String key, String value ->
                httpDelete.setHeader(key, value)
        }

        return httpClient.execute(httpDelete)
    }*/
}
