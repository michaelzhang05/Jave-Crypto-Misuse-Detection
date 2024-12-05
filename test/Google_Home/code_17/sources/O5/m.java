package O5;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class m {

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8294a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.f8295a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.f8296b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.f8297c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8294a = iArr;
        }
    }

    public static InterfaceC1355k a(o mode, Function0 initializer) {
        AbstractC3255y.i(mode, "mode");
        AbstractC3255y.i(initializer, "initializer");
        int i8 = a.f8294a[mode.ordinal()];
        int i9 = 2;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return new J(initializer);
                }
                throw new p();
            }
            return new u(initializer);
        }
        AbstractC3247p abstractC3247p = null;
        return new v(initializer, abstractC3247p, i9, abstractC3247p);
    }

    public static InterfaceC1355k b(Function0 initializer) {
        AbstractC3255y.i(initializer, "initializer");
        AbstractC3247p abstractC3247p = null;
        return new v(initializer, abstractC3247p, 2, abstractC3247p);
    }
}
