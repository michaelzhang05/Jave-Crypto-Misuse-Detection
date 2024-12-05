package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@zzard
/* loaded from: classes2.dex */
final class c7 {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final List<Runnable> f11222b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f11223c = false;

    public final void a(final Runnable runnable, final Executor executor) {
        synchronized (this.a) {
            if (this.f11223c) {
                executor.execute(runnable);
            } else {
                this.f11222b.add(new Runnable(executor, runnable) { // from class: com.google.android.gms.internal.ads.d7

                    /* renamed from: f, reason: collision with root package name */
                    private final Executor f11295f;

                    /* renamed from: g, reason: collision with root package name */
                    private final Runnable f11296g;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.f11295f = executor;
                        this.f11296g = runnable;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11295f.execute(this.f11296g);
                    }
                });
            }
        }
    }

    public final void b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.a) {
            if (this.f11223c) {
                return;
            }
            arrayList.addAll(this.f11222b);
            this.f11222b.clear();
            this.f11223c = true;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((Runnable) obj).run();
            }
        }
    }
}
