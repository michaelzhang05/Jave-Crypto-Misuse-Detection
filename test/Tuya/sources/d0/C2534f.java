package d0;

import H.a;
import P.f;
import R.AbstractC1310g;
import R.C1307d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: d0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2534f extends AbstractC1310g {

    /* renamed from: I, reason: collision with root package name */
    private final a.C0050a f30095I;

    public C2534f(Context context, Looper looper, C1307d c1307d, a.C0050a c0050a, f.a aVar, f.b bVar) {
        super(context, looper, 68, c1307d, aVar, bVar);
        a.C0050a.C0051a c0051a = new a.C0050a.C0051a(c0050a == null ? a.C0050a.f3251d : c0050a);
        c0051a.a(AbstractC2531c.a());
        this.f30095I = new a.C0050a(c0051a);
    }

    @Override // R.AbstractC1306c
    protected final Bundle A() {
        return this.f30095I.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R.AbstractC1306c
    public final String E() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // R.AbstractC1306c
    protected final String F() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // R.AbstractC1306c, P.a.f
    public final int k() {
        return 12800000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R.AbstractC1306c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof g) {
            return (g) queryLocalInterface;
        }
        return new g(iBinder);
    }
}
