package com.google.android.gms.location;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class c implements Comparator<ActivityTransition> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(ActivityTransition activityTransition, ActivityTransition activityTransition2) {
        ActivityTransition activityTransition3 = activityTransition;
        ActivityTransition activityTransition4 = activityTransition2;
        int w = activityTransition3.w();
        int w2 = activityTransition4.w();
        if (w != w2) {
            return w < w2 ? -1 : 1;
        }
        int z = activityTransition3.z();
        int z2 = activityTransition4.z();
        if (z == z2) {
            return 0;
        }
        return z < z2 ? -1 : 1;
    }
}
