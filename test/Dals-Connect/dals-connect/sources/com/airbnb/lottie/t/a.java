package com.airbnb.lottie.t;

import cm.aptoide.pt.utils.MultiDexHelper;

/* compiled from: FileExtension.java */
/* loaded from: classes.dex */
public enum a {
    Json(".json"),
    Zip(MultiDexHelper.EXTRACTED_SUFFIX);


    /* renamed from: i, reason: collision with root package name */
    public final String f8251i;

    a(String str) {
        this.f8251i = str;
    }

    public String d() {
        return ".temp" + this.f8251i;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f8251i;
    }
}
