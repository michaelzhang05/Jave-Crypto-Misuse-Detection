package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class D extends A {
    public D() {
        this.f16048a.add(Z.EQUALS);
        this.f16048a.add(Z.GREATER_THAN);
        this.f16048a.add(Z.GREATER_THAN_EQUALS);
        this.f16048a.add(Z.IDENTITY_EQUALS);
        this.f16048a.add(Z.IDENTITY_NOT_EQUALS);
        this.f16048a.add(Z.LESS_THAN);
        this.f16048a.add(Z.LESS_THAN_EQUALS);
        this.f16048a.add(Z.NOT_EQUALS);
    }

    private static boolean c(InterfaceC2236s interfaceC2236s, InterfaceC2236s interfaceC2236s2) {
        InterfaceC2236s c2165k;
        InterfaceC2236s c2165k2;
        while (!interfaceC2236s.getClass().equals(interfaceC2236s2.getClass())) {
            if (((interfaceC2236s instanceof C2299z) || (interfaceC2236s instanceof C2219q)) && ((interfaceC2236s2 instanceof C2299z) || (interfaceC2236s2 instanceof C2219q))) {
                return true;
            }
            boolean z8 = interfaceC2236s instanceof C2165k;
            if (z8 && (interfaceC2236s2 instanceof C2254u)) {
                c2165k2 = new C2165k(interfaceC2236s2.z());
            } else {
                boolean z9 = interfaceC2236s instanceof C2254u;
                if (z9 && (interfaceC2236s2 instanceof C2165k)) {
                    c2165k = new C2165k(interfaceC2236s.z());
                } else if (interfaceC2236s instanceof C2135h) {
                    c2165k = new C2165k(interfaceC2236s.z());
                } else if (interfaceC2236s2 instanceof C2135h) {
                    c2165k2 = new C2165k(interfaceC2236s2.z());
                } else if ((z9 || z8) && (interfaceC2236s2 instanceof InterfaceC2183m)) {
                    c2165k2 = new C2254u(interfaceC2236s2.A());
                } else {
                    if (!(interfaceC2236s instanceof InterfaceC2183m) || (!(interfaceC2236s2 instanceof C2254u) && !(interfaceC2236s2 instanceof C2165k))) {
                        return false;
                    }
                    c2165k = new C2254u(interfaceC2236s.A());
                }
                interfaceC2236s = c2165k;
            }
            interfaceC2236s2 = c2165k2;
        }
        if ((interfaceC2236s instanceof C2299z) || (interfaceC2236s instanceof C2219q)) {
            return true;
        }
        if (interfaceC2236s instanceof C2165k) {
            if (Double.isNaN(interfaceC2236s.z().doubleValue()) || Double.isNaN(interfaceC2236s2.z().doubleValue()) || interfaceC2236s.z().doubleValue() != interfaceC2236s2.z().doubleValue()) {
                return false;
            }
            return true;
        }
        if (interfaceC2236s instanceof C2254u) {
            return interfaceC2236s.A().equals(interfaceC2236s2.A());
        }
        if (interfaceC2236s instanceof C2135h) {
            return interfaceC2236s.y().equals(interfaceC2236s2.y());
        }
        if (interfaceC2236s != interfaceC2236s2) {
            return false;
        }
        return true;
    }

    private static boolean d(InterfaceC2236s interfaceC2236s, InterfaceC2236s interfaceC2236s2) {
        if (interfaceC2236s instanceof InterfaceC2183m) {
            interfaceC2236s = new C2254u(interfaceC2236s.A());
        }
        if (interfaceC2236s2 instanceof InterfaceC2183m) {
            interfaceC2236s2 = new C2254u(interfaceC2236s2.A());
        }
        if ((interfaceC2236s instanceof C2254u) && (interfaceC2236s2 instanceof C2254u)) {
            if (interfaceC2236s.A().compareTo(interfaceC2236s2.A()) < 0) {
                return true;
            }
            return false;
        }
        double doubleValue = interfaceC2236s.z().doubleValue();
        double doubleValue2 = interfaceC2236s2.z().doubleValue();
        if (!Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && ((doubleValue != 0.0d || doubleValue2 != -0.0d) && ((doubleValue != -0.0d || doubleValue2 != 0.0d) && Double.compare(doubleValue, doubleValue2) < 0))) {
            return true;
        }
        return false;
    }

    private static boolean e(InterfaceC2236s interfaceC2236s, InterfaceC2236s interfaceC2236s2) {
        if (interfaceC2236s instanceof InterfaceC2183m) {
            interfaceC2236s = new C2254u(interfaceC2236s.A());
        }
        if (interfaceC2236s2 instanceof InterfaceC2183m) {
            interfaceC2236s2 = new C2254u(interfaceC2236s2.A());
        }
        if (((!(interfaceC2236s instanceof C2254u) || !(interfaceC2236s2 instanceof C2254u)) && (Double.isNaN(interfaceC2236s.z().doubleValue()) || Double.isNaN(interfaceC2236s2.z().doubleValue()))) || d(interfaceC2236s2, interfaceC2236s)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x002a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    @Override // com.google.android.gms.internal.measurement.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC2236s b(java.lang.String r4, com.google.android.gms.internal.measurement.V2 r5, java.util.List r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.measurement.Z r0 = com.google.android.gms.internal.measurement.AbstractC2128g2.c(r4)
            r1 = 2
            com.google.android.gms.internal.measurement.AbstractC2128g2.f(r0, r1, r6)
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            com.google.android.gms.internal.measurement.s r0 = (com.google.android.gms.internal.measurement.InterfaceC2236s) r0
            com.google.android.gms.internal.measurement.s r0 = r5.b(r0)
            r1 = 1
            java.lang.Object r6 = r6.get(r1)
            com.google.android.gms.internal.measurement.s r6 = (com.google.android.gms.internal.measurement.InterfaceC2236s) r6
            com.google.android.gms.internal.measurement.s r5 = r5.b(r6)
            int[] r6 = com.google.android.gms.internal.measurement.G.f16135a
            com.google.android.gms.internal.measurement.Z r2 = com.google.android.gms.internal.measurement.AbstractC2128g2.c(r4)
            int r2 = r2.ordinal()
            r6 = r6[r2]
            switch(r6) {
                case 1: goto L56;
                case 2: goto L51;
                case 3: goto L4c;
                case 4: goto L47;
                case 5: goto L42;
                case 6: goto L3d;
                case 7: goto L38;
                case 8: goto L32;
                default: goto L2d;
            }
        L2d:
            com.google.android.gms.internal.measurement.s r4 = super.a(r4)
            return r4
        L32:
            boolean r4 = c(r0, r5)
        L36:
            r4 = r4 ^ r1
            goto L5a
        L38:
            boolean r4 = e(r0, r5)
            goto L5a
        L3d:
            boolean r4 = d(r0, r5)
            goto L5a
        L42:
            boolean r4 = com.google.android.gms.internal.measurement.AbstractC2128g2.h(r0, r5)
            goto L36
        L47:
            boolean r4 = com.google.android.gms.internal.measurement.AbstractC2128g2.h(r0, r5)
            goto L5a
        L4c:
            boolean r4 = e(r5, r0)
            goto L5a
        L51:
            boolean r4 = d(r5, r0)
            goto L5a
        L56:
            boolean r4 = c(r0, r5)
        L5a:
            if (r4 == 0) goto L5f
            com.google.android.gms.internal.measurement.s r4 = com.google.android.gms.internal.measurement.InterfaceC2236s.f16807g0
            return r4
        L5f:
            com.google.android.gms.internal.measurement.s r4 = com.google.android.gms.internal.measurement.InterfaceC2236s.f16808h0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.D.b(java.lang.String, com.google.android.gms.internal.measurement.V2, java.util.List):com.google.android.gms.internal.measurement.s");
    }
}
