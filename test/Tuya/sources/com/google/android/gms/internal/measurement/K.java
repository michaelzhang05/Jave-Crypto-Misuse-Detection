package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class K extends AbstractC2139y {
    /* JADX INFO: Access modifiers changed from: protected */
    public K() {
        this.f15960a.add(O.FOR_IN);
        this.f15960a.add(O.FOR_IN_CONST);
        this.f15960a.add(O.FOR_IN_LET);
        this.f15960a.add(O.FOR_LET);
        this.f15960a.add(O.FOR_OF);
        this.f15960a.add(O.FOR_OF_CONST);
        this.f15960a.add(O.FOR_OF_LET);
        this.f15960a.add(O.WHILE);
    }

    private static r c(I i8, Iterator it, r rVar) {
        if (it != null) {
            while (it.hasNext()) {
                r c8 = i8.a((r) it.next()).c((C1986f) rVar);
                if (c8 instanceof C2004h) {
                    C2004h c2004h = (C2004h) c8;
                    if ("break".equals(c2004h.b())) {
                        return r.f15866c0;
                    }
                    if ("return".equals(c2004h.b())) {
                        return c2004h;
                    }
                }
            }
        }
        return r.f15866c0;
    }

    private static r d(I i8, r rVar, r rVar2) {
        return c(i8, rVar.i(), rVar2);
    }

    private static r e(I i8, r rVar, r rVar2) {
        if (rVar instanceof Iterable) {
            return c(i8, ((Iterable) rVar).iterator(), rVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2139y
    public final r a(String str, T1 t12, List list) {
        O o8 = O.ADD;
        int ordinal = AbstractC2110u2.e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    AbstractC2110u2.h(O.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof C2115v) {
                        String g8 = ((r) list.get(0)).g();
                        return d(new J(t12, g8), t12.b((r) list.get(1)), t12.b((r) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    AbstractC2110u2.h(O.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof C2115v) {
                        String g9 = ((r) list.get(0)).g();
                        return d(new G(t12, g9), t12.b((r) list.get(1)), t12.b((r) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    AbstractC2110u2.h(O.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof C2115v) {
                        String g10 = ((r) list.get(0)).g();
                        return d(new H(t12, g10), t12.b((r) list.get(1)), t12.b((r) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    AbstractC2110u2.h(O.FOR_LET.name(), 4, list);
                    r b8 = t12.b((r) list.get(0));
                    if (b8 instanceof C1986f) {
                        C1986f c1986f = (C1986f) b8;
                        r rVar = (r) list.get(1);
                        r rVar2 = (r) list.get(2);
                        r b9 = t12.b((r) list.get(3));
                        T1 a8 = t12.a();
                        for (int i8 = 0; i8 < c1986f.r(); i8++) {
                            String g11 = c1986f.s(i8).g();
                            a8.g(g11, t12.d(g11));
                        }
                        while (t12.b(rVar).h().booleanValue()) {
                            r c8 = t12.c((C1986f) b9);
                            if (c8 instanceof C2004h) {
                                C2004h c2004h = (C2004h) c8;
                                if ("break".equals(c2004h.b())) {
                                    return r.f15866c0;
                                }
                                if ("return".equals(c2004h.b())) {
                                    return c2004h;
                                }
                            }
                            T1 a9 = t12.a();
                            for (int i9 = 0; i9 < c1986f.r(); i9++) {
                                String g12 = c1986f.s(i9).g();
                                a9.g(g12, a8.d(g12));
                            }
                            a9.b(rVar2);
                            a8 = a9;
                        }
                        return r.f15866c0;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    AbstractC2110u2.h(O.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof C2115v) {
                        String g13 = ((r) list.get(0)).g();
                        return e(new J(t12, g13), t12.b((r) list.get(1)), t12.b((r) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    AbstractC2110u2.h(O.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof C2115v) {
                        String g14 = ((r) list.get(0)).g();
                        return e(new G(t12, g14), t12.b((r) list.get(1)), t12.b((r) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    AbstractC2110u2.h(O.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof C2115v) {
                        String g15 = ((r) list.get(0)).g();
                        return e(new H(t12, g15), t12.b((r) list.get(1)), t12.b((r) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.b(str);
            }
        }
        AbstractC2110u2.h(O.WHILE.name(), 4, list);
        r rVar3 = (r) list.get(0);
        r rVar4 = (r) list.get(1);
        r rVar5 = (r) list.get(2);
        r b10 = t12.b((r) list.get(3));
        if (t12.b(rVar5).h().booleanValue()) {
            r c9 = t12.c((C1986f) b10);
            if (c9 instanceof C2004h) {
                C2004h c2004h2 = (C2004h) c9;
                if ("break".equals(c2004h2.b())) {
                    return r.f15866c0;
                }
                if ("return".equals(c2004h2.b())) {
                    return c2004h2;
                }
            }
        }
        while (t12.b(rVar3).h().booleanValue()) {
            r c10 = t12.c((C1986f) b10);
            if (c10 instanceof C2004h) {
                C2004h c2004h3 = (C2004h) c10;
                if ("break".equals(c2004h3.b())) {
                    return r.f15866c0;
                }
                if ("return".equals(c2004h3.b())) {
                    return c2004h3;
                }
            }
            t12.b(rVar4);
        }
        return r.f15866c0;
    }
}
