package com.flurry.sdk;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class v3 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public final String f10211b;

    /* renamed from: c, reason: collision with root package name */
    public int f10212c;

    /* renamed from: d, reason: collision with root package name */
    public final a f10213d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f10214e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, String> f10215f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10216g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10217h;

    /* renamed from: i, reason: collision with root package name */
    public final long f10218i;

    /* renamed from: j, reason: collision with root package name */
    public final long f10219j;

    /* renamed from: k, reason: collision with root package name */
    public long f10220k;

    /* loaded from: classes2.dex */
    public enum a {
        UNKNOWN(0),
        CUSTOM(1),
        PURCHASE(8),
        MESSAGE(9),
        USER_STANDARD(10),
        PERFORMANCE(1),
        SDK_LOG(1);

        final int n;

        a(int i2) {
            this.n = i2;
        }
    }

    public v3(String str, int i2, a aVar, Map<String, String> map, Map<String, String> map2, boolean z, boolean z2, long j2, long j3, long j4) {
        this.a = 2;
        this.f10211b = str;
        this.f10212c = i2;
        this.f10213d = aVar;
        this.f10214e = map;
        this.f10215f = map2;
        this.f10216g = z;
        this.f10217h = z2;
        this.f10218i = j2;
        this.f10219j = j3;
        this.f10220k = j4;
    }

    private static Map<String, String> b(Map<String, String> map, List<String> list) {
        String h2;
        String value;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!list.contains(entry.getKey())) {
                h2 = c2.h(entry.getKey());
                value = c2.h(entry.getValue());
            } else {
                h2 = c2.h(entry.getKey());
                value = entry.getValue();
            }
            if (!TextUtils.isEmpty(h2)) {
                hashMap.put(h2, value);
            }
        }
        return hashMap;
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        JSONObject a2 = super.a();
        a2.put("fl.event.name", this.f10211b);
        a2.put("fl.event.id", this.f10212c);
        a2.put("fl.event.type", this.f10213d.n);
        a2.put("fl.event.timed", this.f10216g);
        a2.put("fl.timed.event.starting", this.f10217h);
        long j2 = this.f10220k;
        if (j2 > 0) {
            a2.put("fl.timed.event.duration", j2);
        }
        a2.put("fl.event.timestamp", this.f10218i);
        a2.put("fl.event.uptime", this.f10219j);
        a2.put("fl.event.user.parameters", e2.a(this.f10214e));
        a2.put("fl.event.flurry.parameters", e2.a(this.f10215f));
        return a2;
    }

    public v3(String str, int i2, a aVar, Map<String, String> map, Map<String, String> map2, List<String> list, boolean z, boolean z2, long j2, long j3) {
        this(c2.h(c2.b(str)), i2, aVar, (Map<String, String>) (map != null ? b(map, list) : new HashMap()), (Map<String, String>) (map2 != null ? b(map2, list) : new HashMap()), z, z2, j2, j3, 0L);
    }
}
