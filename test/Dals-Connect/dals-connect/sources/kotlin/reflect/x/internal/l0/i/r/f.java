package kotlin.reflect.x.internal.l0.i.r;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.f.b;

/* compiled from: ClassLiteralValue.kt */
/* loaded from: classes2.dex */
public final class f {
    private final b a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20868b;

    public f(b bVar, int i2) {
        l.f(bVar, "classId");
        this.a = bVar;
        this.f20868b = i2;
    }

    public final b a() {
        return this.a;
    }

    public final int b() {
        return this.f20868b;
    }

    public final int c() {
        return this.f20868b;
    }

    public final b d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.a, fVar.a) && this.f20868b == fVar.f20868b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.f20868b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.f20868b;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.a);
        int i4 = this.f20868b;
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append(">");
        }
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
