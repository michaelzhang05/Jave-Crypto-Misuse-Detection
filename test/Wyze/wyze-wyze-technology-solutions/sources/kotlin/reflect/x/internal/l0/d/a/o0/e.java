package kotlin.reflect.x.internal.l0.d.a.o0;

import kotlin.jvm.internal.g;

/* compiled from: typeQualifiers.kt */
/* loaded from: classes2.dex */
public final class e {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final e f20122b = new e(null, null, false, false, 8, null);

    /* renamed from: c, reason: collision with root package name */
    private final h f20123c;

    /* renamed from: d, reason: collision with root package name */
    private final f f20124d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20125e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f20126f;

    /* compiled from: typeQualifiers.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final e a() {
            return e.f20122b;
        }
    }

    public e(h hVar, f fVar, boolean z, boolean z2) {
        this.f20123c = hVar;
        this.f20124d = fVar;
        this.f20125e = z;
        this.f20126f = z2;
    }

    public final boolean b() {
        return this.f20125e;
    }

    public final f c() {
        return this.f20124d;
    }

    public final h d() {
        return this.f20123c;
    }

    public final boolean e() {
        return this.f20126f;
    }

    public /* synthetic */ e(h hVar, f fVar, boolean z, boolean z2, int i2, g gVar) {
        this(hVar, fVar, z, (i2 & 8) != 0 ? false : z2);
    }
}
