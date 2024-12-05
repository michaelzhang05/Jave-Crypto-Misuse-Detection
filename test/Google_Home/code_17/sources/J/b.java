package J;

import O.j;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public class b implements j {

    /* renamed from: a, reason: collision with root package name */
    private final Status f4613a;

    /* renamed from: b, reason: collision with root package name */
    private final GoogleSignInAccount f4614b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f4614b = googleSignInAccount;
        this.f4613a = status;
    }

    public GoogleSignInAccount a() {
        return this.f4614b;
    }

    @Override // O.j
    public Status getStatus() {
        return this.f4613a;
    }
}
