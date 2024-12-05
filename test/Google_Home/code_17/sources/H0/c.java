package H0;

import G0.h;
import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class c implements b, a {

    /* renamed from: a, reason: collision with root package name */
    private final e f3462a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3463b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeUnit f3464c;

    /* renamed from: e, reason: collision with root package name */
    private CountDownLatch f3466e;

    /* renamed from: d, reason: collision with root package name */
    private final Object f3465d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f3467f = false;

    public c(e eVar, int i8, TimeUnit timeUnit) {
        this.f3462a = eVar;
        this.f3463b = i8;
        this.f3464c = timeUnit;
    }

    @Override // H0.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f3465d) {
            try {
                h.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f3466e = new CountDownLatch(1);
                this.f3467f = false;
                this.f3462a.a(str, bundle);
                h.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f3466e.await(this.f3463b, this.f3464c)) {
                        this.f3467f = true;
                        h.f().i("App exception callback received from Analytics listener.");
                    } else {
                        h.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    h.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f3466e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H0.b
    public void j(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f3466e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
