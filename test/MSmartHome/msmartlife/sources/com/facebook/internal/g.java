package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.z;

/* compiled from: FacebookDialogFragment.java */
/* loaded from: classes.dex */
public class g extends androidx.fragment.app.b {

    /* renamed from: f, reason: collision with root package name */
    private Dialog f9152f;

    /* compiled from: FacebookDialogFragment.java */
    /* loaded from: classes.dex */
    class a implements z.g {
        a() {
        }

        @Override // com.facebook.internal.z.g
        public void a(Bundle bundle, FacebookException facebookException) {
            g.this.f(bundle, facebookException);
        }
    }

    /* compiled from: FacebookDialogFragment.java */
    /* loaded from: classes.dex */
    class b implements z.g {
        b() {
        }

        @Override // com.facebook.internal.z.g
        public void a(Bundle bundle, FacebookException facebookException) {
            g.this.g(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Bundle bundle, FacebookException facebookException) {
        androidx.fragment.app.c activity = getActivity();
        activity.setResult(facebookException == null ? -1 : 0, s.m(activity.getIntent(), bundle, facebookException));
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Bundle bundle) {
        androidx.fragment.app.c activity = getActivity();
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }

    public void h(Dialog dialog) {
        this.f9152f = dialog;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.f9152f instanceof z) && isResumed()) {
            ((z) this.f9152f).s();
        }
    }

    @Override // androidx.fragment.app.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        z A;
        super.onCreate(bundle);
        if (this.f9152f == null) {
            androidx.fragment.app.c activity = getActivity();
            Bundle u = s.u(activity.getIntent());
            if (!u.getBoolean("is_fallback", false)) {
                String string = u.getString("action");
                Bundle bundle2 = u.getBundle("params");
                if (x.Q(string)) {
                    x.V("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                }
                A = new z.e(activity, string, bundle2).h(new a()).a();
            } else {
                String string2 = u.getString("url");
                if (x.Q(string2)) {
                    x.V("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                } else {
                    A = j.A(activity, string2, String.format("fb%s://bridge/", com.facebook.f.f()));
                    A.w(new b());
                }
            }
            this.f9152f = A;
        }
    }

    @Override // androidx.fragment.app.b
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f9152f == null) {
            f(null, null);
            setShowsDialog(false);
        }
        return this.f9152f;
    }

    @Override // androidx.fragment.app.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = this.f9152f;
        if (dialog instanceof z) {
            ((z) dialog).s();
        }
    }
}
