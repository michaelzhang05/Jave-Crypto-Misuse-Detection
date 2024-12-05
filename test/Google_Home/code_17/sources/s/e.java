package S;

import N.C1333d;
import P.InterfaceC1358c;
import P.h;
import Q.AbstractC1391g;
import Q.C1388d;
import Q.C1406w;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import d0.AbstractC2725d;

/* loaded from: classes3.dex */
public final class e extends AbstractC1391g {

    /* renamed from: I, reason: collision with root package name */
    private final C1406w f9693I;

    public e(Context context, Looper looper, C1388d c1388d, C1406w c1406w, InterfaceC1358c interfaceC1358c, h hVar) {
        super(context, looper, SubsamplingScaleImageView.ORIENTATION_270, c1388d, interfaceC1358c, hVar);
        this.f9693I = c1406w;
    }

    @Override // Q.AbstractC1387c
    protected final Bundle A() {
        return this.f9693I.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1387c
    public final String E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // Q.AbstractC1387c
    protected final String F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // Q.AbstractC1387c
    protected final boolean I() {
        return true;
    }

    @Override // Q.AbstractC1387c, O.a.f
    public final int k() {
        return 203400000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1387c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new a(iBinder);
    }

    @Override // Q.AbstractC1387c
    public final C1333d[] v() {
        return AbstractC2725d.f31127b;
    }
}
