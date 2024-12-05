package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes3.dex */
final class f implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0377b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0377b c0377b = new DynamiteModule.b.C0377b();
        int i8 = 0;
        int a8 = aVar.a(context, str, false);
        c0377b.f15228b = a8;
        if (a8 != 0) {
            i8 = 1;
        }
        c0377b.f15229c = i8;
        return c0377b;
    }
}
