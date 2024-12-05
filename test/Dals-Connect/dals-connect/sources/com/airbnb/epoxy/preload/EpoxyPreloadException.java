package com.airbnb.epoxy.preload;

import kotlin.Metadata;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: EpoxyPreloader.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/airbnb/epoxy/preload/EpoxyPreloadException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", HttpUrl.FRAGMENT_ENCODE_SET, "errorMessage", "<init>", "(Ljava/lang/String;)V", "epoxy-adapter_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class EpoxyPreloadException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyPreloadException(String str) {
        super(str);
        l.g(str, "errorMessage");
    }
}
