package com.facebook.internal;

import com.facebook.FacebookRequestError;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FacebookRequestErrorClassification.java */
/* loaded from: classes.dex */
public final class h {
    private static h a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, Set<Integer>> f9153b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<Integer, Set<Integer>> f9154c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Integer, Set<Integer>> f9155d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9156e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9157f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9158g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FacebookRequestErrorClassification.java */
    /* loaded from: classes.dex */
    public static class a extends HashMap<Integer, Set<Integer>> {
        a() {
            put(2, null);
            put(4, null);
            put(9, null);
            put(17, null);
            put(341, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FacebookRequestErrorClassification.java */
    /* loaded from: classes.dex */
    public static class b extends HashMap<Integer, Set<Integer>> {
        b() {
            put(102, null);
            put(190, null);
            put(412, null);
        }
    }

    /* compiled from: FacebookRequestErrorClassification.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[FacebookRequestError.b.values().length];
            a = iArr;
            try {
                iArr[FacebookRequestError.b.OTHER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[FacebookRequestError.b.LOGIN_RECOVERABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[FacebookRequestError.b.TRANSIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    h(Map<Integer, Set<Integer>> map, Map<Integer, Set<Integer>> map2, Map<Integer, Set<Integer>> map3, String str, String str2, String str3) {
        this.f9153b = map;
        this.f9154c = map2;
        this.f9155d = map3;
        this.f9156e = str;
        this.f9157f = str2;
        this.f9158g = str3;
    }

    public static h b(JSONArray jSONArray) {
        String optString;
        if (jSONArray == null) {
            return null;
        }
        Map<Integer, Set<Integer>> map = null;
        Map<Integer, Set<Integer>> map2 = null;
        Map<Integer, Set<Integer>> map3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            if (optJSONObject != null && (optString = optJSONObject.optString("name")) != null) {
                if (optString.equalsIgnoreCase("other")) {
                    str = optJSONObject.optString("recovery_message", null);
                    map = f(optJSONObject);
                } else if (optString.equalsIgnoreCase("transient")) {
                    str2 = optJSONObject.optString("recovery_message", null);
                    map2 = f(optJSONObject);
                } else if (optString.equalsIgnoreCase("login_recoverable")) {
                    str3 = optJSONObject.optString("recovery_message", null);
                    map3 = f(optJSONObject);
                }
            }
        }
        return new h(map, map2, map3, str, str2, str3);
    }

    public static synchronized h c() {
        h hVar;
        synchronized (h.class) {
            if (a == null) {
                a = d();
            }
            hVar = a;
        }
        return hVar;
    }

    private static h d() {
        return new h(null, new a(), new b(), null, null, null);
    }

    private static Map<Integer, Set<Integer>> f(JSONObject jSONObject) {
        int optInt;
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet();
                    for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                        int optInt2 = optJSONArray2.optInt(i3);
                        if (optInt2 != 0) {
                            hashSet.add(Integer.valueOf(optInt2));
                        }
                    }
                }
                hashMap.put(Integer.valueOf(optInt), hashSet);
            }
        }
        return hashMap;
    }

    public FacebookRequestError.b a(int i2, int i3, boolean z) {
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        if (z) {
            return FacebookRequestError.b.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.f9153b;
        if (map != null && map.containsKey(Integer.valueOf(i2)) && ((set3 = this.f9153b.get(Integer.valueOf(i2))) == null || set3.contains(Integer.valueOf(i3)))) {
            return FacebookRequestError.b.OTHER;
        }
        Map<Integer, Set<Integer>> map2 = this.f9155d;
        if (map2 != null && map2.containsKey(Integer.valueOf(i2)) && ((set2 = this.f9155d.get(Integer.valueOf(i2))) == null || set2.contains(Integer.valueOf(i3)))) {
            return FacebookRequestError.b.LOGIN_RECOVERABLE;
        }
        Map<Integer, Set<Integer>> map3 = this.f9154c;
        if (map3 != null && map3.containsKey(Integer.valueOf(i2)) && ((set = this.f9154c.get(Integer.valueOf(i2))) == null || set.contains(Integer.valueOf(i3)))) {
            return FacebookRequestError.b.TRANSIENT;
        }
        return FacebookRequestError.b.OTHER;
    }

    public String e(FacebookRequestError.b bVar) {
        int i2 = c.a[bVar.ordinal()];
        if (i2 == 1) {
            return this.f9156e;
        }
        if (i2 == 2) {
            return this.f9158g;
        }
        if (i2 != 3) {
            return null;
        }
        return this.f9157f;
    }
}
