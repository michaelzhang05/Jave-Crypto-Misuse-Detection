package com.mbridge.msdk.foundation.db.a;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.m;
import com.mbridge.msdk.foundation.same.a.b;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private b f19169a;

    /* renamed from: b, reason: collision with root package name */
    private m f19170b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.mbridge.msdk.foundation.db.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0398a {

        /* renamed from: a, reason: collision with root package name */
        private static a f19174a = new a();
    }

    private a() {
        this.f19169a = new b(1000);
        try {
            m a8 = m.a(h.a(c.m().c()));
            this.f19170b = a8;
            a(a8.a(), false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void a(JSONObject jSONObject, final boolean z8) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            final b bVar = new b(100);
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                this.f19169a.a(next, optJSONObject);
                bVar.a(next, optJSONObject);
            }
            com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.db.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (z8 && a.this.f19170b != null) {
                        for (String str : bVar.a()) {
                            a.this.f19170b.a(str, a.this.f19169a.b(str));
                        }
                    }
                }
            });
        }
    }

    public final JSONArray b() {
        return new JSONArray((Collection) this.f19169a.a());
    }

    public static a a() {
        return C0398a.f19174a;
    }

    public final JSONObject a(String str) {
        m mVar;
        JSONObject b8 = this.f19169a.b(str);
        if (b8 != null || (mVar = this.f19170b) == null) {
            return b8;
        }
        JSONObject a8 = mVar.a(str);
        if (a8 != null) {
            this.f19169a.a(str, a8);
        }
        return a8;
    }
}
