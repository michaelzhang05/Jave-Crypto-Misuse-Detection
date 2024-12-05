package cordova.plugins.screenorientation;

import android.util.Log;
import androidx.appcompat.app.c;
import org.apache.cordova.a;
import org.apache.cordova.b;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class CDVOrientation extends b {
    private boolean a(JSONArray jSONArray, a aVar) {
        int i6;
        jSONArray.optString(0);
        String optString = jSONArray.optString(1);
        Log.d("YoikScreenOrientation", "Requested ScreenOrientation: " + optString);
        c activity = this.f8371cordova.getActivity();
        if (!optString.equals("any")) {
            if (optString.equals("landscape-primary")) {
                activity.setRequestedOrientation(0);
            } else if (optString.equals("portrait-primary")) {
                activity.setRequestedOrientation(1);
            } else if (optString.equals("landscape")) {
                i6 = 6;
            } else if (optString.equals("portrait")) {
                i6 = 7;
            } else if (optString.equals("landscape-secondary")) {
                i6 = 8;
            } else if (optString.equals("portrait-secondary")) {
                i6 = 9;
            }
            aVar.success();
            return true;
        }
        i6 = -1;
        activity.setRequestedOrientation(i6);
        aVar.success();
        return true;
    }

    @Override // org.apache.cordova.b
    public boolean execute(String str, JSONArray jSONArray, a aVar) {
        Log.d("YoikScreenOrientation", "execute action: " + str);
        if (str.equals("screenOrientation")) {
            return a(jSONArray, aVar);
        }
        aVar.error("action not recognised");
        return false;
    }
}
