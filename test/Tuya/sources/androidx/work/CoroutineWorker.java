package androidx.work;

import P5.d;
import Q5.b;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.SettableFuture;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.C2839p;
import i6.D0;
import i6.I;
import i6.InterfaceC2802A;
import i6.InterfaceC2855x0;
import i6.M;
import i6.N;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.AbstractC3159y;
import x0.InterfaceFutureC3857a;

/* loaded from: classes3.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final I coroutineContext;
    private final SettableFuture<ListenableWorker.Result> future;
    private final InterfaceC2802A job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        InterfaceC2802A b8;
        AbstractC3159y.i(appContext, "appContext");
        AbstractC3159y.i(params, "params");
        b8 = D0.b(null, 1, null);
        this.job = b8;
        SettableFuture<ListenableWorker.Result> create = SettableFuture.create();
        AbstractC3159y.h(create, "create()");
        this.future = create;
        create.addListener(new Runnable() { // from class: androidx.work.a
            @Override // java.lang.Runnable
            public final void run() {
                CoroutineWorker._init_$lambda$0(CoroutineWorker.this);
            }
        }, getTaskExecutor().getSerialTaskExecutor());
        this.coroutineContext = C2812b0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CoroutineWorker this$0) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.future.isCancelled()) {
            InterfaceC2855x0.a.a(this$0.job, null, 1, null);
        }
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, d dVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(d dVar);

    public I getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(d dVar) {
        return getForegroundInfo$suspendImpl(this, dVar);
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceFutureC3857a getForegroundInfoAsync() {
        InterfaceC2802A b8;
        b8 = D0.b(null, 1, null);
        M a8 = N.a(getCoroutineContext().plus(b8));
        JobListenableFuture jobListenableFuture = new JobListenableFuture(b8, null, 2, null);
        AbstractC2829k.d(a8, null, null, new CoroutineWorker$getForegroundInfoAsync$1(jobListenableFuture, this, null), 3, null);
        return jobListenableFuture;
    }

    public final SettableFuture<ListenableWorker.Result> getFuture$work_runtime_release() {
        return this.future;
    }

    public final InterfaceC2802A getJob$work_runtime_release() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(ForegroundInfo foregroundInfo, d dVar) {
        InterfaceFutureC3857a foregroundAsync = setForegroundAsync(foregroundInfo);
        AbstractC3159y.h(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e8) {
                Throwable cause = e8.getCause();
                if (cause == null) {
                    throw e8;
                }
                throw cause;
            }
        } else {
            C2839p c2839p = new C2839p(b.c(dVar), 1);
            c2839p.B();
            foregroundAsync.addListener(new ListenableFutureKt$await$2$1(c2839p, foregroundAsync), DirectExecutor.INSTANCE);
            c2839p.j(new ListenableFutureKt$await$2$2(foregroundAsync));
            Object y8 = c2839p.y();
            if (y8 == b.e()) {
                h.c(dVar);
            }
            if (y8 == b.e()) {
                return y8;
            }
        }
        return L5.I.f6487a;
    }

    public final Object setProgress(Data data, d dVar) {
        InterfaceFutureC3857a progressAsync = setProgressAsync(data);
        AbstractC3159y.h(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e8) {
                Throwable cause = e8.getCause();
                if (cause == null) {
                    throw e8;
                }
                throw cause;
            }
        } else {
            C2839p c2839p = new C2839p(b.c(dVar), 1);
            c2839p.B();
            progressAsync.addListener(new ListenableFutureKt$await$2$1(c2839p, progressAsync), DirectExecutor.INSTANCE);
            c2839p.j(new ListenableFutureKt$await$2$2(progressAsync));
            Object y8 = c2839p.y();
            if (y8 == b.e()) {
                h.c(dVar);
            }
            if (y8 == b.e()) {
                return y8;
            }
        }
        return L5.I.f6487a;
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceFutureC3857a startWork() {
        AbstractC2829k.d(N.a(getCoroutineContext().plus(this.job)), null, null, new CoroutineWorker$startWork$1(this, null), 3, null);
        return this.future;
    }
}
