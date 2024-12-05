package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.google.android.gms.internal.measurement.p0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2211p0 extends SQLiteOpenHelper {
    public AbstractC2211p0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i8) {
        this(context, str, null, 1, AbstractC2228r0.f16791a);
    }

    private AbstractC2211p0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i8, AbstractC2228r0 abstractC2228r0) {
        super(context, (str == null || AbstractC2166k0.a().a(str, abstractC2228r0, EnumC2202o0.SQLITE_OPEN_HELPER_TYPE).equals("")) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }
}
