package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import kotlin.jvm.internal.AbstractC3255y;
import l6.U;
import z0.InterfaceFutureC4218d;

/* loaded from: classes3.dex */
public final class CoroutineAdapterKt {
    public static final <T> InterfaceFutureC4218d asListenableFuture(final U u8, final Object obj) {
        AbstractC3255y.i(u8, "<this>");
        InterfaceFutureC4218d future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.privacysandbox.ads.adservices.java.internal.a
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                Object asListenableFuture$lambda$0;
                asListenableFuture$lambda$0 = CoroutineAdapterKt.asListenableFuture$lambda$0(U.this, obj, completer);
                return asListenableFuture$lambda$0;
            }
        });
        AbstractC3255y.h(future, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return future;
    }

    public static /* synthetic */ InterfaceFutureC4218d asListenableFuture$default(U u8, Object obj, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return asListenableFuture(u8, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object asListenableFuture$lambda$0(U this_asListenableFuture, Object obj, CallbackToFutureAdapter.Completer completer) {
        AbstractC3255y.i(this_asListenableFuture, "$this_asListenableFuture");
        AbstractC3255y.i(completer, "completer");
        this_asListenableFuture.s(new CoroutineAdapterKt$asListenableFuture$1$1(completer, this_asListenableFuture));
        return obj;
    }
}
