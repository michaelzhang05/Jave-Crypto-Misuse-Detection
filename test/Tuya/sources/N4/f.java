package N4;

import android.app.Activity;
import android.content.Context;
import android.content.UriPermission;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.system.StructStatVfs;
import android.webkit.MimeTypeMap;
import androidx.documentfile.provider.DocumentFile;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.io.File;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class f {
    private final File d(Context context) {
        G4.a aVar = new G4.a(context);
        if (aVar.o()) {
            File[] externalFilesDirs = context.getExternalFilesDirs(null);
            if (externalFilesDirs.length > 1) {
                return externalFilesDirs[1];
            }
            File externalFilesDir = context.getExternalFilesDir(null);
            aVar.F(false);
            aVar.E(false);
            return externalFilesDir;
        }
        return context.getExternalFilesDir(null);
    }

    public final File a(Context context, String subdirName) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(subdirName, "subdirName");
        File file = new File(d(context), subdirName);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final String b(PackageInfo pi, String realPath, PackageManager pm) {
        AbstractC3159y.i(pi, "pi");
        AbstractC3159y.i(realPath, "realPath");
        AbstractC3159y.i(pm, "pm");
        ApplicationInfo applicationInfo = pi.applicationInfo;
        applicationInfo.sourceDir = realPath;
        applicationInfo.publicSourceDir = realPath;
        return pm.getApplicationLabel(applicationInfo).toString();
    }

    public final File c(Context context) {
        File externalStorageDirectory;
        AbstractC3159y.i(context, "context");
        G4.a aVar = new G4.a(context);
        if (aVar.o()) {
            File[] externalFilesDirs = context.getExternalFilesDirs(null);
            if (externalFilesDirs.length > 1) {
                externalStorageDirectory = externalFilesDirs[1];
            } else {
                File externalStorageDirectory2 = Environment.getExternalStorageDirectory();
                aVar.F(false);
                aVar.E(false);
                externalStorageDirectory = externalStorageDirectory2;
            }
        } else {
            externalStorageDirectory = Environment.getExternalStorageDirectory();
        }
        if (externalStorageDirectory != null) {
            File file = new File(externalStorageDirectory.getAbsolutePath() + '/' + context.getResources().getString(E4.h.f2232c) + "/Backups");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
        return context.getExternalFilesDir(null);
    }

    public final File e() {
        return new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/obb/");
    }

    public final File f(Context context) {
        AbstractC3159y.i(context, "context");
        File file = new File(context.getExternalFilesDir(null), "received");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File g(Context context) {
        AbstractC3159y.i(context, "context");
        File file = new File(context.getExternalFilesDir(null), "tmp");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final Drawable h(Context context, String filePath) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(filePath, "filePath");
        PackageManager packageManager = context.getPackageManager();
        AbstractC3159y.h(packageManager, "context.packageManager");
        PackageInfo c8 = q.c(packageManager, filePath, 128);
        if (c8 != null) {
            ApplicationInfo applicationInfo = c8.applicationInfo;
            applicationInfo.sourceDir = filePath;
            applicationInfo.publicSourceDir = filePath;
            return applicationInfo.loadIcon(context.getPackageManager());
        }
        return null;
    }

    public final String i(String fileName) {
        String str;
        AbstractC3159y.i(fileName, "fileName");
        if (g6.n.S(fileName, ".", 0, false, 6, null) > 0) {
            str = fileName.substring(g6.n.X(fileName, ".", 0, false, 6, null) + 1);
            AbstractC3159y.h(str, "this as java.lang.String).substring(startIndex)");
        } else {
            str = "";
        }
        if (g6.n.s(str, "xapk", true)) {
            return "application/xapk-package-archive";
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        Locale locale = Locale.getDefault();
        AbstractC3159y.h(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        AbstractC3159y.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
        if (mimeTypeFromExtension == null) {
            return "application/octet-stream";
        }
        return mimeTypeFromExtension;
    }

    public final String j(Uri contentUri, Activity activity) {
        AbstractC3159y.i(contentUri, "contentUri");
        AbstractC3159y.i(activity, "activity");
        String str = null;
        try {
            try {
                Cursor query = activity.getContentResolver().query(contentUri, null, null, null, null);
                if (query != null) {
                    int columnIndex = query.getColumnIndex("_display_name");
                    query.moveToFirst();
                    str = query.getString(columnIndex);
                    query.close();
                }
                if (str == null && contentUri.getPath() != null) {
                    String path = contentUri.getPath();
                    AbstractC3159y.f(path);
                    if (o(path)) {
                        return contentUri.getLastPathSegment();
                    }
                    return str;
                }
                return str;
            } catch (Exception e8) {
                e8.printStackTrace();
                if (str == null && contentUri.getPath() != null) {
                    String path2 = contentUri.getPath();
                    AbstractC3159y.f(path2);
                    if (o(path2)) {
                        return contentUri.getLastPathSegment();
                    }
                    return str;
                }
                return str;
            }
        } catch (Throwable th) {
            if (str == null && contentUri.getPath() != null) {
                String path3 = contentUri.getPath();
                AbstractC3159y.f(path3);
                if (o(path3)) {
                    contentUri.getLastPathSegment();
                }
            }
            throw th;
        }
    }

    public final long k(Context context, Uri uri) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(uri, "uri");
        long j8 = 0;
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, CampaignEx.JSON_KEY_AD_R);
            if (openFileDescriptor == null) {
                return 0L;
            }
            StructStatVfs fstatvfs = Os.fstatvfs(openFileDescriptor.getFileDescriptor());
            j8 = fstatvfs.f_bsize * fstatvfs.f_bavail;
            openFileDescriptor.close();
            return j8;
        } catch (Exception e8) {
            e8.printStackTrace();
            return j8;
        }
    }

    public final long l(Context context, DocumentFile documentFile) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(documentFile, "documentFile");
        Uri uri = documentFile.getUri();
        AbstractC3159y.h(uri, "documentFile.uri");
        return k(context, uri);
    }

    public final long m(PackageInfo pi) {
        long longVersionCode;
        AbstractC3159y.i(pi, "pi");
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = pi.getLongVersionCode();
            return longVersionCode;
        }
        return pi.versionCode;
    }

    public final Uri n(Context context) {
        AbstractC3159y.i(context, "context");
        List<UriPermission> persistedUriPermissions = context.getContentResolver().getPersistedUriPermissions();
        AbstractC3159y.h(persistedUriPermissions, "context.contentResolver.persistedUriPermissions");
        for (UriPermission uriPermission : persistedUriPermissions) {
            Uri uri = uriPermission.getUri();
            AbstractC3159y.h(uri, "permission.uri");
            if (q(uri)) {
                return uriPermission.getUri();
            }
        }
        return null;
    }

    public final boolean o(String path) {
        AbstractC3159y.i(path, "path");
        if (!g6.n.r(path, ".apk", false, 2, null) && !w.f7281b.a(path)) {
            return false;
        }
        return true;
    }

    public final boolean p(Context context, String packagename) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(packagename, "packagename");
        try {
            int applicationEnabledSetting = context.getPackageManager().getApplicationEnabledSetting(packagename);
            if (applicationEnabledSetting != 2 && applicationEnabledSetting != 3 && applicationEnabledSetting != 4) {
                return false;
            }
            return true;
        } catch (Error e8) {
            e8.printStackTrace();
            return false;
        } catch (Exception e9) {
            e9.printStackTrace();
            return false;
        }
    }

    public final boolean q(Uri uri) {
        AbstractC3159y.i(uri, "uri");
        String path = uri.getPath();
        String str = "[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]";
        String str2 = ".*\\b" + str + '-' + str + ":.*";
        if (path != null) {
            return new g6.j(str2).e(path);
        }
        return false;
    }

    public final boolean r(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        if (packageInfo != null) {
            applicationInfo = packageInfo.applicationInfo;
        } else {
            applicationInfo = null;
        }
        if (applicationInfo != null && (packageInfo.applicationInfo.flags & TsExtractor.TS_STREAM_TYPE_AC3) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        String str = Build.BRAND;
        String str2 = Build.MANUFACTURER;
        if (g6.n.s(str, "Xiaomi", true) || g6.n.s(str2, "Xiaomi", true) || g6.n.s(str, "Poco", true)) {
            return true;
        }
        return false;
    }
}
