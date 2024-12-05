package kotlinx.coroutines;

import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: CoroutineStart.kt */
/* loaded from: classes2.dex */
public enum j0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* compiled from: CoroutineStart.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[j0.valuesCustom().length];
            iArr[j0.DEFAULT.ordinal()] = 1;
            iArr[j0.ATOMIC.ordinal()] = 2;
            iArr[j0.UNDISPATCHED.ordinal()] = 3;
            iArr[j0.LAZY.ordinal()] = 4;
            a = iArr;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static j0[] valuesCustom() {
        j0[] valuesCustom = values();
        return (j0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final <R, T> void f(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation) {
        int i2 = a.a[ordinal()];
        if (i2 == 1) {
            kotlinx.coroutines.g2.a.c(function2, r, continuation, null, 4, null);
            return;
        }
        if (i2 == 2) {
            kotlin.coroutines.f.a(function2, r, continuation);
        } else if (i2 == 3) {
            kotlinx.coroutines.g2.b.a(function2, r, continuation);
        } else if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean i() {
        return this == LAZY;
    }
}
