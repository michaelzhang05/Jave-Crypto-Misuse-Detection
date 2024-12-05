package io.ionic.links;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import m5.h;
import m5.k;
import org.apache.cordova.a;
import org.apache.cordova.b;
import org.apache.cordova.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class IonicDeeplink extends b {

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f7011c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f7012d = new ArrayList();

    private JSONObject a(Bundle bundle) {
        if (bundle == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                try {
                    if (jSONObject.getClass().getDeclaredMethod("wrap", String.class) != null) {
                        jSONObject.put(str, JSONObject.wrap(bundle.get(str)));
                    }
                } catch (NoSuchMethodException unused) {
                    jSONObject.put(str, b(bundle.get(str)));
                }
            } catch (JSONException unused2) {
            }
        }
        return jSONObject;
    }

    private Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(null)) {
            return obj;
        }
        if (obj instanceof Collection) {
            return new JSONArray((Collection) obj);
        }
        if (obj.getClass().isArray()) {
            return new JSONArray(obj);
        }
        if (obj instanceof Map) {
            return new JSONObject((Map) obj);
        }
        if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        }
        return obj;
    }

    private void c(JSONArray jSONArray, a aVar) {
        this.f7012d.add(aVar);
        e();
    }

    private void d(String str, a aVar) {
        try {
            this.f8371cordova.getActivity().getApplicationContext().getPackageManager().getPackageInfo(str, 1);
            aVar.success();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        aVar.error("");
    }

    private void e() {
        if (this.f7012d.size() == 0 || this.f7011c == null) {
            return;
        }
        Iterator it = this.f7012d.iterator();
        while (it.hasNext()) {
            m(this.f7011c, (a) it.next());
        }
        this.f7011c = null;
    }

    private void f(JSONArray jSONArray, a aVar) {
        String string = Settings.Secure.getString(this.f8371cordova.getActivity().getContentResolver(), "android_id");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uuid", string);
            jSONObject.put("platform", h());
            jSONObject.put("tz", j());
            jSONObject.put("tz_offset", k());
            jSONObject.put("os_version", g());
            jSONObject.put("sdk_version", i());
        } catch (JSONException unused) {
        }
        aVar.sendPluginResult(new f(f.a.OK, jSONObject));
    }

    private String g() {
        return Build.VERSION.RELEASE;
    }

    private String h() {
        return l() ? "amazon-fireos" : "android";
    }

    private String i() {
        return Build.VERSION.SDK;
    }

    private String j() {
        return TimeZone.getDefault().getID();
    }

    private int k() {
        return (TimeZone.getDefault().getOffset(new Date().getTime()) / 1000) / 60;
    }

    private boolean l() {
        return Build.MANUFACTURER.equals("Amazon");
    }

    private void m(JSONObject jSONObject, a aVar) {
        f fVar = new f(f.a.OK, jSONObject);
        fVar.h(true);
        aVar.sendPluginResult(fVar);
    }

    @Override // org.apache.cordova.b
    public boolean execute(String str, JSONArray jSONArray, a aVar) {
        if (str.equals("onDeepLink")) {
            c(jSONArray, aVar);
            return true;
        }
        if (str.equals("canOpenApp")) {
            d(jSONArray.getString(0), aVar);
            return true;
        }
        if (!str.equals("getHardwareInfo")) {
            return true;
        }
        f(jSONArray, aVar);
        return true;
    }

    public void handleIntent(Intent intent) {
        String dataString = intent.getDataString();
        String action = intent.getAction();
        Uri data = intent.getData();
        JSONObject a6 = a(intent.getExtras());
        Log.d("IonicDeeplinkPlugin", "Got a new intent: " + dataString + " " + intent.getScheme() + " " + action + " " + data);
        if (!"android.intent.action.VIEW".equals(action) || data == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            this.f7011c = jSONObject;
            jSONObject.put("url", data.toString());
            this.f7011c.put("path", data.getPath());
            this.f7011c.put("queryString", data.getQuery());
            this.f7011c.put("scheme", data.getScheme());
            this.f7011c.put("host", data.getHost());
            this.f7011c.put("fragment", data.getFragment());
            this.f7011c.put("extra", a6);
            e();
        } catch (JSONException e6) {
            Log.e("IonicDeeplinkPlugin", "Unable to process URL scheme deeplink", e6);
        }
    }

    @Override // org.apache.cordova.b
    public void initialize(h hVar, k kVar) {
        super.initialize(hVar, kVar);
        Log.d("IonicDeeplinkPlugin", "IonicDeepLinkPlugin: firing up...");
        handleIntent(hVar.getActivity().getIntent());
    }

    @Override // org.apache.cordova.b
    public void onNewIntent(Intent intent) {
        handleIntent(intent);
    }
}
