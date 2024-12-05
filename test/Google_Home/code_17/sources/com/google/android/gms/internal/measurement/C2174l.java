package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2174l implements InterfaceC2236s {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2236s f16696a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16697b;

    public C2174l(String str) {
        this.f16696a = InterfaceC2236s.f16802b0;
        this.f16697b = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final String A() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final Iterator B() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final InterfaceC2236s C(String str, V2 v22, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final InterfaceC2236s a() {
        return this.f16696a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final InterfaceC2236s b() {
        return new C2174l(this.f16697b, this.f16696a.b());
    }

    public final String c() {
        return this.f16697b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2174l)) {
            return false;
        }
        C2174l c2174l = (C2174l) obj;
        if (this.f16697b.equals(c2174l.f16697b) && this.f16696a.equals(c2174l.f16696a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16697b.hashCode() * 31) + this.f16696a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final Boolean y() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final Double z() {
        throw new IllegalStateException("Control is not a double");
    }

    public C2174l(String str, InterfaceC2236s interfaceC2236s) {
        this.f16696a = interfaceC2236s;
        this.f16697b = str;
    }
}
