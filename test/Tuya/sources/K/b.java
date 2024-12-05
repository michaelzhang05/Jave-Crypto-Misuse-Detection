package K;

import P.j;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public class b implements j {

    /* renamed from: a, reason: collision with root package name */
    private final Status f5713a;

    /* renamed from: b, reason: collision with root package name */
    private final GoogleSignInAccount f5714b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f5714b = googleSignInAccount;
        this.f5713a = status;
    }

    public GoogleSignInAccount a() {
        return this.f5714b;
    }

    @Override // P.j
    public Status getStatus() {
        return this.f5713a;
    }
}
