package cm.aptoide.pt.account;

import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AccountService;
import cm.aptoide.accountmanager.SignUpAdapter;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.common.api.GoogleApiClient;
import rx.Single;
import rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class GoogleSignUpAdapter implements SignUpAdapter<GoogleSignInResult> {
    public static final String TYPE = "GOOGLE";
    private final GoogleApiClient client;
    private final LoginPreferences preferences;

    public GoogleSignUpAdapter(GoogleApiClient googleApiClient, LoginPreferences loginPreferences) {
        this.preferences = loginPreferences;
        this.client = googleApiClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$logout$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b a() {
        if (this.client.d().L()) {
            Auth.f10330j.d(this.client);
            return rx.b.e();
        }
        return rx.b.s(new IllegalStateException("Could not connect to Google Play Services to sign out."));
    }

    @Override // cm.aptoide.accountmanager.SignUpAdapter
    public boolean isEnabled() {
        return this.preferences.isGoogleLoginEnabled();
    }

    @Override // cm.aptoide.accountmanager.SignUpAdapter
    public rx.b logout() {
        return rx.b.i(new rx.m.d() { // from class: cm.aptoide.pt.account.s0
            @Override // rx.m.d, java.util.concurrent.Callable
            public final Object call() {
                return GoogleSignUpAdapter.this.a();
            }
        }).K(Schedulers.io());
    }

    @Override // cm.aptoide.accountmanager.SignUpAdapter
    public Single<Account> signUp(GoogleSignInResult googleSignInResult, AccountService accountService) {
        if (!isEnabled()) {
            return Single.h(new IllegalStateException("Google sign up is not enabled"));
        }
        GoogleSignInAccount a = googleSignInResult.a();
        if (googleSignInResult.c() && a != null) {
            return accountService.createAccount(a.z(), a.q0(), TYPE);
        }
        return Single.h(new GoogleSignUpException(GoogleSignInStatusCodes.a(googleSignInResult.getStatus().w()), googleSignInResult.getStatus().w()));
    }
}
