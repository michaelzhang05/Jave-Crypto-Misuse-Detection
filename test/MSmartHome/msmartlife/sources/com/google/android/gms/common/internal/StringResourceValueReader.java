package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes2.dex */
public class StringResourceValueReader {
    private final Resources a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10886b;

    public StringResourceValueReader(Context context) {
        Preconditions.j(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.f10886b = resources.getResourcePackageName(R.string.a);
    }

    @KeepForSdk
    public String a(String str) {
        int identifier = this.a.getIdentifier(str, "string", this.f10886b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
