package v2;

import M5.AbstractC1246t;
import M5.N;
import d6.i;
import d6.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f38789a = new e();

    private e() {
    }

    private final JSONArray c(List list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof Map) {
                obj = f38789a.d((Map) obj);
            } else if (obj instanceof List) {
                obj = f38789a.c((List) obj);
            } else if (!(obj instanceof Number) && !(obj instanceof Boolean)) {
                obj = String.valueOf(obj);
            }
            jSONArray.put(obj);
        }
        return jSONArray;
    }

    public static final String h(JSONObject jsonObject, String fieldName) {
        AbstractC3159y.i(jsonObject, "jsonObject");
        AbstractC3159y.i(fieldName, "fieldName");
        String e8 = f38789a.e(jsonObject.optString(fieldName));
        if (e8 == null || e8.length() != 3) {
            return null;
        }
        return e8;
    }

    public static final String l(JSONObject jSONObject, String fieldName) {
        String str;
        AbstractC3159y.i(fieldName, "fieldName");
        e eVar = f38789a;
        if (jSONObject != null) {
            str = jSONObject.optString(fieldName);
        } else {
            str = null;
        }
        return eVar.e(str);
    }

    public final /* synthetic */ List a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        i s8 = m.s(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(s8, 10));
        Iterator it = s8.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((N) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof JSONArray) {
                obj = f38789a.a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = f38789a.b((JSONObject) obj);
            } else if (AbstractC3159y.d(obj, "null")) {
                obj = null;
            }
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.util.Map b(org.json.JSONObject r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            org.json.JSONArray r1 = r7.names()
            if (r1 != 0) goto Lf
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
        Lf:
            r2 = 0
            int r3 = r1.length()
            d6.i r2 = d6.m.s(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = M5.AbstractC1246t.x(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L27:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L3c
            r4 = r2
            M5.N r4 = (M5.N) r4
            int r4 = r4.nextInt()
            java.lang.String r4 = r1.getString(r4)
            r3.add(r4)
            goto L27
        L3c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r3.iterator()
        L45:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r7.opt(r3)
            if (r4 == 0) goto L84
            kotlin.jvm.internal.AbstractC3159y.f(r4)
            java.lang.String r5 = "null"
            boolean r5 = kotlin.jvm.internal.AbstractC3159y.d(r4, r5)
            if (r5 != 0) goto L84
            boolean r5 = r4 instanceof org.json.JSONObject
            if (r5 == 0) goto L6f
            v2.e r5 = v2.e.f38789a
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            java.util.Map r4 = r5.b(r4)
            goto L7b
        L6f:
            boolean r5 = r4 instanceof org.json.JSONArray
            if (r5 == 0) goto L7b
            v2.e r5 = v2.e.f38789a
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            java.util.List r4 = r5.a(r4)
        L7b:
            L5.r r3 = L5.x.a(r3, r4)
            java.util.Map r3 = M5.Q.e(r3)
            goto L85
        L84:
            r3 = r0
        L85:
            if (r3 == 0) goto L45
            r1.add(r3)
            goto L45
        L8b:
            java.util.Map r7 = M5.Q.h()
            java.util.Iterator r0 = r1.iterator()
        L93:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La4
            java.lang.Object r1 = r0.next()
            java.util.Map r1 = (java.util.Map) r1
            java.util.Map r7 = M5.Q.q(r7, r1)
            goto L93
        La4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.e.b(org.json.JSONObject):java.util.Map");
    }

    public final JSONObject d(Map map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj != null) {
                try {
                    if (obj instanceof Map) {
                        jSONObject.put(str, d((Map) obj));
                    } else if (obj instanceof List) {
                        jSONObject.put(str, c((List) obj));
                    } else {
                        if (!(obj instanceof Number) && !(obj instanceof Boolean)) {
                            jSONObject.put(str, obj.toString());
                        }
                        jSONObject.put(str, obj);
                    }
                } catch (ClassCastException | JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    public final /* synthetic */ String e(String str) {
        if (str == null) {
            return null;
        }
        if (AbstractC3159y.d("null", str) || str.length() == 0) {
            str = null;
        }
        return str;
    }

    public final /* synthetic */ boolean f(JSONObject jsonObject, String fieldName) {
        AbstractC3159y.i(jsonObject, "jsonObject");
        AbstractC3159y.i(fieldName, "fieldName");
        if (!jsonObject.has(fieldName) || !jsonObject.optBoolean(fieldName, false)) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ String g(JSONObject jsonObject, String fieldName) {
        AbstractC3159y.i(jsonObject, "jsonObject");
        AbstractC3159y.i(fieldName, "fieldName");
        String e8 = e(jsonObject.optString(fieldName));
        if (e8 == null || e8.length() != 2) {
            return null;
        }
        return e8;
    }

    public final /* synthetic */ Integer i(JSONObject jsonObject, String fieldName) {
        AbstractC3159y.i(jsonObject, "jsonObject");
        AbstractC3159y.i(fieldName, "fieldName");
        if (!jsonObject.has(fieldName)) {
            return null;
        }
        return Integer.valueOf(jsonObject.optInt(fieldName));
    }

    public final /* synthetic */ Long j(JSONObject jsonObject, String fieldName) {
        AbstractC3159y.i(jsonObject, "jsonObject");
        AbstractC3159y.i(fieldName, "fieldName");
        if (!jsonObject.has(fieldName)) {
            return null;
        }
        return Long.valueOf(jsonObject.optLong(fieldName));
    }

    public final /* synthetic */ Map k(JSONObject jsonObject, String fieldName) {
        AbstractC3159y.i(jsonObject, "jsonObject");
        AbstractC3159y.i(fieldName, "fieldName");
        JSONObject optJSONObject = jsonObject.optJSONObject(fieldName);
        if (optJSONObject != null) {
            return f38789a.b(optJSONObject);
        }
        return null;
    }
}
