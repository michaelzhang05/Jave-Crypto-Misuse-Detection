package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class z extends t {

    /* renamed from: e, reason: collision with root package name */
    private int f5380e;

    /* renamed from: f, reason: collision with root package name */
    private EditText f5381f;

    /* renamed from: g, reason: collision with root package name */
    private final View.OnClickListener f5382g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(s sVar, int i6) {
        super(sVar);
        this.f5380e = m2.d.f7605a;
        this.f5382g = new View.OnClickListener() { // from class: com.google.android.material.textfield.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.this.y(view);
            }
        };
        if (i6 != 0) {
            this.f5380e = i6;
        }
    }

    private boolean w() {
        EditText editText = this.f5381f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean x(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(View view) {
        EditText editText;
        PasswordTransformationMethod passwordTransformationMethod;
        EditText editText2 = this.f5381f;
        if (editText2 == null) {
            return;
        }
        int selectionEnd = editText2.getSelectionEnd();
        if (w()) {
            editText = this.f5381f;
            passwordTransformationMethod = null;
        } else {
            editText = this.f5381f;
            passwordTransformationMethod = PasswordTransformationMethod.getInstance();
        }
        editText.setTransformationMethod(passwordTransformationMethod);
        if (selectionEnd >= 0) {
            this.f5381f.setSelection(selectionEnd);
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public void b(CharSequence charSequence, int i6, int i7, int i8) {
        r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public int c() {
        return m2.h.f7682v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public int d() {
        return this.f5380e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public View.OnClickListener f() {
        return this.f5382g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public boolean l() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public boolean m() {
        return !w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public void n(EditText editText) {
        this.f5381f = editText;
        r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public void s() {
        if (x(this.f5381f)) {
            this.f5381f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public void u() {
        EditText editText = this.f5381f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
