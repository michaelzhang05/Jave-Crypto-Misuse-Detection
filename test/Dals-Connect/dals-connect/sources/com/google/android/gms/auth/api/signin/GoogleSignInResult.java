package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public class GoogleSignInResult implements Result {

    /* renamed from: f, reason: collision with root package name */
    private Status f10439f;

    /* renamed from: g, reason: collision with root package name */
    private GoogleSignInAccount f10440g;

    public GoogleSignInResult(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f10440g = googleSignInAccount;
        this.f10439f = status;
    }

    public GoogleSignInAccount a() {
        return this.f10440g;
    }

    public boolean c() {
        return this.f10439f.J();
    }

    @Override // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.f10439f;
    }
}
