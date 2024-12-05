package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class A extends AbstractC2139y {
    public A() {
        this.f15960a.add(O.EQUALS);
        this.f15960a.add(O.GREATER_THAN);
        this.f15960a.add(O.GREATER_THAN_EQUALS);
        this.f15960a.add(O.IDENTITY_EQUALS);
        this.f15960a.add(O.IDENTITY_NOT_EQUALS);
        this.f15960a.add(O.LESS_THAN);
        this.f15960a.add(O.LESS_THAN_EQUALS);
        this.f15960a.add(O.NOT_EQUALS);
    }

    private static boolean c(r rVar, r rVar2) {
        if (rVar.getClass().equals(rVar2.getClass())) {
            if ((rVar instanceof C2123w) || (rVar instanceof C2068p)) {
                return true;
            }
            if (rVar instanceof C2020j) {
                if (Double.isNaN(rVar.f().doubleValue()) || Double.isNaN(rVar2.f().doubleValue()) || rVar.f().doubleValue() != rVar2.f().doubleValue()) {
                    return false;
                }
                return true;
            }
            if (rVar instanceof C2115v) {
                return rVar.g().equals(rVar2.g());
            }
            if (rVar instanceof C1995g) {
                return rVar.h().equals(rVar2.h());
            }
            if (rVar != rVar2) {
                return false;
            }
            return true;
        }
        if (((rVar instanceof C2123w) || (rVar instanceof C2068p)) && ((rVar2 instanceof C2123w) || (rVar2 instanceof C2068p))) {
            return true;
        }
        boolean z8 = rVar instanceof C2020j;
        if (z8 && (rVar2 instanceof C2115v)) {
            return c(rVar, new C2020j(rVar2.f()));
        }
        boolean z9 = rVar instanceof C2115v;
        if (z9 && (rVar2 instanceof C2020j)) {
            return c(new C2020j(rVar.f()), rVar2);
        }
        if (rVar instanceof C1995g) {
            return c(new C2020j(rVar.f()), rVar2);
        }
        if (rVar2 instanceof C1995g) {
            return c(rVar, new C2020j(rVar2.f()));
        }
        if ((!z9 && !z8) || !(rVar2 instanceof InterfaceC2052n)) {
            if (!(rVar instanceof InterfaceC2052n) || (!(rVar2 instanceof C2115v) && !(rVar2 instanceof C2020j))) {
                return false;
            }
            return c(new C2115v(rVar.g()), rVar2);
        }
        return c(rVar, new C2115v(rVar2.g()));
    }

    private static boolean d(r rVar, r rVar2) {
        if (rVar instanceof InterfaceC2052n) {
            rVar = new C2115v(rVar.g());
        }
        if (rVar2 instanceof InterfaceC2052n) {
            rVar2 = new C2115v(rVar2.g());
        }
        if ((rVar instanceof C2115v) && (rVar2 instanceof C2115v)) {
            if (rVar.g().compareTo(rVar2.g()) < 0) {
                return true;
            }
            return false;
        }
        double doubleValue = rVar.f().doubleValue();
        double doubleValue2 = rVar2.f().doubleValue();
        if (!Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && ((doubleValue != 0.0d || doubleValue2 != 0.0d) && ((doubleValue != 0.0d || doubleValue2 != 0.0d) && Double.compare(doubleValue, doubleValue2) < 0))) {
            return true;
        }
        return false;
    }

    private static boolean e(r rVar, r rVar2) {
        if (rVar instanceof InterfaceC2052n) {
            rVar = new C2115v(rVar.g());
        }
        if (rVar2 instanceof InterfaceC2052n) {
            rVar2 = new C2115v(rVar2.g());
        }
        if (((!(rVar instanceof C2115v) || !(rVar2 instanceof C2115v)) && (Double.isNaN(rVar.f().doubleValue()) || Double.isNaN(rVar2.f().doubleValue()))) || d(rVar2, rVar)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x003a. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.AbstractC2139y
    public final r a(String str, T1 t12, List list) {
        boolean c8;
        boolean c9;
        AbstractC2110u2.h(AbstractC2110u2.e(str).name(), 2, list);
        r b8 = t12.b((r) list.get(0));
        r b9 = t12.b((r) list.get(1));
        int ordinal = AbstractC2110u2.e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal != 48) {
                if (ordinal != 42) {
                    if (ordinal != 43) {
                        switch (ordinal) {
                            case 37:
                                c8 = d(b9, b8);
                                break;
                            case 38:
                                c8 = e(b9, b8);
                                break;
                            case 39:
                                c8 = AbstractC2110u2.l(b8, b9);
                                break;
                            case 40:
                                c9 = AbstractC2110u2.l(b8, b9);
                                break;
                            default:
                                return super.b(str);
                        }
                    } else {
                        c8 = e(b8, b9);
                    }
                } else {
                    c8 = d(b8, b9);
                }
            } else {
                c9 = c(b8, b9);
            }
            c8 = !c9;
        } else {
            c8 = c(b8, b9);
        }
        if (c8) {
            return r.f15871h0;
        }
        return r.f15872i0;
    }
}
