package ClientUtils;
import StaticTags.API_Tags;
import ClientNewBasic.HttpInvoker;

public class Get_Media_Likers_Client
{
    private HttpInvoker hi;
    private String req_url;

    public Get_Media_Likers_Client(String server_ip,
                                     String server_port,
                                     String user_name,
                                     String user_password,
                                     String target_user,
                                     String media_name)
    {
        req_url =   API_Tags.HTTP + server_ip + ":" + server_port +
                API_Tags.GET_MEDIA_LIKERS +
                API_Tags.USR_NAME + user_name + "&" +
                API_Tags.USR_PWD + user_password + "&" +
                API_Tags.TGT_USR + target_user + "&" +
                API_Tags.MED_NAME + media_name;
        hi = new HttpInvoker(req_url);
    }

    public String perform()
    {
        return hi.getRespond();
    }
}
