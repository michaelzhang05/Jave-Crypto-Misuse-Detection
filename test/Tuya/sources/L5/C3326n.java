package l5;

import L5.I;
import X4.C1491a;
import X4.C1492b;
import X4.C1496f;
import X4.C1502l;
import X4.C1505o;
import X4.C1506p;
import X4.C1509t;
import X4.J;
import X4.O;
import X4.U;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: l5.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3326n extends SQLiteOpenHelper {

    /* renamed from: t, reason: collision with root package name */
    public static final a f34504t = new a(null);

    /* renamed from: u, reason: collision with root package name */
    private static C3326n f34505u;

    /* renamed from: a, reason: collision with root package name */
    private SQLiteDatabase f34506a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f34507b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f34508c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f34509d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f34510e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f34511f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f34512g;

    /* renamed from: h, reason: collision with root package name */
    private final String[] f34513h;

    /* renamed from: i, reason: collision with root package name */
    private final String[] f34514i;

    /* renamed from: j, reason: collision with root package name */
    private final String[] f34515j;

    /* renamed from: k, reason: collision with root package name */
    private final String[] f34516k;

    /* renamed from: l, reason: collision with root package name */
    private final String[] f34517l;

    /* renamed from: m, reason: collision with root package name */
    private final String[] f34518m;

    /* renamed from: n, reason: collision with root package name */
    private final String[] f34519n;

    /* renamed from: o, reason: collision with root package name */
    private final String[] f34520o;

    /* renamed from: p, reason: collision with root package name */
    private final String[] f34521p;

    /* renamed from: q, reason: collision with root package name */
    private final String[] f34522q;

    /* renamed from: r, reason: collision with root package name */
    private final String[] f34523r;

    /* renamed from: s, reason: collision with root package name */
    private final AtomicInteger f34524s;

    /* renamed from: l5.n$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final synchronized C3326n a(Context context) {
            C3326n c3326n;
            try {
                AbstractC3159y.i(context, "context");
                if (C3326n.f34505u == null) {
                    C3326n.f34505u = new C3326n(context.getApplicationContext());
                }
                c3326n = C3326n.f34505u;
                AbstractC3159y.f(c3326n);
            } catch (Throwable th) {
                throw th;
            }
            return c3326n;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C3326n(Context context) {
        super(context, "Uptodown.db", (SQLiteDatabase.CursorFactory) null, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID);
        this.f34507b = new String[]{"id", "name", "packagename", "versionCode", "issystemapp", "isSystemService", "urlFicha", "md5", "md5signature", "exclude", "size", "excludeFromTracking", "defaultName", "sha256", "positiveNotified", "appID", "hasOldVersions", "trackInfoRegistered"};
        this.f34508c = new String[]{"id", MBridgeConstans.APP_ID, "md5", "sha256", "size", MBridgeConstans.DYNAMIC_VIEW_WX_PATH};
        this.f34509d = new String[]{"packagename", "versionCode", "versionName", "size", "notified", "nameApkFile", "progress", "ignoreVersion", "filehash", "fileId"};
        this.f34510e = new String[]{"id", "packagename", "apk_name", "progress", "checked", "incomplete", "size", "downloadedSize", "md5", "versioncode", "attempts", "idPrograma", "downloadAnyway", "filehash", "fileId", "md5signature", "supportedAbis", "minsdk", "urlIcon", "appName"};
        this.f34511f = new String[]{"search", CampaignEx.JSON_KEY_TIMESTAMP};
        this.f34512g = new String[]{"id", MBridgeConstans.DYNAMIC_VIEW_WX_PATH};
        this.f34513h = new String[]{"id", CampaignEx.JSON_KEY_TIMESTAMP, CampaignEx.JSON_KEY_TITLE, NotificationCompat.CATEGORY_MESSAGE, "actions", "extra_info"};
        this.f34514i = new String[]{"id_program", "name", RewardPlus.ICON, "release_date", "notified"};
        this.f34515j = new String[]{"appId"};
        this.f34516k = new String[]{"appId"};
        this.f34517l = new String[]{"id", "id_program", "name", RewardPlus.ICON, "packagename", "can_download"};
        this.f34518m = new String[]{MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "date"};
        this.f34519n = new String[]{"id", "notificationId", "packagename", "versioncode", "type"};
        this.f34520o = new String[]{"id", "type", "packagename", "versionname_old", "versionname_new", "versioncode_old", "versioncode_new", "size", CampaignEx.JSON_KEY_TIMESTAMP};
        this.f34521p = new String[]{"id", "type", "json", CampaignEx.JSON_KEY_TIMESTAMP};
        this.f34522q = new String[]{"id", CampaignEx.JSON_KEY_TIMESTAMP, "filePath", "attempts"};
        this.f34523r = new String[]{"id", "json", CampaignEx.JSON_KEY_TIMESTAMP};
        this.f34524s = new AtomicInteger();
    }

    private final C1491a Q0(Cursor cursor) {
        int i8 = cursor.getInt(0);
        int i9 = cursor.getInt(1);
        String packageName = cursor.getString(2);
        String versionCode = cursor.getString(3);
        AbstractC3159y.h(packageName, "packageName");
        AbstractC3159y.h(versionCode, "versionCode");
        C1491a c1491a = new C1491a(packageName, Long.parseLong(versionCode));
        c1491a.i(i8);
        c1491a.h(i9);
        c1491a.j(C1491a.f12466f.a(cursor.getInt(4)));
        return c1491a;
    }

    private final C1496f R0(Cursor cursor) {
        C1496f c1496f = new C1496f();
        c1496f.y0(cursor.getLong(0));
        c1496f.C0(cursor.getString(1));
        c1496f.D0(cursor.getString(2));
        String string = cursor.getString(3);
        AbstractC3159y.h(string, "c.getString(columnIndex++)");
        c1496f.N0(Long.parseLong(string));
        c1496f.K0(cursor.getInt(4));
        c1496f.L0(cursor.getInt(5));
        c1496f.M0(cursor.getString(6));
        c1496f.A0(cursor.getString(7));
        c1496f.B0(cursor.getString(8));
        c1496f.t0(cursor.getInt(9));
        String string2 = cursor.getString(10);
        AbstractC3159y.h(string2, "c.getString(columnIndex++)");
        c1496f.I0(Long.parseLong(string2));
        c1496f.u0(cursor.getInt(11));
        c1496f.r0(cursor.getString(12));
        c1496f.G0(cursor.getString(13));
        c1496f.F0(cursor.getInt(14));
        c1496f.q0(cursor.getLong(15));
        c1496f.x0(cursor.getInt(16));
        return c1496f;
    }

    private final X4.r S0(Cursor cursor) {
        cursor.getInt(0);
        cursor.getInt(1);
        X4.r rVar = new X4.r();
        rVar.g(cursor.getString(2));
        rVar.h(cursor.getString(3));
        String string = cursor.getString(4);
        AbstractC3159y.h(string, "c.getString(columnIndex++)");
        rVar.i(Long.parseLong(string));
        rVar.f(cursor.getString(5));
        return rVar;
    }

    private final C1496f T0(Cursor cursor) {
        C1496f c1496f = new C1496f();
        c1496f.C0(cursor.getString(0));
        c1496f.D0(cursor.getString(1));
        String string = cursor.getString(2);
        AbstractC3159y.h(string, "c.getString(columnIndex++)");
        c1496f.N0(Long.parseLong(string));
        c1496f.K0(cursor.getInt(3));
        c1496f.M0(cursor.getString(4));
        c1496f.A0(cursor.getString(5));
        c1496f.B0(cursor.getString(6));
        c1496f.t0(cursor.getInt(7));
        String string2 = cursor.getString(8);
        AbstractC3159y.h(string2, "c.getString(columnIndex++)");
        c1496f.I0(Long.parseLong(string2));
        c1496f.u0(cursor.getInt(9));
        c1496f.r0(cursor.getString(10));
        c1496f.G0(cursor.getString(11));
        c1496f.F0(cursor.getInt(12));
        return c1496f;
    }

    private final C1505o U0(Cursor cursor) {
        C1505o c1505o = new C1505o();
        c1505o.y0(cursor.getInt(0));
        c1505o.E0(cursor.getString(1));
        c1505o.D0(cursor.getString(2));
        c1505o.F0(cursor.getInt(3));
        c1505o.s0(cursor.getInt(4));
        c1505o.z0(cursor.getInt(5));
        c1505o.G0(cursor.getLong(6));
        if (c1505o.a0() < 0) {
            c1505o.G0(0L);
        }
        c1505o.v0(cursor.getLong(7));
        c1505o.A0(cursor.getString(8));
        String string = cursor.getString(9);
        AbstractC3159y.h(string, "c.getString(columnIndex++)");
        c1505o.J0(Long.parseLong(string));
        c1505o.r0(cursor.getInt(10));
        c1505o.p0(cursor.getLong(11));
        c1505o.t0(cursor.getInt(12));
        c1505o.x0(cursor.getString(13));
        c1505o.w0(cursor.getString(14));
        c1505o.B0(cursor.getString(15));
        c1505o.H0(cursor.getString(16));
        c1505o.C0(cursor.getInt(17));
        c1505o.I0(cursor.getString(18));
        c1505o.q0(cursor.getString(19));
        return c1505o;
    }

    private final C1506p V0(Cursor cursor) {
        C1506p c1506p = new C1506p();
        c1506p.d(cursor.getLong(0));
        c1506p.e(cursor.getString(1));
        c1506p.f(cursor.getLong(2));
        return c1506p;
    }

    private final ArrayList W(SQLiteDatabase sQLiteDatabase) {
        this.f34506a = sQLiteDatabase;
        return f(new String[]{"name", "packagename", "versionCode", "issystemapp", "urlFicha", "md5", "md5signature", "exclude", "size", "excludeFromTracking", "defaultName", "sha256", "positiveNotified"});
    }

    private final C1509t W0(Cursor cursor) {
        C1509t c1509t = new C1509t();
        c1509t.g(cursor.getInt(0));
        c1509t.h(cursor.getString(1));
        c1509t.f(cursor.getString(2));
        c1509t.e(cursor.getInt(3));
        return c1509t;
    }

    private final X4.E X0(Cursor cursor) {
        X4.E e8 = new X4.E();
        e8.c(cursor.getString(0));
        e8.d(cursor.getString(1));
        return e8;
    }

    private final J Y0(Cursor cursor) {
        int i8 = cursor.getInt(0);
        String type = cursor.getString(1);
        String json = cursor.getString(2);
        String timestamp = cursor.getString(3);
        AbstractC3159y.h(type, "type");
        AbstractC3159y.h(json, "json");
        J j8 = new J(type, json);
        j8.g(i8);
        AbstractC3159y.h(timestamp, "timestamp");
        j8.h(Long.parseLong(timestamp));
        return j8;
    }

    private final O Z0(Cursor cursor) {
        String packagename = cursor.getString(0);
        AbstractC3159y.h(packagename, "packagename");
        O o8 = new O(packagename);
        String string = cursor.getString(1);
        AbstractC3159y.h(string, "c.getString(columnIndex++)");
        o8.Z(Long.parseLong(string));
        o8.a0(cursor.getString(2));
        String string2 = cursor.getString(3);
        AbstractC3159y.h(string2, "c.getString(columnIndex++)");
        o8.Y(Long.parseLong(string2));
        o8.V(cursor.getInt(4));
        o8.T(cursor.getString(5));
        o8.X(cursor.getInt(6));
        o8.L(cursor.getInt(7));
        o8.I(cursor.getString(8));
        o8.G(cursor.getString(9));
        return o8;
    }

    private final void e1(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1496f app = (C1496f) it.next();
            AbstractC3159y.h(app, "app");
            C0(app);
        }
    }

    private final ArrayList f(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("apps", strArr, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                arrayList.add(T0(cursor));
                while (cursor.moveToNext()) {
                    arrayList.add(T0(cursor));
                }
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    private final void f1(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            U w8 = (U) it.next();
            AbstractC3159y.h(w8, "w");
            P0(w8);
        }
    }

    private final ArrayList x1() {
        String[] strArr = {"id", "id_program", "name", RewardPlus.ICON, "packagename"};
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("wishlist", strArr, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                arrayList.add(U.f12455h.b(cursor));
                while (cursor.moveToNext()) {
                    arrayList.add(U.f12455h.b(cursor));
                }
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    private final ArrayList y0(SQLiteDatabase sQLiteDatabase) {
        this.f34506a = sQLiteDatabase;
        return x1();
    }

    private final I z0() {
        this.f34506a = getWritableDatabase();
        return I.f6487a;
    }

    public final int A(String name) {
        AbstractC3159y.i(name, "name");
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("downloads", "apk_name=?", new String[]{name});
    }

    public final void A0(C1491a activeNotification) {
        AbstractC3159y.i(activeNotification, "activeNotification");
        ContentValues contentValues = new ContentValues();
        contentValues.put("notificationId", Integer.valueOf(activeNotification.a()));
        contentValues.put("packagename", activeNotification.c());
        contentValues.put("versioncode", Long.valueOf(activeNotification.e()));
        contentValues.put("type", Integer.valueOf(activeNotification.d().ordinal()));
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.insert("active_notifications", null, contentValues);
    }

    public final void B0(C1492b activityLog) {
        AbstractC3159y.i(activityLog, "activityLog");
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(activityLog.d()));
        contentValues.put("packagename", activityLog.a());
        contentValues.put("versioncode_old", activityLog.g());
        contentValues.put("versioncode_new", activityLog.f());
        contentValues.put("versionname_old", activityLog.i());
        contentValues.put("versionname_new", activityLog.h());
        contentValues.put("size", activityLog.b());
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, activityLog.c());
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.insert("activity_log", null, contentValues);
    }

    public final C1496f C0(C1496f app) {
        AbstractC3159y.i(app, "app");
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", app.I());
        contentValues.put("packagename", app.Q());
        contentValues.put("versionCode", Long.valueOf(app.f0()));
        contentValues.put("issystemapp", Integer.valueOf(app.k0()));
        contentValues.put("isSystemService", Integer.valueOf(app.m0()));
        contentValues.put("urlFicha", app.e0());
        contentValues.put("md5", app.u());
        contentValues.put("md5signature", app.z());
        contentValues.put("exclude", Integer.valueOf(app.i()));
        contentValues.put("size", String.valueOf(app.Z()));
        contentValues.put("excludeFromTracking", Integer.valueOf(app.j()));
        contentValues.put("defaultName", app.e());
        contentValues.put("sha256", app.X());
        contentValues.put("positiveNotified", Integer.valueOf(app.V()));
        contentValues.put("appID", Long.valueOf(app.c()));
        contentValues.put("hasOldVersions", Integer.valueOf(app.n()));
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        app.y0(sQLiteDatabase.insert("apps", null, contentValues));
        return app;
    }

    public final long D0(long j8, X4.r appFile) {
        AbstractC3159y.i(appFile, "appFile");
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, String.valueOf(j8));
        contentValues.put("md5", appFile.b());
        contentValues.put("sha256", appFile.d());
        contentValues.put("size", String.valueOf(appFile.e()));
        contentValues.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, appFile.a());
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        return sQLiteDatabase.insert("app_files", null, contentValues);
    }

    public final int E(long j8) {
        String[] strArr = {String.valueOf(j8)};
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("events", "id=?", strArr);
    }

    public final void E0(C1502l deepLink) {
        AbstractC3159y.i(deepLink, "deepLink");
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, deepLink.e());
        contentValues.put("date", deepLink.a());
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.insert("deep_link_files", null, contentValues);
    }

    public final int F(String path) {
        AbstractC3159y.i(path, "path");
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("installable_files", "path=?", new String[]{path});
    }

    public final C1505o F0(C1505o download) {
        AbstractC3159y.i(download, "download");
        ContentValues contentValues = new ContentValues();
        contentValues.put("packagename", download.Y());
        contentValues.put("apk_name", download.X());
        contentValues.put("progress", Integer.valueOf(download.Z()));
        contentValues.put("checked", Integer.valueOf(download.k()));
        contentValues.put("incomplete", Integer.valueOf(download.I()));
        contentValues.put("size", Long.valueOf(download.a0()));
        contentValues.put("downloadedSize", Long.valueOf(download.o()));
        contentValues.put("md5", download.Q());
        contentValues.put("versioncode", Long.valueOf(download.e0()));
        contentValues.put("attempts", Integer.valueOf(download.j()));
        contentValues.put("idPrograma", Long.valueOf(download.f()));
        contentValues.put("downloadAnyway", Integer.valueOf(download.n()));
        contentValues.put("filehash", download.z());
        contentValues.put("fileId", download.u());
        contentValues.put("md5signature", download.T());
        contentValues.put("supportedAbis", download.b0());
        contentValues.put("minsdk", Integer.valueOf(download.V()));
        contentValues.put("urlIcon", download.d0());
        contentValues.put("appName", download.i());
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        download.y0((int) sQLiteDatabase.insert("downloads", null, contentValues));
        return download;
    }

    public final int G(int i8) {
        String[] strArr = {String.valueOf(i8)};
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("installationAttempts", "id=?", strArr);
    }

    public final void G0(C1506p event) {
        AbstractC3159y.i(event, "event");
        ContentValues contentValues = new ContentValues();
        contentValues.put("json", event.b());
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(event.c()));
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.insert("events", null, contentValues);
    }

    public final int H(int i8) {
        String[] strArr = {String.valueOf(i8)};
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("notifications", "id=?", strArr);
    }

    public final void H0(String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, str);
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.insert("installable_files", null, contentValues);
    }

    public final int I() {
        String[] strArr = {String.valueOf(System.currentTimeMillis() - 2592000000L)};
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("events", "timestamp < ?", strArr);
    }

    public final void I0(C1509t installationAttempt) {
        AbstractC3159y.i(installationAttempt, "installationAttempt");
        ContentValues contentValues = new ContentValues();
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, installationAttempt.d());
        contentValues.put("filePath", installationAttempt.b());
        contentValues.put("attempts", String.valueOf(installationAttempt.a()));
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.insert("installationAttempts", null, contentValues);
    }

    public final int J(int i8) {
        int k02 = k0(i8);
        if (k02 > 0) {
            String[] strArr = {String.valueOf(k02)};
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            return sQLiteDatabase.delete("notifications", "id<=?", strArr);
        }
        return 0;
    }

    public final void J0(X4.y notificationRegistry) {
        AbstractC3159y.i(notificationRegistry, "notificationRegistry");
        ContentValues contentValues = new ContentValues();
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, notificationRegistry.e());
        contentValues.put(CampaignEx.JSON_KEY_TITLE, notificationRegistry.f());
        contentValues.put(NotificationCompat.CATEGORY_MESSAGE, notificationRegistry.d());
        contentValues.put("actions", notificationRegistry.a());
        contentValues.put("extra_info", notificationRegistry.b());
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.insert("notifications", null, contentValues);
    }

    public final int K(String query) {
        AbstractC3159y.i(query, "query");
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("recent_searches", "search=?", new String[]{query});
    }

    public final void K0(O update) {
        AbstractC3159y.i(update, "update");
        if (u0(update.n()) == null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("packagename", update.n());
            contentValues.put("versionCode", Long.valueOf(update.u()));
            contentValues.put("versionName", update.z());
            contentValues.put("size", String.valueOf(update.s()));
            contentValues.put("notified", Integer.valueOf(update.k()));
            contentValues.put("nameApkFile", update.j());
            contentValues.put("progress", Integer.valueOf(update.o()));
            contentValues.put("ignoreVersion", Integer.valueOf(update.f()));
            contentValues.put("filehash", update.e());
            contentValues.put("fileId", update.c());
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            sQLiteDatabase.insert("updates", null, contentValues);
            return;
        }
        r1(update);
    }

    public final int L(String type) {
        AbstractC3159y.i(type, "type");
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("responses", "type=?", new String[]{type});
    }

    public final void L0(X4.D preRegister) {
        AbstractC3159y.i(preRegister, "preRegister");
        ContentValues contentValues = new ContentValues();
        contentValues.put("appId", Long.valueOf(preRegister.b()));
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.insert("preregistrations", null, contentValues);
    }

    public final int M(String packagename) {
        AbstractC3159y.i(packagename, "packagename");
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("updates", "packagename=?", new String[]{packagename});
    }

    public final void M0(X4.D preRegister) {
        AbstractC3159y.i(preRegister, "preRegister");
        ContentValues contentValues = new ContentValues();
        contentValues.put("appId", Long.valueOf(preRegister.b()));
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.insert("preregistrations_to_notify", null, contentValues);
    }

    public final void N() {
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.delete("updates", null, null);
    }

    public final void N0(X4.E recentSearch) {
        AbstractC3159y.i(recentSearch, "recentSearch");
        ContentValues contentValues = new ContentValues();
        contentValues.put("search", recentSearch.a());
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, recentSearch.b());
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.insert("recent_searches", null, contentValues);
    }

    public final C1491a O(int i8) {
        Cursor cursor;
        C1491a c1491a;
        try {
            String[] strArr = {String.valueOf(i8)};
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("active_notifications", this.f34519n, "notificationId=?", strArr, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                c1491a = Q0(cursor);
            } else {
                c1491a = null;
            }
            cursor.close();
            return c1491a;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final void O0(J response) {
        AbstractC3159y.i(response, "response");
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", response.e());
        contentValues.put("json", response.b());
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, String.valueOf(response.d()));
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.insert("responses", null, contentValues);
    }

    public final C1491a P(String packageName, long j8) {
        Cursor cursor;
        C1491a c1491a;
        AbstractC3159y.i(packageName, "packageName");
        try {
            String[] strArr = {packageName, String.valueOf(j8)};
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("active_notifications", this.f34519n, "packagename=? AND versioncode=?", strArr, null, null, null);
            try {
                if (cursor.moveToFirst()) {
                    c1491a = Q0(cursor);
                } else {
                    c1491a = null;
                }
                cursor.close();
                return c1491a;
            } catch (Exception e8) {
                e = e8;
                e.printStackTrace();
                if (cursor == null || cursor.isClosed()) {
                    return null;
                }
                cursor.close();
                return null;
            }
        } catch (Exception e9) {
            e = e9;
            cursor = null;
        }
    }

    public final void P0(U wishlist) {
        AbstractC3159y.i(wishlist, "wishlist");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id_program", Long.valueOf(wishlist.a()));
        contentValues.put("name", wishlist.e());
        contentValues.put(RewardPlus.ICON, wishlist.d());
        contentValues.put("packagename", wishlist.f());
        contentValues.put("can_download", Integer.valueOf(wishlist.b()));
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.insert("wishlist", null, contentValues);
    }

    public final C1491a Q(int i8) {
        Cursor cursor;
        C1491a c1491a;
        try {
            String[] strArr = {String.valueOf(i8)};
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("active_notifications", this.f34519n, "id=?", strArr, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                c1491a = Q0(cursor);
            } else {
                c1491a = null;
            }
            cursor.close();
            return c1491a;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final ArrayList R() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("active_notifications", this.f34519n, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                arrayList.add(Q0(cursor));
                while (cursor.moveToNext()) {
                    arrayList.add(Q0(cursor));
                }
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final C1496f S(String packagename) {
        Cursor cursor;
        C1496f c1496f;
        AbstractC3159y.i(packagename, "packagename");
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("apps", this.f34507b, "packagename=?", new String[]{packagename}, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                c1496f = R0(cursor);
            } else {
                c1496f = null;
            }
            cursor.close();
            return c1496f;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final ArrayList T(long j8) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            String[] strArr = {String.valueOf(j8)};
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("app_files", this.f34508c, "app_id=?", strArr, null, null, null);
            if (cursor.moveToFirst()) {
                arrayList.add(S0(cursor));
                while (cursor.moveToNext()) {
                    arrayList.add(S0(cursor));
                }
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final ArrayList U(C1496f app) {
        AbstractC3159y.i(app, "app");
        if (app.o() >= 0) {
            return T(app.o());
        }
        if (app.Q() != null) {
            String Q8 = app.Q();
            AbstractC3159y.f(Q8);
            C1496f S7 = S(Q8);
            if (S7 != null) {
                return T(S7.o());
            }
            return null;
        }
        return null;
    }

    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("apps", this.f34507b, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                arrayList.add(R0(cursor));
                while (cursor.moveToNext()) {
                    arrayList.add(R0(cursor));
                }
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final ArrayList X() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("deep_link_files", this.f34518m, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                C1502l c1502l = new C1502l();
                String string = cursor.getString(0);
                AbstractC3159y.h(string, "c.getString(0)");
                c1502l.h(string);
                String string2 = cursor.getString(1);
                AbstractC3159y.h(string2, "c.getString(1)");
                c1502l.f(string2);
                arrayList.add(c1502l);
            }
            while (cursor.moveToNext()) {
                C1502l c1502l2 = new C1502l();
                String string3 = cursor.getString(0);
                AbstractC3159y.h(string3, "c.getString(0)");
                c1502l2.h(string3);
                String string4 = cursor.getString(1);
                AbstractC3159y.h(string4, "c.getString(1)");
                c1502l2.f(string4);
                arrayList.add(c1502l2);
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final C1505o Y(String filename) {
        Cursor cursor;
        C1505o c1505o;
        AbstractC3159y.i(filename, "filename");
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("downloads", this.f34510e, "apk_name=?", new String[]{filename}, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                c1505o = U0(cursor);
            } else {
                c1505o = null;
            }
            cursor.close();
            return c1505o;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final C1505o Z(String fileId) {
        Cursor cursor;
        C1505o c1505o;
        AbstractC3159y.i(fileId, "fileId");
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("downloads", this.f34510e, "fileId=?", new String[]{fileId}, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                c1505o = U0(cursor);
            } else {
                c1505o = null;
            }
            cursor.close();
            return c1505o;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final synchronized void a() {
        if (this.f34524s.incrementAndGet() == 1) {
            C3326n c3326n = f34505u;
            AbstractC3159y.f(c3326n);
            c3326n.z0();
        }
    }

    public final C1505o a0(String packagename) {
        Cursor cursor;
        C1505o c1505o;
        AbstractC3159y.i(packagename, "packagename");
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("downloads", this.f34510e, "packagename=?", new String[]{packagename}, null, null, "versioncode DESC");
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                c1505o = U0(cursor);
            } else {
                c1505o = null;
            }
            cursor.close();
            return c1505o;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final int a1() {
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("preregistrations", null, null);
    }

    public final C1505o b0(String packagename, long j8) {
        Cursor cursor;
        C1505o c1505o;
        AbstractC3159y.i(packagename, "packagename");
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("downloads", this.f34510e, "packagename=? AND versioncode=?", new String[]{packagename, String.valueOf(j8)}, null, null, null);
            try {
                if (cursor.moveToFirst()) {
                    c1505o = U0(cursor);
                } else {
                    c1505o = null;
                }
                cursor.close();
                return c1505o;
            } catch (Exception e8) {
                e = e8;
                e.printStackTrace();
                if (cursor == null || cursor.isClosed()) {
                    return null;
                }
                cursor.close();
                return null;
            }
        } catch (Exception e9) {
            e = e9;
            cursor = null;
        }
    }

    public final int b1(long j8) {
        String[] strArr = {String.valueOf(j8)};
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("preregistrations", "appId=?", strArr);
    }

    public final ArrayList c0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("downloads", this.f34510e, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                arrayList.add(U0(cursor));
            }
            while (cursor.moveToNext()) {
                arrayList.add(U0(cursor));
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final int c1(long j8) {
        String[] strArr = {String.valueOf(j8)};
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("preregistrations_to_notify", "appId=?", strArr);
    }

    public final ArrayList d0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("events", this.f34523r, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                arrayList.add(V0(cursor));
                while (cursor.moveToNext()) {
                    arrayList.add(V0(cursor));
                }
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final int d1(long j8) {
        String[] strArr = {String.valueOf(j8)};
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("wishlist", "id_program=?", strArr);
    }

    public final ArrayList e0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("installable_files", this.f34512g, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                arrayList.add(cursor.getString(1));
            }
            while (cursor.moveToNext()) {
                arrayList.add(cursor.getString(1));
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final C1509t f0(String filePath) {
        C1509t c1509t;
        Cursor query;
        AbstractC3159y.i(filePath, "filePath");
        Cursor cursor = null;
        r0 = null;
        C1509t c1509t2 = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            query = sQLiteDatabase.query("installationAttempts", this.f34522q, "filePath=?", new String[]{filePath}, null, null, null);
        } catch (Exception e8) {
            e = e8;
            c1509t = null;
        }
        try {
            if (query.moveToFirst()) {
                c1509t2 = W0(query);
            }
            query.close();
            return c1509t2;
        } catch (Exception e9) {
            e = e9;
            C1509t c1509t3 = c1509t2;
            cursor = query;
            c1509t = c1509t3;
            e.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            return c1509t;
        }
    }

    public final synchronized void g() {
        try {
            if (this.f34524s.decrementAndGet() == 0) {
                C3326n c3326n = f34505u;
                AbstractC3159y.f(c3326n);
                c3326n.close();
            } else if (this.f34524s.get() < 0) {
                this.f34524s.set(0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final ArrayList g0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("installationAttempts", this.f34522q, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                arrayList.add(W0(cursor));
                while (cursor.moveToNext()) {
                    arrayList.add(W0(cursor));
                }
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final C1505o g1(int i8) {
        Cursor cursor;
        C1505o c1505o;
        try {
            String[] strArr = {String.valueOf(i8)};
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("downloads", this.f34510e, "id=?", strArr, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                c1505o = U0(cursor);
            } else {
                c1505o = null;
            }
            cursor.close();
            return c1505o;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final int h() {
        int i8 = 0;
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.rawQuery("SELECT COUNT(id) AS count FROM notifications", null);
            if (cursor.moveToFirst()) {
                i8 = cursor.getInt(0);
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return i8;
    }

    public final X4.y h0() {
        X4.y yVar;
        Cursor cursor = null;
        r0 = null;
        X4.y yVar2 = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            Cursor query = sQLiteDatabase.query("notifications", this.f34513h, "actions=?", new String[]{"update_uptodown"}, null, null, "id DESC");
            try {
                if (query.moveToFirst()) {
                    X4.y yVar3 = new X4.y();
                    yVar3.g(query);
                    yVar2 = yVar3;
                }
                query.close();
                return yVar2;
            } catch (Exception e8) {
                e = e8;
                yVar = yVar2;
                cursor = query;
                e.printStackTrace();
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                return yVar;
            }
        } catch (Exception e9) {
            e = e9;
            yVar = null;
        }
    }

    public final void h1() {
        ContentValues contentValues = new ContentValues();
        contentValues.putNull("urlFicha");
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.update("apps", contentValues, null, null);
    }

    public final int i0() {
        Exception e8;
        int i8;
        int i9 = 0;
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("active_notifications", new String[]{"notificationId"}, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                i8 = cursor.getInt(0);
                while (cursor.moveToNext()) {
                    try {
                        int i10 = cursor.getInt(0);
                        if (i10 > i8) {
                            i8 = i10;
                        }
                    } catch (Exception e9) {
                        e8 = e9;
                        e8.printStackTrace();
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        return i8;
                    }
                }
                i9 = i8;
            }
            try {
                cursor.close();
                return i9;
            } catch (Exception e10) {
                i8 = i9;
                e8 = e10;
                e8.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
                return i8;
            }
        } catch (Exception e11) {
            e8 = e11;
            i8 = 0;
        }
    }

    public final void i1() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("checked", (Integer) 1);
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.update("downloads", contentValues, null, null);
    }

    public final int j0() {
        String[] strArr = {"id"};
        int i8 = 0;
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("apps", strArr, "trackInfoRegistered=0", null, null, null, null);
            i8 = cursor.getCount();
            cursor.close();
            return i8;
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
                return i8;
            }
            return i8;
        }
    }

    public final void j1(C1496f app) {
        AbstractC3159y.i(app, "app");
        ContentValues contentValues = new ContentValues();
        contentValues.put("exclude", Integer.valueOf(app.i()));
        String[] strArr = {app.Q()};
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.update("apps", contentValues, "packagename=?", strArr);
    }

    public final int k0(int i8) {
        int i9 = 0;
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.rawQuery("SELECT id FROM notifications ORDER BY id DESC LIMIT " + i8 + ",1", null);
            if (cursor.moveToFirst()) {
                i9 = cursor.getInt(0);
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return i9;
    }

    public final void k1() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("trackInfoRegistered", (Integer) 1);
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.update("apps", contentValues, null, null);
    }

    public final int l(C1491a activeNotification) {
        AbstractC3159y.i(activeNotification, "activeNotification");
        if (activeNotification.b() > -1) {
            String[] strArr = {String.valueOf(activeNotification.b())};
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            return sQLiteDatabase.delete("active_notifications", "id=?", strArr);
        }
        if (activeNotification.a() > -1) {
            String[] strArr2 = {String.valueOf(activeNotification.a())};
            SQLiteDatabase sQLiteDatabase2 = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase2);
            return sQLiteDatabase2.delete("active_notifications", "notificationId=?", strArr2);
        }
        if (activeNotification.c().length() > 0) {
            String[] strArr3 = {activeNotification.c()};
            SQLiteDatabase sQLiteDatabase3 = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase3);
            return sQLiteDatabase3.delete("active_notifications", "packagename=?", strArr3);
        }
        return 0;
    }

    public final ArrayList l0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("notifications", this.f34513h, null, null, null, null, "id DESC");
            if (cursor.moveToFirst()) {
                X4.y yVar = new X4.y();
                yVar.g(cursor);
                arrayList.add(yVar);
            }
            while (cursor.moveToNext()) {
                X4.y yVar2 = new X4.y();
                yVar2.g(cursor);
                arrayList.add(yVar2);
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final void l1(C1491a activeNotification) {
        AbstractC3159y.i(activeNotification, "activeNotification");
        String[] strArr = {String.valueOf(activeNotification.b())};
        ContentValues contentValues = new ContentValues();
        contentValues.put("notificationId", Integer.valueOf(activeNotification.a()));
        contentValues.put("packagename", activeNotification.c());
        contentValues.put("versioncode", Long.valueOf(activeNotification.e()));
        contentValues.put("type", Integer.valueOf(activeNotification.d().ordinal()));
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.update("active_notifications", contentValues, "id=?", strArr);
    }

    public final int m() {
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("notifications", null, null);
    }

    public final ArrayList m0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("notifications", this.f34513h, "actions=?", new String[]{"upcoming_release"}, null, null, null);
            if (cursor.moveToFirst()) {
                X4.y yVar = new X4.y();
                yVar.g(cursor);
                arrayList.add(yVar);
            }
            while (cursor.moveToNext()) {
                X4.y yVar2 = new X4.y();
                yVar2.g(cursor);
                arrayList.add(yVar2);
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final void m1(C1496f app) {
        AbstractC3159y.i(app, "app");
        ContentValues contentValues = new ContentValues();
        if (app.I() != null) {
            contentValues.put("name", app.I());
        }
        if (app.f0() > 0) {
            contentValues.put("versionCode", Long.valueOf(app.f0()));
        }
        contentValues.put("issystemapp", Integer.valueOf(app.k0()));
        contentValues.put("isSystemService", Integer.valueOf(app.m0()));
        if (app.e0() != null) {
            contentValues.put("urlFicha", app.e0());
        }
        if (app.u() != null) {
            contentValues.put("md5", app.u());
        }
        if (app.z() != null) {
            contentValues.put("md5signature", app.z());
        }
        contentValues.put("exclude", Integer.valueOf(app.i()));
        contentValues.put("size", String.valueOf(app.Z()));
        contentValues.put("excludeFromTracking", Integer.valueOf(app.j()));
        if (app.e() != null) {
            contentValues.put("defaultName", app.e());
        }
        if (app.X() != null) {
            contentValues.put("sha256", app.X());
        }
        contentValues.put("positiveNotified", Integer.valueOf(app.V()));
        contentValues.put("appID", Long.valueOf(app.c()));
        contentValues.put("hasOldVersions", Integer.valueOf(app.n()));
        String[] strArr = {app.Q()};
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.update("apps", contentValues, "packagename=?", strArr);
    }

    public final X4.D n0(long j8) {
        Cursor cursor;
        X4.D d8;
        try {
            String[] strArr = {String.valueOf(j8)};
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("preregistrations", this.f34515j, "appId=?", strArr, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                d8 = X4.D.f12335f.c(cursor);
            } else {
                d8 = null;
            }
            cursor.close();
            return d8;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final void n1(C1496f app) {
        AbstractC3159y.i(app, "app");
        ContentValues contentValues = new ContentValues();
        contentValues.put("excludeFromTracking", Integer.valueOf(app.j()));
        String[] strArr = {app.Q()};
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.update("apps", contentValues, "packagename=?", strArr);
    }

    public final int o() {
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("responses", null, null);
    }

    public final X4.D o0(long j8) {
        Cursor cursor;
        X4.D d8;
        try {
            String[] strArr = {String.valueOf(j8)};
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("preregistrations_to_notify", this.f34516k, "appId=?", strArr, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                d8 = X4.D.f12335f.c(cursor);
            } else {
                d8 = null;
            }
            cursor.close();
            return d8;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final int o1(X4.r appFile) {
        AbstractC3159y.i(appFile, "appFile");
        ContentValues contentValues = new ContentValues();
        contentValues.put("md5", appFile.b());
        contentValues.put("sha256", appFile.d());
        String[] strArr = {appFile.a()};
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        return sQLiteDatabase.update("app_files", contentValues, "path=?", strArr);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase mSQLiteDatabase) {
        AbstractC3159y.i(mSQLiteDatabase, "mSQLiteDatabase");
        this.f34506a = mSQLiteDatabase;
        AbstractC3159y.f(mSQLiteDatabase);
        mSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS updates(id integer primary key autoincrement, packagename text, versionCode text, versionName text, size text, notified integer default 0, nameApkFile text, progress integer default 0, ignoreVersion integer default 0, filehash text, fileId text);");
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS apps( id integer primary key autoincrement, name text, packagename text, versionCode text, issystemapp integer default 0, isSystemService integer default 0, urlFicha text, md5 text, md5signature text, exclude integer default 0, size text, excludeFromTracking integer default 0, defaultName text, sha256 text, positiveNotified integer default 0, appID integer default 0, hasOldVersions integer default 0, trackInfoRegistered integer default 0);");
        SQLiteDatabase sQLiteDatabase2 = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase2);
        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS app_files( id integer primary key autoincrement, app_id integer, md5 text, sha256 text, size text, path text);");
        SQLiteDatabase sQLiteDatabase3 = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase3);
        sQLiteDatabase3.execSQL("CREATE TABLE IF NOT EXISTS downloads(id integer primary key autoincrement, packagename text, apk_name text, progress integer default 0, checked integer default 0, incomplete integer default 0, size integer default 0, downloadedSize integer default 0, md5 text, versioncode integer default 0, attempts integer default 0, idPrograma integer default 0, downloadAnyway integer default 0, filehash text, fileId integer default 0, md5signature text, supportedAbis text, minsdk integer default 0, urlIcon text, appName text);");
        SQLiteDatabase sQLiteDatabase4 = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase4);
        sQLiteDatabase4.execSQL("CREATE TABLE IF NOT EXISTS recent_searches(id integer primary key autoincrement, search text unique, timestamp text);");
        SQLiteDatabase sQLiteDatabase5 = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase5);
        sQLiteDatabase5.execSQL("CREATE TABLE IF NOT EXISTS installable_files(id integer primary key autoincrement, path text);");
        SQLiteDatabase sQLiteDatabase6 = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase6);
        sQLiteDatabase6.execSQL("CREATE TABLE IF NOT EXISTS notifications(id integer primary key autoincrement, timestamp text, title text, msg text, actions text, extra_info text);");
        SQLiteDatabase sQLiteDatabase7 = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase7);
        sQLiteDatabase7.execSQL("CREATE TABLE IF NOT EXISTS upcoming_releases(id integer primary key autoincrement, id_program integer, name text, icon text, release_date text, notified integer);");
        SQLiteDatabase sQLiteDatabase8 = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase8);
        sQLiteDatabase8.execSQL("CREATE TABLE IF NOT EXISTS wishlist(id integer primary key autoincrement, id_program integer, name text, icon text, packagename text, can_download integer);");
        SQLiteDatabase sQLiteDatabase9 = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase9);
        sQLiteDatabase9.execSQL("CREATE TABLE IF NOT EXISTS deep_link_files(id integer primary key autoincrement, path text, date text);");
        SQLiteDatabase sQLiteDatabase10 = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase10);
        sQLiteDatabase10.execSQL("CREATE TABLE IF NOT EXISTS active_notifications(id integer primary key autoincrement, notificationId integer, packagename text, versioncode integer, type integer);");
        SQLiteDatabase sQLiteDatabase11 = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase11);
        sQLiteDatabase11.execSQL("CREATE TABLE IF NOT EXISTS activity_log(id integer primary key autoincrement, type integer, packagename text, versionname_old text, versionname_new text, versioncode_old text, versioncode_new text, size text, timestamp text);");
        SQLiteDatabase sQLiteDatabase12 = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase12);
        sQLiteDatabase12.execSQL("CREATE TABLE IF NOT EXISTS responses(id integer primary key autoincrement, type integer, json text, timestamp text);");
        SQLiteDatabase sQLiteDatabase13 = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase13);
        sQLiteDatabase13.execSQL("CREATE TABLE IF NOT EXISTS installationAttempts(id integer primary key autoincrement, timestamp text, filePath text, attempts integer);");
        SQLiteDatabase sQLiteDatabase14 = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase14);
        sQLiteDatabase14.execSQL("CREATE TABLE IF NOT EXISTS events(id integer primary key autoincrement, json text, timestamp integer);");
        SQLiteDatabase sQLiteDatabase15 = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase15);
        sQLiteDatabase15.execSQL("CREATE TABLE IF NOT EXISTS preregistrations(id integer primary key autoincrement, appId integer);");
        SQLiteDatabase sQLiteDatabase16 = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase16);
        sQLiteDatabase16.execSQL("CREATE TABLE IF NOT EXISTS preregistrations_to_notify(id integer primary key autoincrement, appId integer);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i8, int i9) {
        AbstractC3159y.i(sqLiteDatabase, "sqLiteDatabase");
        if (i8 < 387) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS downloads");
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS downloads(id integer primary key autoincrement, packagename text, apk_name text, progress integer default 0, checked integer default 0, incomplete integer default 0, size integer default 0, downloadedSize integer default 0, md5 text, versioncode integer default 0, attempts integer default 0, idPrograma integer default 0, downloadAnyway integer default 0, filehash text, fileId integer default 0, md5signature text, supportedAbis text, minsdk integer default 0, urlIcon text, appName text);");
        }
        if (i8 < 318) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS recent_searches(id integer primary key autoincrement, search text unique, timestamp text);");
        }
        if (i8 < 393) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS installable_files(id integer primary key autoincrement, path text);");
        }
        if (i8 < 442) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS notifications(id integer primary key autoincrement, timestamp text, title text, msg text, actions text, extra_info text);");
        }
        if (i8 < 450) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS upcoming_releases(id integer primary key autoincrement, id_program integer, name text, icon text, release_date text, notified integer);");
        }
        if (i8 < 451) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS wishlist(id integer primary key autoincrement, id_program integer, name text, icon text, packagename text, can_download integer);");
        } else if (i8 < 455) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS wishlist");
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS wishlist(id integer primary key autoincrement, id_program integer, name text, icon text, packagename text, can_download integer);");
        }
        if (i8 < 471) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS app_files( id integer primary key autoincrement, app_id integer, md5 text, sha256 text, size text, path text);");
        }
        if (i8 < 484) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS deep_link_files(id integer primary key autoincrement, path text, date text);");
        }
        if (i8 < 487) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS deep_link_files");
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS deep_link_files(id integer primary key autoincrement, path text, date text);");
        }
        if (i8 < 508) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS active_notifications(id integer primary key autoincrement, notificationId integer, packagename text, versioncode integer, type integer);");
        }
        if (i8 < 512) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS activity_log(id integer primary key autoincrement, type integer, packagename text, versionname_old text, versionname_new text, versioncode_old text, versioncode_new text, size text, timestamp text);");
        }
        if (i8 < 544) {
            ArrayList W7 = W(sqLiteDatabase);
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS apps");
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS apps( id integer primary key autoincrement, name text, packagename text, versionCode text, issystemapp integer default 0, isSystemService integer default 0, urlFicha text, md5 text, md5signature text, exclude integer default 0, size text, excludeFromTracking integer default 0, defaultName text, sha256 text, positiveNotified integer default 0, appID integer default 0, hasOldVersions integer default 0, trackInfoRegistered integer default 0);");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS app_files");
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS app_files( id integer primary key autoincrement, app_id integer, md5 text, sha256 text, size text, path text);");
            e1(W7);
        }
        if (i8 < 550) {
            ArrayList y02 = y0(sqLiteDatabase);
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS wishlist");
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS wishlist(id integer primary key autoincrement, id_program integer, name text, icon text, packagename text, can_download integer);");
            f1(y02);
        }
        if (i8 < 553) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS responses(id integer primary key autoincrement, type integer, json text, timestamp text);");
        }
        if (i8 < 556) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS installationAttempts(id integer primary key autoincrement, timestamp text, filePath text, attempts integer);");
        }
        if (i8 < 574) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS downloads");
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS downloads(id integer primary key autoincrement, packagename text, apk_name text, progress integer default 0, checked integer default 0, incomplete integer default 0, size integer default 0, downloadedSize integer default 0, md5 text, versioncode integer default 0, attempts integer default 0, idPrograma integer default 0, downloadAnyway integer default 0, filehash text, fileId integer default 0, md5signature text, supportedAbis text, minsdk integer default 0, urlIcon text, appName text);");
        }
        if (i8 < 576) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events(id integer primary key autoincrement, json text, timestamp integer);");
        }
        if (i8 < 580) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS preregistrations(id integer primary key autoincrement, appId integer);");
        }
        if (i8 < 589) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS preregistrations_to_notify(id integer primary key autoincrement, appId integer);");
        }
        if (i8 < 612) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS app_files");
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS app_files( id integer primary key autoincrement, app_id integer, md5 text, sha256 text, size text, path text);");
        }
    }

    public final ArrayList p0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("preregistrations", this.f34515j, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                X4.D d8 = new X4.D();
                d8.f(cursor);
                arrayList.add(d8);
            }
            while (cursor.moveToNext()) {
                X4.D d9 = new X4.D();
                d9.f(cursor);
                arrayList.add(d9);
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final void p1(C1496f app) {
        AbstractC3159y.i(app, "app");
        ContentValues contentValues = new ContentValues();
        if (app.u() != null) {
            contentValues.put("md5", app.u());
        }
        contentValues.put("size", String.valueOf(app.Z()));
        String[] strArr = {app.Q()};
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.update("apps", contentValues, "packagename=?", strArr);
    }

    public final ArrayList q0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("preregistrations_to_notify", this.f34516k, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                X4.D d8 = new X4.D();
                d8.f(cursor);
                arrayList.add(d8);
            }
            while (cursor.moveToNext()) {
                X4.D d9 = new X4.D();
                d9.f(cursor);
                arrayList.add(d9);
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final void q1(C1496f app) {
        AbstractC3159y.i(app, "app");
        ContentValues contentValues = new ContentValues();
        if (app.X() != null) {
            contentValues.put("sha256", app.X());
        }
        String[] strArr = {app.Q()};
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.update("apps", contentValues, "packagename=?", strArr);
    }

    public final void r(C1496f appToDelete) {
        AbstractC3159y.i(appToDelete, "appToDelete");
        if (appToDelete.o() < 0) {
            String Q8 = appToDelete.Q();
            AbstractC3159y.f(Q8);
            C1496f S7 = S(Q8);
            if (S7 != null) {
                appToDelete.y0(S7.o());
            }
        }
        String[] strArr = {appToDelete.Q()};
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.delete("apps", "packagename=?", strArr);
        String[] strArr2 = {String.valueOf(appToDelete.o())};
        SQLiteDatabase sQLiteDatabase2 = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase2);
        sQLiteDatabase2.delete("app_files", "app_id=?", strArr2);
    }

    public final ArrayList r0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("recent_searches", this.f34511f, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                arrayList.add(X0(cursor));
            }
            while (cursor.moveToNext()) {
                arrayList.add(X0(cursor));
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final void r1(O update) {
        AbstractC3159y.i(update, "update");
        ContentValues contentValues = new ContentValues();
        contentValues.put("versionCode", Long.valueOf(update.u()));
        contentValues.put("versionName", update.z());
        contentValues.put("size", String.valueOf(update.s()));
        contentValues.put("notified", Integer.valueOf(update.k()));
        contentValues.put("nameApkFile", update.j());
        contentValues.put("progress", Integer.valueOf(update.o()));
        contentValues.put("ignoreVersion", Integer.valueOf(update.f()));
        contentValues.put("filehash", update.e());
        contentValues.put("fileId", update.c());
        String[] strArr = {update.n()};
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.update("updates", contentValues, "packagename=?", strArr);
    }

    public final J s0(String type) {
        J j8;
        Cursor query;
        AbstractC3159y.i(type, "type");
        Cursor cursor = null;
        r0 = null;
        J j9 = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            query = sQLiteDatabase.query("responses", this.f34521p, "type=?", new String[]{type}, null, null, null);
        } catch (Exception e8) {
            e = e8;
            j8 = null;
        }
        try {
            if (query.moveToFirst()) {
                j9 = Y0(query);
            }
            query.close();
            return j9;
        } catch (Exception e9) {
            e = e9;
            J j10 = j9;
            cursor = query;
            j8 = j10;
            e.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            return j8;
        }
    }

    public final int s1(C1505o download) {
        AbstractC3159y.i(download, "download");
        ContentValues contentValues = new ContentValues();
        contentValues.put("packagename", download.Y());
        contentValues.put("apk_name", download.X());
        contentValues.put("progress", Integer.valueOf(download.Z()));
        contentValues.put("checked", Integer.valueOf(download.k()));
        contentValues.put("incomplete", Integer.valueOf(download.I()));
        contentValues.put("size", Long.valueOf(download.a0()));
        contentValues.put("downloadedSize", Long.valueOf(download.o()));
        contentValues.put("md5", download.Q());
        contentValues.put("versioncode", Long.valueOf(download.e0()));
        contentValues.put("attempts", Integer.valueOf(download.j()));
        contentValues.put("idPrograma", Long.valueOf(download.f()));
        contentValues.put("downloadAnyway", Integer.valueOf(download.n()));
        contentValues.put("filehash", download.z());
        contentValues.put("fileId", download.u());
        contentValues.put("md5signature", download.T());
        contentValues.put("supportedAbis", download.b0());
        contentValues.put("minsdk", Integer.valueOf(download.V()));
        contentValues.put("urlIcon", download.d0());
        contentValues.put("appName", download.i());
        if (download.G() >= 0) {
            String[] strArr = {String.valueOf(download.G())};
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            return sQLiteDatabase.update("downloads", contentValues, "id=?", strArr);
        }
        if (download.u() != null) {
            String u8 = download.u();
            AbstractC3159y.f(u8);
            if (u8.length() > 0) {
                String[] strArr2 = {String.valueOf(download.u())};
                SQLiteDatabase sQLiteDatabase2 = this.f34506a;
                AbstractC3159y.f(sQLiteDatabase2);
                return sQLiteDatabase2.update("downloads", contentValues, "fileId=?", strArr2);
            }
        }
        if (download.Y() != null && download.e0() > 0) {
            String[] strArr3 = {download.Y(), String.valueOf(download.e0())};
            SQLiteDatabase sQLiteDatabase3 = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase3);
            return sQLiteDatabase3.update("downloads", contentValues, "packagename=? AND versioncode=?", strArr3);
        }
        if (download.X() != null) {
            String[] strArr4 = {download.X()};
            SQLiteDatabase sQLiteDatabase4 = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase4);
            return sQLiteDatabase4.update("downloads", contentValues, "apk_name=?", strArr4);
        }
        return 0;
    }

    public final void t(String packagename) {
        AbstractC3159y.i(packagename, "packagename");
        C1496f S7 = S(packagename);
        if (S7 != null) {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            sQLiteDatabase.delete("apps", "packagename=?", new String[]{packagename});
            String[] strArr = {String.valueOf(S7.o())};
            SQLiteDatabase sQLiteDatabase2 = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase2);
            sQLiteDatabase2.delete("app_files", "app_id=?", strArr);
        }
    }

    public final X4.D t0(long j8) {
        Cursor cursor;
        X4.D d8;
        try {
            String[] strArr = {String.valueOf(j8)};
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("upcoming_releases", this.f34514i, "id_program=?", strArr, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                d8 = X4.D.f12335f.d(cursor);
            } else {
                d8 = null;
            }
            cursor.close();
            return d8;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final int t1(C1509t installationAttempt) {
        AbstractC3159y.i(installationAttempt, "installationAttempt");
        String[] strArr = {String.valueOf(installationAttempt.c())};
        ContentValues contentValues = new ContentValues();
        contentValues.put("attempts", String.valueOf(installationAttempt.a()));
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, installationAttempt.d());
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        return sQLiteDatabase.update("installationAttempts", contentValues, "id=?", strArr);
    }

    public final void u(X4.r appFile) {
        AbstractC3159y.i(appFile, "appFile");
        if (appFile.b() != null) {
            String[] strArr = {appFile.b()};
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            sQLiteDatabase.delete("app_files", "md5=?", strArr);
            return;
        }
        if (appFile.d() != null) {
            String[] strArr2 = {appFile.d()};
            SQLiteDatabase sQLiteDatabase2 = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase2);
            sQLiteDatabase2.delete("app_files", "sha256=?", strArr2);
            return;
        }
        if (appFile.a() != null) {
            String[] strArr3 = {appFile.a()};
            SQLiteDatabase sQLiteDatabase3 = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase3);
            sQLiteDatabase3.delete("app_files", "path=?", strArr3);
        }
    }

    public final O u0(String packagename) {
        Cursor cursor;
        O o8;
        AbstractC3159y.i(packagename, "packagename");
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("updates", this.f34509d, "packagename=?", new String[]{packagename}, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                o8 = Z0(cursor);
            } else {
                o8 = null;
            }
            cursor.close();
            return o8;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }

    public final void u1(X4.y notification, String notificationActions, String notificationMsg) {
        AbstractC3159y.i(notification, "notification");
        AbstractC3159y.i(notificationActions, "notificationActions");
        AbstractC3159y.i(notificationMsg, "notificationMsg");
        ContentValues contentValues = new ContentValues();
        contentValues.put("actions", notificationActions);
        contentValues.put(NotificationCompat.CATEGORY_MESSAGE, notificationMsg);
        String[] strArr = {String.valueOf(notification.c())};
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.update("notifications", contentValues, "id=?", strArr);
    }

    public final ArrayList v0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("updates", this.f34509d, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                arrayList.add(Z0(cursor));
            }
            while (cursor.moveToNext()) {
                arrayList.add(Z0(cursor));
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final void v1(String packagename, long j8, int i8) {
        AbstractC3159y.i(packagename, "packagename");
        ContentValues contentValues = new ContentValues();
        contentValues.put("appID", Long.valueOf(j8));
        contentValues.put("hasOldVersions", Integer.valueOf(i8));
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.update("apps", contentValues, "packagename=?", new String[]{packagename});
    }

    public final int w(String path) {
        AbstractC3159y.i(path, "path");
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        return sQLiteDatabase.delete("deep_link_files", "path=?", new String[]{path});
    }

    public final ArrayList w0() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("wishlist", this.f34517l, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                U u8 = new U();
                u8.g(cursor);
                arrayList.add(u8);
            }
            while (cursor.moveToNext()) {
                U u9 = new U();
                u9.g(cursor);
                arrayList.add(u9);
            }
            cursor.close();
        } catch (Exception e8) {
            e8.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
        return arrayList;
    }

    public final void w1(long j8, int i8) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("can_download", Integer.valueOf(i8));
        String[] strArr = {String.valueOf(j8)};
        SQLiteDatabase sQLiteDatabase = this.f34506a;
        AbstractC3159y.f(sQLiteDatabase);
        sQLiteDatabase.update("wishlist", contentValues, "id_program=?", strArr);
    }

    public final int x(C1505o c1505o) {
        if (c1505o != null) {
            String[] strArr = {String.valueOf(c1505o.G())};
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            return sQLiteDatabase.delete("downloads", "id=?", strArr);
        }
        return 0;
    }

    public final U x0(long j8) {
        Cursor cursor;
        U u8;
        try {
            String[] strArr = {String.valueOf(j8)};
            SQLiteDatabase sQLiteDatabase = this.f34506a;
            AbstractC3159y.f(sQLiteDatabase);
            cursor = sQLiteDatabase.query("wishlist", this.f34517l, "id_program=?", strArr, null, null, null);
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                u8 = U.f12455h.a(cursor);
            } else {
                u8 = null;
            }
            cursor.close();
            return u8;
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace();
            if (cursor == null || cursor.isClosed()) {
                return null;
            }
            cursor.close();
            return null;
        }
    }
}
