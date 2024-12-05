package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;

/* compiled from: CustomTabPrefetchHelper.java */
/* loaded from: classes.dex */
public class a extends c.c.b.d {

    /* renamed from: f, reason: collision with root package name */
    private static c.c.b.b f9339f;

    /* renamed from: g, reason: collision with root package name */
    private static c.c.b.e f9340g;

    public static c.c.b.e b() {
        c.c.b.e eVar = f9340g;
        f9340g = null;
        return eVar;
    }

    public static void c(Uri uri) {
        if (f9340g == null) {
            d();
        }
        c.c.b.e eVar = f9340g;
        if (eVar != null) {
            eVar.c(uri, null, null);
        }
    }

    private static void d() {
        c.c.b.b bVar;
        if (f9340g != null || (bVar = f9339f) == null) {
            return;
        }
        f9340g = bVar.c(null);
    }

    @Override // c.c.b.d
    public void a(ComponentName componentName, c.c.b.b bVar) {
        f9339f = bVar;
        bVar.d(0L);
        d();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
