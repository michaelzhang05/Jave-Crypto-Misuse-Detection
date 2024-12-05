package c0;

import O.AbstractC1268l;
import Q.InterfaceC1302c;
import Q.h;
import R.AbstractC1310g;
import R.C1307d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1899b extends AbstractC1310g {

    /* renamed from: I, reason: collision with root package name */
    private final Bundle f14847I;

    public C1899b(Context context, Looper looper, C1307d c1307d, H.c cVar, InterfaceC1302c interfaceC1302c, h hVar) {
        super(context, looper, 16, c1307d, interfaceC1302c, hVar);
        this.f14847I = new Bundle();
    }

    @Override // R.AbstractC1306c
    protected final Bundle A() {
        return this.f14847I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R.AbstractC1306c
    public final String E() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // R.AbstractC1306c
    protected final String F() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // R.AbstractC1306c
    public final boolean S() {
        return true;
    }

    @Override // R.AbstractC1306c, P.a.f
    public final int k() {
        return AbstractC1268l.f7671a;
    }

    @Override // R.AbstractC1306c, P.a.f
    public final boolean n() {
        C1307d j02 = j0();
        if (!TextUtils.isEmpty(j02.b()) && !j02.e(H.b.f3257a).isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R.AbstractC1306c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof C1900c) {
            return (C1900c) queryLocalInterface;
        }
        return new C1900c(iBinder);
    }
}
