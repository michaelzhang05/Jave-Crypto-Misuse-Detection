package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.F8;
import com.google.android.gms.internal.measurement.y8;
import java.util.List;

/* loaded from: classes3.dex */
final class I2 implements F8 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ E2 f17178a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I2(E2 e22) {
        this.f17178a = e22;
    }

    @Override // com.google.android.gms.internal.measurement.F8
    public final void a(y8 y8Var, String str, List list, boolean z8, boolean z9) {
        C2381k2 F8;
        int i8 = K2.f17235a[y8Var.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        F8 = this.f17178a.c().J();
                    } else {
                        F8 = this.f17178a.c().K();
                    }
                } else if (z8) {
                    F8 = this.f17178a.c().N();
                } else if (!z9) {
                    F8 = this.f17178a.c().M();
                } else {
                    F8 = this.f17178a.c().L();
                }
            } else if (z8) {
                F8 = this.f17178a.c().I();
            } else if (!z9) {
                F8 = this.f17178a.c().H();
            } else {
                F8 = this.f17178a.c().G();
            }
        } else {
            F8 = this.f17178a.c().F();
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    F8.a(str);
                    return;
                } else {
                    F8.d(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            F8.c(str, list.get(0), list.get(1));
            return;
        }
        F8.b(str, list.get(0));
    }
}
