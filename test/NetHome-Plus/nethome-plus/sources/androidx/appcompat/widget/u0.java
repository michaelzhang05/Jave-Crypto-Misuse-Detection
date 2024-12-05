package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* compiled from: TooltipPopup.java */
/* loaded from: classes.dex */
class u0 {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final View f623b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f624c;

    /* renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f625d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f626e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f627f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f628g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f625d = layoutParams;
        this.f626e = new Rect();
        this.f627f = new int[2];
        this.f628g = new int[2];
        this.a = context;
        View inflate = LayoutInflater.from(context).inflate(c.a.g.s, (ViewGroup) null);
        this.f623b = inflate;
        this.f624c = (TextView) inflate.findViewById(c.a.f.s);
        layoutParams.setTitle(u0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = c.a.i.a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i2, int i3, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(c.a.d.f2194j);
        if (view.getWidth() < dimensionPixelOffset) {
            i2 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.a.getResources().getDimensionPixelOffset(c.a.d.f2193i);
            height = i3 + dimensionPixelOffset2;
            i4 = i3 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i4 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.a.getResources().getDimensionPixelOffset(z ? c.a.d.l : c.a.d.f2195k);
        View b2 = b(view);
        if (b2 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b2.getWindowVisibleDisplayFrame(this.f626e);
        Rect rect = this.f626e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f626e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b2.getLocationOnScreen(this.f628g);
        view.getLocationOnScreen(this.f627f);
        int[] iArr = this.f627f;
        int i5 = iArr[0];
        int[] iArr2 = this.f628g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i2) - (b2.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f623b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f623b.getMeasuredHeight();
        int[] iArr3 = this.f627f;
        int i6 = ((iArr3[1] + i4) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + height + dimensionPixelOffset3;
        if (z) {
            if (i6 >= 0) {
                layoutParams.y = i6;
                return;
            } else {
                layoutParams.y = i7;
                return;
            }
        }
        if (measuredHeight + i7 <= this.f626e.height()) {
            layoutParams.y = i7;
        } else {
            layoutParams.y = i6;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (d()) {
            ((WindowManager) this.a.getSystemService("window")).removeView(this.f623b);
        }
    }

    boolean d() {
        return this.f623b.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(View view, int i2, int i3, boolean z, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f624c.setText(charSequence);
        a(view, i2, i3, z, this.f625d);
        ((WindowManager) this.a.getSystemService("window")).addView(this.f623b, this.f625d);
    }
}
