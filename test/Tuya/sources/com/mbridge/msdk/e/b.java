package com.mbridge.msdk.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/* loaded from: classes4.dex */
final class b extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    private final String f18862a;

    public b(Context context, String str, String str2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f18862a = str2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (y.a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.f18885a, this.f18862a));
        } catch (Exception e8) {
            if (a.f18749a) {
                Log.e("TrackManager", "create table error", e8);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        if (y.a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.f18886b, this.f18862a));
            sQLiteDatabase.execSQL(String.format(i.f18885a, this.f18862a));
        } catch (Exception e8) {
            if (a.f18749a) {
                Log.e("TrackManager", "downgrade table error", e8);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        if (y.a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.f18886b, this.f18862a));
            sQLiteDatabase.execSQL(String.format(i.f18885a, this.f18862a));
        } catch (Exception e8) {
            if (a.f18749a) {
                Log.e("TrackManager", "upgrade table error", e8);
            }
        }
    }
}
