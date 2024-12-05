package u1;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes.dex */
final class a0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f9375a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f9376b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b0 f9377c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(b0 b0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f9377c = b0Var;
        this.f9375a = lifecycleCallback;
        this.f9376b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        b0 b0Var = this.f9377c;
        i6 = b0Var.f9384d0;
        if (i6 > 0) {
            LifecycleCallback lifecycleCallback = this.f9375a;
            bundle = b0Var.f9385e0;
            if (bundle != null) {
                bundle3 = b0Var.f9385e0;
                bundle2 = bundle3.getBundle(this.f9376b);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i7 = this.f9377c.f9384d0;
        if (i7 >= 2) {
            this.f9375a.j();
        }
        i8 = this.f9377c.f9384d0;
        if (i8 >= 3) {
            this.f9375a.h();
        }
        i9 = this.f9377c.f9384d0;
        if (i9 >= 4) {
            this.f9375a.k();
        }
        i10 = this.f9377c.f9384d0;
        if (i10 >= 5) {
            this.f9375a.g();
        }
    }
}
