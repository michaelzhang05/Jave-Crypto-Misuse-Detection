package B3;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final B2.b f805a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f806b;

    public d(B2.b bVar, boolean z8) {
        this.f805a = bVar;
        this.f806b = z8;
    }

    public final boolean a() {
        return this.f806b;
    }

    public final B2.b b() {
        return this.f805a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3255y.d(this.f805a, dVar.f805a) && this.f806b == dVar.f806b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        B2.b bVar = this.f805a;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        return (hashCode * 31) + androidx.compose.foundation.a.a(this.f806b);
    }

    public String toString() {
        return "MandateText(text=" + this.f805a + ", showAbovePrimaryButton=" + this.f806b + ")";
    }
}
