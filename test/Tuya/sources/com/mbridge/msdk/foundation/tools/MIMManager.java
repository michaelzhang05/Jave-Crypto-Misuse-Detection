package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class MIMManager {

    /* renamed from: a */
    private static volatile String f19939a;

    /* renamed from: b */
    private final AtomicBoolean f19940b;

    /* renamed from: c */
    private int f19941c;

    /* renamed from: d */
    private CopyOnWriteArrayList<CampaignEx> f19942d;

    /* renamed from: e */
    private Context f19943e;

    /* renamed from: f */
    private volatile Boolean f19944f;

    /* renamed from: g */
    private CampaignEx f19945g;

    /* renamed from: h */
    private volatile b f19946h;

    /* renamed from: i */
    private volatile MiOverseaMiniCardBroadcasterReceiver f19947i;

    /* renamed from: com.mbridge.msdk.foundation.tools.MIMManager$1 */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f19948a;

        AnonymousClass1(Context context) {
            r2 = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (MIMManager.this.f19940b.compareAndSet(false, true)) {
                try {
                    MIMManager mIMManager = MIMManager.this;
                    mIMManager.f19944f = mIMManager.g();
                } catch (Exception e8) {
                    ad.a("MIMManager", e8.getMessage());
                }
                if (MIMManager.this.f19944f != null && MIMManager.this.f19944f.booleanValue() && r2 != null) {
                    try {
                        MIMManager.this.f19946h = new b();
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="));
                        intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="));
                        intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"));
                        r2.registerReceiver(MIMManager.this.f19946h, intentFilter);
                    } catch (Exception e9) {
                        ad.a("MIMManager", e9.getMessage());
                    }
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.MIMManager$2 */
    /* loaded from: classes4.dex */
    final class AnonymousClass2 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f19950a;

        /* renamed from: b */
        final /* synthetic */ CampaignEx f19951b;

        AnonymousClass2(Context context, CampaignEx campaignEx) {
            r2 = context;
            r3 = campaignEx;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String[] u8;
            try {
                Context context = r2;
                CampaignEx campaignEx = r3;
                if (campaignEx != null) {
                    try {
                        com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                        if (nativeVideoTracking != null && (u8 = nativeVideoTracking.u()) != null) {
                            for (String str : u8) {
                                com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), str, false, false);
                            }
                        }
                    } catch (Exception e8) {
                        ad.b("MIMManager", e8.getMessage());
                    }
                }
            } catch (Exception e9) {
                ad.b("MIMManager", e9.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.MIMManager$3 */
    /* loaded from: classes4.dex */
    final class AnonymousClass3 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f19953a;

        /* renamed from: b */
        final /* synthetic */ CampaignEx f19954b;

        AnonymousClass3(Context context, CampaignEx campaignEx) {
            r2 = context;
            r3 = campaignEx;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String[] v8;
            try {
                Context context = r2;
                CampaignEx campaignEx = r3;
                if (campaignEx != null) {
                    try {
                        com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                        if (nativeVideoTracking != null && (v8 = nativeVideoTracking.v()) != null) {
                            for (String str : v8) {
                                com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), str, false, false);
                            }
                        }
                    } catch (Exception e8) {
                        ad.b("MIMManager", e8.getMessage());
                    }
                }
            } catch (Exception e9) {
                ad.b("MIMManager", e9.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.MIMManager$4 */
    /* loaded from: classes4.dex */
    final class AnonymousClass4 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f19956a;

        /* renamed from: b */
        final /* synthetic */ CampaignEx f19957b;

        AnonymousClass4(Context context, CampaignEx campaignEx) {
            r2 = context;
            r3 = campaignEx;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String[] w8;
            try {
                try {
                    Context context = r2;
                    CampaignEx campaignEx = r3;
                    if (campaignEx != null) {
                        try {
                            com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                            if (nativeVideoTracking != null && (w8 = nativeVideoTracking.w()) != null) {
                                for (String str : w8) {
                                    com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), str, false, false);
                                }
                            }
                        } catch (Exception e8) {
                            ad.b("MIMManager", e8.getMessage());
                        }
                    }
                    if (MIMManager.this.f19942d == null || !MIMManager.this.f19942d.contains(r3)) {
                        return;
                    }
                } catch (Exception e9) {
                    ad.b("MIMManager", e9.getMessage());
                    if (MIMManager.this.f19942d == null || !MIMManager.this.f19942d.contains(r3)) {
                        return;
                    }
                }
                MIMManager.this.f19942d.remove(r3);
            } catch (Throwable th) {
                if (MIMManager.this.f19942d != null && MIMManager.this.f19942d.contains(r3)) {
                    MIMManager.this.f19942d.remove(r3);
                }
                throw th;
            }
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.MIMManager$5 */
    /* loaded from: classes4.dex */
    final class AnonymousClass5 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f19959a;

        /* renamed from: b */
        final /* synthetic */ String f19960b;

        /* renamed from: c */
        final /* synthetic */ CampaignEx f19961c;

        /* renamed from: d */
        final /* synthetic */ int f19962d;

        AnonymousClass5(Context context, String str, CampaignEx campaignEx, int i8) {
            r2 = context;
            r3 = str;
            r4 = campaignEx;
            r5 = i8;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (r2 != null && !TextUtils.isEmpty(r3) && r4 != null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000100&");
                    stringBuffer.append("network_type=");
                    stringBuffer.append(z.l(r2));
                    stringBuffer.append("&");
                    if (!TextUtils.isEmpty(r4.getRequestIdNotice())) {
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(r4.getRequestIdNotice());
                        stringBuffer.append("&");
                    }
                    if (!TextUtils.isEmpty(r4.getRequestId())) {
                        stringBuffer.append("rid=");
                        stringBuffer.append(r4.getRequestId());
                        stringBuffer.append("&");
                    }
                    if (!TextUtils.isEmpty(r4.getCampaignUnitId())) {
                        stringBuffer.append("unit_id=");
                        stringBuffer.append(r4.getCampaignUnitId());
                        stringBuffer.append("&");
                        String str = com.mbridge.msdk.foundation.controller.a.f19053b.get(r4.getCampaignUnitId());
                        StringBuilder sb = new StringBuilder();
                        sb.append("u_stid=");
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        sb.append("&");
                        stringBuffer.append(sb.toString());
                    }
                    if (!TextUtils.isEmpty(r4.getId())) {
                        stringBuffer.append("cid=");
                        stringBuffer.append(r4.getId());
                        stringBuffer.append("&");
                    }
                    stringBuffer.append("status=");
                    stringBuffer.append(r3);
                    stringBuffer.append("&");
                    stringBuffer.append("code=");
                    stringBuffer.append(r5);
                    if (com.mbridge.msdk.foundation.same.report.e.a().b()) {
                        com.mbridge.msdk.foundation.same.report.e.a().a(stringBuffer.toString());
                        return;
                    }
                    try {
                        new com.mbridge.msdk.foundation.same.report.e.a(r2).post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f19696c, com.mbridge.msdk.foundation.same.report.k.a(stringBuffer.toString(), r2), null);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        ad.b("MIMManager", e8.getMessage());
                    }
                }
            } catch (Throwable th) {
                ad.b("MIMManager", th.getMessage());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class MiOverseaMiniCardBroadcasterReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i8;
            if (x.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN=").equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("packageName");
                int intExtra = intent.getIntExtra("errorCode", 0);
                if (intExtra < 0) {
                    i8 = intent.getIntExtra("reason", 0);
                } else {
                    i8 = -1;
                }
                ad.b("MIMManager", stringExtra + " " + intExtra + " " + i8);
                if (intExtra == 1 || intExtra == 2 || intExtra == 3 || intExtra == 4 || intExtra == 7) {
                    try {
                        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
                        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                        dVar.a(LeanbackPreferenceDialogFragment.ARG_KEY, URLEncoder.encode("m_mini_card", "utf-8"));
                        CampaignEx a8 = a.f19964a.a(stringExtra);
                        if (a8 != null) {
                            dVar.a("rid", a8.getRequestId());
                            dVar.a("rid_n", a8.getRequestIdNotice());
                            dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, a8.getCampaignUnitId());
                            dVar.a("u_stid", com.mbridge.msdk.foundation.controller.a.f19053b.get(a8.getCampaignUnitId()));
                            bVar.a(a8);
                        }
                        dVar.a(NotificationCompat.CATEGORY_EVENT, String.valueOf(intExtra));
                        dVar.a("pkg_name", stringExtra);
                        if (i8 != -1) {
                            dVar.a("reasonCode", String.valueOf(i8));
                        }
                        bVar.a("m_mini_card", dVar);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_mini_card", bVar);
                    } catch (Exception e8) {
                        ad.b("MIMManager", e8.getMessage());
                    }
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private static final MIMManager f19964a = new MIMManager();
    }

    /* loaded from: classes4.dex */
    public static class b extends BroadcastReceiver {
        private b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:12:0x0033, B:15:0x003a, B:17:0x004b, B:21:0x0052, B:24:0x005d, B:32:0x0086, B:33:0x008d, B:36:0x006f, B:38:0x0078, B:39:0x007e), top: B:11:0x0033 }] */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onReceive(android.content.Context r9, android.content.Intent r10) {
            /*
                r8 = this;
                java.lang.String r0 = r10.getAction()
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 == 0) goto Lb
                return
            Lb:
                java.lang.String r1 = "DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="
                java.lang.String r1 = com.mbridge.msdk.foundation.tools.x.a(r1)
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L19
                goto Lb4
            L19:
                java.lang.String r1 = "DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="
                java.lang.String r1 = com.mbridge.msdk.foundation.tools.x.a(r1)
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L27
                goto Lb4
            L27:
                java.lang.String r1 = "DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"
                java.lang.String r1 = com.mbridge.msdk.foundation.tools.x.a(r1)
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto Lb4
                android.os.Bundle r10 = r10.getExtras()     // Catch: java.lang.Exception -> L76
                if (r10 != 0) goto L3a
                return
            L3a:
                java.lang.String r0 = "statusCode"
                r1 = -1
                int r7 = r10.getInt(r0, r1)     // Catch: java.lang.Exception -> L76
                java.lang.String r0 = "packageName"
                java.lang.String r2 = ""
                java.lang.String r10 = r10.getString(r0, r2)     // Catch: java.lang.Exception -> L76
                if (r7 == r1) goto Laa
                boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Exception -> L76
                if (r0 == 0) goto L52
                goto Laa
            L52:
                com.mbridge.msdk.foundation.tools.MIMManager r0 = com.mbridge.msdk.foundation.tools.MIMManager.a.a()     // Catch: java.lang.Exception -> L76
                com.mbridge.msdk.foundation.entity.CampaignEx r10 = com.mbridge.msdk.foundation.tools.MIMManager.a(r0, r10)     // Catch: java.lang.Exception -> L76
                if (r10 != 0) goto L5d
                return
            L5d:
                com.mbridge.msdk.foundation.tools.MIMManager r0 = com.mbridge.msdk.foundation.tools.MIMManager.a.a()     // Catch: java.lang.Exception -> L76
                r1 = 3001(0xbb9, float:4.205E-42)
                if (r7 == r1) goto L7e
                r1 = 3002(0xbba, float:4.207E-42)
                if (r7 == r1) goto L78
                r1 = 3008(0xbc0, float:4.215E-42)
                if (r7 == r1) goto L6f
                r10 = 0
                goto L84
            L6f:
                com.mbridge.msdk.foundation.tools.MIMManager$4 r1 = new com.mbridge.msdk.foundation.tools.MIMManager$4     // Catch: java.lang.Exception -> L76
                r1.<init>()     // Catch: java.lang.Exception -> L76
            L74:
                r10 = r1
                goto L84
            L76:
                r9 = move-exception
                goto Lab
            L78:
                com.mbridge.msdk.foundation.tools.MIMManager$3 r1 = new com.mbridge.msdk.foundation.tools.MIMManager$3     // Catch: java.lang.Exception -> L76
                r1.<init>()     // Catch: java.lang.Exception -> L76
                goto L74
            L7e:
                com.mbridge.msdk.foundation.tools.MIMManager$2 r1 = new com.mbridge.msdk.foundation.tools.MIMManager$2     // Catch: java.lang.Exception -> L76
                r1.<init>()     // Catch: java.lang.Exception -> L76
                goto L74
            L84:
                if (r10 == 0) goto L8d
                java.util.concurrent.ThreadPoolExecutor r0 = com.mbridge.msdk.foundation.same.f.b.b()     // Catch: java.lang.Exception -> L76
                r0.execute(r10)     // Catch: java.lang.Exception -> L76
            L8d:
                com.mbridge.msdk.foundation.tools.MIMManager r3 = com.mbridge.msdk.foundation.tools.MIMManager.a.a()     // Catch: java.lang.Exception -> L76
                java.lang.String r5 = "dm_page_status"
                com.mbridge.msdk.foundation.tools.MIMManager r10 = com.mbridge.msdk.foundation.tools.MIMManager.a.a()     // Catch: java.lang.Exception -> L76
                com.mbridge.msdk.foundation.entity.CampaignEx r6 = r10.b()     // Catch: java.lang.Exception -> L76
                java.util.concurrent.ThreadPoolExecutor r10 = com.mbridge.msdk.foundation.same.f.b.b()     // Catch: java.lang.Exception -> L76
                com.mbridge.msdk.foundation.tools.MIMManager$5 r0 = new com.mbridge.msdk.foundation.tools.MIMManager$5     // Catch: java.lang.Exception -> L76
                r2 = r0
                r4 = r9
                r2.<init>()     // Catch: java.lang.Exception -> L76
                r10.execute(r0)     // Catch: java.lang.Exception -> L76
                goto Lb4
            Laa:
                return
            Lab:
                java.lang.String r10 = "MIMManager"
                java.lang.String r9 = r9.getMessage()
                com.mbridge.msdk.foundation.tools.ad.b(r10, r9)
            Lb4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.MIMManager.b.onReceive(android.content.Context, android.content.Intent):void");
        }

        /* synthetic */ b(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* synthetic */ MIMManager(AnonymousClass1 anonymousClass1) {
        this();
    }

    public Boolean g() {
        Cursor cursor;
        Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
        Boolean bool = null;
        if (c8 != null) {
            try {
                if (c8.getContentResolver() != null) {
                    try {
                        cursor = c8.getContentResolver().query(Uri.parse(x.a("DFK/J75/JaEXWFfXYZP9LkcXYk3/YkcBLF5TWgSBYbHuH75BW3xuhr5UJj2tLkeNhrKFLkxQhl==")), null, null, null, null);
                    } catch (Exception unused) {
                        cursor = null;
                    }
                    if (cursor != null) {
                        while (cursor.moveToNext()) {
                            try {
                                String string = cursor.getString(cursor.getColumnIndex("support"));
                                if (!TextUtils.isEmpty(string)) {
                                    if (!string.equalsIgnoreCase("null")) {
                                        if (!string.equalsIgnoreCase("false")) {
                                            if (string.equalsIgnoreCase("true")) {
                                            }
                                        }
                                        bool = Boolean.valueOf(Boolean.parseBoolean(string));
                                    }
                                }
                            } catch (Exception e8) {
                                ad.a("MIMManager", e8.getMessage());
                            }
                            try {
                                f19939a = cursor.getString(cursor.getColumnIndex("detailStyle"));
                            } catch (Exception e9) {
                                ad.a("MIMManager", e9.getMessage());
                            }
                        }
                        try {
                            cursor.close();
                        } catch (Exception e10) {
                            ad.a("MIMManager", e10.getMessage());
                        }
                    }
                }
            } catch (Exception e11) {
                ad.b("MIMManager", e11.getMessage());
            }
        }
        return bool;
    }

    public final void f() {
        int i8 = this.f19941c - 1;
        this.f19941c = i8;
        if (i8 <= 0) {
            Context context = this.f19943e;
            if (context != null) {
                try {
                    try {
                        if (this.f19946h != null) {
                            context.unregisterReceiver(this.f19946h);
                        }
                        if (this.f19947i != null) {
                            context.unregisterReceiver(this.f19947i);
                        }
                    } catch (Exception e8) {
                        ad.a("MIMManager", e8.getMessage());
                    }
                    this.f19945g = null;
                    this.f19942d.clear();
                    this.f19942d = null;
                    this.f19946h = null;
                    this.f19943e = null;
                } catch (Throwable th) {
                    this.f19945g = null;
                    this.f19942d.clear();
                    this.f19942d = null;
                    this.f19946h = null;
                    this.f19943e = null;
                    throw th;
                }
            }
            try {
                try {
                    if (this.f19947i != null) {
                        Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
                        if (c8 != null) {
                            c8.unregisterReceiver(this.f19947i);
                        }
                        this.f19945g = null;
                        this.f19942d.clear();
                        this.f19942d = null;
                        this.f19947i = null;
                    }
                } catch (Exception e9) {
                    ad.a("MIMManager", e9.getMessage());
                }
            } catch (Throwable th2) {
                ad.b("MIMManager", th2.getMessage());
            }
        }
    }

    private MIMManager() {
        this.f19941c = 0;
        this.f19942d = new CopyOnWriteArrayList<>();
        this.f19940b = new AtomicBoolean(false);
    }

    final CampaignEx b() {
        return this.f19945g;
    }

    public final String c() {
        try {
            return f19939a == null ? "" : String.format("[%s]", f19939a);
        } catch (Exception unused) {
            return "";
        }
    }

    public final Boolean d() {
        return this.f19944f;
    }

    public final void e() {
        this.f19941c++;
    }

    public final void b(CampaignEx campaignEx) {
        try {
            if (this.f19944f == null || campaignEx == null || !this.f19944f.booleanValue()) {
                return;
            }
            this.f19945g = null;
            try {
                this.f19942d.remove(campaignEx);
            } catch (Exception e8) {
                ad.a("MIMManager", e8.getMessage());
            }
        } catch (Exception e9) {
            ad.b("MIMManager", e9.getMessage());
        }
    }

    public static MIMManager a() {
        return a.f19964a;
    }

    public final void a(CampaignEx campaignEx) {
        try {
            if (this.f19944f != null && campaignEx != null && this.f19944f.booleanValue()) {
                this.f19945g = campaignEx;
                this.f19942d.add(campaignEx);
            }
            if (com.mbridge.msdk.f.b.b() && campaignEx != null && campaignEx.getDeepLinkURL().startsWith("mimarket")) {
                if (this.f19947i == null) {
                    try {
                        if (this.f19947i == null) {
                            this.f19947i = new MiOverseaMiniCardBroadcasterReceiver();
                        }
                        IntentFilter intentFilter = new IntentFilter(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN="));
                        Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
                        if (c8 != null) {
                            c8.registerReceiver(this.f19947i, intentFilter);
                        }
                    } catch (Exception e8) {
                        ad.a("MIMManager", e8.getMessage());
                    }
                }
                this.f19945g = campaignEx;
                this.f19942d.add(campaignEx);
            }
        } catch (Exception e9) {
            ad.b("MIMManager", e9.getMessage());
        }
    }

    public CampaignEx a(String str) {
        try {
            CampaignEx campaignEx = this.f19945g;
            if (campaignEx != null && TextUtils.equals(campaignEx.getPackageName(), str)) {
                return this.f19945g;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f19942d;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return null;
            }
            Iterator<CampaignEx> it = this.f19942d.iterator();
            while (it.hasNext()) {
                CampaignEx next = it.next();
                if (next != null && TextUtils.equals(next.getPackageName(), str)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e8) {
            ad.b("MIMManager", e8.getMessage());
            return null;
        }
    }

    public final void a(Context context) {
        this.f19943e = context;
        com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.MIMManager.1

            /* renamed from: a */
            final /* synthetic */ Context f19948a;

            AnonymousClass1(Context context2) {
                r2 = context2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (MIMManager.this.f19940b.compareAndSet(false, true)) {
                    try {
                        MIMManager mIMManager = MIMManager.this;
                        mIMManager.f19944f = mIMManager.g();
                    } catch (Exception e8) {
                        ad.a("MIMManager", e8.getMessage());
                    }
                    if (MIMManager.this.f19944f != null && MIMManager.this.f19944f.booleanValue() && r2 != null) {
                        try {
                            MIMManager.this.f19946h = new b();
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="));
                            intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="));
                            intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"));
                            r2.registerReceiver(MIMManager.this.f19946h, intentFilter);
                        } catch (Exception e9) {
                            ad.a("MIMManager", e9.getMessage());
                        }
                    }
                }
            }
        });
    }
}
