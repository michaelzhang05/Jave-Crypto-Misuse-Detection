package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.os.LocaleListCompat;

/* loaded from: classes3.dex */
public class AccessibilityWindowInfoCompat {
    public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
    public static final int TYPE_APPLICATION = 1;
    public static final int TYPE_INPUT_METHOD = 2;
    public static final int TYPE_MAGNIFICATION_OVERLAY = 6;
    public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
    public static final int TYPE_SYSTEM = 3;
    private static final int UNDEFINED = -1;
    private final Object mInfo;

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(21)
    /* loaded from: classes3.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static void getBoundsInScreen(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        @DoNotInline
        static AccessibilityWindowInfo getChild(AccessibilityWindowInfo accessibilityWindowInfo, int i8) {
            return accessibilityWindowInfo.getChild(i8);
        }

        @DoNotInline
        static int getChildCount(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        @DoNotInline
        static int getId(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        @DoNotInline
        static int getLayer(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        @DoNotInline
        static AccessibilityWindowInfo getParent(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        @DoNotInline
        static AccessibilityNodeInfo getRoot(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        @DoNotInline
        static int getType(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        @DoNotInline
        static boolean isAccessibilityFocused(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        @DoNotInline
        static boolean isActive(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        @DoNotInline
        static boolean isFocused(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        @DoNotInline
        static AccessibilityWindowInfo obtain() {
            return AccessibilityWindowInfo.obtain();
        }

        @DoNotInline
        static AccessibilityWindowInfo obtain(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }
    }

    @RequiresApi(24)
    /* loaded from: classes3.dex */
    private static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static AccessibilityNodeInfo getAnchor(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        @DoNotInline
        static CharSequence getTitle(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    @RequiresApi(26)
    /* loaded from: classes3.dex */
    private static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        static boolean isInPictureInPictureMode(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isInPictureInPictureMode();
        }
    }

    @RequiresApi(30)
    /* loaded from: classes3.dex */
    private static class Api30Impl {
        private Api30Impl() {
        }

        @DoNotInline
        static AccessibilityWindowInfo instantiateAccessibilityWindowInfo() {
            return new AccessibilityWindowInfo();
        }
    }

    @RequiresApi(33)
    /* loaded from: classes3.dex */
    private static class Api33Impl {
        private Api33Impl() {
        }

        @DoNotInline
        static int getDisplayId(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getDisplayId();
        }

        @DoNotInline
        static void getRegionInScreen(AccessibilityWindowInfo accessibilityWindowInfo, Region region) {
            accessibilityWindowInfo.getRegionInScreen(region);
        }

        @DoNotInline
        public static AccessibilityNodeInfoCompat getRoot(Object obj, int i8) {
            return AccessibilityNodeInfoCompat.wrapNonNullInstance(((AccessibilityWindowInfo) obj).getRoot(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(34)
    /* loaded from: classes3.dex */
    public static class Api34Impl {
        private Api34Impl() {
        }

        @DoNotInline
        static LocaleList getLocales(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLocales();
        }

        @DoNotInline
        public static long getTransitionTimeMillis(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTransitionTimeMillis();
        }
    }

    public AccessibilityWindowInfoCompat() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.mInfo = Api30Impl.instantiateAccessibilityWindowInfo();
        } else {
            this.mInfo = null;
        }
    }

    @Nullable
    public static AccessibilityWindowInfoCompat obtain() {
        return wrapNonNullInstance(Api21Impl.obtain());
    }

    private static String typeToString(int i8) {
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        return "<UNKNOWN>";
                    }
                    return "TYPE_ACCESSIBILITY_OVERLAY";
                }
                return "TYPE_SYSTEM";
            }
            return "TYPE_INPUT_METHOD";
        }
        return "TYPE_APPLICATION";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AccessibilityWindowInfoCompat wrapNonNullInstance(Object obj) {
        if (obj != null) {
            return new AccessibilityWindowInfoCompat(obj);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityWindowInfoCompat)) {
            return false;
        }
        AccessibilityWindowInfoCompat accessibilityWindowInfoCompat = (AccessibilityWindowInfoCompat) obj;
        Object obj2 = this.mInfo;
        if (obj2 == null) {
            if (accessibilityWindowInfoCompat.mInfo == null) {
                return true;
            }
            return false;
        }
        return obj2.equals(accessibilityWindowInfoCompat.mInfo);
    }

    @Nullable
    public AccessibilityNodeInfoCompat getAnchor() {
        if (Build.VERSION.SDK_INT >= 24) {
            return AccessibilityNodeInfoCompat.wrapNonNullInstance(Api24Impl.getAnchor((AccessibilityWindowInfo) this.mInfo));
        }
        return null;
    }

    public void getBoundsInScreen(@NonNull Rect rect) {
        Api21Impl.getBoundsInScreen((AccessibilityWindowInfo) this.mInfo, rect);
    }

    @Nullable
    public AccessibilityWindowInfoCompat getChild(int i8) {
        return wrapNonNullInstance(Api21Impl.getChild((AccessibilityWindowInfo) this.mInfo, i8));
    }

    public int getChildCount() {
        return Api21Impl.getChildCount((AccessibilityWindowInfo) this.mInfo);
    }

    public int getDisplayId() {
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.getDisplayId((AccessibilityWindowInfo) this.mInfo);
        }
        return 0;
    }

    public int getId() {
        return Api21Impl.getId((AccessibilityWindowInfo) this.mInfo);
    }

    public int getLayer() {
        return Api21Impl.getLayer((AccessibilityWindowInfo) this.mInfo);
    }

    @NonNull
    public LocaleListCompat getLocales() {
        if (Build.VERSION.SDK_INT >= 34) {
            return LocaleListCompat.wrap(Api34Impl.getLocales((AccessibilityWindowInfo) this.mInfo));
        }
        return LocaleListCompat.getEmptyLocaleList();
    }

    @Nullable
    public AccessibilityWindowInfoCompat getParent() {
        return wrapNonNullInstance(Api21Impl.getParent((AccessibilityWindowInfo) this.mInfo));
    }

    public void getRegionInScreen(@NonNull Region region) {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.getRegionInScreen((AccessibilityWindowInfo) this.mInfo, region);
            return;
        }
        Rect rect = new Rect();
        Api21Impl.getBoundsInScreen((AccessibilityWindowInfo) this.mInfo, rect);
        region.set(rect);
    }

    @Nullable
    public AccessibilityNodeInfoCompat getRoot() {
        return AccessibilityNodeInfoCompat.wrapNonNullInstance(Api21Impl.getRoot((AccessibilityWindowInfo) this.mInfo));
    }

    @Nullable
    public CharSequence getTitle() {
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.getTitle((AccessibilityWindowInfo) this.mInfo);
        }
        return null;
    }

    public long getTransitionTimeMillis() {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getTransitionTimeMillis((AccessibilityWindowInfo) this.mInfo);
        }
        return 0L;
    }

    public int getType() {
        return Api21Impl.getType((AccessibilityWindowInfo) this.mInfo);
    }

    public int hashCode() {
        Object obj = this.mInfo;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean isAccessibilityFocused() {
        return Api21Impl.isAccessibilityFocused((AccessibilityWindowInfo) this.mInfo);
    }

    public boolean isActive() {
        return Api21Impl.isActive((AccessibilityWindowInfo) this.mInfo);
    }

    public boolean isFocused() {
        return Api21Impl.isFocused((AccessibilityWindowInfo) this.mInfo);
    }

    public boolean isInPictureInPictureMode() {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.isInPictureInPictureMode((AccessibilityWindowInfo) this.mInfo);
        }
        return false;
    }

    @Deprecated
    public void recycle() {
    }

    @NonNull
    public String toString() {
        boolean z8;
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        getBoundsInScreen(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(getId());
        sb.append(", type=");
        sb.append(typeToString(getType()));
        sb.append(", layer=");
        sb.append(getLayer());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(isFocused());
        sb.append(", active=");
        sb.append(isActive());
        sb.append(", hasParent=");
        boolean z9 = false;
        if (getParent() != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        sb.append(z8);
        sb.append(", hasChildren=");
        if (getChildCount() > 0) {
            z9 = true;
        }
        sb.append(z9);
        sb.append(", transitionTime=");
        sb.append(getTransitionTimeMillis());
        sb.append(", locales=");
        sb.append(getLocales());
        sb.append(']');
        return sb.toString();
    }

    @Nullable
    public AccessibilityWindowInfo unwrap() {
        return (AccessibilityWindowInfo) this.mInfo;
    }

    @Nullable
    public static AccessibilityWindowInfoCompat obtain(@Nullable AccessibilityWindowInfoCompat accessibilityWindowInfoCompat) {
        if (accessibilityWindowInfoCompat == null) {
            return null;
        }
        return wrapNonNullInstance(Api21Impl.obtain((AccessibilityWindowInfo) accessibilityWindowInfoCompat.mInfo));
    }

    @Nullable
    public AccessibilityNodeInfoCompat getRoot(int i8) {
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.getRoot(this.mInfo, i8);
        }
        return getRoot();
    }

    private AccessibilityWindowInfoCompat(Object obj) {
        this.mInfo = obj;
    }
}
