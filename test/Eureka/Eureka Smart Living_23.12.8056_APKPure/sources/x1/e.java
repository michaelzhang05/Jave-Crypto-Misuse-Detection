package x1;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import u1.h;
import v1.g;
import v1.u;

/* loaded from: classes.dex */
public final class e extends g {
    private final u I;

    public e(Context context, Looper looper, v1.d dVar, u uVar, u1.c cVar, h hVar) {
        super(context, looper, 270, dVar, cVar, hVar);
        this.I = uVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v1.c
    public final String D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // v1.c
    protected final String E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // v1.c
    protected final boolean H() {
        return true;
    }

    @Override // v1.c, t1.a.f
    public final int p() {
        return 203400000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v1.c
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    @Override // v1.c
    public final s1.c[] u() {
        return d2.d.f6477b;
    }

    @Override // v1.c
    protected final Bundle z() {
        return this.I.b();
    }
}
