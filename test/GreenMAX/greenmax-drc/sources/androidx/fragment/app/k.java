package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.f;

/* compiled from: FragmentPagerAdapter.java */
/* loaded from: classes.dex */
public abstract class k extends androidx.viewpager.widget.a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private m mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private final h mFragmentManager;

    @Deprecated
    public k(h hVar) {
        this(hVar, 0);
    }

    private static String makeFragmentName(int i2, long j2) {
        return "android:switcher:" + i2 + ":" + j2;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.a();
        }
        this.mCurTransaction.l(fragment);
        if (fragment == this.mCurrentPrimaryItem) {
            this.mCurrentPrimaryItem = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void finishUpdate(ViewGroup viewGroup) {
        m mVar = this.mCurTransaction;
        if (mVar != null) {
            mVar.k();
            this.mCurTransaction = null;
        }
    }

    public abstract Fragment getItem(int i2);

    public long getItemId(int i2) {
        return i2;
    }

    @Override // androidx.viewpager.widget.a
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.a();
        }
        long itemId = getItemId(i2);
        Fragment e2 = this.mFragmentManager.e(makeFragmentName(viewGroup.getId(), itemId));
        if (e2 != null) {
            this.mCurTransaction.g(e2);
        } else {
            e2 = getItem(i2);
            this.mCurTransaction.c(viewGroup.getId(), e2, makeFragmentName(viewGroup.getId(), itemId));
        }
        if (e2 != this.mCurrentPrimaryItem) {
            e2.setMenuVisibility(false);
            if (this.mBehavior == 1) {
                this.mCurTransaction.s(e2, f.b.STARTED);
            } else {
                e2.setUserVisibleHint(false);
            }
        }
        return e2;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable saveState() {
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        this.mCurTransaction = this.mFragmentManager.a();
                    }
                    this.mCurTransaction.s(this.mCurrentPrimaryItem, f.b.STARTED);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    this.mCurTransaction = this.mFragmentManager.a();
                }
                this.mCurTransaction.s(fragment, f.b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public k(h hVar, int i2) {
        this.mCurTransaction = null;
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = hVar;
        this.mBehavior = i2;
    }
}
