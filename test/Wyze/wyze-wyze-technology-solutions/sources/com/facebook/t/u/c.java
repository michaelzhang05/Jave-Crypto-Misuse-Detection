package com.facebook.t.u;

import android.content.Context;
import com.facebook.internal.r;
import com.facebook.internal.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppEventsLoggerUtility.java */
/* loaded from: classes.dex */
public class c {
    private static final Map<b, String> a = new a();

    /* compiled from: AppEventsLoggerUtility.java */
    /* loaded from: classes.dex */
    static class a extends HashMap<b, String> {
        a() {
            put(b.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL");
            put(b.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS");
        }
    }

    /* compiled from: AppEventsLoggerUtility.java */
    /* loaded from: classes.dex */
    public enum b {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    public static JSONObject a(b bVar, com.facebook.internal.a aVar, String str, boolean z, Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", a.get(bVar));
        String f2 = com.facebook.t.g.f();
        if (f2 != null) {
            jSONObject.put("app_user_id", f2);
        }
        x.n0(jSONObject, aVar, str, z);
        try {
            x.o0(jSONObject, context);
        } catch (Exception e2) {
            r.h(com.facebook.l.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e2.toString());
        }
        JSONObject w = x.w();
        if (w != null) {
            Iterator<String> keys = w.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, w.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
