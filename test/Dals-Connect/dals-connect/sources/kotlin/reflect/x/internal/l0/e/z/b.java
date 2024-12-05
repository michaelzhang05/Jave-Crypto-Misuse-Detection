package kotlin.reflect.x.internal.l0.e.z;

import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.x.internal.l0.e.c;
import kotlin.reflect.x.internal.l0.e.j;
import kotlin.reflect.x.internal.l0.e.k;
import kotlin.reflect.x.internal.l0.e.x;

/* compiled from: Flags.java */
/* loaded from: classes2.dex */
public class b {
    public static final C0329b A;
    public static final C0329b B;
    public static final C0329b C;
    public static final C0329b D;
    public static final C0329b E;
    public static final C0329b F;
    public static final C0329b G;
    public static final C0329b H;
    public static final C0329b I;
    public static final C0329b J;
    public static final C0329b K;
    public static final C0329b L;
    public static final C0329b M;
    public static final C0329b N;
    public static final C0329b O;
    public static final C0329b a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0329b f20691b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0329b f20692c;

    /* renamed from: d, reason: collision with root package name */
    public static final d<x> f20693d;

    /* renamed from: e, reason: collision with root package name */
    public static final d<k> f20694e;

    /* renamed from: f, reason: collision with root package name */
    public static final d<c.EnumC0324c> f20695f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0329b f20696g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0329b f20697h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0329b f20698i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0329b f20699j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0329b f20700k;
    public static final C0329b l;
    public static final C0329b m;
    public static final C0329b n;
    public static final d<j> o;
    public static final C0329b p;
    public static final C0329b q;
    public static final C0329b r;
    public static final C0329b s;
    public static final C0329b t;
    public static final C0329b u;
    public static final C0329b v;
    public static final C0329b w;
    public static final C0329b x;
    public static final C0329b y;
    public static final C0329b z;

    /* compiled from: Flags.java */
    /* renamed from: kotlin.f0.x.e.l0.e.z.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0329b extends d<Boolean> {
        public C0329b(int i2) {
            super(i2, 1);
        }

        private static /* synthetic */ void f(int i2) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
        }

        @Override // kotlin.f0.x.e.l0.e.z.b.d
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Boolean d(int i2) {
            Boolean valueOf = Boolean.valueOf((i2 & (1 << this.a)) != 0);
            if (valueOf == null) {
                f(0);
            }
            return valueOf;
        }

        @Override // kotlin.f0.x.e.l0.e.z.b.d
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.a;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Flags.java */
    /* loaded from: classes2.dex */
    public static class c<E extends i.a> extends d<E> {

        /* renamed from: c, reason: collision with root package name */
        private final E[] f20701c;

        public c(int i2, E[] eArr) {
            super(i2, g(eArr));
            this.f20701c = eArr;
        }

        private static /* synthetic */ void f(int i2) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        private static <E> int g(E[] eArr) {
            if (eArr == null) {
                f(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i2 = 31; i2 >= 0; i2--) {
                if (((1 << i2) & length) != 0) {
                    return i2 + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + eArr.getClass());
        }

        @Override // kotlin.f0.x.e.l0.e.z.b.d
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public E d(int i2) {
            int i3 = (1 << this.f20702b) - 1;
            int i4 = this.a;
            int i5 = (i2 & (i3 << i4)) >> i4;
            for (E e2 : this.f20701c) {
                if (e2.a() == i5) {
                    return e2;
                }
            }
            return null;
        }

        @Override // kotlin.f0.x.e.l0.e.z.b.d
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public int e(E e2) {
            return e2.a() << this.a;
        }
    }

    /* compiled from: Flags.java */
    /* loaded from: classes2.dex */
    public static abstract class d<E> {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20702b;

        /* JADX WARN: Incorrect types in method signature: <E::Lkotlin/reflect/jvm/internal/impl/protobuf/i$a;>(Lkotlin/f0/x/e/l0/e/z/b$d<*>;[TE;)Lkotlin/f0/x/e/l0/e/z/b$d<TE;>; */
        public static d a(d dVar, i.a[] aVarArr) {
            return new c(dVar.a + dVar.f20702b, aVarArr);
        }

        public static C0329b b(d<?> dVar) {
            return new C0329b(dVar.a + dVar.f20702b);
        }

        public static C0329b c() {
            return new C0329b(0);
        }

        public abstract E d(int i2);

        public abstract int e(E e2);

        private d(int i2, int i3) {
            this.a = i2;
            this.f20702b = i3;
        }
    }

    static {
        C0329b c2 = d.c();
        a = c2;
        f20691b = d.b(c2);
        C0329b c3 = d.c();
        f20692c = c3;
        d<x> a2 = d.a(c3, x.values());
        f20693d = a2;
        d<k> a3 = d.a(a2, k.values());
        f20694e = a3;
        d<c.EnumC0324c> a4 = d.a(a3, c.EnumC0324c.values());
        f20695f = a4;
        C0329b b2 = d.b(a4);
        f20696g = b2;
        C0329b b3 = d.b(b2);
        f20697h = b3;
        C0329b b4 = d.b(b3);
        f20698i = b4;
        C0329b b5 = d.b(b4);
        f20699j = b5;
        C0329b b6 = d.b(b5);
        f20700k = b6;
        l = d.b(b6);
        C0329b b7 = d.b(a2);
        m = b7;
        n = d.b(b7);
        d<j> a5 = d.a(a3, j.values());
        o = a5;
        C0329b b8 = d.b(a5);
        p = b8;
        C0329b b9 = d.b(b8);
        q = b9;
        C0329b b10 = d.b(b9);
        r = b10;
        C0329b b11 = d.b(b10);
        s = b11;
        C0329b b12 = d.b(b11);
        t = b12;
        C0329b b13 = d.b(b12);
        u = b13;
        C0329b b14 = d.b(b13);
        v = b14;
        w = d.b(b14);
        C0329b b15 = d.b(a5);
        x = b15;
        C0329b b16 = d.b(b15);
        y = b16;
        C0329b b17 = d.b(b16);
        z = b17;
        C0329b b18 = d.b(b17);
        A = b18;
        C0329b b19 = d.b(b18);
        B = b19;
        C0329b b20 = d.b(b19);
        C = b20;
        C0329b b21 = d.b(b20);
        D = b21;
        C0329b b22 = d.b(b21);
        E = b22;
        F = d.b(b22);
        C0329b b23 = d.b(c3);
        G = b23;
        C0329b b24 = d.b(b23);
        H = b24;
        I = d.b(b24);
        C0329b b25 = d.b(a3);
        J = b25;
        C0329b b26 = d.b(b25);
        K = b26;
        L = d.b(b26);
        C0329b c4 = d.c();
        M = c4;
        N = d.b(c4);
        O = d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L2b
            if (r5 == r3) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L2f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.e.z.b.a(int):void");
    }

    public static int b(boolean z2, x xVar, k kVar, boolean z3, boolean z4, boolean z5) {
        if (xVar == null) {
            a(10);
        }
        if (kVar == null) {
            a(11);
        }
        return f20692c.e(Boolean.valueOf(z2)) | f20694e.e(kVar) | f20693d.e(xVar) | J.e(Boolean.valueOf(z3)) | K.e(Boolean.valueOf(z4)) | L.e(Boolean.valueOf(z5));
    }
}
