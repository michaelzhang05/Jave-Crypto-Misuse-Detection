package c0;

import H.g;
import O.f;
import Q.AbstractC1391g;
import Q.C1388d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class e extends AbstractC1391g {

    /* renamed from: I, reason: collision with root package name */
    private final g f15560I;

    public e(Context context, Looper looper, C1388d c1388d, g gVar, f.a aVar, f.b bVar) {
        super(context, looper, 68, c1388d, aVar, bVar);
        H.f fVar = new H.f(gVar == null ? g.f3458d : gVar);
        fVar.a(AbstractC2005b.a());
        this.f15560I = new g(fVar);
    }

    @Override // Q.AbstractC1387c
    protected final Bundle A() {
        return this.f15560I.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1387c
    public final String E() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // Q.AbstractC1387c
    protected final String F() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // Q.AbstractC1387c, O.a.f
    public final int k() {
        return 12800000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1387c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof f) {
            return (f) queryLocalInterface;
        }
        return new f(iBinder);
    }
}
