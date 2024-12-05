package j;

import java.util.Arrays;

/* compiled from: Segment.kt */
/* loaded from: classes2.dex */
public final class y {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f19405b;

    /* renamed from: c, reason: collision with root package name */
    public int f19406c;

    /* renamed from: d, reason: collision with root package name */
    public int f19407d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19408e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19409f;

    /* renamed from: g, reason: collision with root package name */
    public y f19410g;

    /* renamed from: h, reason: collision with root package name */
    public y f19411h;

    /* compiled from: Segment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public y() {
        this.f19405b = new byte[8192];
        this.f19409f = true;
        this.f19408e = false;
    }

    public final void a() {
        y yVar = this.f19411h;
        int i2 = 0;
        if (yVar != this) {
            kotlin.jvm.internal.l.c(yVar);
            if (yVar.f19409f) {
                int i3 = this.f19407d - this.f19406c;
                y yVar2 = this.f19411h;
                kotlin.jvm.internal.l.c(yVar2);
                int i4 = 8192 - yVar2.f19407d;
                y yVar3 = this.f19411h;
                kotlin.jvm.internal.l.c(yVar3);
                if (!yVar3.f19408e) {
                    y yVar4 = this.f19411h;
                    kotlin.jvm.internal.l.c(yVar4);
                    i2 = yVar4.f19406c;
                }
                if (i3 > i4 + i2) {
                    return;
                }
                y yVar5 = this.f19411h;
                kotlin.jvm.internal.l.c(yVar5);
                g(yVar5, i3);
                b();
                z.b(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    public final y b() {
        y yVar = this.f19410g;
        if (yVar == this) {
            yVar = null;
        }
        y yVar2 = this.f19411h;
        kotlin.jvm.internal.l.c(yVar2);
        yVar2.f19410g = this.f19410g;
        y yVar3 = this.f19410g;
        kotlin.jvm.internal.l.c(yVar3);
        yVar3.f19411h = this.f19411h;
        this.f19410g = null;
        this.f19411h = null;
        return yVar;
    }

    public final y c(y yVar) {
        kotlin.jvm.internal.l.f(yVar, "segment");
        yVar.f19411h = this;
        yVar.f19410g = this.f19410g;
        y yVar2 = this.f19410g;
        kotlin.jvm.internal.l.c(yVar2);
        yVar2.f19411h = yVar;
        this.f19410g = yVar;
        return yVar;
    }

    public final y d() {
        this.f19408e = true;
        return new y(this.f19405b, this.f19406c, this.f19407d, true, false);
    }

    public final y e(int i2) {
        y c2;
        if (i2 > 0 && i2 <= this.f19407d - this.f19406c) {
            if (i2 >= 1024) {
                c2 = d();
            } else {
                c2 = z.c();
                byte[] bArr = this.f19405b;
                byte[] bArr2 = c2.f19405b;
                int i3 = this.f19406c;
                kotlin.collections.m.f(bArr, bArr2, 0, i3, i3 + i2, 2, null);
            }
            c2.f19407d = c2.f19406c + i2;
            this.f19406c += i2;
            y yVar = this.f19411h;
            kotlin.jvm.internal.l.c(yVar);
            yVar.c(c2);
            return c2;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    public final y f() {
        byte[] bArr = this.f19405b;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.l.e(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new y(copyOf, this.f19406c, this.f19407d, false, true);
    }

    public final void g(y yVar, int i2) {
        kotlin.jvm.internal.l.f(yVar, "sink");
        if (yVar.f19409f) {
            int i3 = yVar.f19407d;
            if (i3 + i2 > 8192) {
                if (!yVar.f19408e) {
                    int i4 = yVar.f19406c;
                    if ((i3 + i2) - i4 <= 8192) {
                        byte[] bArr = yVar.f19405b;
                        kotlin.collections.m.f(bArr, bArr, 0, i4, i3, 2, null);
                        yVar.f19407d -= yVar.f19406c;
                        yVar.f19406c = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f19405b;
            byte[] bArr3 = yVar.f19405b;
            int i5 = yVar.f19407d;
            int i6 = this.f19406c;
            kotlin.collections.m.d(bArr2, bArr3, i5, i6, i6 + i2);
            yVar.f19407d += i2;
            this.f19406c += i2;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public y(byte[] bArr, int i2, int i3, boolean z, boolean z2) {
        kotlin.jvm.internal.l.f(bArr, "data");
        this.f19405b = bArr;
        this.f19406c = i2;
        this.f19407d = i3;
        this.f19408e = z;
        this.f19409f = z2;
    }
}
