package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.b1;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a, reason: collision with root package name */
    private final Chip f5383a;

    /* renamed from: b, reason: collision with root package name */
    private final TextInputLayout f5384b;

    /* renamed from: c, reason: collision with root package name */
    private final EditText f5385c;

    /* renamed from: d, reason: collision with root package name */
    private TextWatcher f5386d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f5387e;

    /* loaded from: classes.dex */
    private class b extends k {
        private b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f5383a.setText(ChipTextInputComboView.this.c("00"));
                return;
            }
            String c6 = ChipTextInputComboView.this.c(editable);
            Chip chip = ChipTextInputComboView.this.f5383a;
            if (TextUtils.isEmpty(c6)) {
                c6 = ChipTextInputComboView.this.c("00");
            }
            chip.setText(c6);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return f.a(getResources(), charSequence);
    }

    private void d() {
        LocaleList locales;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            this.f5385c.setImeHintLocales(locales);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f5383a.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        this.f5383a.setChecked(z5);
        this.f5385c.setVisibility(z5 ? 0 : 4);
        this.f5383a.setVisibility(z5 ? 8 : 0);
        if (isChecked()) {
            n.h(this.f5385c);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f5383a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i6, Object obj) {
        this.f5383a.setTag(i6, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f5383a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(m2.g.f7649h, (ViewGroup) this, false);
        this.f5383a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(m2.g.f7650i, (ViewGroup) this, false);
        this.f5384b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f5385c = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f5386d = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f5387e = (TextView) findViewById(m2.e.f7630p);
        editText.setId(b1.m());
        b1.C0(this.f5387e, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
