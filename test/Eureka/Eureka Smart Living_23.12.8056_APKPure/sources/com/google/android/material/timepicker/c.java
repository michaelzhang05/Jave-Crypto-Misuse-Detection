package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* loaded from: classes.dex */
class c implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    private int f5420a;

    public c(int i6) {
        this.f5420a = i6;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i6, int i7, Spanned spanned, int i8, int i9) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i8, i9, charSequence.subSequence(i6, i7).toString());
            if (Integer.parseInt(sb.toString()) <= this.f5420a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
