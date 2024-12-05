package com.google.android.gms.measurement.internal;

import android.util.SparseArray;
import z0.InterfaceC4215a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class O3 implements InterfaceC4215a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2481y5 f17276a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f17277b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O3(A3 a32, C2481y5 c2481y5) {
        this.f17276a = c2481y5;
        this.f17277b = a32;
    }

    private final void c() {
        SparseArray K8 = this.f17277b.f().K();
        C2481y5 c2481y5 = this.f17276a;
        K8.put(c2481y5.f17930c, Long.valueOf(c2481y5.f17929b));
        this.f17277b.f().s(K8);
    }

    @Override // z0.InterfaceC4215a
    public final void a(Object obj) {
        this.f17277b.k();
        if (!this.f17277b.a().q(H.f17078N0)) {
            this.f17277b.f16949i = false;
            this.f17277b.H0();
            this.f17277b.c().F().b("registerTriggerAsync ran. uri", this.f17276a.f17928a);
        } else {
            c();
            this.f17277b.f16949i = false;
            this.f17277b.f16950j = 1;
            this.f17277b.c().F().b("Successfully registered trigger URI", this.f17276a.f17928a);
            this.f17277b.H0();
        }
    }

    @Override // z0.InterfaceC4215a
    public final void b(Throwable th) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        this.f17277b.k();
        this.f17277b.f16949i = false;
        if (!this.f17277b.a().q(H.f17078N0)) {
            this.f17277b.H0();
            this.f17277b.c().G().b("registerTriggerAsync failed with throwable", th);
            return;
        }
        if (this.f17277b.a().q(H.f17074L0)) {
            i8 = A3.C(this.f17277b, th);
        } else {
            i8 = 2;
        }
        int i13 = i8 - 1;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    this.f17277b.c().G().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", C2367i2.s(this.f17277b.m().F()), th);
                    c();
                    this.f17277b.f16950j = 1;
                    this.f17277b.H0();
                    return;
                }
                return;
            }
            this.f17277b.A0().add(this.f17276a);
            i9 = this.f17277b.f16950j;
            if (i9 > 32) {
                this.f17277b.f16950j = 1;
                this.f17277b.c().L().c("registerTriggerAsync failed. May try later. App ID, throwable", C2367i2.s(this.f17277b.m().F()), C2367i2.s(th.toString()));
                return;
            }
            C2381k2 L8 = this.f17277b.c().L();
            Object s8 = C2367i2.s(this.f17277b.m().F());
            i10 = this.f17277b.f16950j;
            L8.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", s8, C2367i2.s(String.valueOf(i10)), C2367i2.s(th.toString()));
            A3 a32 = this.f17277b;
            i11 = a32.f16950j;
            A3.P0(a32, i11);
            A3 a33 = this.f17277b;
            i12 = a33.f16950j;
            a33.f16950j = i12 << 1;
            return;
        }
        this.f17277b.c().L().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", C2367i2.s(this.f17277b.m().F()), C2367i2.s(th.toString()));
        this.f17277b.f16950j = 1;
        this.f17277b.A0().add(this.f17276a);
    }
}
