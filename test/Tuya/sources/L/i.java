package L;

import O.AbstractC1268l;
import P.f;
import R.AbstractC1310g;
import R.C1307d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import d0.AbstractC2531c;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class i extends AbstractC1310g {

    /* renamed from: I, reason: collision with root package name */
    private final GoogleSignInOptions f6028I;

    public i(Context context, Looper looper, C1307d c1307d, GoogleSignInOptions googleSignInOptions, f.a aVar, f.b bVar) {
        super(context, looper, 91, c1307d, aVar, bVar);
        GoogleSignInOptions.a aVar2;
        if (googleSignInOptions != null) {
            aVar2 = new GoogleSignInOptions.a(googleSignInOptions);
        } else {
            aVar2 = new GoogleSignInOptions.a();
        }
        aVar2.g(AbstractC2531c.a());
        if (!c1307d.d().isEmpty()) {
            Iterator it = c1307d.d().iterator();
            while (it.hasNext()) {
                aVar2.f((Scope) it.next(), new Scope[0]);
            }
        }
        this.f6028I = aVar2.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R.AbstractC1306c
    public final String E() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // R.AbstractC1306c
    protected final String F() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // R.AbstractC1306c, P.a.f
    public final int k() {
        return AbstractC1268l.f7671a;
    }

    public final GoogleSignInOptions m0() {
        return this.f6028I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R.AbstractC1306c
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
