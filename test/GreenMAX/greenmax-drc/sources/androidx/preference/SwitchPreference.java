package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    private final a a0;
    private CharSequence b0;
    private CharSequence c0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreference.this.f(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreference.this.Z0(z);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.a0 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.C1, i2, i3);
        c1(androidx.core.content.d.g.o(obtainStyledAttributes, t.K1, t.D1));
        b1(androidx.core.content.d.g.o(obtainStyledAttributes, t.J1, t.E1));
        g1(androidx.core.content.d.g.o(obtainStyledAttributes, t.M1, t.G1));
        f1(androidx.core.content.d.g.o(obtainStyledAttributes, t.L1, t.H1));
        a1(androidx.core.content.d.g.b(obtainStyledAttributes, t.I1, t.F1, false));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void h1(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.V);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.b0);
            r4.setTextOff(this.c0);
            r4.setOnCheckedChangeListener(this.a0);
        }
    }

    private void i1(View view) {
        if (((AccessibilityManager) C().getSystemService("accessibility")).isEnabled()) {
            h1(view.findViewById(R.id.switch_widget));
            d1(view.findViewById(R.id.summary));
        }
    }

    public void f1(CharSequence charSequence) {
        this.c0 = charSequence;
        d0();
    }

    public void g1(CharSequence charSequence) {
        this.b0 = charSequence;
        d0();
    }

    @Override // androidx.preference.Preference
    public void j0(l lVar) {
        super.j0(lVar);
        h1(lVar.a(R.id.switch_widget));
        e1(lVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void w0(View view) {
        super.w0(view);
        i1(view);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.d.g.a(context, m.m, R.attr.switchPreferenceStyle));
    }
}
