package e4;

import m4.AbstractC3428s;
import r4.C3688a;

/* renamed from: e4.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2591E {
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3688a c(C3688a c3688a) {
        String c8 = c3688a.c();
        int i8 = -1;
        if (c8 != null) {
            String a8 = AbstractC3428s.a(c8);
            if (a8.length() == 4) {
                Integer i9 = g6.n.i(g6.n.U0(a8, 2));
                if (i9 != null) {
                    i8 = i9.intValue();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
        }
        return C3688a.b(c3688a, g6.n.e0(String.valueOf(i8), 2, '0'), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3688a d(C3688a c3688a) {
        String c8 = c3688a.c();
        int i8 = -1;
        if (c8 != null) {
            String a8 = AbstractC3428s.a(c8);
            if (a8.length() == 4) {
                Integer i9 = g6.n.i(g6.n.V0(a8, 2));
                if (i9 != null) {
                    i8 = i9.intValue() + 2000;
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
        }
        return C3688a.b(c3688a, String.valueOf(i8), false, 2, null);
    }
}
