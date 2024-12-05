package com.mbridge.msdk.foundation.same.net;

import android.content.Context;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static n f20832a;

    /* renamed from: b, reason: collision with root package name */
    private j f20833b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.net.e.b f20834c;

    /* renamed from: d, reason: collision with root package name */
    private j f20835d;

    private n() {
    }

    public static void a(i iVar) {
        b().a(iVar);
    }

    private static j b() {
        n nVar = f20832a;
        if (nVar != null) {
            j jVar = nVar.f20835d;
            if (jVar != null) {
                return jVar;
            }
            nVar.f20835d = new j(com.mbridge.msdk.foundation.controller.c.m().c());
            return f20832a.f20835d;
        }
        n nVar2 = new n();
        f20832a = nVar2;
        if (nVar2.f20835d == null) {
            nVar2.f20835d = new j(com.mbridge.msdk.foundation.controller.c.m().c());
        }
        return f20832a.f20835d;
    }

    public static com.mbridge.msdk.foundation.same.net.e.b a() {
        n nVar = f20832a;
        if (nVar != null) {
            com.mbridge.msdk.foundation.same.net.e.b bVar = nVar.f20834c;
            if (bVar != null) {
                return bVar;
            }
            nVar.f20834c = new com.mbridge.msdk.foundation.same.net.e.b(b(), 3);
            return f20832a.f20834c;
        }
        n nVar2 = new n();
        f20832a = nVar2;
        if (nVar2.f20834c == null) {
            nVar2.f20834c = new com.mbridge.msdk.foundation.same.net.e.b(b(), 3);
        }
        return f20832a.f20834c;
    }

    public static void b(i iVar) {
        n nVar = f20832a;
        if (nVar != null) {
            if (nVar.f20833b == null) {
                nVar.f20833b = new j(com.mbridge.msdk.foundation.controller.c.m().c(), null);
            }
        } else {
            n nVar2 = new n();
            f20832a = nVar2;
            if (nVar2.f20833b == null) {
                nVar2.f20833b = new j(com.mbridge.msdk.foundation.controller.c.m().c(), null);
            }
        }
        f20832a.f20833b.a(iVar);
    }

    public static void a(Context context) {
        if (f20832a == null) {
            n nVar = new n();
            f20832a = nVar;
            nVar.f20835d = new j(context.getApplicationContext());
            f20832a.f20834c = new com.mbridge.msdk.foundation.same.net.e.b(b(), 3);
        }
    }
}
