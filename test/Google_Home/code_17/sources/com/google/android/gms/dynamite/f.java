package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes3.dex */
final class f implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0372b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0372b c0372b = new DynamiteModule.b.C0372b();
        int i8 = 0;
        int a8 = aVar.a(context, str, false);
        c0372b.f16029b = a8;
        if (a8 != 0) {
            i8 = 1;
        }
        c0372b.f16030c = i8;
        return c0372b;
    }
}
