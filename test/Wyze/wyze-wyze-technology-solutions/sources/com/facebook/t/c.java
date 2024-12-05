package com.facebook.t;

import android.os.Build;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.r;
import com.facebook.internal.x;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppEvent.java */
/* loaded from: classes.dex */
public class c implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    private static final HashSet<String> f9435f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final JSONObject f9436g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f9437h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f9438i;

    /* renamed from: j, reason: collision with root package name */
    private final String f9439j;

    /* renamed from: k, reason: collision with root package name */
    private final String f9440k;

    /* compiled from: AppEvent.java */
    /* loaded from: classes.dex */
    static class b implements Serializable {

        /* renamed from: f, reason: collision with root package name */
        private final String f9441f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f9442g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f9443h;

        private Object readResolve() throws JSONException {
            return new c(this.f9441f, this.f9442g, this.f9443h, null);
        }
    }

    /* compiled from: AppEvent.java */
    /* renamed from: com.facebook.t.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0140c implements Serializable {

        /* renamed from: f, reason: collision with root package name */
        private final String f9444f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f9445g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f9446h;

        /* renamed from: i, reason: collision with root package name */
        private final String f9447i;

        private Object readResolve() throws JSONException {
            return new c(this.f9444f, this.f9445g, this.f9446h, this.f9447i);
        }

        private C0140c(String str, boolean z, boolean z2, String str2) {
            this.f9444f = str;
            this.f9445g = z;
            this.f9446h = z2;
            this.f9447i = str2;
        }
    }

    private String a() {
        if (Build.VERSION.SDK_INT > 19) {
            return g(this.f9436g.toString());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = this.f9436g.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(str);
            sb.append(" = ");
            sb.append(this.f9436g.optString(str));
            sb.append('\n');
        }
        return g(sb.toString());
    }

    private JSONObject d(String str, String str2, Double d2, Bundle bundle, UUID uuid) throws JSONException {
        h(str2);
        JSONObject jSONObject = new JSONObject();
        String e2 = com.facebook.t.w.a.e(str2);
        jSONObject.put("_eventName", e2);
        jSONObject.put("_eventName_md5", g(e2));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map<String, String> i2 = i(bundle);
            for (String str3 : i2.keySet()) {
                jSONObject.put(str3, i2.get(str3));
            }
        }
        if (d2 != null) {
            jSONObject.put("_valueToSum", d2.doubleValue());
        }
        if (this.f9438i) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f9437h) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            r.h(com.facebook.l.APP_EVENTS, "AppEvents", "Created app event '%s'", jSONObject.toString());
        }
        return jSONObject;
    }

    private static String g(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes("UTF-8");
            messageDigest.update(bytes, 0, bytes.length);
            return com.facebook.t.u.b.c(messageDigest.digest());
        } catch (UnsupportedEncodingException e2) {
            x.U("Failed to generate checksum: ", e2);
            return "1";
        } catch (NoSuchAlgorithmException e3) {
            x.U("Failed to generate checksum: ", e3);
            return "0";
        }
    }

    private static void h(String str) throws FacebookException {
        boolean contains;
        if (str != null && str.length() != 0 && str.length() <= 40) {
            HashSet<String> hashSet = f9435f;
            synchronized (hashSet) {
                contains = hashSet.contains(str);
            }
            if (contains) {
                return;
            }
            if (str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
                synchronized (hashSet) {
                    hashSet.add(str);
                }
                return;
            }
            throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", str));
        }
        if (str == null) {
            str = "<None Provided>";
        }
        throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", str, 40));
    }

    private Map<String, String> i(Bundle bundle) throws FacebookException {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            h(str);
            Object obj = bundle.get(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", obj, str));
            }
            hashMap.put(str, obj.toString());
        }
        com.facebook.t.t.a.c(hashMap);
        com.facebook.t.w.a.f(hashMap, this.f9439j);
        com.facebook.t.s.a.c(hashMap, this.f9439j);
        return hashMap;
    }

    private Object writeReplace() {
        return new C0140c(this.f9436g.toString(), this.f9437h, this.f9438i, this.f9440k);
    }

    public boolean b() {
        return this.f9437h;
    }

    public JSONObject c() {
        return this.f9436g;
    }

    public String e() {
        return this.f9439j;
    }

    public boolean f() {
        if (this.f9440k == null) {
            return true;
        }
        return a().equals(this.f9440k);
    }

    public String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", this.f9436g.optString("_eventName"), Boolean.valueOf(this.f9437h), this.f9436g.toString());
    }

    public c(String str, String str2, Double d2, Bundle bundle, boolean z, boolean z2, UUID uuid) throws JSONException, FacebookException {
        this.f9437h = z;
        this.f9438i = z2;
        this.f9439j = str2;
        this.f9436g = d(str, str2, d2, bundle, uuid);
        this.f9440k = a();
    }

    private c(String str, boolean z, boolean z2, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.f9436g = jSONObject;
        this.f9437h = z;
        this.f9439j = jSONObject.optString("_eventName");
        this.f9440k = str2;
        this.f9438i = z2;
    }
}
