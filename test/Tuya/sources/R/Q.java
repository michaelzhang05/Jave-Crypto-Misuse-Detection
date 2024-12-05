package R;

import O.C1258b;
import android.app.PendingIntent;
import android.os.Bundle;

/* loaded from: classes3.dex */
abstract class Q extends c0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f8473d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f8474e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC1306c f8475f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(AbstractC1306c abstractC1306c, int i8, Bundle bundle) {
        super(abstractC1306c, Boolean.TRUE);
        this.f8475f = abstractC1306c;
        this.f8473d = i8;
        this.f8474e = bundle;
    }

    @Override // R.c0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        PendingIntent pendingIntent = null;
        if (this.f8473d != 0) {
            this.f8475f.i0(1, null);
            Bundle bundle = this.f8474e;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
            }
            f(new C1258b(this.f8473d, pendingIntent));
            return;
        }
        if (!g()) {
            this.f8475f.i0(1, null);
            f(new C1258b(8, null));
        }
    }

    protected abstract void f(C1258b c1258b);

    protected abstract boolean g();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R.c0
    public final void b() {
    }
}
