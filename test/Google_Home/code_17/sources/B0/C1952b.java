package b0;

import N.AbstractC1341l;
import P.InterfaceC1358c;
import P.h;
import Q.AbstractC1391g;
import Q.C1388d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: b0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1952b extends AbstractC1391g {

    /* renamed from: I, reason: collision with root package name */
    private final Bundle f15041I;

    public C1952b(Context context, Looper looper, C1388d c1388d, H.c cVar, InterfaceC1358c interfaceC1358c, h hVar) {
        super(context, looper, 16, c1388d, interfaceC1358c, hVar);
        this.f15041I = new Bundle();
    }

    @Override // Q.AbstractC1387c
    protected final Bundle A() {
        return this.f15041I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1387c
    public final String E() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // Q.AbstractC1387c
    protected final String F() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // Q.AbstractC1387c
    public final boolean S() {
        return true;
    }

    @Override // Q.AbstractC1387c, O.a.f
    public final int k() {
        return AbstractC1341l.f7472a;
    }

    @Override // Q.AbstractC1387c, O.a.f
    public final boolean o() {
        C1388d j02 = j0();
        if (!TextUtils.isEmpty(j02.b()) && !j02.e(H.b.f3452a).isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1387c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof C1953c) {
            return (C1953c) queryLocalInterface;
        }
        return new C1953c(iBinder);
    }
}
