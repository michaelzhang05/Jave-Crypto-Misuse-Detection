package u1;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes.dex */
final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f9406a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f9407b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ z f9408c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(z zVar, LifecycleCallback lifecycleCallback, String str) {
        this.f9408c = zVar;
        this.f9406a = lifecycleCallback;
        this.f9407b = str;
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
        z zVar = this.f9408c;
        i6 = zVar.f9411b;
        if (i6 > 0) {
            LifecycleCallback lifecycleCallback = this.f9406a;
            bundle = zVar.f9412c;
            if (bundle != null) {
                bundle3 = zVar.f9412c;
                bundle2 = bundle3.getBundle(this.f9407b);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i7 = this.f9408c.f9411b;
        if (i7 >= 2) {
            this.f9406a.j();
        }
        i8 = this.f9408c.f9411b;
        if (i8 >= 3) {
            this.f9406a.h();
        }
        i9 = this.f9408c.f9411b;
        if (i9 >= 4) {
            this.f9406a.k();
        }
        i10 = this.f9408c.f9411b;
        if (i10 >= 5) {
            this.f9406a.g();
        }
    }
}
