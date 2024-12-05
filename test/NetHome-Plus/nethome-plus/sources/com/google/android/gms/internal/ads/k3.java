package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import cm.aptoide.pt.download.DownloadAnalytics;
import com.google.android.gms.ads.internal.zzk;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class k3 implements DialogInterface.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11692f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f11693g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zzapu f11694h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k3(zzapu zzapuVar, String str, String str2) {
        this.f11694h = zzapuVar;
        this.f11692f = str;
        this.f11693g = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        Context context;
        context = this.f11694h.f12879d;
        DownloadManager downloadManager = (DownloadManager) context.getSystemService(DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
        try {
            String str = this.f11692f;
            String str2 = this.f11693g;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            zzk.zzli();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f11694h.e("Could not store picture.");
        }
    }
}
