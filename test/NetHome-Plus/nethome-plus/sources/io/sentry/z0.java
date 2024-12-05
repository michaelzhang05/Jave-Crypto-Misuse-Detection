package io.sentry;

import cm.aptoide.pt.BuildConfig;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: DataCategory.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public enum z0 {
    All("__all__"),
    Default(BuildConfig.APTOIDE_THEME),
    Error("error"),
    Session("session"),
    Attachment("attachment"),
    Profile("profile"),
    Transaction("transaction"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final String category;

    z0(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
