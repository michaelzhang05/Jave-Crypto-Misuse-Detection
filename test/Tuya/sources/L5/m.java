package L5;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class m {

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6503a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.f6504a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.f6505b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.f6506c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6503a = iArr;
        }
    }

    public static InterfaceC1227k a(o mode, Function0 initializer) {
        AbstractC3159y.i(mode, "mode");
        AbstractC3159y.i(initializer, "initializer");
        int i8 = a.f6503a[mode.ordinal()];
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
        AbstractC3151p abstractC3151p = null;
        return new v(initializer, abstractC3151p, i9, abstractC3151p);
    }

    public static InterfaceC1227k b(Function0 initializer) {
        AbstractC3159y.i(initializer, "initializer");
        AbstractC3151p abstractC3151p = null;
        return new v(initializer, abstractC3151p, 2, abstractC3151p);
    }
}
