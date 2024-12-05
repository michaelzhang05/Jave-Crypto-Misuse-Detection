package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.core.view.u;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class CheckableImageButton extends androidx.appcompat.widget.k implements Checkable {

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f16657h = {R.attr.state_checked};

    /* renamed from: i, reason: collision with root package name */
    private boolean f16658i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16659j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16660k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: h, reason: collision with root package name */
        boolean f16661h;

        /* loaded from: classes2.dex */
        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f16661h = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f16661h ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    /* loaded from: classes2.dex */
    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.d0.c cVar) {
            super.g(view, cVar);
            cVar.W(CheckableImageButton.this.a());
            cVar.X(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.a.C);
    }

    public boolean a() {
        return this.f16659j;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f16658i;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        if (this.f16658i) {
            int[] iArr = f16657h;
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i2 + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i2);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.f16661h);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f16661h = this.f16658i;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f16659j != z) {
            this.f16659j = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f16659j || this.f16658i == z) {
            return;
        }
        this.f16658i = z;
        refreshDrawableState();
        sendAccessibilityEvent(RecyclerView.l.FLAG_MOVED);
    }

    public void setPressable(boolean z) {
        this.f16660k = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f16660k) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f16658i);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f16659j = true;
        this.f16660k = true;
        u.i0(this, new a());
    }
}
