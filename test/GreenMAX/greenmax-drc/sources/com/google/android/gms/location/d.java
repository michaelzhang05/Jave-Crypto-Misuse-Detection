package com.google.android.gms.location;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class d implements Comparator<DetectedActivity> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(DetectedActivity detectedActivity, DetectedActivity detectedActivity2) {
        DetectedActivity detectedActivity3 = detectedActivity;
        DetectedActivity detectedActivity4 = detectedActivity2;
        int compareTo = Integer.valueOf(detectedActivity4.w()).compareTo(Integer.valueOf(detectedActivity3.w()));
        return compareTo == 0 ? Integer.valueOf(detectedActivity3.z()).compareTo(Integer.valueOf(detectedActivity4.z())) : compareTo;
    }
}
