package kotlin.reflect.x.internal.l0.d.b;

import com.google.android.gms.ads.AdRequest;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.l.r1;

/* compiled from: TypeMappingMode.kt */
/* loaded from: classes2.dex */
public final class a0 {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f20231b;

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f20232c;

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f20233d;

    /* renamed from: e, reason: collision with root package name */
    public static final a0 f20234e;

    /* renamed from: f, reason: collision with root package name */
    public static final a0 f20235f;

    /* renamed from: g, reason: collision with root package name */
    public static final a0 f20236g;

    /* renamed from: h, reason: collision with root package name */
    public static final a0 f20237h;

    /* renamed from: i, reason: collision with root package name */
    public static final a0 f20238i;

    /* renamed from: j, reason: collision with root package name */
    public static final a0 f20239j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f20240k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final a0 p;
    private final boolean q;
    private final a0 r;
    private final a0 s;
    private final boolean t;

    /* compiled from: TypeMappingMode.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* compiled from: TypeMappingMode.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[r1.values().length];
            iArr[r1.IN_VARIANCE.ordinal()] = 1;
            iArr[r1.INVARIANT.ordinal()] = 2;
            a = iArr;
        }
    }

    static {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        a0 a0Var = null;
        boolean z5 = false;
        a0 a0Var2 = null;
        a0 a0Var3 = null;
        boolean z6 = false;
        g gVar = null;
        a0 a0Var4 = new a0(z, false, z2, z3, z4, a0Var, z5, a0Var2, a0Var3, z6, 1023, gVar);
        f20231b = a0Var4;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        a0 a0Var5 = null;
        a0 a0Var6 = null;
        boolean z13 = true;
        g gVar2 = null;
        a0 a0Var7 = new a0(z7, z8, z9, z10, z11, null, z12, a0Var5, a0Var6, z13, 511, gVar2);
        f20232c = a0Var7;
        f20233d = new a0(z, true, z2, z3, z4, a0Var, z5, a0Var2, a0Var3, z6, 1021, gVar);
        int i2 = 988;
        f20234e = new a0(z, false, z2, z3, z4, a0Var4, z5, a0Var2, a0Var3, z6, i2, gVar);
        f20235f = new a0(z7, z8, z9, z10, z11, a0Var7, z12, a0Var5, a0Var6, z13, 476, gVar2);
        f20236g = new a0(z, true, z2, z3, z4, a0Var4, z5, a0Var2, a0Var3, z6, i2, gVar);
        boolean z14 = false;
        boolean z15 = true;
        f20237h = new a0(z, z14, z2, z15, z4, a0Var4, z5, a0Var2, a0Var3, z6, 983, gVar);
        f20238i = new a0(z, z14, z2, z15, z4, a0Var4, z5, a0Var2, a0Var3, z6, 919, gVar);
        f20239j = new a0(z, z14, true, false, z4, a0Var4, z5, a0Var2, a0Var3, z6, 984, gVar);
    }

    public a0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, a0 a0Var, boolean z6, a0 a0Var2, a0 a0Var3, boolean z7) {
        this.f20240k = z;
        this.l = z2;
        this.m = z3;
        this.n = z4;
        this.o = z5;
        this.p = a0Var;
        this.q = z6;
        this.r = a0Var2;
        this.s = a0Var3;
        this.t = z7;
    }

    public final boolean a() {
        return this.q;
    }

    public final boolean b() {
        return this.t;
    }

    public final boolean c() {
        return this.l;
    }

    public final boolean d() {
        return this.f20240k;
    }

    public final boolean e() {
        return this.m;
    }

    public final a0 f(r1 r1Var, boolean z) {
        l.f(r1Var, "effectiveVariance");
        if (!z || !this.m) {
            int i2 = b.a[r1Var.ordinal()];
            if (i2 == 1) {
                a0 a0Var = this.r;
                if (a0Var != null) {
                    return a0Var;
                }
            } else if (i2 != 2) {
                a0 a0Var2 = this.p;
                if (a0Var2 != null) {
                    return a0Var2;
                }
            } else {
                a0 a0Var3 = this.s;
                if (a0Var3 != null) {
                    return a0Var3;
                }
            }
        }
        return this;
    }

    public final a0 g() {
        return new a0(this.f20240k, true, this.m, this.n, this.o, this.p, this.q, this.r, this.s, false, AdRequest.MAX_CONTENT_URL_LENGTH, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ a0(boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, kotlin.reflect.x.internal.l0.d.b.a0 r17, boolean r18, kotlin.reflect.x.internal.l0.d.b.a0 r19, kotlin.reflect.x.internal.l0.d.b.a0 r20, boolean r21, int r22, kotlin.jvm.internal.g r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 1
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = r12
        La:
            r3 = r0 & 2
            if (r3 == 0) goto L10
            r3 = 1
            goto L11
        L10:
            r3 = r13
        L11:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L18
            r4 = 0
            goto L19
        L18:
            r4 = r14
        L19:
            r6 = r0 & 8
            if (r6 == 0) goto L1f
            r6 = 0
            goto L20
        L1f:
            r6 = r15
        L20:
            r7 = r0 & 16
            if (r7 == 0) goto L26
            r7 = 0
            goto L28
        L26:
            r7 = r16
        L28:
            r8 = r0 & 32
            if (r8 == 0) goto L2e
            r8 = 0
            goto L30
        L2e:
            r8 = r17
        L30:
            r9 = r0 & 64
            if (r9 == 0) goto L35
            goto L37
        L35:
            r2 = r18
        L37:
            r9 = r0 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L3d
            r9 = r8
            goto L3f
        L3d:
            r9 = r19
        L3f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L45
            r10 = r8
            goto L47
        L45:
            r10 = r20
        L47:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L4c
            goto L4e
        L4c:
            r5 = r21
        L4e:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r2
            r20 = r9
            r21 = r10
            r22 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.d.b.a0.<init>(boolean, boolean, boolean, boolean, boolean, kotlin.f0.x.e.l0.d.b.a0, boolean, kotlin.f0.x.e.l0.d.b.a0, kotlin.f0.x.e.l0.d.b.a0, boolean, int, kotlin.a0.d.g):void");
    }
}
