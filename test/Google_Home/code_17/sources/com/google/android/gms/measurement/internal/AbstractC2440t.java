package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC2166k0;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2440t {
    private static Set a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(C2367i2 c2367i2, SQLiteDatabase sQLiteDatabase) {
        if (c2367i2 != null) {
            File file = new File(AbstractC2166k0.a().c(sQLiteDatabase.getPath()));
            if (!file.setReadable(false, false)) {
                c2367i2.L().a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                c2367i2.L().a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                c2367i2.L().a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                c2367i2.L().a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(C2367i2 c2367i2, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        if (c2367i2 != null) {
            if (!d(c2367i2, sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                Set a8 = a(sQLiteDatabase, str);
                for (String str4 : str3.split(",")) {
                    if (!a8.remove(str4)) {
                        throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                    }
                }
                if (strArr != null) {
                    for (int i8 = 0; i8 < strArr.length; i8 += 2) {
                        if (!a8.remove(strArr[i8])) {
                            sQLiteDatabase.execSQL(strArr[i8 + 1]);
                        }
                    }
                }
                if (!a8.isEmpty()) {
                    c2367i2.L().c("Table has extra columns. table, columns", str, TextUtils.join(", ", a8));
                    return;
                }
                return;
            } catch (SQLiteException e8) {
                c2367i2.G().b("Failed to verify columns on table that was just created", str);
                throw e8;
            }
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    private static boolean d(C2367i2 c2367i2, SQLiteDatabase sQLiteDatabase, String str) {
        if (c2367i2 != null) {
            Cursor cursor = null;
            try {
                try {
                    cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                    boolean moveToFirst = cursor.moveToFirst();
                    cursor.close();
                    return moveToFirst;
                } catch (SQLiteException e8) {
                    c2367i2.L().c("Error querying for table", str, e8);
                    if (cursor != null) {
                        cursor.close();
                        return false;
                    }
                    return false;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
