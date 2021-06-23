package at.schuster;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/api/uptime")
public class TestUptimeController {

    @GET
    @Path("/{uptime}")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateUptime (@PathParam("uptime") double uptime){
        double minutesOfMonth = 60 * 24 * 30;
        double definedUpTimeinPercent = uptime / 100;
        double uptimeInMinutes = minutesOfMonth * definedUpTimeinPercent;
        return String.format("%.2f", uptimeInMinutes);
    }


    //default endpath without parameter
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateUptime() {
        return this.calculateUptime(99.95);
    }
}
