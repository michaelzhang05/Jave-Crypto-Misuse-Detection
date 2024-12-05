package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C2298y7;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2336e extends AbstractC2315b {

    /* renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.K1 f17556g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ g6 f17557h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2336e(g6 g6Var, String str, int i8, com.google.android.gms.internal.measurement.K1 k12) {
        super(str, i8);
        this.f17557h = g6Var;
        this.f17556g = k12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC2315b
    public final int a() {
        return this.f17556g.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC2315b
    public final boolean i() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC2315b
    public final boolean j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k(Long l8, Long l9, com.google.android.gms.internal.measurement.I2 i22, boolean z8) {
        boolean z9;
        boolean z10;
        Object obj;
        if (C2298y7.a() && this.f17557h.a().J(this.f17461a, H.f17143n0)) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean L8 = this.f17556g.L();
        boolean M8 = this.f17556g.M();
        boolean N8 = this.f17556g.N();
        if (!L8 && !M8 && !N8) {
            z10 = false;
        } else {
            z10 = true;
        }
        Boolean bool = null;
        Integer num = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z8 && !z10) {
            C2381k2 K8 = this.f17557h.c().K();
            Integer valueOf = Integer.valueOf(this.f17462b);
            if (this.f17556g.O()) {
                num = Integer.valueOf(this.f17556g.j());
            }
            K8.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf, num);
            return true;
        }
        com.google.android.gms.internal.measurement.I1 H8 = this.f17556g.H();
        boolean M9 = H8.M();
        if (i22.Y()) {
            if (!H8.O()) {
                this.f17557h.c().L().b("No number filter for long property. property", this.f17557h.d().g(i22.U()));
            } else {
                bool = AbstractC2315b.d(AbstractC2315b.c(i22.P(), H8.J()), M9);
            }
        } else if (i22.W()) {
            if (!H8.O()) {
                this.f17557h.c().L().b("No number filter for double property. property", this.f17557h.d().g(i22.U()));
            } else {
                bool = AbstractC2315b.d(AbstractC2315b.b(i22.G(), H8.J()), M9);
            }
        } else if (i22.a0()) {
            if (!H8.Q()) {
                if (!H8.O()) {
                    this.f17557h.c().L().b("No string or number filter defined. property", this.f17557h.d().g(i22.U()));
                } else if (W5.h0(i22.V())) {
                    bool = AbstractC2315b.d(AbstractC2315b.e(i22.V(), H8.J()), M9);
                } else {
                    this.f17557h.c().L().c("Invalid user property value for Numeric number filter. property, value", this.f17557h.d().g(i22.U()), i22.V());
                }
            } else {
                bool = AbstractC2315b.d(AbstractC2315b.g(i22.V(), H8.K(), this.f17557h.c()), M9);
            }
        } else {
            this.f17557h.c().L().b("User property has no value, property", this.f17557h.d().g(i22.U()));
        }
        C2381k2 K9 = this.f17557h.c().K();
        if (bool == null) {
            obj = "null";
        } else {
            obj = bool;
        }
        K9.b("Property filter result", obj);
        if (bool == null) {
            return false;
        }
        this.f17463c = Boolean.TRUE;
        if (N8 && !bool.booleanValue()) {
            return true;
        }
        if (!z8 || this.f17556g.L()) {
            this.f17464d = bool;
        }
        if (bool.booleanValue() && z10 && i22.Z()) {
            long R8 = i22.R();
            if (l8 != null) {
                R8 = l8.longValue();
            }
            if (z9 && this.f17556g.L() && !this.f17556g.M() && l9 != null) {
                R8 = l9.longValue();
            }
            if (this.f17556g.M()) {
                this.f17466f = Long.valueOf(R8);
            } else {
                this.f17465e = Long.valueOf(R8);
            }
        }
        return true;
    }
}
