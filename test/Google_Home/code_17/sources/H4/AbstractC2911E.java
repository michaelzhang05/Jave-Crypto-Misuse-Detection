package h4;

import p4.AbstractC3771s;
import u4.C4061a;

/* renamed from: h4.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2911E {
    /* JADX INFO: Access modifiers changed from: private */
    public static final C4061a c(C4061a c4061a) {
        String c8 = c4061a.c();
        int i8 = -1;
        if (c8 != null) {
            String a8 = AbstractC3771s.a(c8);
            if (a8.length() == 4) {
                Integer i9 = j6.n.i(j6.n.U0(a8, 2));
                if (i9 != null) {
                    i8 = i9.intValue();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
        }
        return C4061a.b(c4061a, j6.n.e0(String.valueOf(i8), 2, '0'), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4061a d(C4061a c4061a) {
        String c8 = c4061a.c();
        int i8 = -1;
        if (c8 != null) {
            String a8 = AbstractC3771s.a(c8);
            if (a8.length() == 4) {
                Integer i9 = j6.n.i(j6.n.V0(a8, 2));
                if (i9 != null) {
                    i8 = i9.intValue() + 2000;
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
        }
        return C4061a.b(c4061a, String.valueOf(i8), false, 2, null);
    }
}
