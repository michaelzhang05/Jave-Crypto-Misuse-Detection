package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.r;
import com.google.android.material.internal.ParcelableSparseArray;

/* loaded from: classes2.dex */
public class BottomNavigationPresenter implements m {

    /* renamed from: f, reason: collision with root package name */
    private g f16445f;

    /* renamed from: g, reason: collision with root package name */
    private c f16446g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16447h = false;

    /* renamed from: i, reason: collision with root package name */
    private int f16448i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        int f16449f;

        /* renamed from: g, reason: collision with root package name */
        ParcelableSparseArray f16450g;

        /* loaded from: classes2.dex */
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

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f16449f);
            parcel.writeParcelable(this.f16450g, 0);
        }

        SavedState(Parcel parcel) {
            this.f16449f = parcel.readInt();
            this.f16450g = (ParcelableSparseArray) parcel.readParcelable(SavedState.class.getClassLoader());
        }
    }

    public void a(c cVar) {
        this.f16446g = cVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void b(g gVar, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(boolean z) {
        if (this.f16447h) {
            return;
        }
        if (z) {
            this.f16446g.d();
        } else {
            this.f16446g.k();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public int getId() {
        return this.f16448i;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(Context context, g gVar) {
        this.f16445f = gVar;
        this.f16446g.b(gVar);
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f16446g.j(savedState.f16449f);
            this.f16446g.setBadgeDrawables(com.google.android.material.badge.a.b(this.f16446g.getContext(), savedState.f16450g));
        }
    }

    public void j(int i2) {
        this.f16448i = i2;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k(r rVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable l() {
        SavedState savedState = new SavedState();
        savedState.f16449f = this.f16446g.getSelectedItemId();
        savedState.f16450g = com.google.android.material.badge.a.c(this.f16446g.getBadgeDrawables());
        return savedState;
    }

    public void m(boolean z) {
        this.f16447h = z;
    }
}
