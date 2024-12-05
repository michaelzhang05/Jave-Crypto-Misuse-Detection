package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class X extends A {
    /* JADX INFO: Access modifiers changed from: protected */
    public X() {
        this.f16048a.add(Z.ASSIGN);
        this.f16048a.add(Z.CONST);
        this.f16048a.add(Z.CREATE_ARRAY);
        this.f16048a.add(Z.CREATE_OBJECT);
        this.f16048a.add(Z.EXPRESSION_LIST);
        this.f16048a.add(Z.GET);
        this.f16048a.add(Z.GET_INDEX);
        this.f16048a.add(Z.GET_PROPERTY);
        this.f16048a.add(Z.NULL);
        this.f16048a.add(Z.SET_PROPERTY);
        this.f16048a.add(Z.TYPEOF);
        this.f16048a.add(Z.UNDEFINED);
        this.f16048a.add(Z.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC2236s b(String str, V2 v22, List list) {
        String str2;
        int i8 = 0;
        switch (W.f16428a[AbstractC2128g2.c(str).ordinal()]) {
            case 1:
                AbstractC2128g2.f(Z.ASSIGN, 2, list);
                InterfaceC2236s b8 = v22.b((InterfaceC2236s) list.get(0));
                if (b8 instanceof C2254u) {
                    if (v22.g(b8.A())) {
                        InterfaceC2236s b9 = v22.b((InterfaceC2236s) list.get(1));
                        v22.h(b8.A(), b9);
                        return b9;
                    }
                    throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", b8.A()));
                }
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", b8.getClass().getCanonicalName()));
            case 2:
                AbstractC2128g2.j(Z.CONST, 2, list);
                if (list.size() % 2 == 0) {
                    for (int i9 = 0; i9 < list.size() - 1; i9 += 2) {
                        InterfaceC2236s b10 = v22.b((InterfaceC2236s) list.get(i9));
                        if (b10 instanceof C2254u) {
                            v22.f(b10.A(), v22.b((InterfaceC2236s) list.get(i9 + 1)));
                        } else {
                            throw new IllegalArgumentException(String.format("Expected string for const name. got %s", b10.getClass().getCanonicalName()));
                        }
                    }
                    return InterfaceC2236s.f16802b0;
                }
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            case 3:
                if (list.isEmpty()) {
                    return new C2125g();
                }
                C2125g c2125g = new C2125g();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC2236s b11 = v22.b((InterfaceC2236s) it.next());
                    if (!(b11 instanceof C2174l)) {
                        c2125g.p(i8, b11);
                        i8++;
                    } else {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                }
                return c2125g;
            case 4:
                if (list.isEmpty()) {
                    return new r();
                }
                if (list.size() % 2 == 0) {
                    r rVar = new r();
                    while (i8 < list.size() - 1) {
                        InterfaceC2236s b12 = v22.b((InterfaceC2236s) list.get(i8));
                        InterfaceC2236s b13 = v22.b((InterfaceC2236s) list.get(i8 + 1));
                        if (!(b12 instanceof C2174l) && !(b13 instanceof C2174l)) {
                            rVar.j(b12.A(), b13);
                            i8 += 2;
                        } else {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                    }
                    return rVar;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            case 5:
                AbstractC2128g2.j(Z.EXPRESSION_LIST, 1, list);
                InterfaceC2236s interfaceC2236s = InterfaceC2236s.f16802b0;
                while (i8 < list.size()) {
                    interfaceC2236s = v22.b((InterfaceC2236s) list.get(i8));
                    if (interfaceC2236s instanceof C2174l) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    i8++;
                }
                return interfaceC2236s;
            case 6:
                AbstractC2128g2.f(Z.GET, 1, list);
                InterfaceC2236s b14 = v22.b((InterfaceC2236s) list.get(0));
                if (b14 instanceof C2254u) {
                    return v22.c(b14.A());
                }
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", b14.getClass().getCanonicalName()));
            case 7:
            case 8:
                AbstractC2128g2.f(Z.GET_PROPERTY, 2, list);
                InterfaceC2236s b15 = v22.b((InterfaceC2236s) list.get(0));
                InterfaceC2236s b16 = v22.b((InterfaceC2236s) list.get(1));
                if ((b15 instanceof C2125g) && AbstractC2128g2.l(b16)) {
                    return ((C2125g) b15).e(b16.z().intValue());
                }
                if (b15 instanceof InterfaceC2183m) {
                    return ((InterfaceC2183m) b15).c(b16.A());
                }
                if (b15 instanceof C2254u) {
                    if ("length".equals(b16.A())) {
                        return new C2165k(Double.valueOf(b15.A().length()));
                    }
                    if (AbstractC2128g2.l(b16) && b16.z().doubleValue() < b15.A().length()) {
                        return new C2254u(String.valueOf(b15.A().charAt(b16.z().intValue())));
                    }
                }
                return InterfaceC2236s.f16802b0;
            case 9:
                AbstractC2128g2.f(Z.NULL, 0, list);
                return InterfaceC2236s.f16803c0;
            case 10:
                AbstractC2128g2.f(Z.SET_PROPERTY, 3, list);
                InterfaceC2236s b17 = v22.b((InterfaceC2236s) list.get(0));
                InterfaceC2236s b18 = v22.b((InterfaceC2236s) list.get(1));
                InterfaceC2236s b19 = v22.b((InterfaceC2236s) list.get(2));
                if (b17 != InterfaceC2236s.f16802b0 && b17 != InterfaceC2236s.f16803c0) {
                    if ((b17 instanceof C2125g) && (b18 instanceof C2165k)) {
                        ((C2125g) b17).p(b18.z().intValue(), b19);
                    } else if (b17 instanceof InterfaceC2183m) {
                        ((InterfaceC2183m) b17).j(b18.A(), b19);
                    }
                    return b19;
                }
                throw new IllegalStateException(String.format("Can't set property %s of %s", b18.A(), b17.A()));
            case 11:
                AbstractC2128g2.f(Z.TYPEOF, 1, list);
                InterfaceC2236s b20 = v22.b((InterfaceC2236s) list.get(0));
                if (b20 instanceof C2299z) {
                    str2 = "undefined";
                } else if (b20 instanceof C2135h) {
                    str2 = TypedValues.Custom.S_BOOLEAN;
                } else if (b20 instanceof C2165k) {
                    str2 = "number";
                } else if (b20 instanceof C2254u) {
                    str2 = TypedValues.Custom.S_STRING;
                } else if (b20 instanceof C2245t) {
                    str2 = "function";
                } else {
                    if ((b20 instanceof C2263v) || (b20 instanceof C2174l)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", b20));
                    }
                    str2 = "object";
                }
                return new C2254u(str2);
            case 12:
                AbstractC2128g2.f(Z.UNDEFINED, 0, list);
                return InterfaceC2236s.f16802b0;
            case 13:
                AbstractC2128g2.j(Z.VAR, 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC2236s b21 = v22.b((InterfaceC2236s) it2.next());
                    if (b21 instanceof C2254u) {
                        v22.e(b21.A(), InterfaceC2236s.f16802b0);
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", b21.getClass().getCanonicalName()));
                    }
                }
                return InterfaceC2236s.f16802b0;
            default:
                return super.a(str);
        }
    }
}
