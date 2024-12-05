package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class b<TResult> implements d<TResult> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f16340b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private OnCompleteListener<TResult> f16341c;

    public b(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.a = executor;
        this.f16341c = onCompleteListener;
    }

    @Override // com.google.android.gms.tasks.d
    public final void a(Task<TResult> task) {
        synchronized (this.f16340b) {
            if (this.f16341c == null) {
                return;
            }
            this.a.execute(new c(this, task));
        }
    }
}
