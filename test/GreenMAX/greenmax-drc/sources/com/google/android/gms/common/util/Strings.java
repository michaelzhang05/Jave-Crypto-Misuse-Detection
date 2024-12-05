package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;

@VisibleForTesting
@KeepForSdk
/* loaded from: classes2.dex */
public class Strings {
    private static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");

    private Strings() {
    }
}
