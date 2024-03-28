// Database.java
// 20040968D Dinesh Gautam, 20041569D Islam Ahnaf Al
import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Hashtable;
@Singleton
@Path("/mark")
public class Database {
    private Hashtable<String, Integer> table = new Hashtable<String, Integer>();


    @POST
    @Path("{id},{mark}")
    public String addRecord(@PathParam("id") String id, @PathParam("mark") int mark) {
        // Add a record using id as key and mark as value
        if (table.containsKey(id)) {
            return "Record of " + id + " exists";
        } else {
            table.put(id, mark);
            return "Record of " + id + " added";
        }
    }


    @GET
    public String getMark(@QueryParam("id") String id) {
        // Retrieve a record using id as key
        if (table.containsKey(id)) {
            return "Mark of " + id + ": " + table.get(id);
        } else {
            return "Record of " + id + " not exists";
        }
    }


    @PUT
    @Path("{id},{mark}")
    public String updateRecord(@PathParam("id") String id, @PathParam("mark") int mark) {
        // Update a record using id as key and mark as value
        if (table.containsKey(id)) {
            table.put(id, mark);
            return "Record of " + id + " updated";
        } else {
            return "Record of " + id + " not exists";
        }

    }
    @DELETE
    public  String deletRecord(@QueryParam("id") String id){
        if (table.containsKey(id)) {
            table.remove(id);
            return "Removed record of " + id + ": " + table.get(id);
        } else {
            return "Record of " + id + " not exists";
        }
    }
    }



