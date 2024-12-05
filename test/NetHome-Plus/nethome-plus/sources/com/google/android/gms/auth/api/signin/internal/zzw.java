package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
public final class zzw extends zzr {

    /* renamed from: f, reason: collision with root package name */
    private final Context f10469f;

    public zzw(Context context) {
        this.f10469f = context;
    }

    private final void C() {
        if (GooglePlayServicesUtilLight.isGooglePlayServicesUid(this.f10469f, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzq
    public final void b6() {
        C();
        Storage b2 = Storage.b(this.f10469f);
        GoogleSignInAccount c2 = b2.c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f10431k;
        if (c2 != null) {
            googleSignInOptions = b2.d();
        }
        GoogleApiClient e2 = new GoogleApiClient.Builder(this.f10469f).b(Auth.f10327g, googleSignInOptions).e();
        try {
            if (e2.d().L()) {
                if (c2 != null) {
                    Auth.f10330j.c(e2);
                } else {
                    e2.e();
                }
            }
        } finally {
            e2.h();
        }
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzq
    public final void b7() {
        C();
        zzp.c(this.f10469f).a();
    }
}
