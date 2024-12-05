package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.p;
import androidx.core.view.accessibility.g0;
import androidx.core.view.b1;

/* loaded from: classes.dex */
public class CheckableImageButton extends p implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f5027g = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    private boolean f5028d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5029e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5030f;

    /* loaded from: classes.dex */
    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.a
        public void g(View view, g0 g0Var) {
            super.g(view, g0Var);
            g0Var.V(CheckableImageButton.this.a());
            g0Var.W(CheckableImageButton.this.isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends x.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        boolean f5032c;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i6) {
                return new b[i6];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }

        private void b(Parcel parcel) {
            this.f5032c = parcel.readInt() == 1;
        }

        @Override // x.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f5032c ? 1 : 0);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.f6139z);
    }

    public boolean a() {
        return this.f5029e;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f5028d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i6) {
        if (!this.f5028d) {
            return super.onCreateDrawableState(i6);
        }
        int[] iArr = f5027g;
        return View.mergeDrawableStates(super.onCreateDrawableState(i6 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f5032c);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f5032c = this.f5028d;
        return bVar;
    }

    public void setCheckable(boolean z5) {
        if (this.f5029e != z5) {
            this.f5029e = z5;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        if (!this.f5029e || this.f5028d == z5) {
            return;
        }
        this.f5028d = z5;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z5) {
        this.f5030f = z5;
    }

    @Override // android.view.View
    public void setPressed(boolean z5) {
        if (this.f5030f) {
            super.setPressed(z5);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f5028d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f5029e = true;
        this.f5030f = true;
        b1.q0(this, new a());
    }
}
