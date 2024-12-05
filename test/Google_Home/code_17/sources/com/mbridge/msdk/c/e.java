package com.mbridge.msdk.c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f19065a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, f> f19066b;

    /* loaded from: classes4.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final e f19067a = new e();
    }

    public static e a() {
        return a.f19067a;
    }

    public final String b(String str) {
        HashMap<String, f> hashMap;
        f fVar;
        if (TextUtils.isEmpty(str) || (hashMap = this.f19066b) == null || !hashMap.containsKey(str) || (fVar = this.f19066b.get(str)) == null || fVar.a() >= this.f19065a) {
            return "";
        }
        String b8 = fVar.b();
        if (!TextUtils.isEmpty(b8)) {
            fVar.a(true);
        }
        return b8;
    }

    public final void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f19066b == null) {
                this.f19066b = new HashMap<>();
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject.getString(next);
                f fVar = new f();
                fVar.a(next);
                fVar.b(string);
                this.f19066b.put(next, fVar);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void d(String str) {
        HashMap<String, f> hashMap;
        f fVar;
        if (!TextUtils.isEmpty(str) && (hashMap = this.f19066b) != null && hashMap.containsKey(str) && (fVar = this.f19066b.get(str)) != null && fVar.a() < this.f19065a) {
            fVar.a(fVar.a() + 1);
        }
    }

    public final void e(String str) {
        HashMap<String, f> hashMap;
        f fVar;
        if (!TextUtils.isEmpty(str) && (hashMap = this.f19066b) != null && hashMap.containsKey(str) && (fVar = this.f19066b.get(str)) != null && fVar.a() < this.f19065a) {
            fVar.a(0);
        }
    }

    private e() {
        this.f19065a = 6;
        this.f19066b = new HashMap<>();
    }

    public final int a(String str) {
        HashMap<String, f> hashMap;
        f fVar;
        if (TextUtils.isEmpty(str) || (hashMap = this.f19066b) == null || !hashMap.containsKey(str) || (fVar = this.f19066b.get(str)) == null) {
            return 0;
        }
        int i8 = fVar.c() ? 1 : fVar.a() >= this.f19065a ? 2 : 0;
        fVar.a(false);
        return i8;
    }
}
