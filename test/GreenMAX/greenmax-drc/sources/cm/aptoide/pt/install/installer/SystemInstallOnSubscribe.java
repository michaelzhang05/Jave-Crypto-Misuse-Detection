package cm.aptoide.pt.install.installer;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.RemoteException;
import b.a.a.a;
import cm.aptoide.pt.install.exception.InstallationException;
import okhttp3.HttpUrl;
import rx.e;

/* loaded from: classes.dex */
public class SystemInstallOnSubscribe implements e.a<Void> {
    private static final int INSTALL_REPLACE_EXISTING = 2;
    private static final int INSTALL_SUCCEEDED = 1;
    private final Context context;
    private final PackageManager packageManager;
    private final Uri packageUri;

    public SystemInstallOnSubscribe(Context context, PackageManager packageManager, Uri uri) {
        this.context = context;
        this.packageManager = packageManager;
        this.packageUri = uri;
    }

    private boolean isSystem(Context context) {
        try {
            return (this.packageManager.getApplicationInfo(context.getPackageName(), 0).flags & 1) == 1;
        } catch (PackageManager.NameNotFoundException unused) {
            throw new AssertionError("Aptoide application not found by package manager.");
        }
    }

    @Override // rx.m.b
    public void call(final rx.j<? super Void> jVar) {
        a.AbstractBinderC0044a abstractBinderC0044a = new a.AbstractBinderC0044a() { // from class: cm.aptoide.pt.install.installer.SystemInstallOnSubscribe.1
            @Override // b.a.a.a.AbstractBinderC0044a
            public void packageInstalled(String str, int i2) throws RemoteException {
                if (i2 == 1) {
                    if (jVar.isUnsubscribed()) {
                        return;
                    }
                    jVar.onNext(null);
                    jVar.onCompleted();
                    return;
                }
                if (jVar.isUnsubscribed()) {
                    return;
                }
                jVar.onError(new InstallationException("Package not installed with error code: " + i2));
            }
        };
        if (isSystem(this.context)) {
            try {
                this.packageManager.getClass().getMethod("installPackage", Uri.class, b.a.a.a.class, Integer.TYPE, String.class).invoke(this.packageManager, this.packageUri, abstractBinderC0044a, 2, HttpUrl.FRAGMENT_ENCODE_SET);
                return;
            } catch (Exception e2) {
                if (jVar.isUnsubscribed()) {
                    return;
                }
                jVar.onError(new InstallationException(e2));
                return;
            }
        }
        if (jVar.isUnsubscribed()) {
            return;
        }
        jVar.onError(new InstallationException("Aptoide does not hold system privilege!"));
    }
}
