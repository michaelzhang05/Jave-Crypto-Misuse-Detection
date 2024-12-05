package com.facebook.t;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.internal.x;
import com.facebook.t.u.c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SessionEventsState.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: c, reason: collision with root package name */
    private int f9488c;

    /* renamed from: d, reason: collision with root package name */
    private com.facebook.internal.a f9489d;

    /* renamed from: e, reason: collision with root package name */
    private String f9490e;
    private List<c> a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private List<c> f9487b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final int f9491f = 1000;

    public o(com.facebook.internal.a aVar, String str) {
        this.f9489d = aVar;
        this.f9490e = str;
    }

    private void f(GraphRequest graphRequest, Context context, int i2, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject;
        try {
            jSONObject = com.facebook.t.u.c.a(c.b.CUSTOM_APP_EVENTS, this.f9489d, this.f9490e, z, context);
            if (this.f9488c > 0) {
                jSONObject.put("num_skipped_events", i2);
            }
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        graphRequest.Y(jSONObject);
        Bundle y = graphRequest.y();
        if (y == null) {
            y = new Bundle();
        }
        String jSONArray2 = jSONArray.toString();
        if (jSONArray2 != null) {
            y.putString("custom_events", jSONArray2);
            graphRequest.c0(jSONArray2);
        }
        graphRequest.a0(y);
    }

    public synchronized void a(c cVar) {
        if (this.a.size() + this.f9487b.size() >= 1000) {
            this.f9488c++;
        } else {
            this.a.add(cVar);
        }
    }

    public synchronized void b(boolean z) {
        if (z) {
            this.a.addAll(this.f9487b);
        }
        this.f9487b.clear();
        this.f9488c = 0;
    }

    public synchronized int c() {
        return this.a.size();
    }

    public synchronized List<c> d() {
        List<c> list;
        list = this.a;
        this.a = new ArrayList();
        return list;
    }

    public int e(GraphRequest graphRequest, Context context, boolean z, boolean z2) {
        synchronized (this) {
            int i2 = this.f9488c;
            com.facebook.t.s.a.d(this.a);
            this.f9487b.addAll(this.a);
            this.a.clear();
            JSONArray jSONArray = new JSONArray();
            for (c cVar : this.f9487b) {
                if (cVar.f()) {
                    if (z || !cVar.b()) {
                        jSONArray.put(cVar.c());
                    }
                } else {
                    x.V("Event with invalid checksum: %s", cVar.toString());
                }
            }
            if (jSONArray.length() == 0) {
                return 0;
            }
            f(graphRequest, context, i2, jSONArray, z2);
            return jSONArray.length();
        }
    }
}
