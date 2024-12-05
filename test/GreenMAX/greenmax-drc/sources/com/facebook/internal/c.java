package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BundleJSONConverter.java */
/* loaded from: classes.dex */
public class c {
    private static final Map<Class<?>, h> a;

    /* compiled from: BundleJSONConverter.java */
    /* loaded from: classes.dex */
    static class a implements h {
        a() {
        }

        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* compiled from: BundleJSONConverter.java */
    /* loaded from: classes.dex */
    static class b implements h {
        b() {
        }

        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* compiled from: BundleJSONConverter.java */
    /* renamed from: com.facebook.internal.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0136c implements h {
        C0136c() {
        }

        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* compiled from: BundleJSONConverter.java */
    /* loaded from: classes.dex */
    static class d implements h {
        d() {
        }

        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    /* compiled from: BundleJSONConverter.java */
    /* loaded from: classes.dex */
    static class e implements h {
        e() {
        }

        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putString(str, (String) obj);
        }
    }

    /* compiled from: BundleJSONConverter.java */
    /* loaded from: classes.dex */
    static class f implements h {
        f() {
        }

        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String str, Object obj) throws JSONException {
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* compiled from: BundleJSONConverter.java */
    /* loaded from: classes.dex */
    static class g implements h {
        g() {
        }

        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String str, Object obj) throws JSONException {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList<String> arrayList = new ArrayList<>();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                Object obj2 = jSONArray.get(i2);
                if (obj2 instanceof String) {
                    arrayList.add((String) obj2);
                } else {
                    throw new IllegalArgumentException("Unexpected type in an array: " + obj2.getClass());
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    /* compiled from: BundleJSONConverter.java */
    /* loaded from: classes.dex */
    public interface h {
        void a(Bundle bundle, String str, Object obj) throws JSONException;
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(Boolean.class, new a());
        hashMap.put(Integer.class, new b());
        hashMap.put(Long.class, new C0136c());
        hashMap.put(Double.class, new d());
        hashMap.put(String.class, new e());
        hashMap.put(String[].class, new f());
        hashMap.put(JSONArray.class, new g());
    }

    public static Bundle a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != null && obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, a((JSONObject) obj));
                } else {
                    h hVar = a.get(obj.getClass());
                    if (hVar != null) {
                        hVar.a(bundle, next, obj);
                    } else {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                }
            }
        }
        return bundle;
    }
}
