package naveen.com.broadcastreci;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

/**
 * Created by Naveen Varma on 2/25/2017.
 */

public class MyBroadcastRe extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Please wake up your time is Over !!!!", Toast.LENGTH_SHORT).show();

        //Vibrate
        Vibrator vibrator = (Vibrator)context.getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(2000);

    }
}
