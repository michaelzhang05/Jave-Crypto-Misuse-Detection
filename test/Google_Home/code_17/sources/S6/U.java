package S6;

import P5.AbstractC1371l;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class U {

    /* renamed from: h, reason: collision with root package name */
    public static final a f9843h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9844a;

    /* renamed from: b, reason: collision with root package name */
    public int f9845b;

    /* renamed from: c, reason: collision with root package name */
    public int f9846c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9847d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9848e;

    /* renamed from: f, reason: collision with root package name */
    public U f9849f;

    /* renamed from: g, reason: collision with root package name */
    public U f9850g;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public U() {
        this.f9844a = new byte[8192];
        this.f9848e = true;
        this.f9847d = false;
    }

    public final void a() {
        int i8;
        U u8 = this.f9850g;
        if (u8 != this) {
            AbstractC3255y.f(u8);
            if (!u8.f9848e) {
                return;
            }
            int i9 = this.f9846c - this.f9845b;
            U u9 = this.f9850g;
            AbstractC3255y.f(u9);
            int i10 = 8192 - u9.f9846c;
            U u10 = this.f9850g;
            AbstractC3255y.f(u10);
            if (u10.f9847d) {
                i8 = 0;
            } else {
                U u11 = this.f9850g;
                AbstractC3255y.f(u11);
                i8 = u11.f9845b;
            }
            if (i9 > i10 + i8) {
                return;
            }
            U u12 = this.f9850g;
            AbstractC3255y.f(u12);
            f(u12, i9);
            b();
            V.b(this);
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    public final U b() {
        U u8 = this.f9849f;
        if (u8 == this) {
            u8 = null;
        }
        U u9 = this.f9850g;
        AbstractC3255y.f(u9);
        u9.f9849f = this.f9849f;
        U u10 = this.f9849f;
        AbstractC3255y.f(u10);
        u10.f9850g = this.f9850g;
        this.f9849f = null;
        this.f9850g = null;
        return u8;
    }

    public final U c(U segment) {
        AbstractC3255y.i(segment, "segment");
        segment.f9850g = this;
        segment.f9849f = this.f9849f;
        U u8 = this.f9849f;
        AbstractC3255y.f(u8);
        u8.f9850g = segment;
        this.f9849f = segment;
        return segment;
    }

    public final U d() {
        this.f9847d = true;
        return new U(this.f9844a, this.f9845b, this.f9846c, true, false);
    }

    public final U e(int i8) {
        U c8;
        if (i8 > 0 && i8 <= this.f9846c - this.f9845b) {
            if (i8 >= 1024) {
                c8 = d();
            } else {
                c8 = V.c();
                byte[] bArr = this.f9844a;
                byte[] bArr2 = c8.f9844a;
                int i9 = this.f9845b;
                AbstractC1371l.j(bArr, bArr2, 0, i9, i9 + i8, 2, null);
            }
            c8.f9846c = c8.f9845b + i8;
            this.f9845b += i8;
            U u8 = this.f9850g;
            AbstractC3255y.f(u8);
            u8.c(c8);
            return c8;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    public final void f(U sink, int i8) {
        AbstractC3255y.i(sink, "sink");
        if (sink.f9848e) {
            int i9 = sink.f9846c;
            if (i9 + i8 > 8192) {
                if (!sink.f9847d) {
                    int i10 = sink.f9845b;
                    if ((i9 + i8) - i10 <= 8192) {
                        byte[] bArr = sink.f9844a;
                        AbstractC1371l.j(bArr, bArr, 0, i10, i9, 2, null);
                        sink.f9846c -= sink.f9845b;
                        sink.f9845b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f9844a;
            byte[] bArr3 = sink.f9844a;
            int i11 = sink.f9846c;
            int i12 = this.f9845b;
            AbstractC1371l.d(bArr2, bArr3, i11, i12, i12 + i8);
            sink.f9846c += i8;
            this.f9845b += i8;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public U(byte[] data, int i8, int i9, boolean z8, boolean z9) {
        AbstractC3255y.i(data, "data");
        this.f9844a = data;
        this.f9845b = i8;
        this.f9846c = i9;
        this.f9847d = z8;
        this.f9848e = z9;
    }
}
