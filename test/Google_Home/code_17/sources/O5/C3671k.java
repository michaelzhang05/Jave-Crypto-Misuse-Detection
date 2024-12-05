package o5;

import a5.C1648o;
import a5.O;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.CustomWebView;
import com.uptodown.activities.GdprPrivacySettings;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: o5.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3671k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36498a = new a(null);

    /* renamed from: o5.k$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: o5.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0811a extends CharacterStyle implements UpdateAppearance {

            /* renamed from: a, reason: collision with root package name */
            private final Shader f36499a;

            /* renamed from: b, reason: collision with root package name */
            private final float f36500b;

            public C0811a(Shader shader, float f8) {
                AbstractC3255y.i(shader, "shader");
                this.f36499a = shader;
                this.f36500b = f8;
            }

            @Override // android.text.style.CharacterStyle
            public void updateDrawState(TextPaint tp) {
                AbstractC3255y.i(tp, "tp");
                tp.setShader(this.f36499a);
                tp.setTextSize(this.f36500b);
                tp.setColor(tp.linkColor);
            }
        }

        private a() {
        }

        public final void a(ImageView imageView) {
            AbstractC3255y.i(imageView, "<this>");
            int dimension = (int) imageView.getContext().getResources().getDimension(R.dimen.border_radius_xs);
            imageView.setBackground(ContextCompat.getDrawable(imageView.getContext(), R.drawable.shape_stroke_review_avatar_turbo));
            imageView.setPadding(dimension, dimension, dimension, dimension);
        }

        public final void b(ImageView imageView) {
            AbstractC3255y.i(imageView, "<this>");
            int dimension = (int) imageView.getContext().getResources().getDimension(R.dimen.border_radius_xs);
            imageView.setBackground(ContextCompat.getDrawable(imageView.getContext(), R.drawable.shape_stroke_review_small_avatar_turbo));
            imageView.setPadding(dimension, dimension, dimension, dimension);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Activity activity, DialogInterface dialogInterface, int i8) {
        AbstractC3255y.i(activity, "$activity");
        dialogInterface.dismiss();
        if (activity instanceof AppDetailActivity) {
            ((AppDetailActivity) activity).o3().launch(new Intent(activity, (Class<?>) GdprPrivacySettings.class));
        } else if (activity instanceof MainActivity) {
            ((MainActivity) activity).B5().launch(new Intent(activity, (Class<?>) GdprPrivacySettings.class));
        } else {
            activity.startActivity(new Intent(activity, (Class<?>) GdprPrivacySettings.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(DialogInterface dialogInterface, int i8) {
        AbstractC3255y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    public static /* synthetic */ void r(C3671k c3671k, Activity activity, String str, String str2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str2 = null;
        }
        c3671k.q(activity, str, str2);
    }

    public final String c(String url) {
        String str;
        AbstractC3255y.i(url, "url");
        if (j6.n.H(url, ".uptodown.com/", false, 2, null)) {
            if (j6.n.H(url, "?", false, 2, null)) {
                str = url + '&';
            } else {
                str = url + '?';
            }
            return str + "userAgent=uptodownandroid";
        }
        return url;
    }

    public final SpannableString d(String originalString, String subString, Context context) {
        AbstractC3255y.i(originalString, "originalString");
        AbstractC3255y.i(subString, "subString");
        AbstractC3255y.i(context, "context");
        SpannableString spannableString = new SpannableString(originalString);
        int S8 = j6.n.S(originalString, subString, 0, false, 6, null);
        int length = subString.length() + S8;
        if (S8 != -1) {
            float dimension = context.getResources().getDimension(R.dimen.text_size_m);
            Typeface t8 = H4.j.f3824g.t();
            AbstractC3255y.f(t8);
            spannableString.setSpan(new defpackage.b(dimension, t8, ContextCompat.getColor(context, R.color.text_primary)), S8, length, 33);
        }
        return spannableString;
    }

    public final File e(File fileWithXapkExtension, Context context) {
        PackageInfo packageInfo;
        AbstractC3255y.i(fileWithXapkExtension, "fileWithXapkExtension");
        AbstractC3255y.i(context, "context");
        File file = null;
        if (!new Q4.w().f(fileWithXapkExtension)) {
            try {
                PackageManager pm = context.getPackageManager();
                AbstractC3255y.h(pm, "pm");
                String absolutePath = fileWithXapkExtension.getAbsolutePath();
                AbstractC3255y.h(absolutePath, "fileWithXapkExtension.absolutePath");
                packageInfo = Q4.q.c(pm, absolutePath, 1);
            } catch (Exception unused) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                String parent = fileWithXapkExtension.getParent();
                StringBuilder sb = new StringBuilder();
                String name = fileWithXapkExtension.getName();
                AbstractC3255y.h(name, "fileWithXapkExtension.name");
                String substring = name.substring(0, fileWithXapkExtension.getName().length() - 5);
                AbstractC3255y.h(substring, "substring(...)");
                sb.append(substring);
                sb.append(".apk");
                File file2 = new File(parent, sb.toString());
                boolean renameTo = fileWithXapkExtension.renameTo(file2);
                if (renameTo) {
                    file = file2;
                }
                Bundle bundle = new Bundle();
                bundle.putString("type", String.valueOf(renameTo));
                new C3678r(context).b("rename_apk", bundle);
            }
        }
        return file;
    }

    public final File f(File fileWithApkExtension, Context context) {
        AbstractC3255y.i(fileWithApkExtension, "fileWithApkExtension");
        AbstractC3255y.i(context, "context");
        File file = null;
        if (new Q4.w().f(fileWithApkExtension)) {
            String parent = fileWithApkExtension.getParent();
            StringBuilder sb = new StringBuilder();
            String name = fileWithApkExtension.getName();
            AbstractC3255y.h(name, "fileWithApkExtension.name");
            String substring = name.substring(0, fileWithApkExtension.getName().length() - 4);
            AbstractC3255y.h(substring, "substring(...)");
            sb.append(substring);
            sb.append(".xapk");
            File file2 = new File(parent, sb.toString());
            boolean renameTo = fileWithApkExtension.renameTo(file2);
            if (renameTo) {
                file = file2;
            }
            Bundle bundle = new Bundle();
            bundle.putString("type", String.valueOf(renameTo));
            new C3678r(context).b("rename_xapk", bundle);
        }
        return file;
    }

    public final AlertDialog g(AlertDialog alertDialog, final Activity activity) {
        AbstractC3255y.i(activity, "activity");
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        if (aVar.W(activity) && !aVar.k0(activity)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage(activity.getString(R.string.tracking_disabled_warning_gdpr));
            builder.setPositiveButton(R.string.gdpr_set_up, new DialogInterface.OnClickListener() { // from class: o5.i
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    C3671k.h(activity, dialogInterface, i8);
                }
            });
            builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: o5.j
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    C3671k.i(dialogInterface, i8);
                }
            });
            builder.setCancelable(true);
            AlertDialog create = builder.create();
            if (!activity.isFinishing()) {
                create.show();
            }
            return create;
        }
        return null;
    }

    public final void j(Context context, String packagenameInstalled, String packageNameDeepLink) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(packagenameInstalled, "packagenameInstalled");
        AbstractC3255y.i(packageNameDeepLink, "packageNameDeepLink");
        try {
            if (j6.n.s(packagenameInstalled, packageNameDeepLink, true)) {
                Iterator it = new C3677q().j(context).iterator();
                while (it.hasNext()) {
                    File file = (File) it.next();
                    C3677q c3677q = new C3677q();
                    String name = file.getName();
                    AbstractC3255y.h(name, "apk.name");
                    String i8 = c3677q.i(name);
                    if (i8 != null && j6.n.s(i8, packageNameDeepLink, true)) {
                        String path = file.getAbsolutePath();
                        if (file.delete()) {
                            C3674n a8 = C3674n.f36505t.a(context);
                            a8.a();
                            AbstractC3255y.h(path, "path");
                            a8.y(path);
                            a8.l();
                            return;
                        }
                        return;
                    }
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final ArrayList k(Context context) {
        AbstractC3255y.i(context, "context");
        ArrayList arrayList = new ArrayList();
        C3674n a8 = C3674n.f36505t.a(context);
        a8.a();
        Iterator it = a8.c0().iterator();
        while (it.hasNext()) {
            C1648o c1648o = (C1648o) it.next();
            if (c1648o.h0()) {
                arrayList.add(c1648o);
            }
        }
        a8.l();
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        if (j6.n.C(r2, "https://play.google.com", false, 2, null) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String l(android.net.Uri r12) {
        /*
            r11 = this;
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.AbstractC3255y.i(r12, r0)
            java.lang.String r0 = r12.toString()
            java.lang.String r1 = "uri.toString()"
            kotlin.jvm.internal.AbstractC3255y.h(r0, r1)
            java.lang.String r2 = "utd://"
            r7 = 0
            r8 = 2
            r9 = 0
            boolean r2 = j6.n.C(r0, r2, r7, r8, r9)
            java.lang.String r10 = "substring(...)"
            if (r2 == 0) goto L25
            r12 = 6
            java.lang.String r12 = r0.substring(r12)
            kotlin.jvm.internal.AbstractC3255y.h(r12, r10)
            goto L98
        L25:
            java.lang.String r2 = r12.toString()
            kotlin.jvm.internal.AbstractC3255y.h(r2, r1)
            java.lang.String r3 = "market://"
            boolean r2 = j6.n.C(r2, r3, r7, r8, r9)
            if (r2 != 0) goto L52
            java.lang.String r2 = r12.toString()
            kotlin.jvm.internal.AbstractC3255y.h(r2, r1)
            java.lang.String r3 = "http://play.google.com"
            boolean r2 = j6.n.C(r2, r3, r7, r8, r9)
            if (r2 != 0) goto L52
            java.lang.String r2 = r12.toString()
            kotlin.jvm.internal.AbstractC3255y.h(r2, r1)
            java.lang.String r3 = "https://play.google.com"
            boolean r2 = j6.n.C(r2, r3, r7, r8, r9)
            if (r2 == 0) goto L91
        L52:
            java.lang.String r2 = r12.toString()
            kotlin.jvm.internal.AbstractC3255y.h(r2, r1)
            java.lang.String r3 = "details?id="
            boolean r2 = j6.n.H(r2, r3, r7, r8, r9)
            if (r2 == 0) goto L91
            r5 = 6
            r6 = 0
            r12 = 0
            r4 = 0
            r1 = r0
            r2 = r3
            r3 = r12
            int r12 = j6.n.S(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + 11
            java.lang.String r1 = "&"
            boolean r1 = j6.n.H(r0, r1, r7, r8, r9)
            if (r1 == 0) goto L89
            r5 = 6
            r6 = 0
            java.lang.String r2 = "&"
            r3 = 0
            r4 = 0
            r1 = r0
            int r1 = j6.n.S(r1, r2, r3, r4, r5, r6)
            java.lang.String r12 = r0.substring(r12, r1)
            kotlin.jvm.internal.AbstractC3255y.h(r12, r10)
            goto L98
        L89:
            java.lang.String r12 = r0.substring(r12)
            kotlin.jvm.internal.AbstractC3255y.h(r12, r10)
            goto L98
        L91:
            java.lang.String r12 = r12.toString()
            kotlin.jvm.internal.AbstractC3255y.h(r12, r1)
        L98:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.C3671k.l(android.net.Uri):java.lang.String");
    }

    public final String m(long j8) {
        if (j8 <= 0) {
            return null;
        }
        return new SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault()).format(new Date(j8));
    }

    public final File n(Context context) {
        String str;
        AbstractC3255y.i(context, "context");
        File file = null;
        try {
            C3674n a8 = C3674n.f36505t.a(context);
            a8.a();
            String packageName = context.getPackageName();
            AbstractC3255y.h(packageName, "context.packageName");
            O u02 = a8.u0(packageName);
            if (u02 != null) {
                str = u02.l();
            } else {
                str = null;
            }
            if (str != null && u02.u() == 100) {
                File g8 = new C3677q().g(context);
                String l8 = u02.l();
                AbstractC3255y.f(l8);
                File file2 = new File(g8, l8);
                try {
                    if (file2.exists()) {
                        String name = file2.getName();
                        AbstractC3255y.h(name, "fileUpdate.name");
                        if (j6.n.r(name, ".apk", false, 2, null)) {
                            PackageManager packageManager = context.getPackageManager();
                            AbstractC3255y.h(packageManager, "context.packageManager");
                            String absolutePath = file2.getAbsolutePath();
                            AbstractC3255y.h(absolutePath, "fileUpdate.absolutePath");
                            PackageInfo c8 = Q4.q.c(packageManager, absolutePath, 1);
                            if (c8 != null) {
                                if (628 < new Q4.f().m(c8)) {
                                    if (!j6.n.s(c8.packageName, context.getPackageName(), true)) {
                                    }
                                } else {
                                    String packageName2 = context.getPackageName();
                                    AbstractC3255y.h(packageName2, "context.packageName");
                                    a8.M(packageName2);
                                    file2.delete();
                                }
                            }
                        }
                    }
                    file = file2;
                } catch (Exception e8) {
                    e = e8;
                    file = file2;
                    e.printStackTrace();
                    return file;
                }
            }
            a8.l();
        } catch (Exception e9) {
            e = e9;
        }
        return file;
    }

    public final boolean o(Context context) {
        if (context == null || (context.getResources().getConfiguration().uiMode & 48) != 16) {
            return false;
        }
        return true;
    }

    public final boolean p(View view) {
        AccessibilityNodeInfo obtain;
        boolean z8 = false;
        if (view != null && view.isShown()) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            z8 = rect.intersect(new Rect(0, 0, Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels));
        }
        if (z8) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 33) {
                obtain = AbstractC3668h.a();
            } else {
                obtain = AccessibilityNodeInfo.obtain();
            }
            AbstractC3255y.f(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            boolean isVisibleToUser = obtain.isVisibleToUser();
            if (i8 < 33) {
                obtain.recycle();
            }
            return isVisibleToUser;
        }
        return z8;
    }

    public final void q(Activity activity, String url, String str) {
        AbstractC3255y.i(activity, "activity");
        AbstractC3255y.i(url, "url");
        String c8 = c(url);
        try {
            new CustomTabsIntent.Builder().build().launchUrl(activity, Uri.parse(c8));
        } catch (Exception unused) {
            Intent intent = new Intent(activity, (Class<?>) CustomWebView.class);
            if (str != null) {
                intent.putExtra(CampaignEx.JSON_KEY_TITLE, str);
            }
            intent.putExtra("url", c8);
            activity.startActivity(intent, UptodownApp.f29058B.a(activity));
        }
    }

    public final boolean s(String str, String str2) {
        if (str == null && str2 != null) {
            return false;
        }
        if (str != null && str2 == null) {
            return false;
        }
        return j6.n.s(str, str2, true);
    }

    public final Uri t(File file, Context context) {
        AbstractC3255y.i(context, "context");
        if (Build.VERSION.SDK_INT >= 24) {
            String str = context.getPackageName() + ".provider";
            AbstractC3255y.f(file);
            Uri uriForFile = FileProvider.getUriForFile(context, str, file);
            AbstractC3255y.h(uriForFile, "{\n            FileProvid…vider\", file!!)\n        }");
            return uriForFile;
        }
        Uri fromFile = Uri.fromFile(file);
        AbstractC3255y.h(fromFile, "{\n            Uri.fromFile(file)\n        }");
        return fromFile;
    }
}
