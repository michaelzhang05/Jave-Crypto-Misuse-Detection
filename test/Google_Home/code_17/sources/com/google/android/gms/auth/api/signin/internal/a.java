package com.google.android.gms.auth.api.signin.internal;

import K.g;
import K.x;
import O.f;
import android.os.Bundle;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

/* loaded from: classes3.dex */
final class a implements LoaderManager.LoaderCallbacks {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SignInHubActivity f15883a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ a(SignInHubActivity signInHubActivity, x xVar) {
        this.f15883a = signInHubActivity;
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final Loader onCreateLoader(int i8, Bundle bundle) {
        return new g(this.f15883a, f.b());
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        SignInHubActivity signInHubActivity = this.f15883a;
        signInHubActivity.setResult(SignInHubActivity.n(signInHubActivity), SignInHubActivity.o(signInHubActivity));
        this.f15883a.finish();
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final void onLoaderReset(Loader loader) {
    }
}
