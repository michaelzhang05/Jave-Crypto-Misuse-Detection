package com.getcapacitor;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j0 extends JSONObject {
    public j0() {
    }

    public j0(String str) {
        super(str);
    }

    public static j0 a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        ArrayList arrayList = new ArrayList();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        return new j0(jSONObject, (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public Boolean b(String str) {
        return c(str, null);
    }

    public Boolean c(String str, Boolean bool) {
        try {
            return Boolean.valueOf(super.getBoolean(str));
        } catch (JSONException unused) {
            return bool;
        }
    }

    public Integer d(String str) {
        return e(str, null);
    }

    public Integer e(String str, Integer num) {
        try {
            return Integer.valueOf(super.getInt(str));
        } catch (JSONException unused) {
            return num;
        }
    }

    public j0 f(String str) {
        try {
            return g(str, null);
        } catch (JSONException unused) {
            return null;
        }
    }

    public j0 g(String str, j0 j0Var) {
        try {
            Object obj = get(str);
            if (obj instanceof JSONObject) {
                Iterator<String> keys = ((JSONObject) obj).keys();
                ArrayList arrayList = new ArrayList();
                while (keys.hasNext()) {
                    arrayList.add(keys.next());
                }
                return new j0((JSONObject) obj, (String[]) arrayList.toArray(new String[arrayList.size()]));
            }
        } catch (JSONException unused) {
        }
        return j0Var;
    }

    @Override // org.json.JSONObject
    public String getString(String str) {
        return h(str, null);
    }

    public String h(String str, String str2) {
        return !super.isNull(str) ? super.getString(str) : str2;
    }

    @Override // org.json.JSONObject
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public j0 put(String str, double d6) {
        try {
            super.put(str, d6);
        } catch (JSONException unused) {
        }
        return this;
    }

    @Override // org.json.JSONObject
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public j0 put(String str, int i6) {
        try {
            super.put(str, i6);
        } catch (JSONException unused) {
        }
        return this;
    }

    @Override // org.json.JSONObject
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public j0 put(String str, long j6) {
        try {
            super.put(str, j6);
        } catch (JSONException unused) {
        }
        return this;
    }

    @Override // org.json.JSONObject
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public j0 put(String str, Object obj) {
        try {
            super.put(str, obj);
        } catch (JSONException unused) {
        }
        return this;
    }

    public j0 m(String str, String str2) {
        try {
            super.put(str, str2);
        } catch (JSONException unused) {
        }
        return this;
    }

    @Override // org.json.JSONObject
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public j0 put(String str, boolean z5) {
        try {
            super.put(str, z5);
        } catch (JSONException unused) {
        }
        return this;
    }

    public j0(JSONObject jSONObject, String[] strArr) {
        super(jSONObject, strArr);
    }
}
