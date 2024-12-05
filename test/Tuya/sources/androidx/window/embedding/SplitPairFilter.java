package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import g6.n;
import kotlin.jvm.internal.AbstractC3159y;

@ExperimentalWindowApi
/* loaded from: classes3.dex */
public final class SplitPairFilter {
    private final ComponentName primaryActivityName;
    private final String secondaryActivityIntentAction;
    private final ComponentName secondaryActivityName;

    public SplitPairFilter(ComponentName primaryActivityName, ComponentName secondaryActivityName, String str) {
        Object obj;
        CharSequence charSequence;
        String str2;
        int i8;
        boolean z8;
        AbstractC3159y.i(primaryActivityName, "primaryActivityName");
        AbstractC3159y.i(secondaryActivityName, "secondaryActivityName");
        this.primaryActivityName = primaryActivityName;
        this.secondaryActivityName = secondaryActivityName;
        this.secondaryActivityIntentAction = str;
        String packageName = primaryActivityName.getPackageName();
        AbstractC3159y.h(packageName, "primaryActivityName.packageName");
        String className = primaryActivityName.getClassName();
        AbstractC3159y.h(className, "primaryActivityName.className");
        String packageName2 = secondaryActivityName.getPackageName();
        AbstractC3159y.h(packageName2, "secondaryActivityName.packageName");
        String className2 = secondaryActivityName.getClassName();
        AbstractC3159y.h(className2, "secondaryActivityName.className");
        if (packageName.length() != 0 && packageName2.length() != 0) {
            if (className.length() != 0 && className2.length() != 0) {
                if (n.H(packageName, "*", false, 2, null) && n.S(packageName, "*", 0, false, 6, null) != packageName.length() - 1) {
                    throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
                }
                if (n.H(className, "*", false, 2, null)) {
                    obj = null;
                    i8 = 2;
                    z8 = false;
                    charSequence = "*";
                    str2 = className2;
                    if (n.S(className, "*", 0, false, 6, null) != className.length() - 1) {
                        throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                    }
                } else {
                    obj = null;
                    charSequence = "*";
                    str2 = className2;
                    i8 = 2;
                    z8 = false;
                }
                if (n.H(packageName2, charSequence, z8, i8, obj) && n.S(packageName2, "*", 0, false, 6, null) != packageName2.length() - 1) {
                    throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
                }
                if (n.H(str2, charSequence, z8, i8, obj) && n.S(str2, "*", 0, false, 6, null) != str2.length() - 1) {
                    throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                }
                return;
            }
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        throw new IllegalArgumentException("Package name must not be empty".toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairFilter)) {
            return false;
        }
        SplitPairFilter splitPairFilter = (SplitPairFilter) obj;
        if (AbstractC3159y.d(this.primaryActivityName, splitPairFilter.primaryActivityName) && AbstractC3159y.d(this.secondaryActivityName, splitPairFilter.secondaryActivityName) && AbstractC3159y.d(this.secondaryActivityIntentAction, splitPairFilter.secondaryActivityIntentAction)) {
            return true;
        }
        return false;
    }

    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.primaryActivityName.hashCode() * 31) + this.secondaryActivityName.hashCode()) * 31;
        String str = this.secondaryActivityIntentAction;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final boolean matchesActivityIntentPair(Activity primaryActivity, Intent secondaryActivityIntent) {
        AbstractC3159y.i(primaryActivity, "primaryActivity");
        AbstractC3159y.i(secondaryActivityIntent, "secondaryActivityIntent");
        ComponentName componentName = primaryActivity.getComponentName();
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        if (!matcherUtils.areComponentsMatching$window_release(componentName, this.primaryActivityName) || !matcherUtils.areComponentsMatching$window_release(secondaryActivityIntent.getComponent(), this.secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityIntentAction;
        if (str != null && !AbstractC3159y.d(str, secondaryActivityIntent.getAction())) {
            return false;
        }
        return true;
    }

    public final boolean matchesActivityPair(Activity primaryActivity, Activity secondaryActivity) {
        boolean z8;
        AbstractC3159y.i(primaryActivity, "primaryActivity");
        AbstractC3159y.i(secondaryActivity, "secondaryActivity");
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        boolean z9 = false;
        if (matcherUtils.areComponentsMatching$window_release(primaryActivity.getComponentName(), this.primaryActivityName) && matcherUtils.areComponentsMatching$window_release(secondaryActivity.getComponentName(), this.secondaryActivityName)) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (secondaryActivity.getIntent() != null) {
            if (z8) {
                Intent intent = secondaryActivity.getIntent();
                AbstractC3159y.h(intent, "secondaryActivity.intent");
                if (matchesActivityIntentPair(primaryActivity, intent)) {
                    z9 = true;
                }
            }
            return z9;
        }
        return z8;
    }

    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.primaryActivityName + ", secondaryActivityName=" + this.secondaryActivityName + ", secondaryActivityAction=" + ((Object) this.secondaryActivityIntentAction) + '}';
    }
}
