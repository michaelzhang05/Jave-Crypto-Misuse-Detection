package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class N extends AbstractC2139y {
    /* JADX INFO: Access modifiers changed from: protected */
    public N() {
        this.f15960a.add(O.ASSIGN);
        this.f15960a.add(O.CONST);
        this.f15960a.add(O.CREATE_ARRAY);
        this.f15960a.add(O.CREATE_OBJECT);
        this.f15960a.add(O.EXPRESSION_LIST);
        this.f15960a.add(O.GET);
        this.f15960a.add(O.GET_INDEX);
        this.f15960a.add(O.GET_PROPERTY);
        this.f15960a.add(O.NULL);
        this.f15960a.add(O.SET_PROPERTY);
        this.f15960a.add(O.TYPEOF);
        this.f15960a.add(O.UNDEFINED);
        this.f15960a.add(O.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2139y
    public final r a(String str, T1 t12, List list) {
        String str2;
        int i8 = 0;
        O o8 = O.ADD;
        int ordinal = AbstractC2110u2.e(str).ordinal();
        if (ordinal == 3) {
            AbstractC2110u2.h(O.ASSIGN.name(), 2, list);
            r b8 = t12.b((r) list.get(0));
            if (b8 instanceof C2115v) {
                if (t12.h(b8.g())) {
                    r b9 = t12.b((r) list.get(1));
                    t12.g(b8.g(), b9);
                    return b9;
                }
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", b8.g()));
            }
            throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", b8.getClass().getCanonicalName()));
        }
        if (ordinal == 14) {
            AbstractC2110u2.i(O.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                for (int i9 = 0; i9 < list.size() - 1; i9 += 2) {
                    r b10 = t12.b((r) list.get(i9));
                    if (b10 instanceof C2115v) {
                        t12.f(b10.g(), t12.b((r) list.get(i9 + 1)));
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", b10.getClass().getCanonicalName()));
                    }
                }
                return r.f15866c0;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        }
        if (ordinal == 24) {
            AbstractC2110u2.i(O.EXPRESSION_LIST.name(), 1, list);
            r rVar = r.f15866c0;
            while (i8 < list.size()) {
                rVar = t12.b((r) list.get(i8));
                if (rVar instanceof C2004h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i8++;
            }
            return rVar;
        }
        if (ordinal == 33) {
            AbstractC2110u2.h(O.GET.name(), 1, list);
            r b11 = t12.b((r) list.get(0));
            if (b11 instanceof C2115v) {
                return t12.d(b11.g());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", b11.getClass().getCanonicalName()));
        }
        if (ordinal == 49) {
            AbstractC2110u2.h(O.NULL.name(), 0, list);
            return r.f15867d0;
        }
        if (ordinal == 58) {
            AbstractC2110u2.h(O.SET_PROPERTY.name(), 3, list);
            r b12 = t12.b((r) list.get(0));
            r b13 = t12.b((r) list.get(1));
            r b14 = t12.b((r) list.get(2));
            if (b12 != r.f15866c0 && b12 != r.f15867d0) {
                if ((b12 instanceof C1986f) && (b13 instanceof C2020j)) {
                    ((C1986f) b12).z(b13.f().intValue(), b14);
                } else if (b12 instanceof InterfaceC2052n) {
                    ((InterfaceC2052n) b12).l(b13.g(), b14);
                }
                return b14;
            }
            throw new IllegalStateException(String.format("Can't set property %s of %s", b13.g(), b12.g()));
        }
        if (ordinal == 17) {
            if (list.isEmpty()) {
                return new C1986f();
            }
            C1986f c1986f = new C1986f();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r b15 = t12.b((r) it.next());
                if (!(b15 instanceof C2004h)) {
                    c1986f.z(i8, b15);
                    i8++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return c1986f;
        }
        if (ordinal == 18) {
            if (list.isEmpty()) {
                return new C2060o();
            }
            if (list.size() % 2 == 0) {
                C2060o c2060o = new C2060o();
                while (i8 < list.size() - 1) {
                    r b16 = t12.b((r) list.get(i8));
                    r b17 = t12.b((r) list.get(i8 + 1));
                    if (!(b16 instanceof C2004h) && !(b17 instanceof C2004h)) {
                        c2060o.l(b16.g(), b17);
                        i8 += 2;
                    } else {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                }
                return c2060o;
            }
            throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        }
        if (ordinal != 35 && ordinal != 36) {
            switch (ordinal) {
                case 62:
                    AbstractC2110u2.h(O.TYPEOF.name(), 1, list);
                    r b18 = t12.b((r) list.get(0));
                    if (b18 instanceof C2123w) {
                        str2 = "undefined";
                    } else if (b18 instanceof C1995g) {
                        str2 = TypedValues.Custom.S_BOOLEAN;
                    } else if (b18 instanceof C2020j) {
                        str2 = "number";
                    } else if (b18 instanceof C2115v) {
                        str2 = TypedValues.Custom.S_STRING;
                    } else if (b18 instanceof C2076q) {
                        str2 = "function";
                    } else {
                        if ((b18 instanceof C2091s) || (b18 instanceof C2004h)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", b18));
                        }
                        str2 = "object";
                    }
                    return new C2115v(str2);
                case 63:
                    AbstractC2110u2.h(O.UNDEFINED.name(), 0, list);
                    return r.f15866c0;
                case 64:
                    AbstractC2110u2.i(O.VAR.name(), 1, list);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        r b19 = t12.b((r) it2.next());
                        if (b19 instanceof C2115v) {
                            t12.e(b19.g(), r.f15866c0);
                        } else {
                            throw new IllegalArgumentException(String.format("Expected string for var name. got %s", b19.getClass().getCanonicalName()));
                        }
                    }
                    return r.f15866c0;
                default:
                    return super.b(str);
            }
        }
        AbstractC2110u2.h(O.GET_PROPERTY.name(), 2, list);
        r b20 = t12.b((r) list.get(0));
        r b21 = t12.b((r) list.get(1));
        if ((b20 instanceof C1986f) && AbstractC2110u2.k(b21)) {
            return ((C1986f) b20).s(b21.f().intValue());
        }
        if (b20 instanceof InterfaceC2052n) {
            return ((InterfaceC2052n) b20).p(b21.g());
        }
        if (b20 instanceof C2115v) {
            if ("length".equals(b21.g())) {
                return new C2020j(Double.valueOf(b20.g().length()));
            }
            if (AbstractC2110u2.k(b21) && b21.f().doubleValue() < b20.g().length()) {
                return new C2115v(String.valueOf(b20.g().charAt(b21.f().intValue())));
            }
        }
        return r.f15866c0;
    }
}
