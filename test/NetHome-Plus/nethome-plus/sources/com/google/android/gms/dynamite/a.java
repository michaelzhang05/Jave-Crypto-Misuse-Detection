package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a implements DynamiteModule.VersionPolicy.zza {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zza
    public final int a(Context context, String str) {
        return DynamiteModule.a(context, str);
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zza
    public final int b(Context context, String str, boolean z) throws DynamiteModule.LoadingException {
        return DynamiteModule.f(context, str, z);
    }
}
