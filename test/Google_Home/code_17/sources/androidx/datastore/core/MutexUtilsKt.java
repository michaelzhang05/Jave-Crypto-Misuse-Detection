package androidx.datastore.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3253w;
import kotlin.jvm.internal.AbstractC3255y;
import u6.InterfaceC4063a;

/* loaded from: classes3.dex */
public final class MutexUtilsKt {
    public static final <R> R withTryLock(InterfaceC4063a interfaceC4063a, Object obj, Function1 block) {
        AbstractC3255y.i(interfaceC4063a, "<this>");
        AbstractC3255y.i(block, "block");
        boolean b8 = interfaceC4063a.b(obj);
        try {
            return (R) block.invoke(Boolean.valueOf(b8));
        } finally {
            AbstractC3253w.b(1);
            if (b8) {
                interfaceC4063a.d(obj);
            }
            AbstractC3253w.a(1);
        }
    }

    public static /* synthetic */ Object withTryLock$default(InterfaceC4063a interfaceC4063a, Object obj, Function1 block, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            obj = null;
        }
        AbstractC3255y.i(interfaceC4063a, "<this>");
        AbstractC3255y.i(block, "block");
        boolean b8 = interfaceC4063a.b(obj);
        try {
            return block.invoke(Boolean.valueOf(b8));
        } finally {
            AbstractC3253w.b(1);
            if (b8) {
                interfaceC4063a.d(obj);
            }
            AbstractC3253w.a(1);
        }
    }
}
