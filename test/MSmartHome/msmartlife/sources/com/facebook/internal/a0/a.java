package com.facebook.internal.a0;

import cm.aptoide.pt.install.installer.RootCommandOnSubscribe;
import com.facebook.GraphRequest;
import com.facebook.f;
import com.facebook.h;
import com.facebook.i;
import com.facebook.internal.a0.b;
import com.facebook.internal.k;
import com.facebook.internal.x;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ExceptionAnalyzer.java */
/* loaded from: classes.dex */
public final class a {
    private static boolean a = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExceptionAnalyzer.java */
    /* renamed from: com.facebook.internal.a0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0131a implements GraphRequest.f {
        final /* synthetic */ b a;

        C0131a(b bVar) {
            this.a = bVar;
        }

        @Override // com.facebook.GraphRequest.f
        public void b(i iVar) {
            try {
                if (iVar.g() == null && iVar.h().getBoolean(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION)) {
                    this.a.a();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public static void a() {
        a = true;
        if (f.i()) {
            c();
        }
    }

    public static void b(Throwable th) {
        if (a) {
            HashSet hashSet = new HashSet();
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                k.d d2 = k.d(stackTraceElement.getClassName());
                if (d2 != k.d.Unknown) {
                    k.c(d2);
                    hashSet.add(d2.toString());
                }
            }
            if (!f.i() || hashSet.isEmpty()) {
                return;
            }
            b.C0132b.b(new JSONArray((Collection) hashSet)).h();
        }
    }

    private static void c() {
        if (x.O()) {
            return;
        }
        File[] f2 = d.f();
        ArrayList arrayList = new ArrayList();
        for (File file : f2) {
            b c2 = b.C0132b.c(file);
            if (c2.g()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", c2.toString());
                    arrayList.add(GraphRequest.L(null, String.format("%s/instruments", f.f()), jSONObject, new C0131a(c2)));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new h(arrayList).x();
    }
}
