package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.login.LoginClient;

/* compiled from: LoginFragment.java */
/* loaded from: classes.dex */
public class e extends Fragment {

    /* renamed from: f, reason: collision with root package name */
    private String f9353f;

    /* renamed from: g, reason: collision with root package name */
    private LoginClient f9354g;

    /* renamed from: h, reason: collision with root package name */
    private LoginClient.Request f9355h;

    /* compiled from: LoginFragment.java */
    /* loaded from: classes.dex */
    class a implements LoginClient.c {
        a() {
        }

        @Override // com.facebook.login.LoginClient.c
        public void a(LoginClient.Result result) {
            e.this.i(result);
        }
    }

    /* compiled from: LoginFragment.java */
    /* loaded from: classes.dex */
    class b implements LoginClient.b {
        final /* synthetic */ View a;

        b(View view) {
            this.a = view;
        }

        @Override // com.facebook.login.LoginClient.b
        public void a() {
            this.a.setVisibility(0);
        }

        @Override // com.facebook.login.LoginClient.b
        public void b() {
            this.a.setVisibility(8);
        }
    }

    private void h(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.f9353f = callingActivity.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(LoginClient.Result result) {
        this.f9355h = null;
        int i2 = result.f9318f == LoginClient.Result.b.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (isAdded()) {
            getActivity().setResult(i2, intent);
            getActivity().finish();
        }
    }

    protected LoginClient e() {
        return new LoginClient(this);
    }

    protected int f() {
        return com.facebook.common.c.f9063c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoginClient g() {
        return this.f9354g;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        this.f9354g.x(i2, i3, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        if (bundle != null) {
            LoginClient loginClient = (LoginClient) bundle.getParcelable("loginClient");
            this.f9354g = loginClient;
            loginClient.z(this);
        } else {
            this.f9354g = e();
        }
        this.f9354g.A(new a());
        androidx.fragment.app.c activity = getActivity();
        if (activity == null) {
            return;
        }
        h(activity);
        Intent intent = activity.getIntent();
        if (intent == null || (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) == null) {
            return;
        }
        this.f9355h = (LoginClient.Request) bundleExtra.getParcelable("request");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(f(), viewGroup, false);
        this.f9354g.y(new b(inflate.findViewById(com.facebook.common.b.f9059d)));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f9354g.c();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View findViewById = getView() == null ? null : getView().findViewById(com.facebook.common.b.f9059d);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f9353f == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            getActivity().finish();
        } else {
            this.f9354g.B(this.f9355h);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", this.f9354g);
    }
}
