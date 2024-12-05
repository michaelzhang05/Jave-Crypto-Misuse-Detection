package com.facebook.internal.a0.g;

import com.facebook.internal.a0.d;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ErrorReportData.java */
/* loaded from: classes.dex */
public final class a {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private String f9127b;

    /* renamed from: c, reason: collision with root package name */
    private Long f9128c;

    public a(String str) {
        this.f9128c = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f9127b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        stringBuffer.append(this.f9128c);
        stringBuffer.append(".json");
        this.a = stringBuffer.toString();
    }

    public void a() {
        d.a(this.a);
    }

    public int b(a aVar) {
        Long l = this.f9128c;
        if (l == null) {
            return -1;
        }
        Long l2 = aVar.f9128c;
        if (l2 == null) {
            return 1;
        }
        return l2.compareTo(l);
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.f9128c;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            jSONObject.put("error_message", this.f9127b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public boolean d() {
        return (this.f9127b == null || this.f9128c == null) ? false : true;
    }

    public void e() {
        if (d()) {
            d.j(this.a, toString());
        }
    }

    public String toString() {
        JSONObject c2 = c();
        if (c2 == null) {
            return null;
        }
        return c2.toString();
    }

    public a(File file) {
        String name = file.getName();
        this.a = name;
        JSONObject h2 = d.h(name, true);
        if (h2 != null) {
            this.f9128c = Long.valueOf(h2.optLong("timestamp", 0L));
            this.f9127b = h2.optString("error_message", null);
        }
    }
}
