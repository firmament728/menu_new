package casualc.net.menu.retrofit;

import com.google.gson.JsonObject;
import casualc.net.menu.gson.menu;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface API {

    @POST("#link#")
    Call<menu[]> GetMenu(@Body JsonObject body);
}
