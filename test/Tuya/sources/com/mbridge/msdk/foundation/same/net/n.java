package com.mbridge.msdk.foundation.same.net;

import android.content.Context;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static n f19777a;

    /* renamed from: b, reason: collision with root package name */
    private j f19778b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.net.e.b f19779c;

    /* renamed from: d, reason: collision with root package name */
    private j f19780d;

    private n() {
    }

    public static void a(i iVar) {
        b().a(iVar);
    }

    private static j b() {
        n nVar = f19777a;
        if (nVar != null) {
            j jVar = nVar.f19780d;
            if (jVar != null) {
                return jVar;
            }
            nVar.f19780d = new j(com.mbridge.msdk.foundation.controller.c.m().c());
            return f19777a.f19780d;
        }
        n nVar2 = new n();
        f19777a = nVar2;
        if (nVar2.f19780d == null) {
            nVar2.f19780d = new j(com.mbridge.msdk.foundation.controller.c.m().c());
        }
        return f19777a.f19780d;
    }

    public static com.mbridge.msdk.foundation.same.net.e.b a() {
        n nVar = f19777a;
        if (nVar != null) {
            com.mbridge.msdk.foundation.same.net.e.b bVar = nVar.f19779c;
            if (bVar != null) {
                return bVar;
            }
            nVar.f19779c = new com.mbridge.msdk.foundation.same.net.e.b(b(), 3);
            return f19777a.f19779c;
        }
        n nVar2 = new n();
        f19777a = nVar2;
        if (nVar2.f19779c == null) {
            nVar2.f19779c = new com.mbridge.msdk.foundation.same.net.e.b(b(), 3);
        }
        return f19777a.f19779c;
    }

    public static void b(i iVar) {
        n nVar = f19777a;
        if (nVar != null) {
            if (nVar.f19778b == null) {
                nVar.f19778b = new j(com.mbridge.msdk.foundation.controller.c.m().c(), null);
            }
        } else {
            n nVar2 = new n();
            f19777a = nVar2;
            if (nVar2.f19778b == null) {
                nVar2.f19778b = new j(com.mbridge.msdk.foundation.controller.c.m().c(), null);
            }
        }
        f19777a.f19778b.a(iVar);
    }

    public static void a(Context context) {
        if (f19777a == null) {
            n nVar = new n();
            f19777a = nVar;
            nVar.f19780d = new j(context.getApplicationContext());
            f19777a.f19779c = new com.mbridge.msdk.foundation.same.net.e.b(b(), 3);
        }
    }
}
