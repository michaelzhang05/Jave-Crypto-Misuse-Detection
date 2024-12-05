package androidx.work;

import S5.d;
import T5.b;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.SettableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.C3374p;
import l6.D0;
import l6.I;
import l6.InterfaceC3337A;
import l6.InterfaceC3390x0;
import l6.M;
import l6.N;
import z0.InterfaceFutureC4218d;

/* loaded from: classes3.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final I coroutineContext;
    private final SettableFuture<ListenableWorker.Result> future;
    private final InterfaceC3337A job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        InterfaceC3337A b8;
        AbstractC3255y.i(appContext, "appContext");
        AbstractC3255y.i(params, "params");
        b8 = D0.b(null, 1, null);
        this.job = b8;
        SettableFuture<ListenableWorker.Result> create = SettableFuture.create();
        AbstractC3255y.h(create, "create()");
        this.future = create;
        create.addListener(new Runnable() { // from class: androidx.work.a
            @Override // java.lang.Runnable
            public final void run() {
                CoroutineWorker._init_$lambda$0(CoroutineWorker.this);
            }
        }, getTaskExecutor().getSerialTaskExecutor());
        this.coroutineContext = C3347b0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CoroutineWorker this$0) {
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.future.isCancelled()) {
            InterfaceC3390x0.a.a(this$0.job, null, 1, null);
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
    public final InterfaceFutureC4218d getForegroundInfoAsync() {
        InterfaceC3337A b8;
        b8 = D0.b(null, 1, null);
        M a8 = N.a(getCoroutineContext().plus(b8));
        JobListenableFuture jobListenableFuture = new JobListenableFuture(b8, null, 2, null);
        AbstractC3364k.d(a8, null, null, new CoroutineWorker$getForegroundInfoAsync$1(jobListenableFuture, this, null), 3, null);
        return jobListenableFuture;
    }

    public final SettableFuture<ListenableWorker.Result> getFuture$work_runtime_release() {
        return this.future;
    }

    public final InterfaceC3337A getJob$work_runtime_release() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(ForegroundInfo foregroundInfo, d dVar) {
        InterfaceFutureC4218d foregroundAsync = setForegroundAsync(foregroundInfo);
        AbstractC3255y.h(foregroundAsync, "setForegroundAsync(foregroundInfo)");
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
            C3374p c3374p = new C3374p(b.c(dVar), 1);
            c3374p.C();
            foregroundAsync.addListener(new ListenableFutureKt$await$2$1(c3374p, foregroundAsync), DirectExecutor.INSTANCE);
            c3374p.i(new ListenableFutureKt$await$2$2(foregroundAsync));
            Object y8 = c3374p.y();
            if (y8 == b.e()) {
                h.c(dVar);
            }
            if (y8 == b.e()) {
                return y8;
            }
        }
        return O5.I.f8278a;
    }

    public final Object setProgress(Data data, d dVar) {
        InterfaceFutureC4218d progressAsync = setProgressAsync(data);
        AbstractC3255y.h(progressAsync, "setProgressAsync(data)");
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
            C3374p c3374p = new C3374p(b.c(dVar), 1);
            c3374p.C();
            progressAsync.addListener(new ListenableFutureKt$await$2$1(c3374p, progressAsync), DirectExecutor.INSTANCE);
            c3374p.i(new ListenableFutureKt$await$2$2(progressAsync));
            Object y8 = c3374p.y();
            if (y8 == b.e()) {
                h.c(dVar);
            }
            if (y8 == b.e()) {
                return y8;
            }
        }
        return O5.I.f8278a;
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceFutureC4218d startWork() {
        AbstractC3364k.d(N.a(getCoroutineContext().plus(this.job)), null, null, new CoroutineWorker$startWork$1(this, null), 3, null);
        return this.future;
    }
}
