package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class L extends A {
    /* JADX INFO: Access modifiers changed from: protected */
    public L() {
        this.f16048a.add(Z.FOR_IN);
        this.f16048a.add(Z.FOR_IN_CONST);
        this.f16048a.add(Z.FOR_IN_LET);
        this.f16048a.add(Z.FOR_LET);
        this.f16048a.add(Z.FOR_OF);
        this.f16048a.add(Z.FOR_OF_CONST);
        this.f16048a.add(Z.FOR_OF_LET);
        this.f16048a.add(Z.WHILE);
    }

    private static InterfaceC2236s c(P p8, InterfaceC2236s interfaceC2236s, InterfaceC2236s interfaceC2236s2) {
        return d(p8, interfaceC2236s.B(), interfaceC2236s2);
    }

    private static InterfaceC2236s d(P p8, Iterator it, InterfaceC2236s interfaceC2236s) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC2236s a8 = p8.a((InterfaceC2236s) it.next()).a((C2125g) interfaceC2236s);
                if (a8 instanceof C2174l) {
                    C2174l c2174l = (C2174l) a8;
                    if ("break".equals(c2174l.c())) {
                        return InterfaceC2236s.f16802b0;
                    }
                    if ("return".equals(c2174l.c())) {
                        return c2174l;
                    }
                }
            }
        }
        return InterfaceC2236s.f16802b0;
    }

    private static InterfaceC2236s e(P p8, InterfaceC2236s interfaceC2236s, InterfaceC2236s interfaceC2236s2) {
        if (interfaceC2236s instanceof Iterable) {
            return d(p8, ((Iterable) interfaceC2236s).iterator(), interfaceC2236s2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC2236s b(String str, V2 v22, List list) {
        switch (O.f16237a[AbstractC2128g2.c(str).ordinal()]) {
            case 1:
                AbstractC2128g2.f(Z.FOR_IN, 3, list);
                if (list.get(0) instanceof C2254u) {
                    String A8 = ((InterfaceC2236s) list.get(0)).A();
                    return c(new T(v22, A8), v22.b((InterfaceC2236s) list.get(1)), v22.b((InterfaceC2236s) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
            case 2:
                AbstractC2128g2.f(Z.FOR_IN_CONST, 3, list);
                if (list.get(0) instanceof C2254u) {
                    String A9 = ((InterfaceC2236s) list.get(0)).A();
                    return c(new N(v22, A9), v22.b((InterfaceC2236s) list.get(1)), v22.b((InterfaceC2236s) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
            case 3:
                AbstractC2128g2.f(Z.FOR_IN_LET, 3, list);
                if (list.get(0) instanceof C2254u) {
                    String A10 = ((InterfaceC2236s) list.get(0)).A();
                    return c(new Q(v22, A10), v22.b((InterfaceC2236s) list.get(1)), v22.b((InterfaceC2236s) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
            case 4:
                AbstractC2128g2.f(Z.FOR_LET, 4, list);
                InterfaceC2236s b8 = v22.b((InterfaceC2236s) list.get(0));
                if (b8 instanceof C2125g) {
                    C2125g c2125g = (C2125g) b8;
                    InterfaceC2236s interfaceC2236s = (InterfaceC2236s) list.get(1);
                    InterfaceC2236s interfaceC2236s2 = (InterfaceC2236s) list.get(2);
                    InterfaceC2236s b9 = v22.b((InterfaceC2236s) list.get(3));
                    V2 d8 = v22.d();
                    for (int i8 = 0; i8 < c2125g.m(); i8++) {
                        String A11 = c2125g.e(i8).A();
                        d8.h(A11, v22.c(A11));
                    }
                    while (v22.b(interfaceC2236s).y().booleanValue()) {
                        InterfaceC2236s a8 = v22.a((C2125g) b9);
                        if (a8 instanceof C2174l) {
                            C2174l c2174l = (C2174l) a8;
                            if (!"break".equals(c2174l.c())) {
                                if ("return".equals(c2174l.c())) {
                                    return c2174l;
                                }
                            } else {
                                return InterfaceC2236s.f16802b0;
                            }
                        }
                        V2 d9 = v22.d();
                        for (int i9 = 0; i9 < c2125g.m(); i9++) {
                            String A12 = c2125g.e(i9).A();
                            d9.h(A12, d8.c(A12));
                        }
                        d9.b(interfaceC2236s2);
                        d8 = d9;
                    }
                    return InterfaceC2236s.f16802b0;
                }
                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
            case 5:
                AbstractC2128g2.f(Z.FOR_OF, 3, list);
                if (list.get(0) instanceof C2254u) {
                    String A13 = ((InterfaceC2236s) list.get(0)).A();
                    return e(new T(v22, A13), v22.b((InterfaceC2236s) list.get(1)), v22.b((InterfaceC2236s) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
            case 6:
                AbstractC2128g2.f(Z.FOR_OF_CONST, 3, list);
                if (list.get(0) instanceof C2254u) {
                    String A14 = ((InterfaceC2236s) list.get(0)).A();
                    return e(new N(v22, A14), v22.b((InterfaceC2236s) list.get(1)), v22.b((InterfaceC2236s) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
            case 7:
                AbstractC2128g2.f(Z.FOR_OF_LET, 3, list);
                if (list.get(0) instanceof C2254u) {
                    String A15 = ((InterfaceC2236s) list.get(0)).A();
                    return e(new Q(v22, A15), v22.b((InterfaceC2236s) list.get(1)), v22.b((InterfaceC2236s) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
            case 8:
                AbstractC2128g2.f(Z.WHILE, 4, list);
                InterfaceC2236s interfaceC2236s3 = (InterfaceC2236s) list.get(0);
                InterfaceC2236s interfaceC2236s4 = (InterfaceC2236s) list.get(1);
                InterfaceC2236s interfaceC2236s5 = (InterfaceC2236s) list.get(2);
                InterfaceC2236s b10 = v22.b((InterfaceC2236s) list.get(3));
                if (v22.b(interfaceC2236s5).y().booleanValue()) {
                    InterfaceC2236s a9 = v22.a((C2125g) b10);
                    if (a9 instanceof C2174l) {
                        C2174l c2174l2 = (C2174l) a9;
                        if (!"break".equals(c2174l2.c())) {
                            if ("return".equals(c2174l2.c())) {
                                return c2174l2;
                            }
                        }
                        return InterfaceC2236s.f16802b0;
                    }
                }
                while (v22.b(interfaceC2236s3).y().booleanValue()) {
                    InterfaceC2236s a10 = v22.a((C2125g) b10);
                    if (a10 instanceof C2174l) {
                        C2174l c2174l3 = (C2174l) a10;
                        if (!"break".equals(c2174l3.c())) {
                            if ("return".equals(c2174l3.c())) {
                                return c2174l3;
                            }
                        } else {
                            return InterfaceC2236s.f16802b0;
                        }
                    }
                    v22.b(interfaceC2236s4);
                }
                return InterfaceC2236s.f16802b0;
            default:
                return super.a(str);
        }
    }
}
