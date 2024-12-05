package l6;

import a6.InterfaceC1668n;
import r6.AbstractC3975a;
import r6.AbstractC3976b;

/* loaded from: classes5.dex */
public enum O {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34576a;

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
            f34576a = iArr;
        }
    }

    public final void b(InterfaceC1668n interfaceC1668n, Object obj, S5.d dVar) {
        int i8 = a.f34576a[ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        throw new O5.p();
                    }
                    return;
                } else {
                    AbstractC3976b.a(interfaceC1668n, obj, dVar);
                    return;
                }
            }
            S5.f.b(interfaceC1668n, obj, dVar);
            return;
        }
        AbstractC3975a.d(interfaceC1668n, obj, dVar, null, 4, null);
    }

    public final boolean c() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }
}
