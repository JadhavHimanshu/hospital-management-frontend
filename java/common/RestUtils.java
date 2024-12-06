package common;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.dnyanyog.dto.UserRequest;
import org.dnyanyog.dto.UserResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RestUtils {
	private static ObjectMapper objectMapper = new ObjectMapper();

	public static <T> T postRequest(String url, Object objectBody, Class<?> responseClassType)
			throws IOException, InterruptedException {
		String body = objectMapper.writeValueAsString(objectBody);
		System.out.println(body);
		HttpClient client = HttpClient.newHttpClient();

		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).header("Content-Type", "application/json")
				.POST(HttpRequest.BodyPublishers.ofString(body)).build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		T responseObject = (T) objectMapper.readValue(response.body(), responseClassType);
		return responseObject;
	}

	public static <T> T getRequest(String url, Class<T> responseType) throws IOException, InterruptedException {
		System.out.println("Request URL: " + url);
		System.out.println("Response Type: " + responseType.getName());

		HttpResponse<String> response = HttpClient.newHttpClient()
				.send(HttpRequest.newBuilder().uri(URI.create(url)).build(), HttpResponse.BodyHandlers.ofString());
		System.out.println("Response Body: " + response.body());
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(response.body(), responseType);
	}

	public static <T> T PostRequest(String url, Object objectBody, Class<?> responseClassType)
			throws IOException, InterruptedException {
		String body = objectMapper.writeValueAsString(objectBody);
         		System.out.println(body);
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).header("Content-Type", "application/json")
				.POST(HttpRequest.BodyPublishers.ofString(body)).build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		T responseObject = (T) objectMapper.readValue(response.body(), responseClassType);
		return responseObject;
	}

	public static <T> T deleteRequest(String url, Class<T> responseClassType)
	        throws IOException, InterruptedException {
      HttpClient client = HttpClient.newHttpClient();
	    HttpRequest request = HttpRequest.newBuilder()
	            .uri(URI.create(url))
	            .DELETE()
	            .build();
      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

	    System.out.println("Response Body: " + response.body());

	    return objectMapper.readValue(response.body(), responseClassType);
	}
    }

	

