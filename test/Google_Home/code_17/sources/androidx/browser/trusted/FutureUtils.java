package androidx.browser.trusted;

import androidx.annotation.NonNull;
import androidx.concurrent.futures.ResolvableFuture;
import z0.InterfaceFutureC4218d;

/* loaded from: classes.dex */
class FutureUtils {
    private FutureUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static <T> InterfaceFutureC4218d immediateFailedFuture(@NonNull Throwable th) {
        ResolvableFuture create = ResolvableFuture.create();
        create.setException(th);
        return create;
    }
}
