package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.f;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    final String f1112f;

    /* renamed from: g, reason: collision with root package name */
    final String f1113g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f1114h;

    /* renamed from: i, reason: collision with root package name */
    final int f1115i;

    /* renamed from: j, reason: collision with root package name */
    final int f1116j;

    /* renamed from: k, reason: collision with root package name */
    final String f1117k;
    final boolean l;
    final boolean m;
    final boolean n;
    final Bundle o;
    final boolean p;
    final int q;
    Bundle r;
    Fragment s;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<FragmentState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i2) {
            return new FragmentState[i2];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentState(Fragment fragment) {
        this.f1112f = fragment.getClass().getName();
        this.f1113g = fragment.mWho;
        this.f1114h = fragment.mFromLayout;
        this.f1115i = fragment.mFragmentId;
        this.f1116j = fragment.mContainerId;
        this.f1117k = fragment.mTag;
        this.l = fragment.mRetainInstance;
        this.m = fragment.mRemoving;
        this.n = fragment.mDetached;
        this.o = fragment.mArguments;
        this.p = fragment.mHidden;
        this.q = fragment.mMaxState.ordinal();
    }

    public Fragment a(ClassLoader classLoader, f fVar) {
        if (this.s == null) {
            Bundle bundle = this.o;
            if (bundle != null) {
                bundle.setClassLoader(classLoader);
            }
            Fragment a2 = fVar.a(classLoader, this.f1112f);
            this.s = a2;
            a2.setArguments(this.o);
            Bundle bundle2 = this.r;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
                this.s.mSavedFragmentState = this.r;
            } else {
                this.s.mSavedFragmentState = new Bundle();
            }
            Fragment fragment = this.s;
            fragment.mWho = this.f1113g;
            fragment.mFromLayout = this.f1114h;
            fragment.mRestored = true;
            fragment.mFragmentId = this.f1115i;
            fragment.mContainerId = this.f1116j;
            fragment.mTag = this.f1117k;
            fragment.mRetainInstance = this.l;
            fragment.mRemoving = this.m;
            fragment.mDetached = this.n;
            fragment.mHidden = this.p;
            fragment.mMaxState = f.b.values()[this.q];
            if (i.f1127h) {
                Log.v("FragmentManager", "Instantiated fragment " + this.s);
            }
        }
        return this.s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1112f);
        sb.append(" (");
        sb.append(this.f1113g);
        sb.append(")}:");
        if (this.f1114h) {
            sb.append(" fromLayout");
        }
        if (this.f1116j != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1116j));
        }
        String str = this.f1117k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f1117k);
        }
        if (this.l) {
            sb.append(" retainInstance");
        }
        if (this.m) {
            sb.append(" removing");
        }
        if (this.n) {
            sb.append(" detached");
        }
        if (this.p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1112f);
        parcel.writeString(this.f1113g);
        parcel.writeInt(this.f1114h ? 1 : 0);
        parcel.writeInt(this.f1115i);
        parcel.writeInt(this.f1116j);
        parcel.writeString(this.f1117k);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeBundle(this.o);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeBundle(this.r);
        parcel.writeInt(this.q);
    }

    FragmentState(Parcel parcel) {
        this.f1112f = parcel.readString();
        this.f1113g = parcel.readString();
        this.f1114h = parcel.readInt() != 0;
        this.f1115i = parcel.readInt();
        this.f1116j = parcel.readInt();
        this.f1117k = parcel.readString();
        this.l = parcel.readInt() != 0;
        this.m = parcel.readInt() != 0;
        this.n = parcel.readInt() != 0;
        this.o = parcel.readBundle();
        this.p = parcel.readInt() != 0;
        this.r = parcel.readBundle();
        this.q = parcel.readInt();
    }
}
