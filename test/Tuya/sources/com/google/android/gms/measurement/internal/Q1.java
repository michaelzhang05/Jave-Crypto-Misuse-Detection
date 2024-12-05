package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2003g7;
import java.util.List;

/* loaded from: classes3.dex */
final class Q1 implements InterfaceC2003g7 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ S1 f16259a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q1(S1 s12) {
        this.f16259a = s12;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2003g7
    public final void a(int i8, String str, List list, boolean z8, boolean z9) {
        C2257s1 q8;
        int i9 = i8 - 1;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        q8 = this.f16259a.f16777a.d().u();
                    } else if (z8) {
                        q8 = this.f16259a.f16777a.d().y();
                    } else if (!z9) {
                        q8 = this.f16259a.f16777a.d().x();
                    } else {
                        q8 = this.f16259a.f16777a.d().w();
                    }
                } else {
                    q8 = this.f16259a.f16777a.d().v();
                }
            } else if (z8) {
                q8 = this.f16259a.f16777a.d().t();
            } else if (!z9) {
                q8 = this.f16259a.f16777a.d().s();
            } else {
                q8 = this.f16259a.f16777a.d().r();
            }
        } else {
            q8 = this.f16259a.f16777a.d().q();
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    q8.a(str);
                    return;
                } else {
                    q8.d(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            q8.c(str, list.get(0), list.get(1));
            return;
        }
        q8.b(str, list.get(0));
    }
}
