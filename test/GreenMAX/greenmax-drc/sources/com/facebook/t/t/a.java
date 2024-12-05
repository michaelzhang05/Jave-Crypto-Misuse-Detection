package com.facebook.t.t;

import com.facebook.f;
import com.facebook.internal.l;
import com.facebook.t.v.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* compiled from: IntegrityManager.java */
/* loaded from: classes.dex */
public final class a {
    private static boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f9600b = false;

    public static void a() {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return;
        }
        try {
            a = true;
            f9600b = l.g("FBSDKFeatureIntegritySample", f.f(), false);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
        }
    }

    private static String b(String str) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            String[] o = c.o(c.e.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            return o == null ? "none" : o[0];
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
            return null;
        }
    }

    public static void c(Map<String, String> map) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return;
        }
        try {
            if (a && map.size() != 0) {
                try {
                    ArrayList<String> arrayList = new ArrayList(map.keySet());
                    JSONObject jSONObject = new JSONObject();
                    for (String str : arrayList) {
                        String str2 = map.get(str);
                        if (d(str) || d(str2)) {
                            map.remove(str);
                            if (!f9600b) {
                                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            jSONObject.put(str, str2);
                        }
                    }
                    if (jSONObject.length() != 0) {
                        map.put("_onDeviceParams", jSONObject.toString());
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
        }
    }

    private static boolean d(String str) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return false;
        }
        try {
            return !"none".equals(b(str));
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
            return false;
        }
    }
}
