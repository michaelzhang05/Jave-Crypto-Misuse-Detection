package k6;

import L5.AbstractC1221e;
import L5.I;
import i6.e1;
import k6.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.U;
import n6.Q;
import n6.x;

/* loaded from: classes5.dex */
public class p extends b {

    /* renamed from: m, reason: collision with root package name */
    private final int f33624m;

    /* renamed from: n, reason: collision with root package name */
    private final EnumC3132a f33625n;

    public p(int i8, EnumC3132a enumC3132a, Function1 function1) {
        super(i8, function1);
        this.f33624m = i8;
        this.f33625n = enumC3132a;
        if (enumC3132a != EnumC3132a.SUSPEND) {
            if (i8 >= 1) {
                return;
            }
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i8 + " was specified").toString());
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + U.b(b.class).b() + " instead").toString());
    }

    static /* synthetic */ Object N0(p pVar, Object obj, P5.d dVar) {
        Q d8;
        Object Q02 = pVar.Q0(obj, true);
        if (Q02 instanceof h.a) {
            h.e(Q02);
            Function1 function1 = pVar.f33572b;
            if (function1 != null && (d8 = x.d(function1, obj, null, 2, null)) != null) {
                AbstractC1221e.a(d8, pVar.Q());
                throw d8;
            }
            throw pVar.Q();
        }
        return I.f6487a;
    }

    private final Object O0(Object obj, boolean z8) {
        Function1 function1;
        Q d8;
        Object y8 = super.y(obj);
        if (!h.i(y8) && !h.h(y8)) {
            if (z8 && (function1 = this.f33572b) != null && (d8 = x.d(function1, obj, null, 2, null)) != null) {
                throw d8;
            }
            return h.f33614b.c(I.f6487a);
        }
        return y8;
    }

    private final Object P0(Object obj) {
        j jVar;
        e1 e1Var;
        Object obj2 = c.f33593d;
        j jVar2 = (j) b.f33566h.get(this);
        while (true) {
            long andIncrement = b.f33562d.getAndIncrement(this);
            long j8 = andIncrement & 1152921504606846975L;
            boolean a02 = a0(andIncrement);
            int i8 = c.f33591b;
            long j9 = j8 / i8;
            int i9 = (int) (j8 % i8);
            if (jVar2.f36233c != j9) {
                j L8 = L(j9, jVar2);
                if (L8 == null) {
                    if (a02) {
                        return h.f33614b.a(Q());
                    }
                } else {
                    jVar = L8;
                }
            } else {
                jVar = jVar2;
            }
            int I02 = I0(jVar, i9, obj, j8, obj2, a02);
            if (I02 != 0) {
                if (I02 != 1) {
                    if (I02 != 2) {
                        if (I02 != 3) {
                            if (I02 != 4) {
                                if (I02 == 5) {
                                    jVar.b();
                                }
                                jVar2 = jVar;
                            } else {
                                if (j8 < P()) {
                                    jVar.b();
                                }
                                return h.f33614b.a(Q());
                            }
                        } else {
                            throw new IllegalStateException("unexpected".toString());
                        }
                    } else {
                        if (a02) {
                            jVar.p();
                            return h.f33614b.a(Q());
                        }
                        if (obj2 instanceof e1) {
                            e1Var = (e1) obj2;
                        } else {
                            e1Var = null;
                        }
                        if (e1Var != null) {
                            q0(e1Var, jVar, i9);
                        }
                        H((jVar.f36233c * i8) + i9);
                        return h.f33614b.c(I.f6487a);
                    }
                } else {
                    return h.f33614b.c(I.f6487a);
                }
            } else {
                jVar.b();
                return h.f33614b.c(I.f6487a);
            }
        }
    }

    private final Object Q0(Object obj, boolean z8) {
        if (this.f33625n == EnumC3132a.DROP_LATEST) {
            return O0(obj, z8);
        }
        return P0(obj);
    }

    @Override // k6.b
    protected boolean b0() {
        if (this.f33625n == EnumC3132a.DROP_OLDEST) {
            return true;
        }
        return false;
    }

    @Override // k6.b, k6.v
    public Object i(Object obj, P5.d dVar) {
        return N0(this, obj, dVar);
    }

    @Override // k6.b, k6.v
    public Object y(Object obj) {
        return Q0(obj, false);
    }
}
