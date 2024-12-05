package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    final c.e.g<String, Long> V;
    private final Handler W;
    private List<Preference> X;
    private boolean Y;
    private int Z;
    private boolean a0;
    private int b0;
    private b c0;
    private final Runnable d0;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.V.clear();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    public interface c {
        int c(Preference preference);

        int f(String str);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.V = new c.e.g<>();
        this.W = new Handler();
        this.Y = true;
        this.Z = 0;
        this.a0 = false;
        this.b0 = Integer.MAX_VALUE;
        this.c0 = null;
        this.d0 = new a();
        this.X = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.h1, i2, i3);
        int i4 = t.j1;
        this.Y = androidx.core.content.d.g.b(obtainStyledAttributes, i4, i4, true);
        int i5 = t.i1;
        if (obtainStyledAttributes.hasValue(i5)) {
            j1(androidx.core.content.d.g.d(obtainStyledAttributes, i5, i5, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    private boolean i1(Preference preference) {
        boolean remove;
        synchronized (this) {
            preference.q0();
            if (preference.L() == this) {
                preference.d(null);
            }
            remove = this.X.remove(preference);
            if (remove) {
                String I = preference.I();
                if (I != null) {
                    this.V.put(I, Long.valueOf(preference.G()));
                    this.W.removeCallbacks(this.d0);
                    this.W.post(this.d0);
                }
                if (this.a0) {
                    preference.m0();
                }
            }
        }
        return remove;
    }

    public void Y0(Preference preference) {
        Z0(preference);
    }

    public boolean Z0(Preference preference) {
        long d2;
        if (this.X.contains(preference)) {
            return true;
        }
        if (preference.I() != null) {
            PreferenceGroup preferenceGroup = this;
            while (preferenceGroup.L() != null) {
                preferenceGroup = preferenceGroup.L();
            }
            String I = preference.I();
            if (preferenceGroup.a1(I) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + I + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.K() == Integer.MAX_VALUE) {
            if (this.Y) {
                int i2 = this.Z;
                this.Z = i2 + 1;
                preference.N0(i2);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).k1(this.Y);
            }
        }
        int binarySearch = Collections.binarySearch(this.X, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * (-1)) - 1;
        }
        if (!g1(preference)) {
            return false;
        }
        synchronized (this) {
            this.X.add(binarySearch, preference);
        }
        j R = R();
        String I2 = preference.I();
        if (I2 != null && this.V.containsKey(I2)) {
            d2 = this.V.get(I2).longValue();
            this.V.remove(I2);
        } else {
            d2 = R.d();
        }
        preference.i0(R, d2);
        preference.d(this);
        if (this.a0) {
            preference.g0();
        }
        f0();
        return true;
    }

    public <T extends Preference> T a1(CharSequence charSequence) {
        T t;
        if (charSequence != null) {
            if (TextUtils.equals(I(), charSequence)) {
                return this;
            }
            int e1 = e1();
            for (int i2 = 0; i2 < e1; i2++) {
                PreferenceGroup preferenceGroup = (T) d1(i2);
                if (TextUtils.equals(preferenceGroup.I(), charSequence)) {
                    return preferenceGroup;
                }
                if ((preferenceGroup instanceof PreferenceGroup) && (t = (T) preferenceGroup.a1(charSequence)) != null) {
                    return t;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Key cannot be null");
    }

    public int b1() {
        return this.b0;
    }

    public b c1() {
        return this.c0;
    }

    public Preference d1(int i2) {
        return this.X.get(i2);
    }

    @Override // androidx.preference.Preference
    public void e0(boolean z) {
        super.e0(z);
        int e1 = e1();
        for (int i2 = 0; i2 < e1; i2++) {
            d1(i2).p0(this, z);
        }
    }

    public int e1() {
        return this.X.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean f1() {
        return true;
    }

    @Override // androidx.preference.Preference
    public void g0() {
        super.g0();
        this.a0 = true;
        int e1 = e1();
        for (int i2 = 0; i2 < e1; i2++) {
            d1(i2).g0();
        }
    }

    protected boolean g1(Preference preference) {
        preference.p0(this, T0());
        return true;
    }

    public boolean h1(Preference preference) {
        boolean i1 = i1(preference);
        f0();
        return i1;
    }

    public void j1(int i2) {
        if (i2 != Integer.MAX_VALUE && !X()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.b0 = i2;
    }

    public void k1(boolean z) {
        this.Y = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l1() {
        synchronized (this) {
            Collections.sort(this.X);
        }
    }

    @Override // androidx.preference.Preference
    public void m0() {
        super.m0();
        this.a0 = false;
        int e1 = e1();
        for (int i2 = 0; i2 < e1; i2++) {
            d1(i2).m0();
        }
    }

    @Override // androidx.preference.Preference
    protected void o(Bundle bundle) {
        super.o(bundle);
        int e1 = e1();
        for (int i2 = 0; i2 < e1; i2++) {
            d1(i2).o(bundle);
        }
    }

    @Override // androidx.preference.Preference
    protected void r(Bundle bundle) {
        super.r(bundle);
        int e1 = e1();
        for (int i2 = 0; i2 < e1; i2++) {
            d1(i2).r(bundle);
        }
    }

    @Override // androidx.preference.Preference
    protected void r0(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            this.b0 = savedState.f1299f;
            super.r0(savedState.getSuperState());
            return;
        }
        super.r0(parcelable);
    }

    @Override // androidx.preference.Preference
    protected Parcelable s0() {
        return new SavedState(super.s0(), this.b0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        int f1299f;

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
            this.f1299f = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f1299f);
        }

        SavedState(Parcelable parcelable, int i2) {
            super(parcelable);
            this.f1299f = i2;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
