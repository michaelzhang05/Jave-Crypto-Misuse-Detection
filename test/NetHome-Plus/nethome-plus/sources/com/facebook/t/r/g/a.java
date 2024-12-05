package com.facebook.t.r.g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: EventBinding.java */
/* loaded from: classes.dex */
public class a {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final b f9563b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC0148a f9564c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9565d;

    /* renamed from: e, reason: collision with root package name */
    private final List<c> f9566e;

    /* renamed from: f, reason: collision with root package name */
    private final List<com.facebook.t.r.g.b> f9567f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9568g;

    /* renamed from: h, reason: collision with root package name */
    private final String f9569h;

    /* renamed from: i, reason: collision with root package name */
    private final String f9570i;

    /* compiled from: EventBinding.java */
    /* renamed from: com.facebook.t.r.g.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0148a {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    /* compiled from: EventBinding.java */
    /* loaded from: classes.dex */
    public enum b {
        MANUAL,
        INFERENCE
    }

    public a(String str, b bVar, EnumC0148a enumC0148a, String str2, List<c> list, List<com.facebook.t.r.g.b> list2, String str3, String str4, String str5) {
        this.a = str;
        this.f9563b = bVar;
        this.f9564c = enumC0148a;
        this.f9565d = str2;
        this.f9566e = list;
        this.f9567f = list2;
        this.f9568g = str3;
        this.f9569h = str4;
        this.f9570i = str5;
    }

    public static a c(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        String string = jSONObject.getString("event_name");
        String string2 = jSONObject.getString("method");
        Locale locale = Locale.ENGLISH;
        b valueOf = b.valueOf(string2.toUpperCase(locale));
        EnumC0148a valueOf2 = EnumC0148a.valueOf(jSONObject.getString("event_type").toUpperCase(locale));
        String string3 = jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(new c(jSONArray.getJSONObject(i2)));
        }
        String optString = jSONObject.optString("path_type", "absolute");
        JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null) {
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                arrayList2.add(new com.facebook.t.r.g.b(optJSONArray.getJSONObject(i3)));
            }
        }
        return new a(string, valueOf, valueOf2, string3, arrayList, arrayList2, jSONObject.optString("component_id"), optString, jSONObject.optString("activity_name"));
    }

    public static List<a> f(JSONArray jSONArray) {
        int length;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            try {
                length = jSONArray.length();
            } catch (IllegalArgumentException | JSONException unused) {
            }
        } else {
            length = 0;
        }
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(c(jSONArray.getJSONObject(i2)));
        }
        return arrayList;
    }

    public String a() {
        return this.f9570i;
    }

    public String b() {
        return this.a;
    }

    public List<com.facebook.t.r.g.b> d() {
        return Collections.unmodifiableList(this.f9567f);
    }

    public List<c> e() {
        return Collections.unmodifiableList(this.f9566e);
    }
}
