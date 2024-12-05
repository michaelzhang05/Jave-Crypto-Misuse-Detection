package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.core.view.accessibility.c;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    final TextInputLayout f5332a;

    /* renamed from: b, reason: collision with root package name */
    final s f5333b;

    /* renamed from: c, reason: collision with root package name */
    final Context f5334c;

    /* renamed from: d, reason: collision with root package name */
    final CheckableImageButton f5335d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(s sVar) {
        this.f5332a = sVar.f5302a;
        this.f5333b = sVar;
        this.f5334c = sVar.getContext();
        this.f5335d = sVar.r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Editable editable) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(CharSequence charSequence, int i6, int i7, int i8) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View.OnFocusChangeListener e() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View.OnClickListener f() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View.OnFocusChangeListener g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.b h() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i(int i6) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(EditText editText) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(View view, androidx.core.view.accessibility.g0 g0Var) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(boolean z5) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        this.f5333b.K(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u() {
    }
}
