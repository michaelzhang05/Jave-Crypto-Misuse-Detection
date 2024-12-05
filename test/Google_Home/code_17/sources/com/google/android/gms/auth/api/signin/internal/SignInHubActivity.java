package com.google.android.gms.auth.api.signin.internal;

import K.p;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;

@KeepName
/* loaded from: classes3.dex */
public class SignInHubActivity extends FragmentActivity {

    /* renamed from: f */
    private static boolean f15877f = false;

    /* renamed from: a */
    private boolean f15878a = false;

    /* renamed from: b */
    private SignInConfiguration f15879b;

    /* renamed from: c */
    private boolean f15880c;

    /* renamed from: d */
    private int f15881d;

    /* renamed from: e */
    private Intent f15882e;

    private final void p() {
        getSupportLoaderManager().initLoader(0, null, new a(this, null));
        f15877f = false;
    }

    private final void q(int i8) {
        Status status = new Status(i8);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f15877f = false;
    }

    private final void r(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.f15879b);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f15878a = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            q(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i8, int i9, Intent intent) {
        if (!this.f15878a) {
            setResult(0);
            if (i8 != 40962) {
                return;
            }
            if (intent != null) {
                SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                if (signInAccount != null && signInAccount.p() != null) {
                    GoogleSignInAccount p8 = signInAccount.p();
                    if (p8 == null) {
                        Log.e("AuthSignInClient", "Google account is null");
                        q(12500);
                        return;
                    }
                    p.a(this).c(this.f15879b.p(), p8);
                    intent.removeExtra("signInAccount");
                    intent.putExtra("googleSignInAccount", p8);
                    this.f15880c = true;
                    this.f15881d = i9;
                    this.f15882e = intent;
                    p();
                    return;
                }
                if (intent.hasExtra("errorCode")) {
                    int intExtra = intent.getIntExtra("errorCode", 8);
                    if (intExtra == 13) {
                        intExtra = 12501;
                    }
                    q(intExtra);
                    return;
                }
            }
            q(8);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            q(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            q(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f15879b = signInConfiguration;
        if (bundle == null) {
            if (f15877f) {
                setResult(0);
                q(12502);
                return;
            } else {
                f15877f = true;
                r(action);
                return;
            }
        }
        boolean z8 = bundle.getBoolean("signingInGoogleApiClients");
        this.f15880c = z8;
        if (z8) {
            this.f15881d = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            if (intent2 == null) {
                Log.e("AuthSignInClient", "Sign in result data cannot be null");
                setResult(0);
                finish();
            } else {
                this.f15882e = intent2;
                p();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f15877f = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f15880c);
        if (this.f15880c) {
            bundle.putInt("signInResultCode", this.f15881d);
            bundle.putParcelable("signInResultData", this.f15882e);
        }
    }
}
