package e4;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: e4.r0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2631r0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f30812a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30813b;

    /* renamed from: c, reason: collision with root package name */
    private final int f30814c;

    public C2631r0(String url, int i8, int i9) {
        AbstractC3159y.i(url, "url");
        this.f30812a = url;
        this.f30813b = i8;
        this.f30814c = i9;
    }

    public final int a() {
        return this.f30814c;
    }

    public final int b() {
        return this.f30813b;
    }

    public final String c() {
        return this.f30812a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2631r0)) {
            return false;
        }
        C2631r0 c2631r0 = (C2631r0) obj;
        if (AbstractC3159y.d(this.f30812a, c2631r0.f30812a) && this.f30813b == c2631r0.f30813b && this.f30814c == c2631r0.f30814c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f30812a.hashCode() * 31) + this.f30813b) * 31) + this.f30814c;
    }

    public String toString() {
        return "LinkAnnotation(url=" + this.f30812a + ", start=" + this.f30813b + ", end=" + this.f30814c + ")";
    }
}
