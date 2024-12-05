package com.mbridge.msdk.foundation.same.net;

import android.os.Process;
import com.mbridge.msdk.foundation.same.net.stack.OkHttpStack;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20776a = "h";

    /* renamed from: b, reason: collision with root package name */
    private c f20777b;

    /* renamed from: c, reason: collision with root package name */
    private g f20778c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.net.stack.b f20779d;

    public h(c cVar) {
        a();
        this.f20778c = new com.mbridge.msdk.foundation.same.net.f.a(this.f20779d, cVar);
        this.f20777b = cVar;
    }

    private void a() {
        try {
            if (com.mbridge.msdk.f.c.b()) {
                this.f20779d = new com.mbridge.msdk.foundation.same.net.stack.a();
                return;
            }
        } catch (Throwable th) {
            ad.b(f20776a, th.getMessage());
        }
        this.f20779d = new OkHttpStack();
    }

    public h(c cVar, com.mbridge.msdk.foundation.same.net.stack.b bVar) {
        if (bVar == null) {
            a();
        } else {
            this.f20779d = bVar;
        }
        this.f20778c = new com.mbridge.msdk.foundation.same.net.f.a(this.f20779d, cVar);
        this.f20777b = cVar;
    }

    public final void a(i iVar) {
        Process.setThreadPriority(10);
        try {
            this.f20777b.d(iVar);
            if (iVar.q()) {
                iVar.a("network-discard-cancelled");
                this.f20777b.a(iVar);
                this.f20777b.b(iVar);
            } else {
                this.f20777b.c(iVar);
                this.f20777b.a((i<?>) iVar, iVar.a(this.f20778c.a(iVar)));
            }
        } catch (com.mbridge.msdk.foundation.same.net.b.a e8) {
            this.f20777b.a((i<?>) iVar, e8);
        } catch (Exception e9) {
            ad.b(f20776a, "Unhandled exception " + e9.getMessage());
            this.f20777b.a((i<?>) iVar, new com.mbridge.msdk.foundation.same.net.b.a(4, null));
        }
    }
}
