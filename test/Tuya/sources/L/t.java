package L;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public interface t extends IInterface {
    void L(Status status);

    void N(GoogleSignInAccount googleSignInAccount, Status status);

    void U(Status status);
}
