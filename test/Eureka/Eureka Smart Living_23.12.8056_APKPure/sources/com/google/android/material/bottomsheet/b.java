package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.v;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public class b extends v {

    /* renamed from: s0, reason: collision with root package name */
    private boolean f4795s0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.bottomsheet.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0082b extends BottomSheetBehavior.f {
        private C0082b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View view, float f6) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View view, int i6) {
            if (i6 == 5) {
                b.this.X1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X1() {
        if (this.f4795s0) {
            super.K1();
        } else {
            super.J1();
        }
    }

    private void Y1(BottomSheetBehavior bottomSheetBehavior, boolean z5) {
        this.f4795s0 = z5;
        if (bottomSheetBehavior.o0() == 5) {
            X1();
            return;
        }
        if (M1() instanceof com.google.android.material.bottomsheet.a) {
            ((com.google.android.material.bottomsheet.a) M1()).v();
        }
        bottomSheetBehavior.Y(new C0082b());
        bottomSheetBehavior.P0(5);
    }

    private boolean Z1(boolean z5) {
        Dialog M1 = M1();
        if (!(M1 instanceof com.google.android.material.bottomsheet.a)) {
            return false;
        }
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) M1;
        BottomSheetBehavior s5 = aVar.s();
        if (!s5.t0() || !aVar.u()) {
            return false;
        }
        Y1(s5, z5);
        return true;
    }

    @Override // androidx.fragment.app.e
    public void J1() {
        if (Z1(false)) {
            return;
        }
        super.J1();
    }

    @Override // androidx.appcompat.app.v, androidx.fragment.app.e
    public Dialog O1(Bundle bundle) {
        return new com.google.android.material.bottomsheet.a(u(), N1());
    }
}
