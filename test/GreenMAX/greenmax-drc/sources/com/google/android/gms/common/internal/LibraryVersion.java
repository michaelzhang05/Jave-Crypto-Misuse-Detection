package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;

@KeepForSdk
/* loaded from: classes2.dex */
public class LibraryVersion {
    private static final GmsLogger a = new GmsLogger("LibraryVersion", HttpUrl.FRAGMENT_ENCODE_SET);

    /* renamed from: b, reason: collision with root package name */
    private static LibraryVersion f10868b = new LibraryVersion();

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f10869c = new ConcurrentHashMap<>();

    @VisibleForTesting
    protected LibraryVersion() {
    }
}
