package com.squareup.picasso;

import I6.d;
import I6.x;
import android.net.NetworkInfo;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import java.io.IOException;
import l2.InterfaceC3310c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class q extends x {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3310c f24363a;

    /* renamed from: b, reason: collision with root package name */
    private final z f24364b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends IOException {

        /* renamed from: a, reason: collision with root package name */
        final int f24365a;

        /* renamed from: b, reason: collision with root package name */
        final int f24366b;

        b(int i8, int i9) {
            super("HTTP " + i8);
            this.f24365a = i8;
            this.f24366b = i9;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(InterfaceC3310c interfaceC3310c, z zVar) {
        this.f24363a = interfaceC3310c;
        this.f24364b = zVar;
    }

    private static I6.x j(v vVar, int i8) {
        I6.d dVar;
        if (i8 != 0) {
            if (p.a(i8)) {
                dVar = I6.d.f4284o;
            } else {
                d.a aVar = new d.a();
                if (!p.b(i8)) {
                    aVar.c();
                }
                if (!p.c(i8)) {
                    aVar.d();
                }
                dVar = aVar.a();
            }
        } else {
            dVar = null;
        }
        x.a h8 = new x.a().h(vVar.f24422d.toString());
        if (dVar != null) {
            h8.b(dVar);
        }
        return h8.a();
    }

    @Override // com.squareup.picasso.x
    public boolean c(v vVar) {
        String scheme = vVar.f24422d.getScheme();
        if (!"http".equals(scheme) && !"https".equals(scheme)) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.picasso.x
    int e() {
        return 2;
    }

    @Override // com.squareup.picasso.x
    public x.a f(v vVar, int i8) {
        s.e eVar;
        I6.z a8 = this.f24363a.a(j(vVar, i8));
        I6.A a9 = a8.a();
        if (a8.s()) {
            if (a8.f() == null) {
                eVar = s.e.NETWORK;
            } else {
                eVar = s.e.DISK;
            }
            if (eVar == s.e.DISK && a9.a() == 0) {
                a9.close();
                throw new a("Received response with 0 content-length header.");
            }
            if (eVar == s.e.NETWORK && a9.a() > 0) {
                this.f24364b.f(a9.a());
            }
            return new x.a(a9.g(), eVar);
        }
        a9.close();
        throw new b(a8.g(), vVar.f24421c);
    }

    @Override // com.squareup.picasso.x
    boolean h(boolean z8, NetworkInfo networkInfo) {
        if (networkInfo != null && !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.picasso.x
    boolean i() {
        return true;
    }
}
