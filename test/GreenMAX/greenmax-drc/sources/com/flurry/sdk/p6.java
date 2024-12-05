package com.flurry.sdk;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class p6 extends q6 {

    /* renamed from: b, reason: collision with root package name */
    public final int f10109b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10110c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10111d;

    /* renamed from: e, reason: collision with root package name */
    public final List<String> f10112e;

    /* renamed from: f, reason: collision with root package name */
    public final a f10113f;

    /* loaded from: classes2.dex */
    public enum a {
        Set(1),
        Add(2),
        Remove(3),
        Clear(4),
        Assign(5),
        Flag(6),
        Unknown(0);

        private final int n;

        a(int i2) {
            this.n = i2;
        }
    }

    public p6(int i2, long j2, String str, List<String> list, a aVar) {
        this.f10109b = i2;
        this.f10110c = j2;
        this.f10111d = str;
        this.f10112e = list;
        this.f10113f = aVar;
    }

    @Override // com.flurry.sdk.q6, com.flurry.sdk.t6
    public final JSONObject a() throws JSONException {
        JSONObject a2 = super.a();
        a2.put("fl.user.property.id", this.f10109b);
        a2.put("fl.user.property.uptime", this.f10110c);
        a2.put("fl.user.property.key", this.f10111d);
        List<String> list = this.f10112e;
        JSONArray jSONArray = new JSONArray();
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
        }
        a2.put("fl.user.property.values", jSONArray);
        a2.put("fl.user.property.call.type", this.f10113f.n);
        return a2;
    }
}
