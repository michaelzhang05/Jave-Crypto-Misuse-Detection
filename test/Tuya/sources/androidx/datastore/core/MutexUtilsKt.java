package androidx.datastore.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3157w;
import kotlin.jvm.internal.AbstractC3159y;
import r6.InterfaceC3690a;

/* loaded from: classes3.dex */
public final class MutexUtilsKt {
    public static final <R> R withTryLock(InterfaceC3690a interfaceC3690a, Object obj, Function1 block) {
        AbstractC3159y.i(interfaceC3690a, "<this>");
        AbstractC3159y.i(block, "block");
        boolean a8 = interfaceC3690a.a(obj);
        try {
            return (R) block.invoke(Boolean.valueOf(a8));
        } finally {
            AbstractC3157w.b(1);
            if (a8) {
                interfaceC3690a.d(obj);
            }
            AbstractC3157w.a(1);
        }
    }

    public static /* synthetic */ Object withTryLock$default(InterfaceC3690a interfaceC3690a, Object obj, Function1 block, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            obj = null;
        }
        AbstractC3159y.i(interfaceC3690a, "<this>");
        AbstractC3159y.i(block, "block");
        boolean a8 = interfaceC3690a.a(obj);
        try {
            return block.invoke(Boolean.valueOf(a8));
        } finally {
            AbstractC3157w.b(1);
            if (a8) {
                interfaceC3690a.d(obj);
            }
            AbstractC3157w.a(1);
        }
    }
}
