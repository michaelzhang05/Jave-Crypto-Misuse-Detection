package com.google.android.gms.common;

import s1.g;

/* loaded from: classes.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i6) {
        super(i6, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + g.f9221a + " but found " + i6 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
    }
}
