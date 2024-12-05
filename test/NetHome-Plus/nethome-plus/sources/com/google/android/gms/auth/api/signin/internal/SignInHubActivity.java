package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import c.l.a.a;
import cm.aptoide.pt.account.AccountAnalytics;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

@KeepName
/* loaded from: classes2.dex */
public class SignInHubActivity extends androidx.fragment.app.c {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f10451f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10452g = false;

    /* renamed from: h, reason: collision with root package name */
    private SignInConfiguration f10453h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10454i;

    /* renamed from: j, reason: collision with root package name */
    private int f10455j;

    /* renamed from: k, reason: collision with root package name */
    private Intent f10456k;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a implements a.InterfaceC0066a<Void> {
        private a() {
        }

        @Override // c.l.a.a.InterfaceC0066a
        public final /* synthetic */ void a(c.l.b.b<Void> bVar, Void r3) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.f10455j, SignInHubActivity.this.f10456k);
            SignInHubActivity.this.finish();
        }

        @Override // c.l.a.a.InterfaceC0066a
        public final c.l.b.b<Void> b(int i2, Bundle bundle) {
            return new zze(SignInHubActivity.this, GoogleApiClient.l());
        }

        @Override // c.l.a.a.InterfaceC0066a
        public final void c(c.l.b.b<Void> bVar) {
        }
    }

    private final void b(int i2) {
        Status status = new Status(i2);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f10451f = false;
    }

    private final void d() {
        getSupportLoaderManager().c(0, null, new a());
        f10451f = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (this.f10452g) {
            return;
        }
        setResult(0);
        if (i2 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.f() != null) {
                GoogleSignInAccount f2 = signInAccount.f();
                zzp.c(this).b(this.f10453h.w(), f2);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", f2);
                this.f10454i = true;
                this.f10455j = i3;
                this.f10456k = intent;
                d();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = AccountAnalytics.UNKNOWN_STATUS_CODE;
                }
                b(intExtra);
                return;
            }
        }
        b(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            b(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", valueOf.length() != 0 ? "Unknown action: ".concat(valueOf) : new String("Unknown action: "));
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) intent.getBundleExtra("config").getParcelable("config");
        this.f10453h = signInConfiguration;
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        if (bundle == null) {
            if (f10451f) {
                setResult(0);
                b(12502);
                return;
            }
            f10451f = true;
            Intent intent2 = new Intent(action);
            if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                intent2.setPackage("com.google.android.gms");
            } else {
                intent2.setPackage(getPackageName());
            }
            intent2.putExtra("config", this.f10453h);
            try {
                startActivityForResult(intent2, 40962);
                return;
            } catch (ActivityNotFoundException unused) {
                this.f10452g = true;
                Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                b(17);
                return;
            }
        }
        boolean z = bundle.getBoolean("signingInGoogleApiClients");
        this.f10454i = z;
        if (z) {
            this.f10455j = bundle.getInt("signInResultCode");
            this.f10456k = (Intent) bundle.getParcelable("signInResultData");
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f10454i);
        if (this.f10454i) {
            bundle.putInt("signInResultCode", this.f10455j);
            bundle.putParcelable("signInResultData", this.f10456k);
        }
    }
}
