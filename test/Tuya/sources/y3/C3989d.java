package y3;

import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* renamed from: y3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3989d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3983b f39761a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39762b;

    public C3989d(InterfaceC3983b interfaceC3983b, boolean z8) {
        this.f39761a = interfaceC3983b;
        this.f39762b = z8;
    }

    public final boolean a() {
        return this.f39762b;
    }

    public final InterfaceC3983b b() {
        return this.f39761a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3989d)) {
            return false;
        }
        C3989d c3989d = (C3989d) obj;
        if (AbstractC3159y.d(this.f39761a, c3989d.f39761a) && this.f39762b == c3989d.f39762b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        InterfaceC3983b interfaceC3983b = this.f39761a;
        if (interfaceC3983b == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC3983b.hashCode();
        }
        return (hashCode * 31) + androidx.compose.foundation.a.a(this.f39762b);
    }

    public String toString() {
        return "MandateText(text=" + this.f39761a + ", showAbovePrimaryButton=" + this.f39762b + ")";
    }
}
