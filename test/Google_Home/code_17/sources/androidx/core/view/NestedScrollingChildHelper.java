package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class NestedScrollingChildHelper {
    private boolean mIsNestedScrollingEnabled;
    private ViewParent mNestedScrollingParentNonTouch;
    private ViewParent mNestedScrollingParentTouch;
    private int[] mTempNestedScrollConsumed;
    private final View mView;

    public NestedScrollingChildHelper(@NonNull View view) {
        this.mView = view;
    }

    private boolean dispatchNestedScrollInternal(int i8, int i9, int i10, int i11, @Nullable int[] iArr, int i12, @Nullable int[] iArr2) {
        ViewParent nestedScrollingParentForType;
        int i13;
        int i14;
        int[] iArr3;
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(i12)) == null) {
            return false;
        }
        if (i8 == 0 && i9 == 0 && i10 == 0 && i11 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.mView.getLocationInWindow(iArr);
            i13 = iArr[0];
            i14 = iArr[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr2 == null) {
            int[] tempNestedScrollConsumed = getTempNestedScrollConsumed();
            tempNestedScrollConsumed[0] = 0;
            tempNestedScrollConsumed[1] = 0;
            iArr3 = tempNestedScrollConsumed;
        } else {
            iArr3 = iArr2;
        }
        ViewParentCompat.onNestedScroll(nestedScrollingParentForType, this.mView, i8, i9, i10, i11, i12, iArr3);
        if (iArr != null) {
            this.mView.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i13;
            iArr[1] = iArr[1] - i14;
        }
        return true;
    }

    private ViewParent getNestedScrollingParentForType(int i8) {
        if (i8 != 0) {
            if (i8 != 1) {
                return null;
            }
            return this.mNestedScrollingParentNonTouch;
        }
        return this.mNestedScrollingParentTouch;
    }

    private int[] getTempNestedScrollConsumed() {
        if (this.mTempNestedScrollConsumed == null) {
            this.mTempNestedScrollConsumed = new int[2];
        }
        return this.mTempNestedScrollConsumed;
    }

    private void setNestedScrollingParentForType(int i8, ViewParent viewParent) {
        if (i8 != 0) {
            if (i8 == 1) {
                this.mNestedScrollingParentNonTouch = viewParent;
                return;
            }
            return;
        }
        this.mNestedScrollingParentTouch = viewParent;
    }

    public boolean dispatchNestedFling(float f8, float f9, boolean z8) {
        ViewParent nestedScrollingParentForType;
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(0)) == null) {
            return false;
        }
        return ViewParentCompat.onNestedFling(nestedScrollingParentForType, this.mView, f8, f9, z8);
    }

    public boolean dispatchNestedPreFling(float f8, float f9) {
        ViewParent nestedScrollingParentForType;
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(0)) == null) {
            return false;
        }
        return ViewParentCompat.onNestedPreFling(nestedScrollingParentForType, this.mView, f8, f9);
    }

    public boolean dispatchNestedPreScroll(int i8, int i9, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return dispatchNestedPreScroll(i8, i9, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, @Nullable int[] iArr) {
        return dispatchNestedScrollInternal(i8, i9, i10, i11, iArr, 0, null);
    }

    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.mIsNestedScrollingEnabled;
    }

    public void onDetachedFromWindow() {
        ViewCompat.stopNestedScroll(this.mView);
    }

    public void onStopNestedScroll(@NonNull View view) {
        ViewCompat.stopNestedScroll(this.mView);
    }

    public void setNestedScrollingEnabled(boolean z8) {
        if (this.mIsNestedScrollingEnabled) {
            ViewCompat.stopNestedScroll(this.mView);
        }
        this.mIsNestedScrollingEnabled = z8;
    }

    public boolean startNestedScroll(int i8) {
        return startNestedScroll(i8, 0);
    }

    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public boolean dispatchNestedPreScroll(int i8, int i9, @Nullable int[] iArr, @Nullable int[] iArr2, int i10) {
        ViewParent nestedScrollingParentForType;
        int i11;
        int i12;
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(i10)) == null) {
            return false;
        }
        if (i8 == 0 && i9 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.mView.getLocationInWindow(iArr2);
            i11 = iArr2[0];
            i12 = iArr2[1];
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (iArr == null) {
            iArr = getTempNestedScrollConsumed();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        ViewParentCompat.onNestedPreScroll(nestedScrollingParentForType, this.mView, i8, i9, iArr, i10);
        if (iArr2 != null) {
            this.mView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i11;
            iArr2[1] = iArr2[1] - i12;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, @Nullable int[] iArr, int i12) {
        return dispatchNestedScrollInternal(i8, i9, i10, i11, iArr, i12, null);
    }

    public boolean hasNestedScrollingParent(int i8) {
        return getNestedScrollingParentForType(i8) != null;
    }

    public boolean startNestedScroll(int i8, int i9) {
        if (hasNestedScrollingParent(i9)) {
            return true;
        }
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        View view = this.mView;
        for (ViewParent parent = this.mView.getParent(); parent != null; parent = parent.getParent()) {
            if (ViewParentCompat.onStartNestedScroll(parent, view, this.mView, i8, i9)) {
                setNestedScrollingParentForType(i9, parent);
                ViewParentCompat.onNestedScrollAccepted(parent, view, this.mView, i8, i9);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void stopNestedScroll(int i8) {
        ViewParent nestedScrollingParentForType = getNestedScrollingParentForType(i8);
        if (nestedScrollingParentForType != null) {
            ViewParentCompat.onStopNestedScroll(nestedScrollingParentForType, this.mView, i8);
            setNestedScrollingParentForType(i8, null);
        }
    }

    public void dispatchNestedScroll(int i8, int i9, int i10, int i11, @Nullable int[] iArr, int i12, @Nullable int[] iArr2) {
        dispatchNestedScrollInternal(i8, i9, i10, i11, iArr, i12, iArr2);
    }
}
