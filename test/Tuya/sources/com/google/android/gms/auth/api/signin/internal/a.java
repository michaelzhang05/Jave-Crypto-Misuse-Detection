package com.google.android.gms.auth.api.signin.internal;

import L.g;
import L.x;
import P.f;
import android.os.Bundle;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

/* loaded from: classes3.dex */
final class a implements LoaderManager.LoaderCallbacks {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SignInHubActivity f15082a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ a(SignInHubActivity signInHubActivity, x xVar) {
        this.f15082a = signInHubActivity;
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final Loader onCreateLoader(int i8, Bundle bundle) {
        return new g(this.f15082a, f.b());
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        SignInHubActivity signInHubActivity = this.f15082a;
        signInHubActivity.setResult(SignInHubActivity.n(signInHubActivity), SignInHubActivity.o(signInHubActivity));
        this.f15082a.finish();
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final void onLoaderReset(Loader loader) {
    }
}
