package o6;

import O5.s;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;
import l6.C3374p;
import l6.InterfaceC3351d0;
import n6.EnumC3487a;
import q6.C3865F;

/* renamed from: o6.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3688B extends p6.b implements v, InterfaceC3706f, p6.p {

    /* renamed from: e, reason: collision with root package name */
    private final int f36555e;

    /* renamed from: f, reason: collision with root package name */
    private final int f36556f;

    /* renamed from: g, reason: collision with root package name */
    private final EnumC3487a f36557g;

    /* renamed from: h, reason: collision with root package name */
    private Object[] f36558h;

    /* renamed from: i, reason: collision with root package name */
    private long f36559i;

    /* renamed from: j, reason: collision with root package name */
    private long f36560j;

    /* renamed from: k, reason: collision with root package name */
    private int f36561k;

    /* renamed from: l, reason: collision with root package name */
    private int f36562l;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o6.B$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3351d0 {

        /* renamed from: a, reason: collision with root package name */
        public final C3688B f36563a;

        /* renamed from: b, reason: collision with root package name */
        public long f36564b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f36565c;

        /* renamed from: d, reason: collision with root package name */
        public final S5.d f36566d;

        public a(C3688B c3688b, long j8, Object obj, S5.d dVar) {
            this.f36563a = c3688b;
            this.f36564b = j8;
            this.f36565c = obj;
            this.f36566d = dVar;
        }

        @Override // l6.InterfaceC3351d0
        public void dispose() {
            this.f36563a.y(this);
        }
    }

    /* renamed from: o6.B$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36567a;

        static {
            int[] iArr = new int[EnumC3487a.values().length];
            try {
                iArr[EnumC3487a.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3487a.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3487a.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36567a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o6.B$c */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36568a;

        /* renamed from: b, reason: collision with root package name */
        Object f36569b;

        /* renamed from: c, reason: collision with root package name */
        Object f36570c;

        /* renamed from: d, reason: collision with root package name */
        Object f36571d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f36572e;

        /* renamed from: g, reason: collision with root package name */
        int f36574g;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36572e = obj;
            this.f36574g |= Integer.MIN_VALUE;
            return C3688B.A(C3688B.this, null, this);
        }
    }

    public C3688B(int i8, int i9, EnumC3487a enumC3487a) {
        this.f36555e = i8;
        this.f36556f = i9;
        this.f36557g = enumC3487a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:14:0x003b, B:18:0x0092, B:20:0x009a, B:28:0x00ad, B:29:0x00b0, B:36:0x005d), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r5v1, types: [p6.b] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [o6.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [o6.g] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [p6.d] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, o6.D] */
    /* JADX WARN: Type inference failed for: r9v9, types: [o6.D] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00be -> B:15:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object A(o6.C3688B r8, o6.InterfaceC3707g r9, S5.d r10) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.C3688B.A(o6.B, o6.g, S5.d):java.lang.Object");
    }

    private final void B(long j8) {
        p6.d[] g8;
        if (p6.b.b(this) != 0 && (g8 = p6.b.g(this)) != null) {
            for (p6.d dVar : g8) {
                if (dVar != null) {
                    C3690D c3690d = (C3690D) dVar;
                    long j9 = c3690d.f36576a;
                    if (j9 >= 0 && j9 < j8) {
                        c3690d.f36576a = j8;
                    }
                }
            }
        }
        this.f36560j = j8;
    }

    private final void E() {
        Object[] objArr = this.f36558h;
        AbstractC3255y.f(objArr);
        AbstractC3689C.g(objArr, K(), null);
        this.f36561k--;
        long K8 = K() + 1;
        if (this.f36559i < K8) {
            this.f36559i = K8;
        }
        if (this.f36560j < K8) {
            B(K8);
        }
    }

    static /* synthetic */ Object F(C3688B c3688b, Object obj, S5.d dVar) {
        if (c3688b.e(obj)) {
            return O5.I.f8278a;
        }
        Object G8 = c3688b.G(obj, dVar);
        if (G8 == T5.b.e()) {
            return G8;
        }
        return O5.I.f8278a;
    }

    private final Object G(Object obj, S5.d dVar) {
        S5.d[] dVarArr;
        a aVar;
        C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
        c3374p.C();
        S5.d[] dVarArr2 = p6.c.f37901a;
        synchronized (this) {
            try {
                if (R(obj)) {
                    s.a aVar2 = O5.s.f8302b;
                    c3374p.resumeWith(O5.s.b(O5.I.f8278a));
                    dVarArr = I(dVarArr2);
                    aVar = null;
                } else {
                    a aVar3 = new a(this, P() + K(), obj, c3374p);
                    H(aVar3);
                    this.f36562l++;
                    if (this.f36556f == 0) {
                        dVarArr2 = I(dVarArr2);
                    }
                    dVarArr = dVarArr2;
                    aVar = aVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            l6.r.a(c3374p, aVar);
        }
        for (S5.d dVar2 : dVarArr) {
            if (dVar2 != null) {
                s.a aVar4 = O5.s.f8302b;
                dVar2.resumeWith(O5.s.b(O5.I.f8278a));
            }
        }
        Object y8 = c3374p.y();
        if (y8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == T5.b.e()) {
            return y8;
        }
        return O5.I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(Object obj) {
        int P8 = P();
        Object[] objArr = this.f36558h;
        if (objArr == null) {
            objArr = Q(null, 0, 2);
        } else if (P8 >= objArr.length) {
            objArr = Q(objArr, P8, objArr.length * 2);
        }
        AbstractC3689C.g(objArr, K() + P8, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object[], java.lang.Object] */
    public final S5.d[] I(S5.d[] dVarArr) {
        p6.d[] g8;
        C3690D c3690d;
        S5.d dVar;
        int length = dVarArr.length;
        if (p6.b.b(this) != 0 && (g8 = p6.b.g(this)) != null) {
            int length2 = g8.length;
            int i8 = 0;
            dVarArr = dVarArr;
            while (i8 < length2) {
                p6.d dVar2 = g8[i8];
                if (dVar2 != null && (dVar = (c3690d = (C3690D) dVar2).f36577b) != null && T(c3690d) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        AbstractC3255y.h(copyOf, "copyOf(this, newSize)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = dVar;
                    c3690d.f36577b = null;
                    length++;
                }
                i8++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    private final long J() {
        return K() + this.f36561k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long K() {
        return Math.min(this.f36560j, this.f36559i);
    }

    private final Object M(long j8) {
        Object f8;
        Object[] objArr = this.f36558h;
        AbstractC3255y.f(objArr);
        f8 = AbstractC3689C.f(objArr, j8);
        if (f8 instanceof a) {
            return ((a) f8).f36565c;
        }
        return f8;
    }

    private final long N() {
        return K() + this.f36561k + this.f36562l;
    }

    private final int O() {
        return (int) ((K() + this.f36561k) - this.f36559i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P() {
        return this.f36561k + this.f36562l;
    }

    private final Object[] Q(Object[] objArr, int i8, int i9) {
        Object f8;
        if (i9 > 0) {
            Object[] objArr2 = new Object[i9];
            this.f36558h = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long K8 = K();
            for (int i10 = 0; i10 < i8; i10++) {
                long j8 = i10 + K8;
                f8 = AbstractC3689C.f(objArr, j8);
                AbstractC3689C.g(objArr2, j8, f8);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R(Object obj) {
        if (l() == 0) {
            return S(obj);
        }
        if (this.f36561k >= this.f36556f && this.f36560j <= this.f36559i) {
            int i8 = b.f36567a[this.f36557g.ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        H(obj);
        int i9 = this.f36561k + 1;
        this.f36561k = i9;
        if (i9 > this.f36556f) {
            E();
        }
        if (O() > this.f36555e) {
            V(this.f36559i + 1, this.f36560j, J(), N());
        }
        return true;
    }

    private final boolean S(Object obj) {
        if (this.f36555e == 0) {
            return true;
        }
        H(obj);
        int i8 = this.f36561k + 1;
        this.f36561k = i8;
        if (i8 > this.f36555e) {
            E();
        }
        this.f36560j = K() + this.f36561k;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long T(C3690D c3690d) {
        long j8 = c3690d.f36576a;
        if (j8 < J()) {
            return j8;
        }
        if (this.f36556f > 0 || j8 > K() || this.f36562l == 0) {
            return -1L;
        }
        return j8;
    }

    private final Object U(C3690D c3690d) {
        Object obj;
        S5.d[] dVarArr = p6.c.f37901a;
        synchronized (this) {
            try {
                long T8 = T(c3690d);
                if (T8 < 0) {
                    obj = AbstractC3689C.f36575a;
                } else {
                    long j8 = c3690d.f36576a;
                    Object M8 = M(T8);
                    c3690d.f36576a = T8 + 1;
                    dVarArr = W(j8);
                    obj = M8;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (S5.d dVar : dVarArr) {
            if (dVar != null) {
                s.a aVar = O5.s.f8302b;
                dVar.resumeWith(O5.s.b(O5.I.f8278a));
            }
        }
        return obj;
    }

    private final void V(long j8, long j9, long j10, long j11) {
        long min = Math.min(j9, j8);
        for (long K8 = K(); K8 < min; K8++) {
            Object[] objArr = this.f36558h;
            AbstractC3255y.f(objArr);
            AbstractC3689C.g(objArr, K8, null);
        }
        this.f36559i = j8;
        this.f36560j = j9;
        this.f36561k = (int) (j10 - min);
        this.f36562l = (int) (j11 - j10);
    }

    private final Object x(C3690D c3690d, S5.d dVar) {
        C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
        c3374p.C();
        synchronized (this) {
            try {
                if (T(c3690d) < 0) {
                    c3690d.f36577b = c3374p;
                } else {
                    s.a aVar = O5.s.f8302b;
                    c3374p.resumeWith(O5.s.b(O5.I.f8278a));
                }
                O5.I i8 = O5.I.f8278a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object y8 = c3374p.y();
        if (y8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == T5.b.e()) {
            return y8;
        }
        return O5.I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(a aVar) {
        Object f8;
        synchronized (this) {
            if (aVar.f36564b < K()) {
                return;
            }
            Object[] objArr = this.f36558h;
            AbstractC3255y.f(objArr);
            f8 = AbstractC3689C.f(objArr, aVar.f36564b);
            if (f8 == aVar) {
                AbstractC3689C.g(objArr, aVar.f36564b, AbstractC3689C.f36575a);
                z();
                O5.I i8 = O5.I.f8278a;
            }
        }
    }

    private final void z() {
        Object f8;
        if (this.f36556f == 0 && this.f36562l <= 1) {
            return;
        }
        Object[] objArr = this.f36558h;
        AbstractC3255y.f(objArr);
        while (this.f36562l > 0) {
            f8 = AbstractC3689C.f(objArr, (K() + P()) - 1);
            if (f8 == AbstractC3689C.f36575a) {
                this.f36562l--;
                AbstractC3689C.g(objArr, K() + P(), null);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p6.b
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C3690D i() {
        return new C3690D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p6.b
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C3690D[] j(int i8) {
        return new C3690D[i8];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object L() {
        Object f8;
        Object[] objArr = this.f36558h;
        AbstractC3255y.f(objArr);
        f8 = AbstractC3689C.f(objArr, (this.f36559i + O()) - 1);
        return f8;
    }

    public final S5.d[] W(long j8) {
        int i8;
        long j9;
        long j10;
        long j11;
        boolean z8;
        Object f8;
        Object f9;
        long j12;
        p6.d[] g8;
        if (j8 > this.f36560j) {
            return p6.c.f37901a;
        }
        long K8 = K();
        long j13 = this.f36561k + K8;
        if (this.f36556f == 0 && this.f36562l > 0) {
            j13++;
        }
        if (p6.b.b(this) != 0 && (g8 = p6.b.g(this)) != null) {
            for (p6.d dVar : g8) {
                if (dVar != null) {
                    long j14 = ((C3690D) dVar).f36576a;
                    if (j14 >= 0 && j14 < j13) {
                        j13 = j14;
                    }
                }
            }
        }
        if (j13 <= this.f36560j) {
            return p6.c.f37901a;
        }
        long J8 = J();
        if (l() > 0) {
            i8 = Math.min(this.f36562l, this.f36556f - ((int) (J8 - j13)));
        } else {
            i8 = this.f36562l;
        }
        S5.d[] dVarArr = p6.c.f37901a;
        long j15 = this.f36562l + J8;
        if (i8 > 0) {
            dVarArr = new S5.d[i8];
            Object[] objArr = this.f36558h;
            AbstractC3255y.f(objArr);
            long j16 = J8;
            int i9 = 0;
            while (true) {
                if (J8 < j15) {
                    f9 = AbstractC3689C.f(objArr, J8);
                    j9 = j13;
                    C3865F c3865f = AbstractC3689C.f36575a;
                    if (f9 != c3865f) {
                        AbstractC3255y.g(f9, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        a aVar = (a) f9;
                        int i10 = i9 + 1;
                        j10 = j15;
                        dVarArr[i9] = aVar.f36566d;
                        AbstractC3689C.g(objArr, J8, c3865f);
                        AbstractC3689C.g(objArr, j16, aVar.f36565c);
                        j12 = 1;
                        j16++;
                        if (i10 >= i8) {
                            break;
                        }
                        i9 = i10;
                    } else {
                        j10 = j15;
                        j12 = 1;
                    }
                    J8 += j12;
                    j13 = j9;
                    j15 = j10;
                } else {
                    j9 = j13;
                    j10 = j15;
                    break;
                }
            }
            J8 = j16;
        } else {
            j9 = j13;
            j10 = j15;
        }
        int i11 = (int) (J8 - K8);
        if (l() == 0) {
            j11 = J8;
        } else {
            j11 = j9;
        }
        long max = Math.max(this.f36559i, J8 - Math.min(this.f36555e, i11));
        if (this.f36556f == 0 && max < j10) {
            Object[] objArr2 = this.f36558h;
            AbstractC3255y.f(objArr2);
            f8 = AbstractC3689C.f(objArr2, max);
            if (AbstractC3255y.d(f8, AbstractC3689C.f36575a)) {
                J8++;
                max++;
            }
        }
        V(max, j11, J8, j10);
        z();
        if (dVarArr.length == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            return I(dVarArr);
        }
        return dVarArr;
    }

    public final long X() {
        long j8 = this.f36559i;
        if (j8 < this.f36560j) {
            this.f36560j = j8;
        }
        return j8;
    }

    @Override // p6.p
    public InterfaceC3706f a(S5.g gVar, int i8, EnumC3487a enumC3487a) {
        return AbstractC3689C.e(this, gVar, i8, enumC3487a);
    }

    @Override // o6.InterfaceC3687A, o6.InterfaceC3706f
    public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
        return A(this, interfaceC3707g, dVar);
    }

    @Override // o6.v
    public void d() {
        synchronized (this) {
            V(J(), this.f36560j, J(), N());
            O5.I i8 = O5.I.f8278a;
        }
    }

    @Override // o6.v
    public boolean e(Object obj) {
        int i8;
        boolean z8;
        S5.d[] dVarArr = p6.c.f37901a;
        synchronized (this) {
            if (R(obj)) {
                dVarArr = I(dVarArr);
                z8 = true;
            } else {
                z8 = false;
            }
        }
        for (S5.d dVar : dVarArr) {
            if (dVar != null) {
                s.a aVar = O5.s.f8302b;
                dVar.resumeWith(O5.s.b(O5.I.f8278a));
            }
        }
        return z8;
    }

    @Override // o6.v, o6.InterfaceC3707g
    public Object emit(Object obj, S5.d dVar) {
        return F(this, obj, dVar);
    }
}
