package i6;

import o6.AbstractC3585a;
import o6.AbstractC3586b;

/* loaded from: classes5.dex */
public enum O {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31724a;

        static {
            int[] iArr = new int[O.values().length];
            try {
                iArr[O.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[O.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f31724a = iArr;
        }
    }

    public final void b(X5.n nVar, Object obj, P5.d dVar) {
        int i8 = a.f31724a[ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        throw new L5.p();
                    }
                    return;
                } else {
                    AbstractC3586b.a(nVar, obj, dVar);
                    return;
                }
            }
            P5.f.b(nVar, obj, dVar);
            return;
        }
        AbstractC3585a.d(nVar, obj, dVar, null, 4, null);
    }

    public final boolean c() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }
}
