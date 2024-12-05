package Q;

import N.C1331b;
import android.app.PendingIntent;
import android.os.Bundle;

/* loaded from: classes3.dex */
abstract class Q extends c0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f8935d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f8936e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC1387c f8937f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(AbstractC1387c abstractC1387c, int i8, Bundle bundle) {
        super(abstractC1387c, Boolean.TRUE);
        this.f8937f = abstractC1387c;
        this.f8935d = i8;
        this.f8936e = bundle;
    }

    @Override // Q.c0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        PendingIntent pendingIntent = null;
        if (this.f8935d != 0) {
            this.f8937f.i0(1, null);
            Bundle bundle = this.f8936e;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
            }
            f(new C1331b(this.f8935d, pendingIntent));
            return;
        }
        if (!g()) {
            this.f8937f.i0(1, null);
            f(new C1331b(8, null));
        }
    }

    protected abstract void f(C1331b c1331b);

    protected abstract boolean g();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.c0
    public final void b() {
    }
}
