package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.SimpleArrayMap;

/* loaded from: classes3.dex */
public final class C2 {

    /* renamed from: a, reason: collision with root package name */
    private final SimpleArrayMap f15281a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2(SimpleArrayMap simpleArrayMap) {
        this.f15281a = simpleArrayMap;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        SimpleArrayMap simpleArrayMap;
        if (uri != null) {
            simpleArrayMap = (SimpleArrayMap) this.f15281a.get(uri.toString());
        } else {
            simpleArrayMap = null;
        }
        if (simpleArrayMap == null) {
            return null;
        }
        return (String) simpleArrayMap.get("".concat(str3));
    }
}
