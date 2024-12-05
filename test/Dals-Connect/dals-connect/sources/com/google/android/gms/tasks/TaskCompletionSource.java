package com.google.android.gms.tasks;

/* loaded from: classes2.dex */
public class TaskCompletionSource<TResult> {
    private final g<TResult> a = new g<>();

    public Task<TResult> a() {
        return this.a;
    }

    public void b(Exception exc) {
        this.a.g(exc);
    }

    public void c(TResult tresult) {
        this.a.h(tresult);
    }

    public boolean d(Exception exc) {
        return this.a.i(exc);
    }

    public boolean e(TResult tresult) {
        return this.a.j(tresult);
    }
}
