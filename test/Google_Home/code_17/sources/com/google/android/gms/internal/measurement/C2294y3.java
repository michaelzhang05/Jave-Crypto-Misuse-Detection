package com.google.android.gms.internal.measurement;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.measurement.y3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2294y3 extends Y3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16904a;

    /* renamed from: b, reason: collision with root package name */
    private final w0.k f16905b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2294y3(Context context, w0.k kVar) {
        if (context != null) {
            this.f16904a = context;
            this.f16905b = kVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.Y3
    public final Context a() {
        return this.f16904a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.Y3
    public final w0.k b() {
        return this.f16905b;
    }

    public final boolean equals(Object obj) {
        w0.k kVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Y3) {
            Y3 y32 = (Y3) obj;
            if (this.f16904a.equals(y32.a()) && ((kVar = this.f16905b) != null ? kVar.equals(y32.b()) : y32.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f16904a.hashCode() ^ 1000003) * 1000003;
        w0.k kVar = this.f16905b;
        if (kVar == null) {
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.f16904a) + ", hermeticFileOverrides=" + String.valueOf(this.f16905b) + "}";
    }
}
