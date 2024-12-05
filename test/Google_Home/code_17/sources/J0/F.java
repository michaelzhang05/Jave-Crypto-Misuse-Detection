package J0;

import android.content.Context;

/* loaded from: classes3.dex */
class F {

    /* renamed from: a, reason: collision with root package name */
    private String f4637a;

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName == null) {
            return "";
        }
        return installerPackageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a(Context context) {
        String str;
        try {
            if (this.f4637a == null) {
                this.f4637a = b(context);
            }
            if ("".equals(this.f4637a)) {
                str = null;
            } else {
                str = this.f4637a;
            }
        } finally {
        }
        return str;
    }
}
