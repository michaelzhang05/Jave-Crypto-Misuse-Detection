package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.T5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2221l extends AbstractC2190f4 {

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f16648f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f16649g = {TtmlNode.ATTR_TTS_ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f16650h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;"};

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f16651i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f16652j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f16653k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f16654l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f16655m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d, reason: collision with root package name */
    private final C2215k f16656d;

    /* renamed from: e, reason: collision with root package name */
    private final C2166b4 f16657e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2221l(r4 r4Var) {
        super(r4Var);
        this.f16657e = new C2166b4(this.f16777a.a());
        this.f16777a.z();
        this.f16656d = new C2215k(this, this.f16777a.c(), "google_app_measurement.db");
    }

    static final void H(ContentValues contentValues, String str, Object obj) {
        AbstractC1319p.f("value");
        AbstractC1319p.l(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put("value", (Double) obj);
                return;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final long I(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = P().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j8 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j8;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e8) {
                this.f16777a.d().r().c("Database error", str, e8);
                throw e8;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long K(String str, String[] strArr, long j8) {
        Cursor cursor = null;
        try {
            try {
                cursor = P().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j9 = cursor.getLong(0);
                    cursor.close();
                    return j9;
                }
                cursor.close();
                return j8;
            } catch (SQLiteException e8) {
                this.f16777a.d().r().c("Database error", str, e8);
                throw e8;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0079: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:122), block:B:101:0x0079 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void G(String str, long j8, long j9, p4 p4Var) {
        ?? r42;
        Cursor cursor;
        SQLiteDatabase P8;
        String[] strArr;
        Cursor rawQuery;
        String string;
        String str2;
        Cursor query;
        String str3;
        String[] strArr2;
        String[] strArr3;
        AbstractC1319p.l(p4Var);
        h();
        i();
        Cursor cursor2 = null;
        r3 = null;
        r3 = null;
        String str4 = null;
        try {
            try {
                P8 = P();
                r42 = TextUtils.isEmpty(null);
                String str5 = "";
                try {
                    if (r42 != 0) {
                        if (j9 != -1) {
                            strArr3 = new String[]{String.valueOf(j9), String.valueOf(j8)};
                        } else {
                            strArr3 = new String[]{String.valueOf(j8)};
                        }
                        if (j9 != -1) {
                            str5 = "rowid <= ? and ";
                        }
                        rawQuery = P8.rawQuery("select app_id, metadata_fingerprint from raw_events where " + str5 + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", strArr3);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            str4 = rawQuery.getString(0);
                            string = rawQuery.getString(1);
                            rawQuery.close();
                        }
                    } else {
                        if (j9 != -1) {
                            strArr = new String[]{null, String.valueOf(j9)};
                        } else {
                            strArr = new String[]{null};
                        }
                        if (j9 != -1) {
                            str5 = " and rowid <= ?";
                        }
                        rawQuery = P8.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + str5 + " order by rowid limit 1;", strArr);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            string = rawQuery.getString(0);
                            rawQuery.close();
                        }
                    }
                    Cursor cursor3 = rawQuery;
                    str2 = string;
                    try {
                        query = P8.query("raw_events_metadata", new String[]{TtmlNode.TAG_METADATA}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, str2}, null, null, "rowid", "2");
                    } catch (SQLiteException e8) {
                        e = e8;
                        r42 = cursor3;
                    } catch (Throwable th) {
                        th = th;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e9) {
                    e = e9;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
            }
            try {
                if (!query.moveToFirst()) {
                    this.f16777a.d().r().b("Raw event metadata record is missing. appId", C2267u1.z(str4));
                    query.close();
                    return;
                }
                try {
                    com.google.android.gms.internal.measurement.X1 x12 = (com.google.android.gms.internal.measurement.X1) ((com.google.android.gms.internal.measurement.W1) t4.E(com.google.android.gms.internal.measurement.X1.S1(), query.getBlob(0))).k();
                    if (query.moveToNext()) {
                        this.f16777a.d().w().b("Get multiple raw event metadata records, expected one. appId", C2267u1.z(str4));
                    }
                    query.close();
                    AbstractC1319p.l(x12);
                    p4Var.f16739a = x12;
                    if (j9 != -1) {
                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                        strArr2 = new String[]{str4, str2, String.valueOf(j9)};
                    } else {
                        str3 = "app_id = ? and metadata_fingerprint = ?";
                        strArr2 = new String[]{str4, str2};
                    }
                    Cursor query2 = P8.query("raw_events", new String[]{"rowid", "name", CampaignEx.JSON_KEY_TIMESTAMP, DataSchemeDataSource.SCHEME_DATA}, str3, strArr2, null, null, "rowid", null);
                    if (!query2.moveToFirst()) {
                        this.f16777a.d().w().b("Raw event data disappeared while in transaction. appId", C2267u1.z(str4));
                        query2.close();
                        return;
                    }
                    do {
                        long j10 = query2.getLong(0);
                        try {
                            com.google.android.gms.internal.measurement.L1 l12 = (com.google.android.gms.internal.measurement.L1) t4.E(com.google.android.gms.internal.measurement.M1.F(), query2.getBlob(3));
                            l12.x(query2.getString(1));
                            l12.B(query2.getLong(2));
                            if (!p4Var.a(j10, (com.google.android.gms.internal.measurement.M1) l12.k())) {
                                query2.close();
                                return;
                            }
                        } catch (IOException e10) {
                            this.f16777a.d().r().c("Data loss. Failed to merge raw event. appId", C2267u1.z(str4), e10);
                        }
                    } while (query2.moveToNext());
                    query2.close();
                } catch (IOException e11) {
                    this.f16777a.d().r().c("Data loss. Failed to merge raw event metadata. appId", C2267u1.z(str4), e11);
                    query.close();
                }
            } catch (SQLiteException e12) {
                e = e12;
                r42 = query;
                this.f16777a.d().r().c("Data loss. Error selecting raw event. appId", C2267u1.z(str4), e);
                if (r42 != 0) {
                    r42.close();
                }
            } catch (Throwable th3) {
                th = th3;
                cursor2 = query;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e13) {
            e = e13;
            r42 = 0;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final int J(String str, String str2) {
        AbstractC1319p.f(str);
        AbstractC1319p.f(str2);
        h();
        i();
        try {
            return P().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e8) {
            this.f16777a.d().r().d("Error deleting conditional property", C2267u1.z(str), this.f16777a.D().f(str2), e8);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long L(String str, String str2) {
        long K8;
        AbstractC1319p.f(str);
        AbstractC1319p.f("first_open_count");
        h();
        i();
        SQLiteDatabase P8 = P();
        P8.beginTransaction();
        long j8 = 0;
        try {
            try {
                K8 = K("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (K8 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(MBridgeConstans.APP_ID, str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (P8.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.f16777a.d().r().c("Failed to insert column (got -1). appId", C2267u1.z(str), "first_open_count");
                        return -1L;
                    }
                    K8 = 0;
                }
            } catch (SQLiteException e8) {
                e = e8;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(MBridgeConstans.APP_ID, str);
                contentValues2.put("first_open_count", Long.valueOf(1 + K8));
                if (P8.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                    this.f16777a.d().r().c("Failed to update column (got 0). appId", C2267u1.z(str), "first_open_count");
                    return -1L;
                }
                P8.setTransactionSuccessful();
                return K8;
            } catch (SQLiteException e9) {
                e = e9;
                j8 = K8;
                this.f16777a.d().r().d("Error inserting column. appId", C2267u1.z(str), "first_open_count", e);
                P8.endTransaction();
                return j8;
            }
        } finally {
            P8.endTransaction();
        }
    }

    public final long M() {
        return K("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long N() {
        return K("select max(timestamp) from raw_events", null, 0L);
    }

    public final long O(String str) {
        AbstractC1319p.f(str);
        return K("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SQLiteDatabase P() {
        h();
        try {
            return this.f16656d.getWritableDatabase();
        } catch (SQLiteException e8) {
            this.f16777a.d().w().b("Error opening database", e8);
            throw e8;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00bf: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:192), block:B:58:0x00bf */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle Q(java.lang.String r8) {
        /*
            r7 = this;
            r7.h()
            r7.i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.P()     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r2 != 0) goto L34
            com.google.android.gms.measurement.internal.Y1 r8 = r7.f16777a     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.u1 r8 = r8.d()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.s1 r8 = r8.v()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r1.close()
            return r0
        L2e:
            r8 = move-exception
            goto Lbf
        L31:
            r8 = move-exception
            goto Lc5
        L34:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.internal.measurement.L1 r3 = com.google.android.gms.internal.measurement.M1.F()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.internal.measurement.X4 r2 = com.google.android.gms.measurement.internal.t4.E(r3, r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.internal.measurement.L1 r2 = (com.google.android.gms.internal.measurement.L1) r2     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.internal.measurement.u4 r2 = r2.k()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.internal.measurement.M1 r2 = (com.google.android.gms.internal.measurement.M1) r2     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.measurement.internal.r4 r8 = r7.f16482b     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r8.g0()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.util.List r8 = r2.K()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
        L5b:
            boolean r3 = r8.hasNext()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r3 == 0) goto La3
            java.lang.Object r3 = r8.next()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.internal.measurement.Q1 r3 = (com.google.android.gms.internal.measurement.Q1) r3     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r4 = r3.H()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            boolean r5 = r3.W()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 == 0) goto L79
            double r5 = r3.B()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.putDouble(r4, r5)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            goto L5b
        L79:
            boolean r5 = r3.X()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 == 0) goto L87
            float r3 = r3.C()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.putFloat(r4, r3)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            goto L5b
        L87:
            boolean r5 = r3.a0()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 == 0) goto L95
            java.lang.String r3 = r3.J()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.putString(r4, r3)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            goto L5b
        L95:
            boolean r5 = r3.Y()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 == 0) goto L5b
            long r5 = r3.E()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.putLong(r4, r5)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            goto L5b
        La3:
            r1.close()
            return r2
        La7:
            r2 = move-exception
            com.google.android.gms.measurement.internal.Y1 r3 = r7.f16777a     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.u1 r3 = r3.d()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.s1 r3 = r3.r()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C2267u1.z(r8)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r3.c(r4, r8, r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r1.close()
            return r0
        Lbf:
            r0 = r1
            goto Lda
        Lc1:
            r8 = move-exception
            goto Lda
        Lc3:
            r8 = move-exception
            r1 = r0
        Lc5:
            com.google.android.gms.measurement.internal.Y1 r2 = r7.f16777a     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.measurement.internal.u1 r2 = r2.d()     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.measurement.internal.s1 r2 = r2.r()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto Ld9
            r1.close()
        Ld9:
            return r0
        Lda:
            if (r0 == 0) goto Ldf
            r0.close()
        Ldf:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2221l.Q(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C2268u2 R(java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2221l.R(java.lang.String):com.google.android.gms.measurement.internal.u2");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C2173d S(java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2221l.S(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.d");
    }

    public final C2209j T(long j8, String str, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        return U(j8, str, 1L, false, false, z10, false, z12);
    }

    public final C2209j U(long j8, String str, long j9, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        AbstractC1319p.f(str);
        h();
        i();
        String[] strArr = {str};
        C2209j c2209j = new C2209j();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase P8 = P();
                Cursor query = P8.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.f16777a.d().w().b("Not updating daily counts, app is not known. appId", C2267u1.z(str));
                    query.close();
                    return c2209j;
                }
                if (query.getLong(0) == j8) {
                    c2209j.f16524b = query.getLong(1);
                    c2209j.f16523a = query.getLong(2);
                    c2209j.f16525c = query.getLong(3);
                    c2209j.f16526d = query.getLong(4);
                    c2209j.f16527e = query.getLong(5);
                }
                if (z8) {
                    c2209j.f16524b += j9;
                }
                if (z9) {
                    c2209j.f16523a += j9;
                }
                if (z10) {
                    c2209j.f16525c += j9;
                }
                if (z11) {
                    c2209j.f16526d += j9;
                }
                if (z12) {
                    c2209j.f16527e += j9;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j8));
                contentValues.put("daily_public_events_count", Long.valueOf(c2209j.f16523a));
                contentValues.put("daily_events_count", Long.valueOf(c2209j.f16524b));
                contentValues.put("daily_conversions_count", Long.valueOf(c2209j.f16525c));
                contentValues.put("daily_error_events_count", Long.valueOf(c2209j.f16526d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c2209j.f16527e));
                P8.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return c2209j;
            } catch (SQLiteException e8) {
                this.f16777a.d().r().c("Error updating daily counts. appId", C2267u1.z(str), e8);
                if (0 != 0) {
                    cursor.close();
                }
                return c2209j;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.r V(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2221l.V(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.r");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0073: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:116), block:B:29:0x0073 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.w4 X(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            R.AbstractC1319p.f(r11)
            R.AbstractC1319p.f(r12)
            r10.h()
            r10.i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.P()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            java.lang.String r4 = "app_id=? and name=?"
            java.lang.String[] r5 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            if (r2 != 0) goto L34
            r1.close()
            return r0
        L34:
            r2 = 0
            long r7 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            r2 = 1
            java.lang.Object r9 = r10.Y(r1, r2)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            if (r9 != 0) goto L44
            r1.close()
            return r0
        L44:
            r2 = 2
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            com.google.android.gms.measurement.internal.w4 r2 = new com.google.android.gms.measurement.internal.w4     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            r3 = r2
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            if (r3 == 0) goto L6f
            com.google.android.gms.measurement.internal.Y1 r3 = r10.f16777a     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            com.google.android.gms.measurement.internal.u1 r3 = r3.d()     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            com.google.android.gms.measurement.internal.s1 r3 = r3.r()     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2267u1.z(r11)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            r3.b(r4, r5)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            goto L6f
        L6b:
            r11 = move-exception
            goto L73
        L6d:
            r2 = move-exception
            goto L7a
        L6f:
            r1.close()
            return r2
        L73:
            r0 = r1
            goto L9d
        L75:
            r11 = move-exception
            goto L9d
        L77:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L7a:
            com.google.android.gms.measurement.internal.Y1 r3 = r10.f16777a     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.measurement.internal.u1 r3 = r3.d()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.measurement.internal.s1 r3 = r3.r()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C2267u1.z(r11)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.measurement.internal.Y1 r5 = r10.f16777a     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.measurement.internal.p1 r5 = r5.D()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r12 = r5.f(r12)     // Catch: java.lang.Throwable -> L6b
            r3.d(r4, r11, r12, r2)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L9c
            r1.close()
        L9c:
            return r0
        L9d:
            if (r0 == 0) goto La2
            r0.close()
        La2:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2221l.X(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.w4");
    }

    final Object Y(Cursor cursor, int i8) {
        int type = cursor.getType(i8);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            this.f16777a.d().r().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                            return null;
                        }
                        this.f16777a.d().r().a("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i8);
                }
                return Double.valueOf(cursor.getDouble(i8));
            }
            return Long.valueOf(cursor.getLong(i8));
        }
        this.f16777a.d().r().a("Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Z() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.P()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L26 android.database.sqlite.SQLiteException -> L28
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L22
        L1c:
            r2 = move-exception
            goto L2b
        L1e:
            r0.close()
            return r1
        L22:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L40
        L26:
            r0 = move-exception
            goto L40
        L28:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L2b:
            com.google.android.gms.measurement.internal.Y1 r3 = r6.f16777a     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.u1 r3 = r3.d()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.s1 r3 = r3.r()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L3f
            r0.close()
        L3f:
            return r1
        L40:
            if (r1 == 0) goto L45
            r1.close()
        L45:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2221l.Z():java.lang.String");
    }

    public final List a0(String str, String str2, String str3) {
        AbstractC1319p.f(str);
        h();
        i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return b0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r2 = r27.f16777a.d().r();
        r27.f16777a.z();
        r2.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b0(java.lang.String r28, java.lang.String[] r29) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2221l.b0(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List c0(String str) {
        AbstractC1319p.f(str);
        h();
        i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.f16777a.z();
                cursor = P().query("user_attributes", new String[]{"name", TtmlNode.ATTR_TTS_ORIGIN, "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j8 = cursor.getLong(2);
                    Object Y7 = Y(cursor, 3);
                    if (Y7 == null) {
                        this.f16777a.d().r().b("Read invalid user property value, ignoring it. appId", C2267u1.z(str));
                    } else {
                        arrayList.add(new w4(str, str2, string, j8, Y7));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e8) {
                this.f16777a.d().r().c("Error querying user properties. appId", C2267u1.z(str), e8);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        r0 = r17.f16777a.d().r();
        r17.f16777a.z();
        r0.b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d0(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2221l.d0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void e0() {
        i();
        P().beginTransaction();
    }

    public final void f0() {
        i();
        P().endTransaction();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g0(List list) {
        h();
        i();
        AbstractC1319p.l(list);
        AbstractC1319p.n(list.size());
        if (!u()) {
            return;
        }
        String str = "(" + TextUtils.join(",", list) + ")";
        if (I("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
            this.f16777a.d().w().a("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            P().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
        } catch (SQLiteException e8) {
            this.f16777a.d().r().b("Error incrementing retry count. error", e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h0() {
        h();
        i();
        if (u()) {
            long a8 = this.f16482b.e0().f16235e.a();
            long elapsedRealtime = this.f16777a.a().elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - a8);
            this.f16777a.z();
            if (abs > ((Long) AbstractC2217k1.f16545A.a(null)).longValue()) {
                this.f16482b.e0().f16235e.b(elapsedRealtime);
                h();
                i();
                if (u()) {
                    SQLiteDatabase P8 = P();
                    String valueOf = String.valueOf(this.f16777a.a().currentTimeMillis());
                    this.f16777a.z();
                    int delete = P8.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{valueOf, String.valueOf(C2197h.i())});
                    if (delete > 0) {
                        this.f16777a.d().v().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2190f4
    protected final boolean l() {
        return false;
    }

    public final void m(String str, String str2) {
        AbstractC1319p.f(str);
        AbstractC1319p.f(str2);
        h();
        i();
        try {
            P().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e8) {
            this.f16777a.d().r().d("Error deleting user property. appId", C2267u1.z(str), this.f16777a.D().f(str2), e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0254, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0238, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e2, code lost:
    
        r0 = r23.f16777a.d().w();
        r10 = com.google.android.gms.measurement.internal.C2267u1.z(r24);
        r12 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fa, code lost:
    
        if (r11.R() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fc, code lost:
    
        r16 = java.lang.Integer.valueOf(r11.C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0209, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r10, r12, java.lang.String.valueOf(r16));
        r21 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0207, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x029a, code lost:
    
        r21 = r7;
        r0 = r0.J().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02a8, code lost:
    
        if (r0.hasNext() == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02aa, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.C2038l1) r0.next();
        i();
        h();
        R.AbstractC1319p.f(r24);
        R.AbstractC1319p.l(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02c4, code lost:
    
        if (r3.F().isEmpty() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02f6, code lost:
    
        r7 = r3.g();
        r10 = new android.content.ContentValues();
        r10.put(com.mbridge.msdk.MBridgeConstans.APP_ID, r24);
        r10.put("audience_id", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x030d, code lost:
    
        if (r3.M() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x030f, code lost:
    
        r11 = java.lang.Integer.valueOf(r3.B());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0319, code lost:
    
        r10.put("filter_id", r11);
        r22 = r0;
        r10.put("property_name", r3.F());
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x032b, code lost:
    
        if (r3.N() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x032d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r3.K());
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0337, code lost:
    
        r10.put("session_scoped", r0);
        r10.put(com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource.SCHEME_DATA, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x034b, code lost:
    
        if (P().insertWithOnConflict("property_filters", null, r10, 5) != (-1)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0363, code lost:
    
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x034d, code lost:
    
        r23.f16777a.d().r().b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.C2267u1.z(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0361, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0367, code lost:
    
        r23.f16777a.d().r().c("Error storing property filter. appId", com.google.android.gms.measurement.internal.C2267u1.z(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0336, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0318, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c6, code lost:
    
        r0 = r23.f16777a.d().w();
        r8 = com.google.android.gms.measurement.internal.C2267u1.z(r24);
        r10 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02de, code lost:
    
        if (r3.M() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e0, code lost:
    
        r16 = java.lang.Integer.valueOf(r3.B());
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ed, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r10, java.lang.String.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02eb, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017b, code lost:
    
        r10 = r0.J().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0187, code lost:
    
        if (r10.hasNext() == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0193, code lost:
    
        if (((com.google.android.gms.internal.measurement.C2038l1) r10.next()).M() != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0195, code lost:
    
        r23.f16777a.d().w().c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.C2267u1.z(r24), java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ae, code lost:
    
        r10 = r0.H().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c4, code lost:
    
        if (r10.hasNext() == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c6, code lost:
    
        r11 = (com.google.android.gms.internal.measurement.C1961c1) r10.next();
        i();
        h();
        R.AbstractC1319p.f(r24);
        R.AbstractC1319p.l(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e0, code lost:
    
        if (r11.H().isEmpty() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0214, code lost:
    
        r3 = r11.g();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put(com.mbridge.msdk.MBridgeConstans.APP_ID, r24);
        r7.put("audience_id", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022d, code lost:
    
        if (r11.R() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022f, code lost:
    
        r8 = java.lang.Integer.valueOf(r11.C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0239, code lost:
    
        r7.put("filter_id", r8);
        r7.put("event_name", r11.H());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0249, code lost:
    
        if (r11.S() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x024b, code lost:
    
        r8 = java.lang.Boolean.valueOf(r11.P());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0255, code lost:
    
        r7.put("session_scoped", r8);
        r7.put(com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource.SCHEME_DATA, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0269, code lost:
    
        if (P().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x026b, code lost:
    
        r23.f16777a.d().r().b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.C2267u1.z(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x027e, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0284, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0285, code lost:
    
        r23.f16777a.d().r().c("Error storing event filter. appId", com.google.android.gms.measurement.internal.C2267u1.z(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x037a, code lost:
    
        i();
        h();
        R.AbstractC1319p.f(r24);
        r0 = P();
        r7 = r18;
        r0.delete("property_filters", r7, new java.lang.String[]{r24, java.lang.String.valueOf(r9)});
        r0.delete("event_filters", r7, new java.lang.String[]{r24, java.lang.String.valueOf(r9)});
        r18 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03a3, code lost:
    
        r7 = r21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.lang.String r24, java.util.List r25) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2221l.n(java.lang.String, java.util.List):void");
    }

    public final void o() {
        i();
        P().setTransactionSuccessful();
    }

    public final void p(C2268u2 c2268u2) {
        AbstractC1319p.l(c2268u2);
        h();
        i();
        String l02 = c2268u2.l0();
        AbstractC1319p.l(l02);
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, l02);
        contentValues.put("app_instance_id", c2268u2.m0());
        contentValues.put("gmp_app_id", c2268u2.a());
        contentValues.put("resettable_device_id_hash", c2268u2.c());
        contentValues.put("last_bundle_index", Long.valueOf(c2268u2.e0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c2268u2.f0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c2268u2.d0()));
        contentValues.put("app_version", c2268u2.o0());
        contentValues.put("app_store", c2268u2.n0());
        contentValues.put("gmp_version", Long.valueOf(c2268u2.c0()));
        contentValues.put("dev_cert_hash", Long.valueOf(c2268u2.Z()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c2268u2.O()));
        contentValues.put("day", Long.valueOf(c2268u2.Y()));
        contentValues.put("daily_public_events_count", Long.valueOf(c2268u2.W()));
        contentValues.put("daily_events_count", Long.valueOf(c2268u2.V()));
        contentValues.put("daily_conversions_count", Long.valueOf(c2268u2.T()));
        contentValues.put("config_fetched_time", Long.valueOf(c2268u2.S()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c2268u2.b0()));
        contentValues.put("app_version_int", Long.valueOf(c2268u2.R()));
        contentValues.put("firebase_instance_id", c2268u2.p0());
        contentValues.put("daily_error_events_count", Long.valueOf(c2268u2.U()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c2268u2.X()));
        contentValues.put("health_monitor_sample", c2268u2.b());
        c2268u2.A();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c2268u2.N()));
        contentValues.put("admob_app_id", c2268u2.j0());
        contentValues.put("dynamite_version", Long.valueOf(c2268u2.a0()));
        contentValues.put("session_stitching_token", c2268u2.d());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c2268u2.Q()));
        contentValues.put("target_os_version", Long.valueOf(c2268u2.h0()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(c2268u2.g0()));
        List e8 = c2268u2.e();
        if (e8 != null) {
            if (e8.isEmpty()) {
                this.f16777a.d().w().b("Safelisted events should not be an empty list. appId", l02);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", e8));
            }
        }
        T5.c();
        if (this.f16777a.z().B(null, AbstractC2217k1.f16607m0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase P8 = P();
            if (P8.update("apps", contentValues, "app_id = ?", new String[]{l02}) == 0 && P8.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.f16777a.d().r().b("Failed to insert/update app (got -1). appId", C2267u1.z(l02));
            }
        } catch (SQLiteException e9) {
            this.f16777a.d().r().c("Error storing app. appId", C2267u1.z(l02), e9);
        }
    }

    public final void q(r rVar) {
        Long l8;
        AbstractC1319p.l(rVar);
        h();
        i();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, rVar.f16759a);
        contentValues.put("name", rVar.f16760b);
        contentValues.put("lifetime_count", Long.valueOf(rVar.f16761c));
        contentValues.put("current_bundle_count", Long.valueOf(rVar.f16762d));
        contentValues.put("last_fire_timestamp", Long.valueOf(rVar.f16764f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(rVar.f16765g));
        contentValues.put("last_bundled_day", rVar.f16766h);
        contentValues.put("last_sampled_complex_event_id", rVar.f16767i);
        contentValues.put("last_sampling_rate", rVar.f16768j);
        contentValues.put("current_session_count", Long.valueOf(rVar.f16763e));
        Boolean bool = rVar.f16769k;
        if (bool != null && bool.booleanValue()) {
            l8 = 1L;
        } else {
            l8 = null;
        }
        contentValues.put("last_exempt_from_sampling", l8);
        try {
            if (P().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.f16777a.d().r().b("Failed to insert/update event aggregates (got -1). appId", C2267u1.z(rVar.f16759a));
            }
        } catch (SQLiteException e8) {
            this.f16777a.d().r().c("Error storing event aggregates. appId", C2267u1.z(rVar.f16759a), e8);
        }
    }

    public final boolean r() {
        if (I("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if (I("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        if (I("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    protected final boolean u() {
        Context c8 = this.f16777a.c();
        this.f16777a.z();
        return c8.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean v(String str, Long l8, long j8, com.google.android.gms.internal.measurement.M1 m12) {
        h();
        i();
        AbstractC1319p.l(m12);
        AbstractC1319p.f(str);
        AbstractC1319p.l(l8);
        byte[] g8 = m12.g();
        this.f16777a.d().v().c("Saving complex main event, appId, data size", this.f16777a.D().d(str), Integer.valueOf(g8.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("event_id", l8);
        contentValues.put("children_to_process", Long.valueOf(j8));
        contentValues.put("main_event", g8);
        try {
            if (P().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                this.f16777a.d().r().b("Failed to insert complex main event (got -1). appId", C2267u1.z(str));
                return false;
            }
            return true;
        } catch (SQLiteException e8) {
            this.f16777a.d().r().c("Error storing complex main event. appId", C2267u1.z(str), e8);
            return false;
        }
    }

    public final boolean w(C2173d c2173d) {
        AbstractC1319p.l(c2173d);
        h();
        i();
        String str = c2173d.f16446a;
        AbstractC1319p.l(str);
        if (X(str, c2173d.f16448c.f16878b) == null) {
            long I8 = I("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f16777a.z();
            if (I8 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put(TtmlNode.ATTR_TTS_ORIGIN, c2173d.f16447b);
        contentValues.put("name", c2173d.f16448c.f16878b);
        H(contentValues, "value", AbstractC1319p.l(c2173d.f16448c.s()));
        contentValues.put("active", Boolean.valueOf(c2173d.f16450e));
        contentValues.put("trigger_event_name", c2173d.f16451f);
        contentValues.put("trigger_timeout", Long.valueOf(c2173d.f16453h));
        contentValues.put("timed_out_event", this.f16777a.N().e0(c2173d.f16452g));
        contentValues.put("creation_timestamp", Long.valueOf(c2173d.f16449d));
        contentValues.put("triggered_event", this.f16777a.N().e0(c2173d.f16454i));
        contentValues.put("triggered_timestamp", Long.valueOf(c2173d.f16448c.f16879c));
        contentValues.put("time_to_live", Long.valueOf(c2173d.f16455j));
        contentValues.put("expired_event", this.f16777a.N().e0(c2173d.f16456k));
        try {
            if (P().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.f16777a.d().r().b("Failed to insert/update conditional user property (got -1)", C2267u1.z(str));
                return true;
            }
            return true;
        } catch (SQLiteException e8) {
            this.f16777a.d().r().c("Error storing conditional user property", C2267u1.z(str), e8);
            return true;
        }
    }

    public final boolean x(w4 w4Var) {
        AbstractC1319p.l(w4Var);
        h();
        i();
        if (X(w4Var.f16910a, w4Var.f16912c) == null) {
            if (y4.Z(w4Var.f16912c)) {
                if (I("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{w4Var.f16910a}) >= this.f16777a.z().p(w4Var.f16910a, AbstractC2217k1.f16561I, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(w4Var.f16912c)) {
                long I8 = I("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{w4Var.f16910a, w4Var.f16911b});
                this.f16777a.z();
                if (I8 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, w4Var.f16910a);
        contentValues.put(TtmlNode.ATTR_TTS_ORIGIN, w4Var.f16911b);
        contentValues.put("name", w4Var.f16912c);
        contentValues.put("set_timestamp", Long.valueOf(w4Var.f16913d));
        H(contentValues, "value", w4Var.f16914e);
        try {
            if (P().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.f16777a.d().r().b("Failed to insert/update user property (got -1). appId", C2267u1.z(w4Var.f16910a));
                return true;
            }
            return true;
        } catch (SQLiteException e8) {
            this.f16777a.d().r().c("Error storing user property. appId", C2267u1.z(w4Var.f16910a), e8);
            return true;
        }
    }
}
