package androidx.browser.trusted;

import androidx.annotation.NonNull;
import androidx.concurrent.futures.ResolvableFuture;
import x0.InterfaceFutureC3857a;

/* loaded from: classes.dex */
class FutureUtils {
    private FutureUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static <T> InterfaceFutureC3857a immediateFailedFuture(@NonNull Throwable th) {
        ResolvableFuture create = ResolvableFuture.create();
        create.setException(th);
        return create;
    }
}
