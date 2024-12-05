package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    protected boolean V;
    private CharSequence W;
    private CharSequence X;
    private boolean Y;
    private boolean Z;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    @Override // androidx.preference.Preference
    public boolean T0() {
        return (this.Z ? this.V : !this.V) || super.T0();
    }

    public boolean Y0() {
        return this.V;
    }

    public void Z0(boolean z) {
        boolean z2 = this.V != z;
        if (z2 || !this.Y) {
            this.V = z;
            this.Y = true;
            x0(z);
            if (z2) {
                e0(T0());
                d0();
            }
        }
    }

    public void a1(boolean z) {
        this.Z = z;
    }

    public void b1(CharSequence charSequence) {
        this.X = charSequence;
        if (Y0()) {
            return;
        }
        d0();
    }

    public void c1(CharSequence charSequence) {
        this.W = charSequence;
        if (Y0()) {
            d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d1(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.V
            r2 = 0
            if (r1 == 0) goto L1c
            java.lang.CharSequence r1 = r4.W
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1c
            java.lang.CharSequence r0 = r4.W
            r5.setText(r0)
        L1a:
            r0 = 0
            goto L2e
        L1c:
            boolean r1 = r4.V
            if (r1 != 0) goto L2e
            java.lang.CharSequence r1 = r4.X
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2e
            java.lang.CharSequence r0 = r4.X
            r5.setText(r0)
            goto L1a
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r1 = r4.T()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L3e
            r5.setText(r1)
            r0 = 0
        L3e:
            r1 = 8
            if (r0 != 0) goto L43
            goto L45
        L43:
            r2 = 8
        L45:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L4e
            r5.setVisibility(r2)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.d1(android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e1(l lVar) {
        d1(lVar.a(R.id.summary));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void k0() {
        super.k0();
        boolean z = !Y0();
        if (f(Boolean.valueOf(z))) {
            Z0(z);
        }
    }

    @Override // androidx.preference.Preference
    protected Object n0(TypedArray typedArray, int i2) {
        return Boolean.valueOf(typedArray.getBoolean(i2, false));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void r0(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            super.r0(savedState.getSuperState());
            Z0(savedState.f1305f);
            return;
        }
        super.r0(parcelable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public Parcelable s0() {
        Parcelable s0 = super.s0();
        if (a0()) {
            return s0;
        }
        SavedState savedState = new SavedState(s0);
        savedState.f1305f = Y0();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void t0(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        Z0(M(((Boolean) obj).booleanValue()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        boolean f1305f;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1305f = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f1305f ? 1 : 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
