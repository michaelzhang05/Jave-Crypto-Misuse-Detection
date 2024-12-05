package com.facebook.internal.a0.e;

import android.util.Log;
import cm.aptoide.pt.install.installer.RootCommandOnSubscribe;
import com.facebook.GraphRequest;
import com.facebook.f;
import com.facebook.i;
import com.facebook.internal.a0.b;
import com.facebook.internal.a0.d;
import com.facebook.internal.x;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: CrashHandler.java */
/* loaded from: classes.dex */
public class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: f, reason: collision with root package name */
    private static final String f9123f = a.class.getCanonicalName();

    /* renamed from: g, reason: collision with root package name */
    private static a f9124g;

    /* renamed from: h, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f9125h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashHandler.java */
    /* renamed from: com.facebook.internal.a0.e.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0133a implements Comparator<com.facebook.internal.a0.b> {
        C0133a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(com.facebook.internal.a0.b bVar, com.facebook.internal.a0.b bVar2) {
            return bVar.b(bVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashHandler.java */
    /* loaded from: classes.dex */
    public static class b implements GraphRequest.f {
        final /* synthetic */ ArrayList a;

        b(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // com.facebook.GraphRequest.f
        public void b(i iVar) {
            try {
                if (iVar.g() == null && iVar.h().getBoolean(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION)) {
                    for (int i2 = 0; this.a.size() > i2; i2++) {
                        ((com.facebook.internal.a0.b) this.a.get(i2)).a();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    private a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f9125h = uncaughtExceptionHandler;
    }

    public static synchronized void a() {
        synchronized (a.class) {
            if (f.i()) {
                b();
            }
            if (f9124g != null) {
                Log.w(f9123f, "Already enabled!");
                return;
            }
            a aVar = new a(Thread.getDefaultUncaughtExceptionHandler());
            f9124g = aVar;
            Thread.setDefaultUncaughtExceptionHandler(aVar);
        }
    }

    private static void b() {
        if (x.O()) {
            return;
        }
        File[] g2 = d.g();
        ArrayList arrayList = new ArrayList();
        for (File file : g2) {
            com.facebook.internal.a0.b c2 = b.C0132b.c(file);
            if (c2.g()) {
                arrayList.add(c2);
            }
        }
        Collections.sort(arrayList, new C0133a());
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < arrayList.size() && i2 < 5; i2++) {
            jSONArray.put(arrayList.get(i2));
        }
        d.i("crash_reports", jSONArray, new b(arrayList));
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (d.e(th)) {
            com.facebook.internal.a0.a.b(th);
            b.C0132b.a(th, b.c.CrashReport).h();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f9125h;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
