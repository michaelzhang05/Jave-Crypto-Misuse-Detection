package com.getcapacitor;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f4489a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(JSONObject jSONObject) {
        this.f4489a = jSONObject;
    }

    public String[] a(String str) {
        return b(str, null);
    }

    public String[] b(String str, String[] strArr) {
        return a1.c.a(this.f4489a, str, strArr);
    }

    public boolean c(String str, boolean z5) {
        return a1.c.b(this.f4489a, str, z5);
    }

    public JSONObject d() {
        return this.f4489a;
    }
}
