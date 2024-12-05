package com.google.android.gms.tasks;

/* loaded from: classes2.dex */
final class c implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Task f16342f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ b f16343g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(b bVar, Task task) {
        this.f16343g = bVar;
        this.f16342f = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnCompleteListener onCompleteListener;
        OnCompleteListener onCompleteListener2;
        obj = this.f16343g.f16340b;
        synchronized (obj) {
            onCompleteListener = this.f16343g.f16341c;
            if (onCompleteListener != null) {
                onCompleteListener2 = this.f16343g.f16341c;
                onCompleteListener2.a(this.f16342f);
            }
        }
    }
}
