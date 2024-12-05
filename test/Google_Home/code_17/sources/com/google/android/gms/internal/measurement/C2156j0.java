package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2156j0 extends AbstractC2228r0 {

    /* renamed from: c, reason: collision with root package name */
    private final String f16678c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16679d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f16680e;

    /* renamed from: f, reason: collision with root package name */
    private final EnumC2246t0 f16681f;

    @Override // com.google.android.gms.internal.measurement.AbstractC2228r0
    public final InterfaceC2136h0 a() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2228r0
    public final InterfaceC2126g0 b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2228r0
    public final EnumC2246t0 c() {
        return this.f16681f;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2228r0
    public final String d() {
        return this.f16678c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2228r0
    public final boolean e() {
        return this.f16679d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2228r0) {
            AbstractC2228r0 abstractC2228r0 = (AbstractC2228r0) obj;
            if (this.f16678c.equals(abstractC2228r0.d()) && this.f16679d == abstractC2228r0.e() && this.f16680e == abstractC2228r0.f()) {
                abstractC2228r0.a();
                abstractC2228r0.b();
                if (this.f16681f.equals(abstractC2228r0.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2228r0
    public final boolean f() {
        return this.f16680e;
    }

    public final int hashCode() {
        int i8;
        int hashCode = (this.f16678c.hashCode() ^ 1000003) * 1000003;
        int i9 = 1237;
        if (this.f16679d) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        int i10 = (hashCode ^ i8) * 1000003;
        if (this.f16680e) {
            i9 = 1231;
        }
        return ((i10 ^ i9) * 583896283) ^ this.f16681f.hashCode();
    }

    public final String toString() {
        return "FileComplianceOptions{fileOwner=" + this.f16678c + ", hasDifferentDmaOwner=" + this.f16679d + ", skipChecks=" + this.f16680e + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + String.valueOf(this.f16681f) + "}";
    }

    private C2156j0(String str, boolean z8, boolean z9, InterfaceC2136h0 interfaceC2136h0, InterfaceC2126g0 interfaceC2126g0, EnumC2246t0 enumC2246t0) {
        this.f16678c = str;
        this.f16679d = z8;
        this.f16680e = z9;
        this.f16681f = enumC2246t0;
    }
}
