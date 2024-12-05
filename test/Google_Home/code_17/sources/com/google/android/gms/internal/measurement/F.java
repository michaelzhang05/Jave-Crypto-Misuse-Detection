package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class F extends A {
    /* JADX INFO: Access modifiers changed from: protected */
    public F() {
        this.f16048a.add(Z.APPLY);
        this.f16048a.add(Z.BLOCK);
        this.f16048a.add(Z.BREAK);
        this.f16048a.add(Z.CASE);
        this.f16048a.add(Z.DEFAULT);
        this.f16048a.add(Z.CONTINUE);
        this.f16048a.add(Z.DEFINE_FUNCTION);
        this.f16048a.add(Z.FN);
        this.f16048a.add(Z.IF);
        this.f16048a.add(Z.QUOTE);
        this.f16048a.add(Z.RETURN);
        this.f16048a.add(Z.SWITCH);
        this.f16048a.add(Z.TERNARY);
    }

    private static InterfaceC2236s c(V2 v22, List list) {
        AbstractC2128g2.j(Z.FN, 2, list);
        InterfaceC2236s b8 = v22.b((InterfaceC2236s) list.get(0));
        InterfaceC2236s b9 = v22.b((InterfaceC2236s) list.get(1));
        if (b9 instanceof C2125g) {
            List t8 = ((C2125g) b9).t();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new C2245t(b8.A(), t8, arrayList, v22);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", b9.getClass().getCanonicalName()));
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC2236s b(String str, V2 v22, List list) {
        InterfaceC2236s interfaceC2236s;
        InterfaceC2236s interfaceC2236s2;
        int i8 = 0;
        switch (I.f16148a[AbstractC2128g2.c(str).ordinal()]) {
            case 1:
                AbstractC2128g2.f(Z.APPLY, 3, list);
                InterfaceC2236s b8 = v22.b((InterfaceC2236s) list.get(0));
                String A8 = v22.b((InterfaceC2236s) list.get(1)).A();
                InterfaceC2236s b9 = v22.b((InterfaceC2236s) list.get(2));
                if (b9 instanceof C2125g) {
                    if (!A8.isEmpty()) {
                        return b8.C(A8, v22, ((C2125g) b9).t());
                    }
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", b9.getClass().getCanonicalName()));
            case 2:
                return v22.d().a(new C2125g(list));
            case 3:
                AbstractC2128g2.f(Z.BREAK, 0, list);
                return InterfaceC2236s.f16805e0;
            case 4:
            case 5:
                if (!list.isEmpty()) {
                    InterfaceC2236s b10 = v22.b((InterfaceC2236s) list.get(0));
                    if (b10 instanceof C2125g) {
                        return v22.a((C2125g) b10);
                    }
                }
                return InterfaceC2236s.f16802b0;
            case 6:
                AbstractC2128g2.f(Z.BREAK, 0, list);
                return InterfaceC2236s.f16804d0;
            case 7:
                AbstractC2128g2.j(Z.DEFINE_FUNCTION, 2, list);
                C2245t c2245t = (C2245t) c(v22, list);
                if (c2245t.d() == null) {
                    v22.h("", c2245t);
                } else {
                    v22.h(c2245t.d(), c2245t);
                }
                return c2245t;
            case 8:
                return c(v22, list);
            case 9:
                AbstractC2128g2.j(Z.IF, 2, list);
                InterfaceC2236s b11 = v22.b((InterfaceC2236s) list.get(0));
                InterfaceC2236s b12 = v22.b((InterfaceC2236s) list.get(1));
                if (list.size() > 2) {
                    interfaceC2236s = v22.b((InterfaceC2236s) list.get(2));
                } else {
                    interfaceC2236s = null;
                }
                InterfaceC2236s interfaceC2236s3 = InterfaceC2236s.f16802b0;
                if (b11.y().booleanValue()) {
                    interfaceC2236s2 = v22.a((C2125g) b12);
                } else if (interfaceC2236s != null) {
                    interfaceC2236s2 = v22.a((C2125g) interfaceC2236s);
                } else {
                    interfaceC2236s2 = interfaceC2236s3;
                }
                if (interfaceC2236s2 instanceof C2174l) {
                    return interfaceC2236s2;
                }
                return interfaceC2236s3;
            case 10:
                return new C2125g(list);
            case 11:
                if (list.isEmpty()) {
                    return InterfaceC2236s.f16806f0;
                }
                AbstractC2128g2.f(Z.RETURN, 1, list);
                return new C2174l("return", v22.b((InterfaceC2236s) list.get(0)));
            case 12:
                AbstractC2128g2.f(Z.SWITCH, 3, list);
                InterfaceC2236s b13 = v22.b((InterfaceC2236s) list.get(0));
                InterfaceC2236s b14 = v22.b((InterfaceC2236s) list.get(1));
                InterfaceC2236s b15 = v22.b((InterfaceC2236s) list.get(2));
                if (b14 instanceof C2125g) {
                    if (b15 instanceof C2125g) {
                        C2125g c2125g = (C2125g) b14;
                        C2125g c2125g2 = (C2125g) b15;
                        boolean z8 = false;
                        while (true) {
                            if (i8 < c2125g.m()) {
                                if (z8 || b13.equals(v22.b(c2125g.e(i8)))) {
                                    InterfaceC2236s b16 = v22.b(c2125g2.e(i8));
                                    if (b16 instanceof C2174l) {
                                        if (!((C2174l) b16).c().equals("break")) {
                                            return b16;
                                        }
                                    } else {
                                        z8 = true;
                                    }
                                }
                                i8++;
                            } else if (c2125g.m() + 1 == c2125g2.m()) {
                                InterfaceC2236s b17 = v22.b(c2125g2.e(c2125g.m()));
                                if (b17 instanceof C2174l) {
                                    String c8 = ((C2174l) b17).c();
                                    if (c8.equals("return") || c8.equals("continue")) {
                                        return b17;
                                    }
                                }
                            }
                        }
                        return InterfaceC2236s.f16802b0;
                    }
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
            case 13:
                AbstractC2128g2.f(Z.TERNARY, 3, list);
                if (v22.b((InterfaceC2236s) list.get(0)).y().booleanValue()) {
                    return v22.b((InterfaceC2236s) list.get(1));
                }
                return v22.b((InterfaceC2236s) list.get(2));
            default:
                return super.a(str);
        }
    }
}
