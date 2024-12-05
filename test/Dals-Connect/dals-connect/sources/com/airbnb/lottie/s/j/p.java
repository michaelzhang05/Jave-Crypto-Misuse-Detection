package com.airbnb.lottie.s.j;

import android.graphics.Paint;
import java.util.List;

/* compiled from: ShapeStroke.java */
/* loaded from: classes.dex */
public class p implements com.airbnb.lottie.s.j.b {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.b f8191b;

    /* renamed from: c, reason: collision with root package name */
    private final List<com.airbnb.lottie.s.i.b> f8192c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.a f8193d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.d f8194e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.b f8195f;

    /* renamed from: g, reason: collision with root package name */
    private final b f8196g;

    /* renamed from: h, reason: collision with root package name */
    private final c f8197h;

    /* renamed from: i, reason: collision with root package name */
    private final float f8198i;

    /* compiled from: ShapeStroke.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f8199b;

        static {
            int[] iArr = new int[c.values().length];
            f8199b = iArr;
            try {
                iArr[c.Bevel.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8199b[c.Miter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8199b[c.Round.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            a = iArr2;
            try {
                iArr2[b.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: ShapeStroke.java */
    /* loaded from: classes.dex */
    public enum b {
        Butt,
        Round,
        Unknown;

        public Paint.Cap d() {
            int i2 = a.a[ordinal()];
            if (i2 == 1) {
                return Paint.Cap.BUTT;
            }
            if (i2 != 2) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }
    }

    /* compiled from: ShapeStroke.java */
    /* loaded from: classes.dex */
    public enum c {
        Miter,
        Round,
        Bevel;

        public Paint.Join d() {
            int i2 = a.f8199b[ordinal()];
            if (i2 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i2 == 2) {
                return Paint.Join.MITER;
            }
            if (i2 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public p(String str, com.airbnb.lottie.s.i.b bVar, List<com.airbnb.lottie.s.i.b> list, com.airbnb.lottie.s.i.a aVar, com.airbnb.lottie.s.i.d dVar, com.airbnb.lottie.s.i.b bVar2, b bVar3, c cVar, float f2) {
        this.a = str;
        this.f8191b = bVar;
        this.f8192c = list;
        this.f8193d = aVar;
        this.f8194e = dVar;
        this.f8195f = bVar2;
        this.f8196g = bVar3;
        this.f8197h = cVar;
        this.f8198i = f2;
    }

    @Override // com.airbnb.lottie.s.j.b
    public com.airbnb.lottie.q.a.b a(com.airbnb.lottie.f fVar, com.airbnb.lottie.s.k.a aVar) {
        return new com.airbnb.lottie.q.a.q(fVar, aVar, this);
    }

    public b b() {
        return this.f8196g;
    }

    public com.airbnb.lottie.s.i.a c() {
        return this.f8193d;
    }

    public com.airbnb.lottie.s.i.b d() {
        return this.f8191b;
    }

    public c e() {
        return this.f8197h;
    }

    public List<com.airbnb.lottie.s.i.b> f() {
        return this.f8192c;
    }

    public float g() {
        return this.f8198i;
    }

    public String h() {
        return this.a;
    }

    public com.airbnb.lottie.s.i.d i() {
        return this.f8194e;
    }

    public com.airbnb.lottie.s.i.b j() {
        return this.f8195f;
    }
}
