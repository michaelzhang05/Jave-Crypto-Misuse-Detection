package h.a.z.g;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: DisposeOnCancel.java */
/* loaded from: classes2.dex */
final class c implements Future<Object> {

    /* renamed from: f, reason: collision with root package name */
    final h.a.x.c f18182f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(h.a.x.c cVar) {
        this.f18182f = cVar;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.f18182f.d();
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException, ExecutionException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }
}
