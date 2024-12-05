package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes3.dex */
final class e implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0372b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0372b c0372b = new DynamiteModule.b.C0372b();
        int b8 = aVar.b(context, str);
        c0372b.f16028a = b8;
        if (b8 != 0) {
            c0372b.f16030c = -1;
        } else {
            int a8 = aVar.a(context, str, true);
            c0372b.f16029b = a8;
            if (a8 != 0) {
                c0372b.f16030c = 1;
            }
        }
        return c0372b;
    }
}
