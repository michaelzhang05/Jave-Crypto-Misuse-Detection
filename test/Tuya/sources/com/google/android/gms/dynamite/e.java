package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes3.dex */
final class e implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0377b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0377b c0377b = new DynamiteModule.b.C0377b();
        int b8 = aVar.b(context, str);
        c0377b.f15227a = b8;
        if (b8 != 0) {
            c0377b.f15229c = -1;
        } else {
            int a8 = aVar.a(context, str, true);
            c0377b.f15228b = a8;
            if (a8 != 0) {
                c0377b.f15229c = 1;
            }
        }
        return c0377b;
    }
}
