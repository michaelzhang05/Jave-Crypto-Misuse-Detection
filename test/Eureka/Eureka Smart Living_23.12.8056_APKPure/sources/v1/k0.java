package v1;

import android.app.PendingIntent;
import android.os.Bundle;

/* loaded from: classes.dex */
abstract class k0 extends r0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f9610d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f9611e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f9612f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(c cVar, int i6, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f9612f = cVar;
        this.f9610d = i6;
        this.f9611e = bundle;
    }

    @Override // v1.r0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        s1.a aVar;
        if (this.f9610d != 0) {
            this.f9612f.g0(1, null);
            Bundle bundle = this.f9611e;
            aVar = new s1.a(this.f9610d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        } else {
            if (g()) {
                return;
            }
            this.f9612f.g0(1, null);
            aVar = new s1.a(8, null);
        }
        f(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v1.r0
    public final void b() {
    }

    protected abstract void f(s1.a aVar);

    protected abstract boolean g();
}
