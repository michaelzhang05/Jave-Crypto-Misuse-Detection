package com.google.android.gms.common.api.internal;

import N.C1331b;
import O.a;
import P.C1357b;
import Q.AbstractC1387c;
import Q.InterfaceC1394j;
import android.os.Handler;
import android.util.Log;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class q implements AbstractC1387c.InterfaceC0179c, P.x {

    /* renamed from: a, reason: collision with root package name */
    private final a.f f15986a;

    /* renamed from: b, reason: collision with root package name */
    private final C1357b f15987b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC1394j f15988c = null;

    /* renamed from: d, reason: collision with root package name */
    private Set f15989d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15990e = false;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2063c f15991f;

    public q(C2063c c2063c, a.f fVar, C1357b c1357b) {
        this.f15991f = c2063c;
        this.f15986a = fVar;
        this.f15987b = c1357b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        InterfaceC1394j interfaceC1394j;
        if (this.f15990e && (interfaceC1394j = this.f15988c) != null) {
            this.f15986a.m(interfaceC1394j, this.f15989d);
        }
    }

    @Override // P.x
    public final void a(InterfaceC1394j interfaceC1394j, Set set) {
        if (interfaceC1394j != null && set != null) {
            this.f15988c = interfaceC1394j;
            this.f15989d = set;
            i();
        } else {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            c(new C1331b(4));
        }
    }

    @Override // Q.AbstractC1387c.InterfaceC0179c
    public final void b(C1331b c1331b) {
        Handler handler;
        handler = this.f15991f.f15946n;
        handler.post(new p(this, c1331b));
    }

    @Override // P.x
    public final void c(C1331b c1331b) {
        Map map;
        map = this.f15991f.f15942j;
        n nVar = (n) map.get(this.f15987b);
        if (nVar != null) {
            nVar.I(c1331b);
        }
    }

    @Override // P.x
    public final void d(int i8) {
        Map map;
        boolean z8;
        map = this.f15991f.f15942j;
        n nVar = (n) map.get(this.f15987b);
        if (nVar != null) {
            z8 = nVar.f15977q;
            if (z8) {
                nVar.I(new C1331b(17));
            } else {
                nVar.h(i8);
            }
        }
    }
}
