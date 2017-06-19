import com.google.gson.Gson;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Kamil on 22.05.2017.
 */

@Path("/mobile")
public class App2 {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String start() {
        return "Witam w platformie mobilnej";
    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public void post(Wiadomosc wiadomosc) {
        System.out.println("Telefon komorkowy dostal powiadomienie");
        System.out.println(wiadomosc.getMsg());
        System.out.println(wiadomosc.getTyp());
    }

}
