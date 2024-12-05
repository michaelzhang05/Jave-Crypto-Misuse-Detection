package com.google.android.gms.common;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.SignInButtonCreator;
import com.google.android.gms.common.internal.SignInButtonImpl;
import com.google.android.gms.dynamic.RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    private int f10512f;

    /* renamed from: g, reason: collision with root package name */
    private int f10513g;

    /* renamed from: h, reason: collision with root package name */
    private View f10514h;

    /* renamed from: i, reason: collision with root package name */
    private View.OnClickListener f10515i;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ColorScheme {
    }

    public final void a(int i2, int i3) {
        this.f10512f = i2;
        this.f10513g = i3;
        Context context = getContext();
        View view = this.f10514h;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f10514h = SignInButtonCreator.c(context, this.f10512f, this.f10513g);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i4 = this.f10512f;
            int i5 = this.f10513g;
            SignInButtonImpl signInButtonImpl = new SignInButtonImpl(context);
            signInButtonImpl.a(context.getResources(), i4, i5);
            this.f10514h = signInButtonImpl;
        }
        addView(this.f10514h);
        this.f10514h.setEnabled(isEnabled());
        this.f10514h.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f10515i;
        if (onClickListener == null || view != this.f10514h) {
            return;
        }
        onClickListener.onClick(this);
    }

    public final void setColorScheme(int i2) {
        a(this.f10512f, i2);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f10514h.setEnabled(z);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f10515i = onClickListener;
        View view = this.f10514h;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public final void setScopes(Scope[] scopeArr) {
        a(this.f10512f, this.f10513g);
    }

    public final void setSize(int i2) {
        a(i2, this.f10513g);
    }
}
