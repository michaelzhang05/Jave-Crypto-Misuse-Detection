package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class g<TResult> extends Task<TResult> {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final e<TResult> f16346b = new e<>();

    /* renamed from: c, reason: collision with root package name */
    private boolean f16347c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f16348d;

    /* renamed from: e, reason: collision with root package name */
    private TResult f16349e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f16350f;

    private final void k() {
        Preconditions.m(this.f16347c, "Task is not yet complete");
    }

    private final void l() {
        Preconditions.m(!this.f16347c, "Task is already complete");
    }

    private final void m() {
        if (this.f16348d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void n() {
        synchronized (this.a) {
            if (this.f16347c) {
                this.f16346b.a(this);
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> a(OnCompleteListener<TResult> onCompleteListener) {
        return b(TaskExecutors.a, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<TResult> b(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.f16346b.b(new b(executor, onCompleteListener));
        n();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception c() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f16350f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final TResult d() {
        TResult tresult;
        synchronized (this.a) {
            k();
            m();
            if (this.f16350f == null) {
                tresult = this.f16349e;
            } else {
                throw new RuntimeExecutionException(this.f16350f);
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.f16347c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = this.f16347c && !this.f16348d && this.f16350f == null;
        }
        return z;
    }

    public final void g(Exception exc) {
        Preconditions.k(exc, "Exception must not be null");
        synchronized (this.a) {
            l();
            this.f16347c = true;
            this.f16350f = exc;
        }
        this.f16346b.a(this);
    }

    public final void h(TResult tresult) {
        synchronized (this.a) {
            l();
            this.f16347c = true;
            this.f16349e = tresult;
        }
        this.f16346b.a(this);
    }

    public final boolean i(Exception exc) {
        Preconditions.k(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.f16347c) {
                return false;
            }
            this.f16347c = true;
            this.f16350f = exc;
            this.f16346b.a(this);
            return true;
        }
    }

    public final boolean j(TResult tresult) {
        synchronized (this.a) {
            if (this.f16347c) {
                return false;
            }
            this.f16347c = true;
            this.f16349e = tresult;
            this.f16346b.a(this);
            return true;
        }
    }
}
