package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final a a0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!CheckBoxPreference.this.f(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                CheckBoxPreference.this.Z0(z);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void f1(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.V);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.a0);
        }
    }

    private void g1(View view) {
        if (((AccessibilityManager) C().getSystemService("accessibility")).isEnabled()) {
            f1(view.findViewById(R.id.checkbox));
            d1(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void j0(l lVar) {
        super.j0(lVar);
        f1(lVar.a(R.id.checkbox));
        e1(lVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void w0(View view) {
        super.w0(view);
        g1(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.a0 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.s, i2, i3);
        c1(androidx.core.content.d.g.o(obtainStyledAttributes, t.y, t.t));
        b1(androidx.core.content.d.g.o(obtainStyledAttributes, t.x, t.u));
        a1(androidx.core.content.d.g.b(obtainStyledAttributes, t.w, t.v, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.d.g.a(context, m.a, R.attr.checkBoxPreferenceStyle));
    }
}
