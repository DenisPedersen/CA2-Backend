package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dataFetcher.MealFetcher;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;

@Path("meal")
public class MealResource {


    @Context
    private UriInfo context;

    @Context
    SecurityContext securityContext;

    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("random")
    public Response getRandom() {
        MealFetcher mealFetcher = new MealFetcher();
        try {
            return Response.ok().entity(gson.toJson(mealFetcher.combinedMeal())).build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
