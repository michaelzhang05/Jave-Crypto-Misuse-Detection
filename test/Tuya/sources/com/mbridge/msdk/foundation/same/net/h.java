package com.mbridge.msdk.foundation.same.net;

import android.os.Process;
import com.mbridge.msdk.foundation.same.net.stack.OkHttpStack;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19721a = "h";

    /* renamed from: b, reason: collision with root package name */
    private c f19722b;

    /* renamed from: c, reason: collision with root package name */
    private g f19723c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.net.stack.b f19724d;

    public h(c cVar) {
        a();
        this.f19723c = new com.mbridge.msdk.foundation.same.net.f.a(this.f19724d, cVar);
        this.f19722b = cVar;
    }

    private void a() {
        try {
            if (com.mbridge.msdk.f.c.b()) {
                this.f19724d = new com.mbridge.msdk.foundation.same.net.stack.a();
                return;
            }
        } catch (Throwable th) {
            ad.b(f19721a, th.getMessage());
        }
        this.f19724d = new OkHttpStack();
    }

    public h(c cVar, com.mbridge.msdk.foundation.same.net.stack.b bVar) {
        if (bVar == null) {
            a();
        } else {
            this.f19724d = bVar;
        }
        this.f19723c = new com.mbridge.msdk.foundation.same.net.f.a(this.f19724d, cVar);
        this.f19722b = cVar;
    }

    public final void a(i iVar) {
        Process.setThreadPriority(10);
        try {
            this.f19722b.d(iVar);
            if (iVar.q()) {
                iVar.a("network-discard-cancelled");
                this.f19722b.a(iVar);
                this.f19722b.b(iVar);
            } else {
                this.f19722b.c(iVar);
                this.f19722b.a((i<?>) iVar, iVar.a(this.f19723c.a(iVar)));
            }
        } catch (com.mbridge.msdk.foundation.same.net.b.a e8) {
            this.f19722b.a((i<?>) iVar, e8);
        } catch (Exception e9) {
            ad.b(f19721a, "Unhandled exception " + e9.getMessage());
            this.f19722b.a((i<?>) iVar, new com.mbridge.msdk.foundation.same.net.b.a(4, null));
        }
    }
}
