package T;

import O.C1260d;
import Q.InterfaceC1302c;
import Q.h;
import R.AbstractC1310g;
import R.C1307d;
import R.C1325w;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import e0.AbstractC2572d;

/* loaded from: classes3.dex */
public final class e extends AbstractC1310g {

    /* renamed from: I, reason: collision with root package name */
    private final C1325w f9690I;

    public e(Context context, Looper looper, C1307d c1307d, C1325w c1325w, InterfaceC1302c interfaceC1302c, h hVar) {
        super(context, looper, SubsamplingScaleImageView.ORIENTATION_270, c1307d, interfaceC1302c, hVar);
        this.f9690I = c1325w;
    }

    @Override // R.AbstractC1306c
    protected final Bundle A() {
        return this.f9690I.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R.AbstractC1306c
    public final String E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // R.AbstractC1306c
    protected final String F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // R.AbstractC1306c
    protected final boolean I() {
        return true;
    }

    @Override // R.AbstractC1306c, P.a.f
    public final int k() {
        return 203400000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R.AbstractC1306c
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

    @Override // R.AbstractC1306c
    public final C1260d[] v() {
        return AbstractC2572d.f30221b;
    }
}
