package h4;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: h4.r0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2951r0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f32733a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32734b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32735c;

    public C2951r0(String url, int i8, int i9) {
        AbstractC3255y.i(url, "url");
        this.f32733a = url;
        this.f32734b = i8;
        this.f32735c = i9;
    }

    public final int a() {
        return this.f32735c;
    }

    public final int b() {
        return this.f32734b;
    }

    public final String c() {
        return this.f32733a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2951r0)) {
            return false;
        }
        C2951r0 c2951r0 = (C2951r0) obj;
        if (AbstractC3255y.d(this.f32733a, c2951r0.f32733a) && this.f32734b == c2951r0.f32734b && this.f32735c == c2951r0.f32735c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f32733a.hashCode() * 31) + this.f32734b) * 31) + this.f32735c;
    }

    public String toString() {
        return "LinkAnnotation(url=" + this.f32733a + ", start=" + this.f32734b + ", end=" + this.f32735c + ")";
    }
}
