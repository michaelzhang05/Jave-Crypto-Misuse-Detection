package kotlin.reflect.x.internal.l0.j.b;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.x.internal.l0.e.c;
import kotlin.reflect.x.internal.l0.e.k;
import kotlin.reflect.x.internal.l0.e.q;
import kotlin.reflect.x.internal.l0.e.s;
import kotlin.reflect.x.internal.l0.e.x;
import kotlin.reflect.x.internal.l0.l.r1;

/* compiled from: ProtoEnumFlags.kt */
/* loaded from: classes2.dex */
public final class a0 {
    public static final a0 a = new a0();

    /* compiled from: ProtoEnumFlags.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f20968b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f20969c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f20970d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f20971e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f20972f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f20973g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f20974h;

        static {
            int[] iArr = new int[k.values().length];
            iArr[k.FINAL.ordinal()] = 1;
            iArr[k.OPEN.ordinal()] = 2;
            iArr[k.ABSTRACT.ordinal()] = 3;
            iArr[k.SEALED.ordinal()] = 4;
            a = iArr;
            int[] iArr2 = new int[d0.values().length];
            iArr2[d0.FINAL.ordinal()] = 1;
            iArr2[d0.OPEN.ordinal()] = 2;
            iArr2[d0.ABSTRACT.ordinal()] = 3;
            iArr2[d0.SEALED.ordinal()] = 4;
            f20968b = iArr2;
            int[] iArr3 = new int[x.values().length];
            iArr3[x.INTERNAL.ordinal()] = 1;
            iArr3[x.PRIVATE.ordinal()] = 2;
            iArr3[x.PRIVATE_TO_THIS.ordinal()] = 3;
            iArr3[x.PROTECTED.ordinal()] = 4;
            iArr3[x.PUBLIC.ordinal()] = 5;
            iArr3[x.LOCAL.ordinal()] = 6;
            f20969c = iArr3;
            int[] iArr4 = new int[c.EnumC0324c.values().length];
            iArr4[c.EnumC0324c.CLASS.ordinal()] = 1;
            iArr4[c.EnumC0324c.INTERFACE.ordinal()] = 2;
            iArr4[c.EnumC0324c.ENUM_CLASS.ordinal()] = 3;
            iArr4[c.EnumC0324c.ENUM_ENTRY.ordinal()] = 4;
            iArr4[c.EnumC0324c.ANNOTATION_CLASS.ordinal()] = 5;
            iArr4[c.EnumC0324c.OBJECT.ordinal()] = 6;
            iArr4[c.EnumC0324c.COMPANION_OBJECT.ordinal()] = 7;
            f20970d = iArr4;
            int[] iArr5 = new int[f.values().length];
            iArr5[f.CLASS.ordinal()] = 1;
            iArr5[f.INTERFACE.ordinal()] = 2;
            iArr5[f.ENUM_CLASS.ordinal()] = 3;
            iArr5[f.ENUM_ENTRY.ordinal()] = 4;
            iArr5[f.ANNOTATION_CLASS.ordinal()] = 5;
            iArr5[f.OBJECT.ordinal()] = 6;
            f20971e = iArr5;
            int[] iArr6 = new int[s.c.values().length];
            iArr6[s.c.IN.ordinal()] = 1;
            iArr6[s.c.OUT.ordinal()] = 2;
            iArr6[s.c.INV.ordinal()] = 3;
            f20972f = iArr6;
            int[] iArr7 = new int[q.b.c.values().length];
            iArr7[q.b.c.IN.ordinal()] = 1;
            iArr7[q.b.c.OUT.ordinal()] = 2;
            iArr7[q.b.c.INV.ordinal()] = 3;
            iArr7[q.b.c.STAR.ordinal()] = 4;
            f20973g = iArr7;
            int[] iArr8 = new int[r1.values().length];
            iArr8[r1.IN_VARIANCE.ordinal()] = 1;
            iArr8[r1.OUT_VARIANCE.ordinal()] = 2;
            iArr8[r1.INVARIANT.ordinal()] = 3;
            f20974h = iArr8;
        }
    }

    private a0() {
    }

    public final f a(c.EnumC0324c enumC0324c) {
        switch (enumC0324c == null ? -1 : a.f20970d[enumC0324c.ordinal()]) {
            case 1:
                return f.CLASS;
            case 2:
                return f.INTERFACE;
            case 3:
                return f.ENUM_CLASS;
            case 4:
                return f.ENUM_ENTRY;
            case 5:
                return f.ANNOTATION_CLASS;
            case 6:
            case 7:
                return f.OBJECT;
            default:
                return f.CLASS;
        }
    }

    public final d0 b(k kVar) {
        int i2 = kVar == null ? -1 : a.a[kVar.ordinal()];
        if (i2 == 1) {
            return d0.FINAL;
        }
        if (i2 == 2) {
            return d0.OPEN;
        }
        if (i2 == 3) {
            return d0.ABSTRACT;
        }
        if (i2 != 4) {
            return d0.FINAL;
        }
        return d0.SEALED;
    }

    public final r1 c(q.b.c cVar) {
        l.f(cVar, "projection");
        int i2 = a.f20973g[cVar.ordinal()];
        if (i2 == 1) {
            return r1.IN_VARIANCE;
        }
        if (i2 == 2) {
            return r1.OUT_VARIANCE;
        }
        if (i2 == 3) {
            return r1.INVARIANT;
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + cVar);
    }

    public final r1 d(s.c cVar) {
        l.f(cVar, "variance");
        int i2 = a.f20972f[cVar.ordinal()];
        if (i2 == 1) {
            return r1.IN_VARIANCE;
        }
        if (i2 == 2) {
            return r1.OUT_VARIANCE;
        }
        if (i2 == 3) {
            return r1.INVARIANT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
