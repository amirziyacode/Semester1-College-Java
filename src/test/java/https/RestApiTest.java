package https;
import Player.Players;
import Player.Status;
import com.google.gson.Gson;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static java.lang.System.*;
import static org.assertj.core.api.Assertions.*;


public class RestApiTest {

     HttpRequest request;
     HttpRequest postRequest;
     HttpResponse<String> response;
    @BeforeEach
    void setUp() throws URISyntaxException, IOException, InterruptedException {
        request = HttpRequest.newBuilder().uri(new URI("http://localhost:3000/Players")).GET().build();
        postRequest =HttpRequest.newBuilder().uri(new URI("http://localhost:3000/Players/add"))
                .header("Content-Type", "application/json").
                POST(HttpRequest.BodyPublishers.noBody()).
                build();
        response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    }

    @Test
    void check_Connected(){
        assertThat(response.statusCode()).isEqualTo(200);
    }

    @Test
    void check_Player(){
        final Gson gson = new Gson();
        String body = response.body();
        final  Players  players = gson.fromJson(body, Players.class);
        assertThat(players.getPlayers()).hasSize(2);
    }

    @Test
    void Post_data() throws IOException, InterruptedException {
        final HttpResponse<String> postResponse = HttpClient.newHttpClient()
                .send(postRequest, HttpResponse.BodyHandlers.ofString());
        final Gson gson = new Gson();
        final String body = postResponse.body();
        final Status status = gson.fromJson(body, Status.class);
        assertThat(status.getStatus()).isEqualTo("200");
    }


    @Test
    void do_async() throws ExecutionException, InterruptedException {
        CompletableFuture<HttpResponse<String>> httpResponseCompletableFuture = HttpClient.newHttpClient().sendAsync(postRequest, HttpResponse.BodyHandlers.ofString());
        CompletableFuture<HttpResponse<String>> httpResponseCompletableFuture1 = HttpClient.newHttpClient().sendAsync(request, HttpResponse.BodyHandlers.ofString());



        out.println(httpResponseCompletableFuture.get()); // POST
        out.println(httpResponseCompletableFuture1.get()); // GET




    }
}
