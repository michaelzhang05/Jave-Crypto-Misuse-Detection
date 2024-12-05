package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes3.dex */
final class j implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0372b a(Context context, String str, DynamiteModule.b.a aVar) {
        int a8;
        DynamiteModule.b.C0372b c0372b = new DynamiteModule.b.C0372b();
        int b8 = aVar.b(context, str);
        c0372b.f16028a = b8;
        int i8 = 1;
        int i9 = 0;
        if (b8 != 0) {
            a8 = aVar.a(context, str, false);
            c0372b.f16029b = a8;
        } else {
            a8 = aVar.a(context, str, true);
            c0372b.f16029b = a8;
        }
        int i10 = c0372b.f16028a;
        if (i10 == 0) {
            if (a8 == 0) {
                i8 = 0;
                c0372b.f16030c = i8;
                return c0372b;
            }
        } else {
            i9 = i10;
        }
        if (a8 < i9) {
            i8 = -1;
        }
        c0372b.f16030c = i8;
        return c0372b;
    }
}
