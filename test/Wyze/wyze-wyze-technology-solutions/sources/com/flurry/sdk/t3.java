package com.flurry.sdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class t3 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public final int f10174b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10175c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10176d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10177e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10178f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10179g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10180h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10181i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10182j;

    /* renamed from: k, reason: collision with root package name */
    public final String f10183k;
    public final Map<String, String> l;
    public final Map<String, String> m;
    public int n;
    public List<m7> o;

    public t3(int i2, String str, long j2, String str2, String str3, String str4, int i3, int i4, Map<String, String> map, Map<String, String> map2, int i5, List<m7> list, String str5, String str6) {
        this.f10174b = i2;
        this.f10175c = str;
        this.f10176d = j2;
        this.f10177e = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        this.f10178f = str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
        this.f10179g = str4 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str4;
        this.f10180h = i3;
        this.f10181i = i4;
        this.l = map == null ? new HashMap<>() : map;
        this.m = map2 == null ? new HashMap<>() : map2;
        this.n = i5;
        this.o = list == null ? new ArrayList<>() : list;
        this.f10182j = str5 != null ? c2.h(str5) : HttpUrl.FRAGMENT_ENCODE_SET;
        this.f10183k = str6 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str6;
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        JSONObject a = super.a();
        a.put("fl.error.id", this.f10174b);
        a.put("fl.error.name", this.f10175c);
        a.put("fl.error.timestamp", this.f10176d);
        a.put("fl.error.message", this.f10177e);
        a.put("fl.error.class", this.f10178f);
        a.put("fl.error.type", this.f10180h);
        a.put("fl.crash.report", this.f10179g);
        a.put("fl.crash.platform", this.f10181i);
        a.put("fl.error.user.crash.parameter", e2.a(this.m));
        a.put("fl.error.sdk.crash.parameter", e2.a(this.l));
        a.put("fl.breadcrumb.version", this.n);
        JSONArray jSONArray = new JSONArray();
        List<m7> list = this.o;
        if (list != null) {
            for (m7 m7Var : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("fl.breadcrumb.message", m7Var.f10037b);
                jSONObject.put("fl.breadcrumb.timestamp", m7Var.f10038c);
                jSONArray.put(jSONObject);
            }
        }
        a.put("fl.breadcrumb", jSONArray);
        a.put("fl.nativecrash.minidump", this.f10182j);
        a.put("fl.nativecrash.logcat", this.f10183k);
        return a;
    }
}
