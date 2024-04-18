package my.social.app.Messages.Notification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAx1JODDc:APA91bEQzQYKy6gccnXRvBlbe6mAairKtG8zJmeLwx_qlHRWLGZyfF4-3acwIVXdza0k5KmB1GbRT80TC7NhrYeJWQV5ri1XxClih9CPkP3pYvqXYdqWupzh9kxoqyOMAzcq5kSKXzSW"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);


}
