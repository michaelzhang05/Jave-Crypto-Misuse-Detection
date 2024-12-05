package P;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes3.dex */
final class C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f8632a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f8633b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ D f8634c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(D d8, LifecycleCallback lifecycleCallback, String str) {
        this.f8634c = d8;
        this.f8632a = lifecycleCallback;
        this.f8633b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        D d8 = this.f8634c;
        i8 = d8.f8637b;
        if (i8 > 0) {
            LifecycleCallback lifecycleCallback = this.f8632a;
            bundle = d8.f8638c;
            if (bundle != null) {
                String str = this.f8633b;
                bundle3 = d8.f8638c;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i9 = this.f8634c.f8637b;
        if (i9 >= 2) {
            this.f8632a.j();
        }
        i10 = this.f8634c.f8637b;
        if (i10 >= 3) {
            this.f8632a.h();
        }
        i11 = this.f8634c.f8637b;
        if (i11 >= 4) {
            this.f8632a.k();
        }
        i12 = this.f8634c.f8637b;
        if (i12 >= 5) {
            this.f8632a.g();
        }
    }
}
