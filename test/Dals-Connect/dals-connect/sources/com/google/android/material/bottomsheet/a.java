package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.h;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.u;
import cm.aptoide.pt.file.CacheHelper;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e.e.b.b.f;
import e.e.b.b.k;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes2.dex */
public class a extends h {

    /* renamed from: h, reason: collision with root package name */
    private BottomSheetBehavior<FrameLayout> f16494h;

    /* renamed from: i, reason: collision with root package name */
    private FrameLayout f16495i;

    /* renamed from: j, reason: collision with root package name */
    boolean f16496j;

    /* renamed from: k, reason: collision with root package name */
    boolean f16497k;
    private boolean l;
    private boolean m;
    private BottomSheetBehavior.e n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC0188a implements View.OnClickListener {
        ViewOnClickListenerC0188a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f16497k && aVar.isShowing() && a.this.g()) {
                a.this.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes2.dex */
    public class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.d0.c cVar) {
            super.g(view, cVar);
            if (a.this.f16497k) {
                cVar.a(CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES);
                cVar.d0(true);
            } else {
                cVar.d0(false);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i2, Bundle bundle) {
            if (i2 == 1048576) {
                a aVar = a.this;
                if (aVar.f16497k) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(view, i2, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnTouchListener {
        c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes2.dex */
    class d extends BottomSheetBehavior.e {
        d() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.e
        public void onSlide(View view, float f2) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.e
        public void onStateChanged(View view, int i2) {
            if (i2 == 5) {
                a.this.cancel();
            }
        }
    }

    public a(Context context, int i2) {
        super(context, b(context, i2));
        this.f16497k = true;
        this.l = true;
        this.n = new d();
        d(1);
    }

    private static int b(Context context, int i2) {
        if (i2 != 0) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(e.e.b.b.b.f17424e, typedValue, true)) {
            return typedValue.resourceId;
        }
        return k.f17489e;
    }

    private FrameLayout e() {
        if (this.f16495i == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), e.e.b.b.h.f17466b, null);
            this.f16495i = frameLayout;
            BottomSheetBehavior<FrameLayout> T = BottomSheetBehavior.T((FrameLayout) frameLayout.findViewById(f.f17457d));
            this.f16494h = T;
            T.K(this.n);
            this.f16494h.g0(this.f16497k);
        }
        return this.f16495i;
    }

    private View h(int i2, View view, ViewGroup.LayoutParams layoutParams) {
        e();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f16495i.findViewById(f.f17456c);
        if (i2 != 0 && view == null) {
            view = getLayoutInflater().inflate(i2, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.f16495i.findViewById(f.f17457d);
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(f.E).setOnClickListener(new ViewOnClickListenerC0188a());
        u.i0(frameLayout, new b());
        frameLayout.setOnTouchListener(new c());
        return this.f16495i;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> f2 = f();
        if (this.f16496j && f2.V() != 5) {
            f2.l0(5);
        } else {
            super.cancel();
        }
    }

    public BottomSheetBehavior<FrameLayout> f() {
        if (this.f16494h == null) {
            e();
        }
        return this.f16494h;
    }

    boolean g() {
        if (!this.m) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.l = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.m = true;
        }
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f16494h;
        if (bottomSheetBehavior == null || bottomSheetBehavior.V() != 5) {
            return;
        }
        this.f16494h.l0(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f16497k != z) {
            this.f16497k = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f16494h;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.g0(z);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f16497k) {
            this.f16497k = true;
        }
        this.l = z;
        this.m = true;
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(int i2) {
        super.setContentView(h(i2, null, null));
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(h(0, view, null));
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(h(0, view, layoutParams));
    }
}
