package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final b f2494a;

        public a(b bVar) {
            this.f2494a = bVar == null ? e() : bVar;
        }

        private e.c a(Context context, androidx.core.provider.e eVar) {
            if (eVar == null) {
                return null;
            }
            return new j(context, eVar);
        }

        private List b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        private androidx.core.provider.e d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new androidx.core.provider.e(str, str2, "emojicompat-emoji-font", b(this.f2494a.b(packageManager, str2)));
        }

        private static b e() {
            return Build.VERSION.SDK_INT >= 28 ? new d() : new C0041c();
        }

        private boolean f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        private ProviderInfo g(PackageManager packageManager) {
            Iterator it = this.f2494a.c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo a6 = this.f2494a.a((ResolveInfo) it.next());
                if (f(a6)) {
                    return a6;
                }
            }
            return null;
        }

        public e.c c(Context context) {
            return a(context, h(context));
        }

        androidx.core.provider.e h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            androidx.core.util.h.g(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g6 = g(packageManager);
            if (g6 == null) {
                return null;
            }
            try {
                return d(g6, packageManager);
            } catch (PackageManager.NameNotFoundException e6) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e6);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public abstract ProviderInfo a(ResolveInfo resolveInfo);

        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public abstract List c(PackageManager packageManager, Intent intent, int i6);
    }

    /* renamed from: androidx.emoji2.text.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0041c extends b {
        @Override // androidx.emoji2.text.c.b
        public ProviderInfo a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.c.b
        public List c(PackageManager packageManager, Intent intent, int i6) {
            return packageManager.queryIntentContentProviders(intent, i6);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends C0041c {
        @Override // androidx.emoji2.text.c.b
        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static j a(Context context) {
        return (j) new a(null).c(context);
    }
}
