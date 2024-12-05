package com.squareup.picasso;

import F6.d;
import F6.x;
import android.net.NetworkInfo;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import i2.InterfaceC2775c;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class q extends x {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2775c f23308a;

    /* renamed from: b, reason: collision with root package name */
    private final z f23309b;

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
        final int f23310a;

        /* renamed from: b, reason: collision with root package name */
        final int f23311b;

        b(int i8, int i9) {
            super("HTTP " + i8);
            this.f23310a = i8;
            this.f23311b = i9;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(InterfaceC2775c interfaceC2775c, z zVar) {
        this.f23308a = interfaceC2775c;
        this.f23309b = zVar;
    }

    private static F6.x j(v vVar, int i8) {
        F6.d dVar;
        if (i8 != 0) {
            if (p.a(i8)) {
                dVar = F6.d.f2744o;
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
        x.a h8 = new x.a().h(vVar.f23367d.toString());
        if (dVar != null) {
            h8.b(dVar);
        }
        return h8.a();
    }

    @Override // com.squareup.picasso.x
    public boolean c(v vVar) {
        String scheme = vVar.f23367d.getScheme();
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
        F6.z a8 = this.f23308a.a(j(vVar, i8));
        F6.A a9 = a8.a();
        if (a8.o()) {
            if (a8.e() == null) {
                eVar = s.e.NETWORK;
            } else {
                eVar = s.e.DISK;
            }
            if (eVar == s.e.DISK && a9.a() == 0) {
                a9.close();
                throw new a("Received response with 0 content-length header.");
            }
            if (eVar == s.e.NETWORK && a9.a() > 0) {
                this.f23309b.f(a9.a());
            }
            return new x.a(a9.f(), eVar);
        }
        a9.close();
        throw new b(a8.f(), vVar.f23366c);
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
