package K;

import N.AbstractC1341l;
import O.f;
import Q.AbstractC1391g;
import Q.C1388d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c0.AbstractC2005b;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class i extends AbstractC1391g {

    /* renamed from: I, reason: collision with root package name */
    private final GoogleSignInOptions f4973I;

    public i(Context context, Looper looper, C1388d c1388d, GoogleSignInOptions googleSignInOptions, f.a aVar, f.b bVar) {
        super(context, looper, 91, c1388d, aVar, bVar);
        GoogleSignInOptions.a aVar2;
        if (googleSignInOptions != null) {
            aVar2 = new GoogleSignInOptions.a(googleSignInOptions);
        } else {
            aVar2 = new GoogleSignInOptions.a();
        }
        aVar2.g(AbstractC2005b.a());
        if (!c1388d.d().isEmpty()) {
            Iterator it = c1388d.d().iterator();
            while (it.hasNext()) {
                aVar2.f((Scope) it.next(), new Scope[0]);
            }
        }
        this.f4973I = aVar2.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1387c
    public final String E() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // Q.AbstractC1387c
    protected final String F() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // Q.AbstractC1387c, O.a.f
    public final int k() {
        return AbstractC1341l.f7472a;
    }

    public final GoogleSignInOptions m0() {
        return this.f4973I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1387c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof u) {
            return (u) queryLocalInterface;
        }
        return new u(iBinder);
    }
}
