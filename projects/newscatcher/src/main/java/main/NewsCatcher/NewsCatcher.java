package main.NewsCatcher;

import main.Helpers.HttpHelper;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.net.URLEncoder;
import java.util.Map;

public class NewsCatcher {

    private static final String ENDPOINT = "https://newscatcher.p.rapidapi.com/v1/latest_headlines";

    public static void main(String[] args) {

        System.out.println("Hello world!");

        HashMap<String, String> queryParameters = new HashMap<String, String>();
        queryParameters.put("topic", "Joe Rogan");

        List<String> headers = new ArrayList<>();

        headers.add("x-rapidapi-key");
        headers.add("556609e07emsh42b7bba41bc0146p11420cjsnfd72f6caa630");
        headers.add("x-rapidapi-host");
        headers.add("newscatcher.p.rapidapi.com");

        HttpHelper httpHelper = new HttpHelper();
        HttpResponse response = httpHelper.httpGet(ENDPOINT, queryParameters, headers);
    }
}
