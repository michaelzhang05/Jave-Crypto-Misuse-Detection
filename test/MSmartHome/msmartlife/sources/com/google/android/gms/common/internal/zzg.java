package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import cm.aptoide.pt.DeepLinkIntentReceiver;

/* loaded from: classes2.dex */
public final class zzg {
    private static final Uri a;

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f10915b;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        a = parse;
        f10915b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }

    public static Intent a(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(DeepLinkIntentReceiver.DeepLinksKeys.ID, str);
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    public static Intent b(String str) {
        Uri fromParts = Uri.fromParts(cm.aptoide.pt.downloadmanager.Constants.PACKAGE, str, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    public static Intent c() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }
}
