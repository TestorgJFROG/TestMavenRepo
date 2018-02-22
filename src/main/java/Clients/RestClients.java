package Clients;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RestClients {

    HttpHeaders headers; // should be modified to accesible and updatable property
    RestTemplate restTemplate;

    public RestClients(){
        ClientHttpRequestFactory requestFactory = getClientHttpRequestFactory();
        restTemplate = new RestTemplate(requestFactory);
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        // Note: here we are making this converter to process any kind of RestClients,
        // not only application/*json, which is the default behaviour
        converter.setSupportedMediaTypes(Arrays.asList(MediaType.ALL));
        messageConverters.add(converter);
        restTemplate.setMessageConverters(messageConverters);
        headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
    }



    public <T, I> T getPostAsEntity(String url, I input, Class<T> type) {
        try {
            HttpEntity request = new HttpEntity(input, headers);
            T response = restTemplate.postForObject(url, request, type);
            return response;
        } catch (HttpClientErrorException e) {
            Assert.fail(e.getResponseBodyAsString());
            return null;
        }
    }

    public <T, I> T getGetAsEntity(String url, Class<T> type) {
        try {
            T response = restTemplate.getForObject(url,  type);
            return response;
        } catch (HttpClientErrorException e) {
            Assert.fail(e.getResponseBodyAsString());
            return null;
        }
    }

    public String getGetAsString(String url) {
        try {
            return  restTemplate.getForObject(url,  String.class);

        } catch (HttpClientErrorException e) {
            Assert.fail(e.getResponseBodyAsString());
            return null;
        }
    }



    private ClientHttpRequestFactory getClientHttpRequestFactory() {
        int timeout = 5000;
        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory
                = new HttpComponentsClientHttpRequestFactory();
        clientHttpRequestFactory.setConnectTimeout(timeout);
        return clientHttpRequestFactory;
    }
}
