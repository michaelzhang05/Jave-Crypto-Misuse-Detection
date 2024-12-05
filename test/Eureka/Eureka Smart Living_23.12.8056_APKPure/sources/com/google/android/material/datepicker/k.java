package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.f0;
import androidx.core.view.b1;
import androidx.core.view.c3;
import androidx.core.view.w0;
import androidx.fragment.app.e0;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class k<S> extends androidx.fragment.app.e {
    static final Object Q0 = "CONFIRM_BUTTON_TAG";
    static final Object R0 = "CANCEL_BUTTON_TAG";
    static final Object S0 = "TOGGLE_BUTTON_TAG";
    private int A0;
    private CharSequence B0;
    private boolean C0;
    private int D0;
    private int E0;
    private CharSequence F0;
    private int G0;
    private CharSequence H0;
    private TextView I0;
    private TextView J0;
    private CheckableImageButton K0;
    private c3.g L0;
    private Button M0;
    private boolean N0;
    private CharSequence O0;
    private CharSequence P0;

    /* renamed from: s0, reason: collision with root package name */
    private final LinkedHashSet f4978s0 = new LinkedHashSet();

    /* renamed from: t0, reason: collision with root package name */
    private final LinkedHashSet f4979t0 = new LinkedHashSet();

    /* renamed from: u0, reason: collision with root package name */
    private final LinkedHashSet f4980u0 = new LinkedHashSet();

    /* renamed from: v0, reason: collision with root package name */
    private final LinkedHashSet f4981v0 = new LinkedHashSet();

    /* renamed from: w0, reason: collision with root package name */
    private int f4982w0;

    /* renamed from: x0, reason: collision with root package name */
    private q f4983x0;

    /* renamed from: y0, reason: collision with root package name */
    private com.google.android.material.datepicker.a f4984y0;

    /* renamed from: z0, reason: collision with root package name */
    private j f4985z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements w0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f4986a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f4987b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4988c;

        a(int i6, View view, int i7) {
            this.f4986a = i6;
            this.f4987b = view;
            this.f4988c = i7;
        }

        @Override // androidx.core.view.w0
        public c3 a(View view, c3 c3Var) {
            int i6 = c3Var.f(c3.m.d()).f2111b;
            if (this.f4986a >= 0) {
                this.f4987b.getLayoutParams().height = this.f4986a + i6;
                View view2 = this.f4987b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f4987b;
            view3.setPadding(view3.getPaddingLeft(), this.f4988c + i6, this.f4987b.getPaddingRight(), this.f4987b.getPaddingBottom());
            return c3Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends p {
        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Button unused = k.this.M0;
            k.W1(k.this);
            throw null;
        }
    }

    static /* synthetic */ d W1(k kVar) {
        kVar.a2();
        return null;
    }

    private static Drawable Y1(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, e.a.b(context, m2.d.f7606b));
        stateListDrawable.addState(new int[0], e.a.b(context, m2.d.f7607c));
        return stateListDrawable;
    }

    private void Z1(Window window) {
        if (this.N0) {
            return;
        }
        View findViewById = t1().findViewById(m2.e.f7623i);
        com.google.android.material.internal.c.a(window, true, com.google.android.material.internal.n.c(findViewById), null);
        b1.D0(findViewById, new a(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
        this.N0 = true;
    }

    private d a2() {
        f0.a(s().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    private static CharSequence b2(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] split = TextUtils.split(String.valueOf(charSequence), "\n");
        return split.length > 1 ? split[0] : charSequence;
    }

    private String c2() {
        a2();
        s1();
        throw null;
    }

    private static int e2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(m2.c.f7602x);
        int i6 = m.d().f4998d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(m2.c.f7604z) * i6) + ((i6 - 1) * resources.getDimensionPixelOffset(m2.c.C));
    }

    private int f2(Context context) {
        int i6 = this.f4982w0;
        if (i6 != 0) {
            return i6;
        }
        a2();
        throw null;
    }

    private void g2(Context context) {
        this.K0.setTag(S0);
        this.K0.setImageDrawable(Y1(context));
        this.K0.setChecked(this.D0 != 0);
        b1.q0(this.K0, null);
        o2(this.K0);
        this.K0.setOnClickListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h2(Context context) {
        return k2(context, R.attr.windowFullscreen);
    }

    private boolean i2() {
        return O().getConfiguration().orientation == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j2(Context context) {
        return k2(context, m2.a.G);
    }

    static boolean k2(Context context, int i6) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(z2.b.d(context, m2.a.f7568v, j.class.getCanonicalName()), new int[]{i6});
        boolean z5 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z5;
    }

    private void l2() {
        q qVar;
        int f22 = f2(s1());
        a2();
        this.f4985z0 = j.W1(null, f22, this.f4984y0, null);
        boolean isChecked = this.K0.isChecked();
        if (isChecked) {
            a2();
            qVar = l.I1(null, f22, this.f4984y0);
        } else {
            qVar = this.f4985z0;
        }
        this.f4983x0 = qVar;
        n2(isChecked);
        m2(d2());
        e0 o6 = t().o();
        o6.m(m2.e.f7640z, this.f4983x0);
        o6.h();
        this.f4983x0.G1(new b());
    }

    private void n2(boolean z5) {
        this.I0.setText((z5 && i2()) ? this.P0 : this.O0);
    }

    private void o2(CheckableImageButton checkableImageButton) {
        this.K0.setContentDescription(checkableImageButton.getContext().getString(this.K0.isChecked() ? m2.h.f7678r : m2.h.f7680t));
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public final void L0(Bundle bundle) {
        super.L0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f4982w0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        a.b bVar = new a.b(this.f4984y0);
        if (this.f4985z0.R1() != null) {
            bVar.b(this.f4985z0.R1().f5000f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.A0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.B0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.E0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.F0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.G0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.H0);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void M0() {
        super.M0();
        Window window = S1().getWindow();
        if (this.C0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.L0);
            Z1(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = O().getDimensionPixelOffset(m2.c.B);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.L0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new s2.a(S1(), rect));
        }
        l2();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void N0() {
        this.f4983x0.H1();
        super.N0();
    }

    @Override // androidx.fragment.app.e
    public final Dialog O1(Bundle bundle) {
        Dialog dialog = new Dialog(s1(), f2(s1()));
        Context context = dialog.getContext();
        this.C0 = h2(context);
        int d6 = z2.b.d(context, m2.a.f7558l, k.class.getCanonicalName());
        c3.g gVar = new c3.g(context, null, m2.a.f7568v, m2.i.f7697n);
        this.L0 = gVar;
        gVar.H(context);
        this.L0.R(ColorStateList.valueOf(d6));
        this.L0.Q(b1.y(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public String d2() {
        a2();
        u();
        throw null;
    }

    void m2(String str) {
        this.J0.setContentDescription(c2());
        this.J0.setText(str);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f4980u0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f4981v0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) W();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public final void p0(Bundle bundle) {
        super.p0(bundle);
        if (bundle == null) {
            bundle = s();
        }
        this.f4982w0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        f0.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f4984y0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        f0.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.A0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.B0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.D0 = bundle.getInt("INPUT_MODE_KEY");
        this.E0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.F0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.G0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.H0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.B0;
        if (charSequence == null) {
            charSequence = s1().getResources().getText(this.A0);
        }
        this.O0 = charSequence;
        this.P0 = b2(charSequence);
    }

    @Override // androidx.fragment.app.Fragment
    public final View t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View findViewById;
        LinearLayout.LayoutParams layoutParams;
        View inflate = layoutInflater.inflate(this.C0 ? m2.g.f7660s : m2.g.f7659r, viewGroup);
        Context context = inflate.getContext();
        if (this.C0) {
            findViewById = inflate.findViewById(m2.e.f7640z);
            layoutParams = new LinearLayout.LayoutParams(e2(context), -2);
        } else {
            findViewById = inflate.findViewById(m2.e.A);
            layoutParams = new LinearLayout.LayoutParams(e2(context), -1);
        }
        findViewById.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(m2.e.D);
        this.J0 = textView;
        b1.s0(textView, 1);
        this.K0 = (CheckableImageButton) inflate.findViewById(m2.e.E);
        this.I0 = (TextView) inflate.findViewById(m2.e.F);
        g2(context);
        this.M0 = (Button) inflate.findViewById(m2.e.f7618d);
        a2();
        throw null;
    }
}
